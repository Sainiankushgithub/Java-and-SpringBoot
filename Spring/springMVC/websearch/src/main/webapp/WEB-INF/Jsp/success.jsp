<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
		<h1 style="color:green">SuccessFully Uploaded ........</h1>
		<h3>File details : </h3>
		<p><strong>Original Name : </strong>${file.originalFilename}</p>
		<p><strong>Size : </strong>${file.size}</p>
		<p><strong>Storage : </strong>${file.storageDescription }</p>
		<p><strong>Uploaded image : </strong></p>
		<img alt="profile_img" src="<c:url value="resources/Img/${file.originalFilename }" />">
</body>
</html>