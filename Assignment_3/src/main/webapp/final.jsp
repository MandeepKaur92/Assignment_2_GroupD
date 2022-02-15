<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.center {
	margin: auto;
	width: 60%;
	padding: 10px;
	text-align: center;
}
</style>
</head>
<body style="background-color: #F0FFFF;">
	<div class="center">
		<table border="1" width="900dp">
			<tr>
				<td><b>Student Detials</b><br>
				<br> First Name:<% out.print(""+request.getAttribute("fname"));%><br>
				<br> Last Name:<% out.print(""+request.getAttribute("lname"));%><br>
				<br></td>
				<td><b>Address:</b> <br>
				<br> Street:<% out.print(""+request.getAttribute("street"));%><br>
				<br> City:<% out.print(""+request.getAttribute("city"));%><br>
				<br> State:<% out.print(""+request.getAttribute("state"));%><br>
				<br></td>
			</tr>
			<tr>
				<td><b>Scrore:</b><br>
				<br> Subject1:<% out.print(""+request.getAttribute("subject1"));%><br>
				<br> Subject2:<% out.print(""+request.getAttribute("subject2"));%><br>
				<br> Subject3:<% out.print(""+request.getAttribute("subject3"));%><br>
				<br> Subject4:<% out.print(""+request.getAttribute("subject4"));%><br>
				<br> Subject5:<% out.print(""+request.getAttribute("subject5"));%><br>
				<br></td>
				<td><b>Contact no:</b><br>
				<br> Contact1:<% out.print(""+request.getAttribute("Contact1"));%><br>
				<br> Contact2:<% out.print(""+request.getAttribute("Contact2"));%><br>
				<br></td>
			</tr>
			<tr>
				<td><b>Values</b><br>
				<br> Base:<% out.print(""+request.getAttribute("base"));%><br>
				<br> height:<% out.print(""+request.getAttribute("height"));%><br>
				<br> Side:<% out.print(""+request.getAttribute("side"));%><br>
				<br></td>
				<td><b>Area:</b><br>
				<br> Area of traingle:<% out.print(""+request.getAttribute("t_area"));%><br>
				<br> Area of Square:<% out.print(""+request.getAttribute("s_area"));%><br>
				<br></td>


			</tr>
		</table>
	</div>
</body>
</html>