package Madhuitha;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Studentdetails
 */
@WebServlet("/Studentdetails")
public class Studentdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Studentdetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int RollNumber=Integer.parseInt(request.getParameter("RollNumber"));
		int Tamil=Integer.parseInt(request.getParameter("Tamil"));
		int English=Integer.parseInt(request.getParameter("English"));
		int Maths=Integer.parseInt(request.getParameter("Maths"));
		int science=Integer.parseInt(request.getParameter("science"));
		int socialscience=Integer.parseInt(request.getParameter("socialscience"));
		String Term =request.getParameter("Term");
		int Total=Tamil+English+Maths+science+socialscience;
		int count=0;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","Madhu*10");
			PreparedStatement ps=c.prepareStatement("select count from subject where RollNumber=?");
			ps.setInt(1, RollNumber);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				count=rs.getInt(1); 
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		if(count<3)
		{
			
			++count;
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","Madhu*10");
				PreparedStatement ps=c.prepareStatement("insert into subject values(?,?,?,?,?,?,?,?,?)");
				ps.setInt(1,RollNumber);
				ps.setInt(2, count);
				ps.setInt(3,Tamil);
				ps.setInt(4,English);
				ps.setInt(5,Maths);
				ps.setInt(6, science);
				ps.setInt(7, socialscience);
				ps.setString(8, Term);
				ps.setInt(9, Total);
				int i=ps.executeUpdate();
				if(i>0)
				{
				
					//response.sendRedirect("http://localhost:8080/Student2/register.html");
					out.print("Student Marks added Successfully");
				}
				
			}
				catch(Exception e)
				{
					System.out.println(e);
				}
			

		}else {
			out.print("Already added marks...");
		}
	}

}
