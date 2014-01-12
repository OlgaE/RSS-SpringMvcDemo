<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RSS setup</title>
</head>
<body>

	<h3>With redirection to another page:</h3>
	<form action="to-rss-page" method="get">
		<input type="text" name="url" />
		<input type="submit" name="submit" />
	</form>
	
	<h3>Getting a JSON object instead:</h3>
	<form action="get-person-object" method="get">
		<input type="text" name="firstName" />
		<input type="submit" name="submit" />
	</form>
</body>
</html>