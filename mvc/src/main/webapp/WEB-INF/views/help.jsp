<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>
	<h1>help page for user manual</h1>
	<h2>24 hours helping available</h2>
	<h1>give me feed back after help</h1>

	<%
		String name = (String) request.getAttribute("name");
		Integer rollNumber = (Integer) request.getAttribute("rollNumber");
		LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	%>
	<h1>
		hello my name is
		<%=name%>
	</h1>
	<h1>
		my roll number is
		<%=rollNumber%>
	</h1>
	<h1>
		date and time is
		<%=time.toString()%></h1>


</body>
</html>