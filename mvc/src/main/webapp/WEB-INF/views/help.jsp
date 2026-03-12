<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>

<%-- <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>

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
		// 		String name = (String) request.getAttribute("name");
		// 		Integer rollNumber = (Integer) request.getAttribute("rollNumber");
		// 		LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	%>
	<h1>
		hello my name is
		<%-- 		<%=name%> --%>
		${name}
	</h1>
	<h1>
		my roll number is
		<%-- 		<%=rollNumber%> --%>
		${rollNumber }
	</h1>
	<h1>
		date and time is
		<%-- 		<%=time.toString()%> --%>
		${time }
	</h1>
	<hr>
	${marks }
	<c:forEach var="item" items="${marks }">
		<h1>${item }</h1>
		<c:out value="${item }"></c:out>

	</c:forEach>


</body>
</html>