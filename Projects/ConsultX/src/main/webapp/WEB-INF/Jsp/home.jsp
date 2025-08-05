<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>

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

<!-- Custom Style CSS File  -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/ConsultX/css/style.css">

<!-- Google Fonts -->
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Merriweather:wght@300;400;700&display=swap"
	rel="stylesheet" />

<!-- AOS Link  -->
<link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet" />

</head>
<body>
	<!-- Navbar -->
	<header id="home">
		<nav
			class="navbar navbar-expand-lg navbar-dark fixed-top navbar-black">
			<div class="container-fluid">
				<a class="navbar-brand" href="#home"> <img class="img-fluid"
					src="${pageContext.request.contextPath }/ConsultX/images/consultX_logo3.png" alt="logo" />
				</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarNavDropdown">
					<ul class="navbar-nav ms-auto mb-2 mb-lg-0 fs-5 p-2">
						<li class="nav-item"><a class="nav-link active" href="${pageContext.request.contextPath }/home">Home</a>
						</li>
						<li class="nav-item"><a class="nav-link"
							href="${pageContext.request.contextPath }/what">What we do</a></li>
						<li class="nav-item"><a class="nav-link"
							href="${pageContext.request.contextPath }/about">About us</a></li>
						<li class="nav-item"><a class="nav-link"
							href="${pageContext.request.contextPath }/contact">Contact Us</a></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-bs-toggle="dropdown">
								Our Services </a>
							<ul class="dropdown-menu dropdown-menu-dark bg-dark fs-6">
								<li><a class="dropdown-item" href="${pageContext.request.contextPath }/career">Career</a></li>
								<li><a class="dropdown-item" href="${pageContext.request.contextPath }/education">Education</a></li>
								<li><a class="dropdown-item" href="${pageContext.request.contextPath }/health">Health Related</a></li>
							</ul></li>
						<li class="nav-item"><a class="nav-link"
							href="${pageContext.request.contextPath }/signup">SignUp <i
								class="fas fa-user-plus ps-2 text-white"></i></a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>

	<!-- Section -1 Carsouel section  -->
	<section id="home" class="my-5 pt-5">
		<div class="container mt-4 my-5">
			<div class="row">
				<div class="col-12 text-center" data-aos="fade-right"
					data-aos-offset="300" data-aos-easing="ease-in-sine">
					<div id="carouselExampleCaptions" class="carousel slide"
						data-bs-ride="carousel">
						<div class="carousel-indicators">
							<button type="button" data-bs-target="#carouselExampleCaptions"
								data-bs-slide-to="0" class="active"></button>
							<button type="button" data-bs-target="#carouselExampleCaptions"
								data-bs-slide-to="1"></button>
							<button type="button" data-bs-target="#carouselExampleCaptions"
								data-bs-slide-to="2"></button>
						</div>
						<div class="carousel-inner">
							<div class="carousel-item active">
								<img src="${pageContext.request.contextPath }/ConsultX/images/slide1.jpg" class="d-block w-100 rounded"
									alt="Slide 1" />
								<div class="carousel-caption d-none d-md-block">
									<h5>Sahil Saini</h5>
								</div>
							</div>
							<div class="carousel-item">
								<img src="${pageContext.request.contextPath }/ConsultX/images/slide2.jpg" class="d-block w-100 rounded"
									alt="Slide 2" />
								<div class="carousel-caption d-none d-md-block">
									<h5>Ankush Saini</h5>
								</div>
							</div>
							<div class="carousel-item">
								<img src="${pageContext.request.contextPath }/ConsultX/images/slide3.jpg" class="d-block w-100 rounded"
									alt="Slide 3" />
								<div class="carousel-caption d-none d-md-block">
									<h5>Avani Dangi</h5>
								</div>
							</div>
						</div>
						<button class="carousel-control-prev" type="button"
							data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
							<span class="carousel-control-prev-icon"></span>
						</button>
						<button class="carousel-control-next" type="button"
							data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
							<span class="carousel-control-next-icon"></span>
						</button>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- Section -2 card section  -->
	<section id="What-we-do">
		<div class="container mt-5">
			<div class="row">
				<div class="col-12">
					<h2 class="my-4">Transforming Future</h2>
				</div>
			</div>

			<!-- cards section -1 -->
			<div class="row">
				<!-- card -1  -->
				<div class="col-12 col-sm-12 col-lg-4 col-md-4 mb-3">
					<div class="card bg-dark text-white" data-aos="zoom-in">
						<img src="/images/card-1.jpg" class="card-img" alt="..." />
						<div
							class="card-img-overlay d-flex flex-column justify-content-end">
							<h5 class="card-title">Card title</h5>
							<p class="card-text">This is a wider card with supporting
								text below as a natural lead-in to additional content. This
								content is a little bit longer.</p>
							<p class="card-text">Last updated 3 mins ago</p>
						</div>
					</div>
				</div>
				<!-- Card -2  -->
				<div class="col-12 col-sm-12 col-lg-4 col-md-4 mb-3">
					<div class="card bg-dark text-white" data-aos="zoom-in">
						<img src="/images/card-2.jpg" class="card-img" alt="..." />
						<div
							class="card-img-overlay d-flex flex-column justify-content-end">
							<h5 class="card-title">Card title</h5>
							<p class="card-text">This is a wider card with supporting
								text below as a natural lead-in to additional content. This
								content is a little bit longer.</p>
							<p class="card-text">Last updated 3 mins ago</p>
						</div>
					</div>
				</div>

				<!-- card -3  -->
				<div class="col-12 col-sm-12 col-lg-4 col-md-4 mb-3">
					<div class="card bg-dark text-white" data-aos="zoom-in">
						<img src="/images/card-3.jpg" class="card-img img-fluid" alt="..." />
						<div
							class="card-img-overlay d-flex flex-column justify-content-end">
							<h5 class="card-title">Card title</h5>
							<p class="card-text">This is a wider card with supporting
								text below as a natural lead-in to additional content. This
								content is a little bit longer.</p>
							<p class="card-text">Last updated 3 mins ago</p>
						</div>
					</div>
				</div>
			</div>

			<!-- card section -2  -->
			<div class="row">
				<div class="col-12 col-sm-12 col-lg-4 col-md-4 mb-3">
					<!-- card-1  -->
					<div class="card bg-dark text-white" data-aos="zoom-out">
						<img src="/images/card-2.webp" class="card-img" alt="..." />
						<div
							class="card-img-overlay d-flex flex-column justify-content-end">
							<h5 class="card-title">Card title</h5>
							<p class="card-text">This is a wider card with supporting
								text...</p>
							<p class="card-text">Last updated 3 mins ago</p>
						</div>
					</div>
				</div>
				<div class="col-12 col-sm-12 col-lg-4 col-md-4 mb-3">
					<!-- card-2 -->
					<div class="card bg-dark text-white" data-aos="zoom-out">
						<img src="/images/card-5.jpg" class="card-img" alt="..." />
						<div
							class="card-img-overlay d-flex flex-column justify-content-end">
							<h5 class="card-title">Card title</h5>
							<p class="card-text">This is a wider card with supporting
								text...</p>
							<p class="card-text">Last updated 3 mins ago</p>
						</div>
					</div>
				</div>
				<div class="col-12 col-sm-12 col-lg-4 col-md-4 mb-3">
					<!-- card-3 -->
					<div class="card bg-dark text-white" data-aos="zoom-out">
						<img src="/images/consultX_logo2.png" class="card-img" alt="..." />
						<div
							class="card-img-overlay d-flex flex-column justify-content-end">
							<h5 class="card-title">Card title</h5>
							<p class="card-text">This is a wider card with supporting
								text...</p>
							<p class="card-text">Last updated 3 mins ago</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- section -3  -->
	<section class="section-3 bg-white">
		<div class="container">
			<!-- Heading Section -3  -->
			<div class="row">
				<div class="col-12">
					<h2 class="text-black g-5 my-4 fw-normal">Build Skills. Make
						Impact. Start Here.</h2>
				</div>
			</div>

			<!-- row-1  -->
			<div class="row mb-4">
				<div class="col-6 hr position-relative">
					<h5 class="section-2-logo">
						<a class="nav-link" href=""><i
							class="fas fa-code me-4" style="color: #0a6ab2"></i><span>DSA
								Mastery Roadmap</span> <i
							class="fas fa-arrow-right arrow-icon position-absolute end-0 me-5"></i>
						</a>
					</h5>
					<hr />
				</div>
				<div class="col-6 hr position-relative">
					<h5 class="section-2-logo">
						<a class="nav-link" href=""><i
							class="fas fa-language me-4" style="color: #0a6ab2"></i><span>Programming
								Language Tracks</span> <i
							class="fas fa-arrow-right arrow-icon position-absolute end-0 me-5"></i>
						</a>
					</h5>
					<hr />
				</div>
			</div>

			<!-- row-2 -->
			<div class="row mb-4">
				<div class="col-6 hr position-relative">
					<h5 class="section-2-logo">
						<a class="nav-link" href=""><i
							class="fas fa-bullseye me-4" style="color: #0a6ab2"></i><span>Career
								Strategy Planning</span> <i
							class="fas fa-arrow-right arrow-icon position-absolute end-0 me-5"></i>
						</a>
					</h5>
					<hr />
				</div>
				<div class="col-6 hr position-relative">
					<h5 class="section-2-logo">
						<a class="nav-link" href=""><i
							class="fas fa-chart-line me-4" style="color: #0a6ab2"></i><span>Internship
								& Job Prep</span> <i
							class="fas fa-arrow-right arrow-icon position-absolute end-0 me-5"></i>
						</a>
					</h5>
					<hr />
				</div>
			</div>

			<!-- row-3 -->
			<div class="row mb-4">
				<div class="col-6 hr position-relative">
					<h5 class="section-2-logo">
						<a class="nav-link" href=""><i
							class="fas fa-graduation-cap me-4" style="color: #0a6ab2"></i><span>Academic
								Support & Study Hacks</span> <i
							class="fas fa-arrow-right arrow-icon position-absolute end-0 me-5"></i>
						</a>
					</h5>
					<hr />
				</div>
				<div class="col-6 hr position-relative">
					<h5 class="section-2-logo">
						<a class="nav-link" href=""><i
							class="fas fa-briefcase-medical me-4" style="color: #0a6ab2"></i><span>Mental
								& Physical Wellness</span> <i
							class="fas fa-arrow-right arrow-icon position-absolute end-0 me-5"></i>
						</a>
					</h5>
					<hr />
				</div>
			</div>

			<!-- row-4 -->
			<div class="row mb-4">
				<div class="col-6 hr position-relative">
					<h5 class="section-2-logo">
						<a class="nav-link" href=""><i
							class="fas fa-laptop-code me-4" style="color: #0a6ab2"></i><span>Project-Based
								Learning</span> <i
							class="fas fa-arrow-right arrow-icon position-absolute end-0 me-5"></i>
						</a>
					</h5>
					<hr />
				</div>
				<div class="col-6 hr position-relative">
					<h5 class="section-2-logo">
						<a class="nav-link" href=""><i
							class="fas fa-user-tie me-4" style="color: #0a6ab2"></i><span>1:1
								Personalized Mentoring</span> <i
							class="fas fa-arrow-right arrow-icon position-absolute end-0 me-5"></i>
						</a>
					</h5>
					<hr />
				</div>
			</div>
			<!-- row-5 -->
			<div class="row mb-4">
				<div class="col-6 hr position-relative">
					<h5 class="section-2-logo">
						<a class="nav-link" href=""><i
							class="fab fa-hackerrank me-4" style="color: #0a6ab2"></i><span>Hackathons
								& Coding Contests</span> <i
							class="fas fa-arrow-right arrow-icon position-absolute end-0 me-5"></i>
						</a>
					</h5>
					<hr />
				</div>
				<div class="col-6 hr position-relative">
					<h5 class="section-2-logo">
						<a class="nav-link" href=""><i
							class="fas fa-university me-4" style="color: #0a6ab2"></i><span>College
								& Course Selection Help</span> <i
							class="fas fa-arrow-right arrow-icon position-absolute end-0 me-5"></i>
						</a>
					</h5>
					<hr />
				</div>
			</div>
			<!-- row-6 -->
			<div class="row pb-5">
				<div class="col-6 hr position-relative">
					<h5 class="section-2-logo">
						<a class="nav-link" href=""><i
							class="fas fa-award me-4" style="color: #0a6ab2"></i><span>Skill
								Certifications & Platforms</span> <i
							class="fas fa-arrow-right arrow-icon position-absolute end-0 me-5"></i>
						</a>
					</h5>
					<hr />
				</div>
				<div class="col-6 hr position-relative">
					<h5 class="section-2-logo">
						<a class="nav-link" href=""><i
							class="fab fa-git-alt me-4" style="color: #0a6ab2"></i><span>Open
								Source & GitHub Journe</span> <i
							class="fas fa-arrow-right arrow-icon position-absolute end-0 me-5"></i>
						</a>
					</h5>
					<hr />
				</div>
			</div>
		</div>
	</section>

	<section class="sec-color py-5">
		<div class="container">
			<div class="row text-center">
				<div class="col-12 a-tag">
					<h1 class="text-white fw-normal pt-5">Join with us</h1>
					<p class="text-white pt-3">Realize your potential</p>
					<a class="nav-link" href="">Explore ConsultX Carrers</a>
				</div>
			</div>
			<hr class="text-white hr-bold" />

			<div class="row pt-4">
				<div class="col-12 text-white">
					<p>Social</p>
					<h1 class="fw-light">Follow us for the latest updates</h1>
				</div>
			</div>

			<div class="row fs-3 my-4">
				<div class="col-3 text-white">
					<a class="nav-link text-white d-inline-block" href=""><p>
							<i class="fab fa-facebook-f pe-3" style="color: #f3f4f7"></i>
							Facebook
						</p></a>
				</div>
				<div class="col-3 text-white">
					<a class="nav-link text-white d-inline-block" href=""><p>
							<i class="fab fa-twitter pe-3" style="color: #fcfcfc"></i>Twitter
						</p></a>
				</div>
				<div class="col-3 text-white">
					<a class="nav-link text-white d-inline-block" href=""><p>
							<i class="fab fa-instagram pe-3" style="color: #ffffff"></i>Instagram
						</p></a>
				</div>
				<div class="col-3 text-white">
					<a class="nav-link text-white d-inline-block" href=""><p>
							<i class="fab fa-linkedin pe-3" style="color: #ffffff"></i>LinkedIn
						</p></a>
				</div>
				<div class="col-2"></div>
			</div>
			<hr class="text-white" />
		</div>
	</section>

	<!-- footer section  -->

	<footer class="navbar-black text-white py-4">
		<div class="container">
			<div class="row align-items-center">
				<div
					class="col-md-4 d-flex justify-content-center justify-content-md-start">
					<!-- Image vertically centered -->
					<a href="#home"><img
						src="${pageContext.request.contextPath }/ConsultX/images/consultX_logo3.png" alt="Logo" class="img-fluid"
						style="width: 200px" /></a>
				</div>
				<div class="col-md-4 text-center text-md-start mt-3 mt-md-0">
					<p class="mb-0">© 2025 ConsultX. All rights reserved.</p>
				</div>

				<div
					class="col-sm-12 col-md-4 text-center mt-3 mt-lg-0 mt-md-0 text-md-end fs-4">
					<a class="pe-2" href=""><i
						class="fab fa-facebook-f pe-3" style="color: #f3f4f7"></i></a> <a
						class="pe-2" href=""> <i class="fab fa-twitter pe-3"
						style="color: #fcfcfc"></i></a> <a class="pe-2" href=""><i
						class="fab fa-instagram pe-3" style="color: #ffffff"></i></a> <a
						class="pe-2" href=""><i
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

	<!-- AOS Link  -->
	<script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>

	<!-- Another AOS Link  -->
	<script>
      AOS.init();
    </script>
</body>
</html>