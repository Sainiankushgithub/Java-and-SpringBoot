<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>User data inserted successfully........</h1>
		<h2><strong>User Details..</strong></h2>
		<h4>Name : ${sessionScope.user.name}</h4>
		<h4>Email : ${sessionScope.user.email}</h4>
		<h4>Phone no : ${sessionScope.user.phone_no}</h4>
		<h4>Password : ${sessionScope.user.password}</h4>
</body>
</html>