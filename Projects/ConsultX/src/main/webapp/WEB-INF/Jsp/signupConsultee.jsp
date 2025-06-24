<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>signUP</title>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous" />

<!-- Custom Style css  -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/ConsultX/css/style.css">

<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
	integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />

<!-- Google Fonts -->
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Merriweather:wght@300;400;700&display=swap"
	rel="stylesheet" />

<!-- AOS Link  -->
<link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet" />

<!-- SWEET ALERT CDN LINK  -->
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>

</head>
<body>

	<section class="signup-section">
		<div class="container mt-5 pt-5">
			<div class="row mt-1 g-0 rounded">
				<div class="col-lg-6 d-none d-lg-block">
					<img class="img-fluid w-100 h-100"
						src="${pageContext.request.contextPath}/ConsultX/images/signup.jpg"
						alt="">
				</div>
				<div class="col-md-6 col-sm-12 ps-5 bg-white">
					<div class="container pb-4">
						<form action="processform" method="post"
							onsubmit="return validateForm();">
							<!--  -->
							<h4 class="text-black mt-5">Create an account</h4>
							<div class="input-group mb-3">
								<span class="input-group-text border-0 bg-white"
									id="basic-addon1"><i class="fas fa-user-plus"></i></span> <input
									type="text" class="form-control border-0"
									placeholder="Your Name" aria-label="Your Name"
									aria-describedby="basic-addon1" name="name" />
							</div>
							<!--  -->
							<div class="input-group mb-3">
								<span class="input-group-text bg-white border-0"
									id="basic-addon1"><i class="fas fa-envelope"></i></span> <input
									type="text" class="form-control border-0" placeholder="Email"
									aria-label="Email" aria-describedby="basic-addon1" name="email" />
							</div>
							<!--  -->
							<div class="input-group mb-3">
								<span class="input-group-text bg-white border-0"
									id="basic-addon1"><i class="fas fa-phone"></i></span> <input
									type="number" class="form-control border-0"
									placeholder="Phone no." aria-label="phone no"
									aria-describedby="basic-addon1" name="phone_no" />
							</div>
							<!--  -->
							<div class="input-group mb-3">
								<span class="input-group-text bg-white border-0"
									id="basic-addon1"><i class="fas fa-key"></i></span> <input
									type="password" class="form-control border-0"
									placeholder="Password" aria-label="passwrod"
									aria-describedby="basic-addon1" name="password" />
							</div>
							<!--  -->
							<div class="form-check">
								<input class="form-check-input" type="checkbox" value=""
									id="flexCheckDefault"> <label
									class="form-check-label text-primary" for="flexCheckDefault">
									I agree with the terms & condition. </label>
							</div>
							<!--  -->
							<button type="submit" class="btn bg-primary text-white mt-2">Submit</button>
							<!--  -->
							<div class="row">
								<div class="col-5">
									<hr>
								</div>
								<div class="col-1">or</div>
								<div class="col-5">
									<hr>
								</div>
							</div>
							<!--  -->
							<div class="input-group mt-3">
								<span>I'm already a member!<a
									class="ms-2 nav-link d-inline bg-dark text-white sign-border"
									href="${pageContext.request.contextPath}/signin">Sign in</a></span>
							</div>
							<!--  -->
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>


	<!-- Error mesaages while submitting the data  -->

	<c:if test="${not empty successMessage}">
		<script>
  Swal.fire({
    icon: 'success',
    title: '${successMessage}',
    text:'Redirecting',
    showConfirmButton: false,
    timer: 2000
  }).then(() => {
    window.location.href = '${pageContext.request.contextPath}/user';
  });
</script>

	</c:if>


	<c:if test="${not empty errorMessage}">
		<script>
			Swal.fire({
				icon:"error",
				title:"Error!",
				text:"${errorMessage}",
				showConfirmButton:false,
				timer:2000
			});
		</script>

	</c:if>


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

	<script src="${pageContext.request.contextPath }/ConsultX/js/style.js"></script>
</body>
</html>