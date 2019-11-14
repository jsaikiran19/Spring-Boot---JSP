<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
<p>Get Student By Id</p>
<p>Enter ID: </p>

<form action = "rest/user/getById" method = "get">
<p><input type = "text" name = "id"></p>
<p><input type = "submit" value = "submit"></p>
</form>
<p>
Get All Students </p>
<form action = "rest/user/getAll" method = "get"> 
<p><input type = "submit" value = "submit"></p>
</form>

<p>Get Student By Name</p>
<form action = "rest/user/getByName" method = "get">
<p><input type = "text" name="name"></p>
<p><input type = "submit" value = "submit"></p>
</form>
</body></html>