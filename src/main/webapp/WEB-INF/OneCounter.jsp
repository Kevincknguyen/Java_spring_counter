<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>No points for visiting this page</h1>
	<h2>In this session you visited the splash page:<c:out value="${counter}"/></h2>
	
	<a href="http://localhost:8080/">Return</a>
		
	
</body>
</html>


