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
<h1>Student Details Viewed Here</h1>
<form action="ViewStudentServlet" method="post">
<table >
<tr>
<td>RollNumber</td>
<td><input type="text" name="RollNumber"/></td>
</tr>
</table>
<span style="color:red">${error}</span>
<input type="submit" value="View"/>
</div>
</form>
</body>
</html>
