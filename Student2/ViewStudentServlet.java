package Madhuitha;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ViewStudentServlet
 */
@WebServlet("/ViewStudentServlet")
public class ViewStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","Madhu*10");
			PreparedStatement ps=c.prepareStatement("select * from student where RollNumber=?");
			ps.setInt(1,Integer.parseInt(request.getParameter("RollNumber")));
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				out.println("<html><body>");
				out.println("<h3>Student Personal  Details</h3>");
				out.println("<table border=1><tr>"  + "<td><b>Name</b></td>"
						+ "<td><b>RollNumber</b></td>" + "<td><b>Standard</b></td>" +"<td><b>Gender</b></td>"
						+"<td><b>DateofBirth</b></td>" +"<td><b>BloodGroup</b></td>"+"<td><b>FatherName</b></td>"
						+"<td><b>MotherName</b></td>" +"<td><b>FatherOccupation</b></td>"+"<td><b>MotherOccupation</b></td>"+"<td><b>MobileNumber</b></td>"
						+"<td><b>Address</b></td>");
				out.println("<form method='get' action='ViewStudentServlet'>");
				out.println("<tr>");
				out.println("<td>");
				out.println("<input type='text' name='Name' value='"+rs.getString(1)+"'/>");
				out.println("<td>");
				out.println("<input type='text' name='RollNumber' value='"+rs.getInt(2)+"'/>");
				out.println("<td>");
				out.println("<input type='text' name='Standard' value='"+rs.getString(3)+"'/>");
				out.println("<td>");
				out.println("<input type='text' name='Gender' value='"+rs.getString(4)+"'/>");
				out.println("<td>");
				out.println("<input type='text' name='DateofBirth' value='"+rs.getString(5)+"'/>");
				out.println("<td>");
				out.println("<input type='text' name='BloodGroup' value='"+rs.getString(6)+"'/>");
				out.println("<td>");
				out.println("<input type='text' name='FatherName' value='"+rs.getString(7)+"'/>");
				out.println("<td>");
				out.println("<input type='text' name='MotherName' value='"+rs.getString(8)+"'/>");
				out.println("<td>");
				out.println("<input type='text' name='FatherOccupation' value='"+rs.getString(9)+"'/>");
				out.println("<td>");
				out.println("<input type='text' name='MotherOccupation' value='"+rs.getString(10)+"'/>");
				out.println("<td>");
				out.println("<input type='text' name='MobileNumber' value='"+rs.getString(11)+"'/>");
				out.println("<td>");
				out.println("<input type='text' name='Address' value='"+rs.getString(12)+"'/>");
				out.println("<td>");
				out.println("</tr>");
				out.println("</form>");	
			}
			else
			{
				
				RequestDispatcher rd=request.getRequestDispatcher("StudentLogin.jsp");
				request.setAttribute("error","Invalid RollNumber");
				rd.include(request,response);
				
				//response.sendRedirect("StudentLogin.html"); 
		    }
		}
			catch(Exception e)
			{
				e.getMessage();
			}			
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
