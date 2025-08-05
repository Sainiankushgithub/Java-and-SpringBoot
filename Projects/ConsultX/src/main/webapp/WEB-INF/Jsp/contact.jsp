<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact</title>
</head>

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous" />

<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
	integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />

<!-- Custom Styles -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/ConsultX/css/style.css" />

<!-- Google Fonts -->
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Merriweather:wght@300;400;700&display=swap"
	rel="stylesheet" />

<!-- AOS Link  -->
<link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet" />

<body>
	<!-- Navbar -->
	<header>
		<nav
			class="navbar navbar-expand-lg navbar-dark fixed-top navbar-black">
			<div class="container-fluid">
				<a class="navbar-brand"
					href="${pageContext.request.contextPath }/home"> <img
					class="img-fluid"
					src="${pageContext.request.contextPath }/ConsultX/images/consultX_logo3.png"
					alt="logo" />
				</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarNavDropdown">
					<ul class="navbar-nav ms-auto mb-2 mb-lg-0 fs-5 p-2">
						<li class="nav-item"><a class="nav-link"
							href="${pageContext.request.contextPath }/home">Home</a></li>
						<li class="nav-item"><a class="nav-link"
							href="${pageContext.request.contextPath }/what">What we do</a></li>
						<li class="nav-item"><a class="nav-link"
							href="${pageContext.request.contextPath }/about">About us</a></li>
						<li class="nav-item"><a class="nav-link active"
							href="${pageContext.request.contextPath }/contact">Contact Us</a></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-bs-toggle="dropdown"> Our Services </a>
							<ul class="dropdown-menu dropdown-menu-dark bg-dark fs-6">
								<li><a class="dropdown-item"
									href="${pageContext.request.contextPath }/career">Career</a></li>
								<li><a class="dropdown-item"
									href="${pageContext.request.contextPath }/education">Education</a></li>
								<li><a class="dropdown-item"
									href="${pageContext.request.contextPath }/health">Health
										Related</a></li>
							</ul></li>
						<li class="nav-item"><a class="nav-link"
							href="${pageContext.request.contextPath }/signup">SignUp <i
								class="fas fa-user-plus ps-2 text-white"></i>
						</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>

	<!-- contact us section -1  -->
	<section>
		<div class="container mb-5">

			<!-- row-1  -->
			<div class="row mt-5 pt-5">
				<div class="col-12 col-md-6 col-md-6 p-5">
					<h1 class="fw-light">What's on your mind ?</h1>
				</div>
				<div class="col-12 col-md-6 col-lg-6 p-5">
					<p class="fs-4 fw-light" style="color: #b4b4b8;">
						We’re here to help! Tell us what you’re <br> looking for and
						we’ll get you connected to <br> the right people.
					</p>
				</div>
			</div>

			<!-- row-2  -->
			<div class="row mt-4">

				<!-- service -1  -->
				<div
					class="col-sm-12 col-md-4 col-lg-4 text-center py-5 cont-service">
					<a class="nav-link rounded text-white p-5" href=""> <i
						class="fas fa-building fs-3 pb-2" style="color: #0d6efd;"></i> <br>Request
						for services
					</a>
				</div>

				<!-- service -2  -->
				<div
					class="col-sm-12 col-md-4 col-lg-4 text-center py-5 cont-service">
					<a class="nav-link rounded text-white p-5" href=""> <i
						class="far fa-address-card fs-3 pb-2" style="color: #0d6efd;"></i>
						<br>Media Contacts
					</a>
				</div>

				<!-- service -3  -->
				<div
					class="col-sm-12 col-md-4 col-lg-4 text-center py-5 cont-service">
					<a class="nav-link rounded text-white p-5" href=""> <i
						class="fas fa-user-tag fs-3 pb-2" style="color: #0d6efd;"></i> <br>Consultant
						Information
					</a>
				</div>
			</div>

			<!-- row-3  -->
			<div class="row">
				<div class="col-12">
					<p style="color: #b4b4b8;">Looking for something else?</p>
				</div>
			</div>

			<!-- row-4  -->
			<div class="row">
				<div class="col-sm-6 col-md-3 col-lg-3">
					<a class="nav-link text-white fs-4" href="">Analyst Relations <i
						class="fas fa-arrow-circle-right"></i></a>
				</div>
				<div class="col-sm-6 col-md-3 col-lg-3">
					<a class="nav-link text-white text-lg-center fs-4" href="">CSR
						<i class="fas fa-arrow-circle-right"></i>
					</a>
				</div>
				<div class="col-sm-6 col-md-3 col-lg-3">
					<a class="nav-link text-white fs-4" href="">Patnerships <i
						class="fas fa-arrow-circle-right"></i></a>
				</div>
				<div class="col-sm-6 col-md-3 col-lg-3">
					<a class="nav-link text-white fs-4" href="">Website feedback <i
						class="fas fa-arrow-circle-right"></i></a>
				</div>
			</div>
		</div>
		</div>
	</section>

	<!-- footer section  -->

	<footer class="bg-dark text-white py-4">
		<div class="container">
			<div class="row align-items-center">
				<div
					class="col-md-4 d-flex justify-content-center justify-content-md-start">
					<!-- Image vertically centered -->
					<a href="#home"><img src="/ConsultX/images/consultX_logo3.png"
						alt="Logo" class="img-fluid" style="width: 200px" /></a>
				</div>
				<div class="col-md-4 text-center text-md-start mt-3 mt-md-0">
					<p class="mb-0">© 2025 ConsultX. All rights reserved.</p>
				</div>

				<div
					class="col-sm-12 col-md-4 text-center mt-3 mt-lg-0 mt-md-0 text-md-end fs-4">
					<a class="pe-2" href=""><i class="fab fa-facebook-f pe-3"
						style="color: #f3f4f7"></i></a> <a class="pe-2" href=""> <i
						class="fab fa-twitter pe-3" style="color: #fcfcfc"></i></a> <a
						class="pe-2" href=""><i class="fab fa-instagram pe-3"
						style="color: #ffffff"></i></a> <a class="pe-2" href=""><i
						class="fab fa-linkedin pe-3" style="color: #ffffff"></i></a>
				</div>
			</div>
		</div>
	</footer>

	<!-- Bootstrap JS -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>

</body>
</html>