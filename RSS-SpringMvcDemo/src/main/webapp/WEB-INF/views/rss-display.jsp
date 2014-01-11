<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RSS titles</title>
</head>
<body>
	
	<h3>${rssFeed[0] } </h3>
	<h4>The first three titles are</h4>
	<c:forEach var="data" items="${rssFeed}"
		begin="2" end="4">
		<c:out value="${data}" /><br>
	</c:forEach>

</body>
</html>