package Madhuitha;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	// JDBC a = new JDBC();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","Madhu*10");
			PreparedStatement ps=c.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,request.getParameter("Name"));
			ps.setInt(2,Integer.parseInt(request.getParameter("RollNumber")));
			ps.setString(3,request.getParameter("Standard"));
			ps.setString(4,request.getParameter("Gender"));
			ps.setString(5, request.getParameter("DateofBirth"));
			ps.setString(6, request.getParameter("BloodGroup"));
			ps.setString(7,request.getParameter("FatherName"));
			ps.setString(8, request.getParameter("MotherName"));
			ps.setString(9, request.getParameter("FatherOccupation"));
			ps.setString(10, request.getParameter("MotherOccupation"));
			ps.setString(11, request.getParameter("MotherName"));
			ps.setString(12, request.getParameter("Address"));
			int i=ps.executeUpdate();
			if(i>0)
			{
			
				//response.sendRedirect("http://localhost:8080/Student2/register.html");
				out.print("Student Details Added Successfully");
				response.sendRedirect("http://localhost:8080/Student2/Marks.html");
			}
			
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		

	}
			

	}
	


	
