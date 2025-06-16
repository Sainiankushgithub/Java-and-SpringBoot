<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error !!!!</title>

    <!-- Font awesome link  -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.0/css/all.min.css"
	integrity="sha512-9xKTRVabjVeZmc+GUW8GgSmcREDunMM+Dt/GrzchfN8tkwHizc5RP4Ok/MXFFy5rIjJjzhndFScTceq5e6GvVQ=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
	
	<!-- Bootstrap link   -->
	
	<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
	
</head>
<body>

	<div class="container">
		<div class="container text-center mt-5">
		<h1 style="color:red;">500 </h1>
		<h1>Internal Server Error</h1>
		<p><i class="fa-solid fa-triangle-exclamation fa-bounce fs-1 mt-2" style="color: #e41126;"></i></p>		
		<p>We Apologies For The Inconveniences. <strong>Please Try Again Later .........</strong> </p>
		
		<p class="">Error Message : </p>
		<br>
		<strong>${error }</strong>
		</div>
	</div>
</body>
</html>