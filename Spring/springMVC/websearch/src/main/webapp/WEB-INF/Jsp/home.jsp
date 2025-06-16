<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/Css/style.css">
</head>
<body>
	<div class="container">
		<h1>Welcome ! Good morning sir/ma'am</h1>
		<div class="text-center">
			<img class="" alt="goodmorning"
				src="${pageContext.request.contextPath}/resources/Img/good.jpeg">
		</div>
		<form action="uploadfile" method="POST" enctype="multipart/form-data">
			<div class="">
				<label class="control-label"></label>
				<input type="file" class="form-control-file" name="inputfile">
				<button type="submit" class="btn btn-outline-light">Upload</button>
			</div>
		</form>
	</div>


</body>
</html>