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

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    DeleteDetails d = new DeleteDetails();

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			PrintWriter pw=response.getWriter();
			int RollNumber=Integer.parseInt(request.getParameter("RollNumber"));			
			boolean start=d.check(RollNumber);
			if(start)
			{
			
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","Madhu*10");
				PreparedStatement ps=c.prepareStatement("delete from student where RollNumber=?");
				ps.setInt(1,RollNumber);
				int a =ps.executeUpdate();
				if(a!=0)
				{
				pw.print("Successfully Deleted ");
				}
				else
				{
					//response.sendRedirect("http://localhost:8080/Student2/Delete.html");
					RequestDispatcher rd=request.getRequestDispatcher("Delete.jsp");
					request.setAttribute("error","Invalid RollNumber");
					rd.include(request,response);
				}
				
			}
				catch(Exception e)
				{
					pw.println("Reg no not avilable");
				}
			}
			else
			{
				//response.sendRedirect("http://localhost:8080/Student2/Delete.jsp");
				RequestDispatcher rd=request.getRequestDispatcher("Delete.jsp");
				request.setAttribute("error","Invalid RollNumber");
				rd.include(request,response);
			}
				//pw.println("Roll Number not available ");
			}	
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	
		
	}

	

	}
