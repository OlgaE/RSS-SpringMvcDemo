<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RSS setup</title>
</head>
<body>

	<form action="to-rss-page" method="get">
		<input type="text" name="url" />
		<input type="submit" name="submit" />
	</form>
	
	<form action="get-rss-object" method="get">
		<input type="text" name="url" />
		<input type="submit" name="submit" />
	</form>
</body>
</html>