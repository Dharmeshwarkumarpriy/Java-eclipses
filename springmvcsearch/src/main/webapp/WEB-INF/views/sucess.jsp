<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${student }</h1>
<hr>
<h1>name is ${student.name }</h1>
<h1>student id is ${student.id }</h1>
<h1>student DOB is ${student.date }</h1>
<h1>student course is ${student.courses }</h1>
<h1>student gender is ${student.gender }</h1>
<h1>student type is ${student.type }</h1>
<hr>
<h1>Address street is ${student.address.street }</h1>
<h1>Address city is ${student.address.city }</h1>
</body>
</html>