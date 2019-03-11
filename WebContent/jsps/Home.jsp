<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="../Css/home.css">
<title>Hello</title>
</head>
<body>
<table class="table table-striped">
<tr>
<th>PersonID</th>
<th>lastname</th>
<th>firstname</th>
<th>Address</th>
<th>city</th>
</tr>
<c:forEach var="student" items="${studentlist}">
<tr>
<td><c:out value="${student.personId}"/></td>
<td><c:out value="${student.lastname}"/></td>
<td><c:out value="${student.firstname}"/></td>
<td><c:out value="${student.address}"/></td>
<td><c:out value="${student.city}"/></td>
</tr>
</c:forEach>
</table>
</body>
</html>