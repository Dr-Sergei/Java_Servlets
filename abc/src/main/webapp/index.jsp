<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>THIS IS THE ABC PROJECT</title>
</head>
<body>
<h1>THIS IS THE ABC PROJECT</h1>
<%
	String user =(String) request.getAttribute("user");
	out.println("Ich begrüße dich: " + user);
%>

</body>
</html>