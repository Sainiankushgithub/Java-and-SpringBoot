<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help page</title>
</head>
<body>
		<h1>This is our help</h1>
		<% String desk = (String) request.getAttribute("desk");
		   String name=(String)request.getAttribute("assistant");
		%>
		
		<h2><%= desk %></h2>
		<h2>This your Assistance name : <%=name %></h2>
</body>
</html>