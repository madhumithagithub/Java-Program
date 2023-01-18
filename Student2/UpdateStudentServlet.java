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
 * Servlet implementation class UpdateStudentServlet
 */
@WebServlet("/UpdateStudentServlet")
public class UpdateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	}				
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String Name=request.getParameter("Name");
		int RollNumber=Integer.parseInt(request.getParameter("RollNumber"));
		String Standard=request.getParameter("Standard");
		String Gender=request.getParameter("Gender");
		String DateofBirth=request.getParameter("DateofBirth");
		String BloodGroup=request.getParameter("BloodGroup");
		String FatherName=request.getParameter("FatherName");
		String MotherName=request.getParameter("MotherName");
		String FatherOccupation=request.getParameter("FatherOccupation");
		String MotherOccupation=request.getParameter("MotherOccupation");
		String MobileNumber=request.getParameter("MobileNumber");
		String Address=request.getParameter("Address");			
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","Madhu*10");
			PreparedStatement ps=c.prepareStatement("update student set  Name='"+Name+" ', RollNumber=' "+RollNumber+"',Standard=' "+Standard+"',Gender='"+Gender+"',DateofBirth='"+DateofBirth+"',BloodGroup='"+BloodGroup+"',FatherName='"+FatherName+"',MotherName='"+MotherName+"',FatherOccupation='"+FatherOccupation+"',MotherOccupation='"+MotherOccupation+"',MobileNumber='"+MobileNumber+"',Address='"+Address+"' where RollNumber=?");
			ps.setInt(1,RollNumber);
		int sql=ps.executeUpdate();
		
	}catch (Exception e)
		{
		System.out.println(e);
		}
	}

}
