<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "rest/user/insert" method = "post">
<p>ID:</p>
<input type = "text" name = "id">
<p>Name:</p>
<input type = "text" name = "name">
<p>Branch:</p>
<input type = "text" name = "branch">
<p>Percentage:</p>
<input type = "text" name = "percentage">
<p>Phone:</p>
<input type = "text" name = "phone">
<p>Email:</p>
<input type = "text" name = "email">
<input type = "submit" value = "submit">
</form>
</body>
</html>