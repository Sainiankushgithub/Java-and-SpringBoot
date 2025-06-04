<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Success Submission</title>
</head>
<body>
		<h1 style="color:green;">Successfully Submitted the data </h1>
		<!-- WAY 1  -->
		<%-- <h3>Name : ${name }</h3>
		<h3>Email : ${email }</h3>
		<h3>Password : ${password }</h3> --%>
		
        <!-- WAY 2 IF WE MADE A CLASS  -->
        
        <h3>Name : ${user.name }</h3>
        <h3>Email : ${user.email }</h3>
        <h3>Password : ${user.password }</h3>
        
        
</body>
</html>