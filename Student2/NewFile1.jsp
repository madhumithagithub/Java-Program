<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Student Details Added Here</h1>
<form action="StudentServlet" method="post">
<table style="with: 80%">
<tr>
<td>Name</td>
<td><input type="text" name="Name"/></td>
</tr>
<tr>
<td>RollNumber</td>
<td><input type="text" name="RollNumber"/></td>
</tr>
<tr>

<td >Standard</td>
<td><select name="Standard" id="Standard" type="dropdown" >
  <option value="First">First</option>
  <option value="Second">Second</option>
  <option value="Third">Third</option>
  <option value="Fourth">Fourth</option>
  <option value="Fifth">Fifth</option>
</select>
</td>
</tr>
<tr>
<td>Gender</td>
<td><input type="radio" name="Gender" value="male"/>Male
<input type="radio" name="Gender" value="female"/>Female
</td>
</tr>
<tr>
<td>DateofBirth</td>
<td><input type="date" name="DateofBirth"></td>
</tr>
<tr>
<td>BloodGroup</td>
<td><input type="text" name="BloodGroup"></td>
</tr>
<tr>
<td>FatherName</td>
<td><input type="text" name="FatherName"></td>
</tr>
<tr>
<td>MotherName</td>
<td><input type="text" name="MotherName"></td>
</tr>
<tr>
<td>FatherOccupation</td>
<td><input type="text" name="FatherOccupation"></td>
</tr>
<tr>
<td>MotherOccupation</td>
<td><input type="text" name="MotherOccupation"></td>
</tr>
<tr>
<td>MobileNumber</td>
<td><input type="text" name="MobileNumber"/></td>
</tr>
<tr>
<td>Address</td>
<td><input type="text" name="Address"/></td>
</tr>
</table>
<input type="submit" value="Update Student"/>
</form>
</body>
</html>
