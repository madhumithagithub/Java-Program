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
<h1>Student Details Deleted Here</h1>
<div class="container"> 
<form action="DeleteServlet" method="get">
<table style="with: 80%">
<tr>
<td>RollNumber</td>
<td><input type="text" name="RollNumber"/></td>
</tr>
<tr>
</table>
<span style="color:red">${error}</span>
<button onclick="myFunction()">Delete</button>
<script>
function myFunction() {
  confirm("Are you sure you Want to Delete Data!");
}
</script>
</form>
</div>
</div>
</body>
</html>
