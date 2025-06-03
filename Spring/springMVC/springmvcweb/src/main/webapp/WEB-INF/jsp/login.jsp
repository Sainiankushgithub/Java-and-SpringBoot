<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>Hello login page !</h1>
	<% String name=(String)request.getAttribute("name");
	   int age = (int) request.getAttribute("age");
	   List<String>friends=(List<String>)request.getAttribute("f");
	%>
	
	<h1>My name is <%= name %> </h1>
	<h1>Age : <%= age %></h1>
	<h1>My friends name (Dynamically printed : )</h1>
	<% for(String s:friends){
		%>
		
		<h3><%= s %></h3>
		<%
	}
		%>
	
	
</body>
</html>