package Madhuitha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;

public class UpdateDetails {
	boolean start= false;
	boolean updated(int RollNumber)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","Madhu*10");
			PreparedStatement ps=c.prepareStatement("select * from student where RollNumber=?");
			ps.setInt(1, RollNumber);
			System.out.println(RollNumber);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				start=true;
				
				
				//rs.getString(1,)
			}
			else
			{
				start=false;
			}				
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		return start;
	}	
	}
