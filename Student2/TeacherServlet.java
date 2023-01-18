package Madhuitha;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TeacherServlet
 */
@WebServlet("/TeacherServlet")
public class TeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherServlet() {
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
		String EmailId=request.getParameter("EmailId");
	    Email email = new Email();
	    boolean test=email.emailVerification(EmailId);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try
		{
			if(test)
			{
		Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","Madhu*10");
			PreparedStatement ps=c.prepareStatement("insert into teacher values(?,?,?,?,?,?,?)");
			ps.setInt(1,Integer.parseInt(request.getParameter("Teacher_id")));
			ps.setString(2,request.getParameter("Name"));
			ps.setString(3,request.getParameter("Password"));
			ps.setString(4,request.getParameter("Gender"));
			ps.setString(5, request.getParameter("Standard"));
			ps.setString(6, EmailId);
			ps.setString(7,request.getParameter("MobileNumber"));
			int i=ps.executeUpdate();
			if(i>0)
			{
			
				//response.sendRedirect("http://localhost:8080/Student2/register.html");
				out.print("Teacher Details Added Successfully");
			}
			}
			
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}

}
