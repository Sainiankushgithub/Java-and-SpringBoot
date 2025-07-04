<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Signin</title>

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

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css"
	integrity="sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg=="
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

<!-- SWEET ALERT CDN LINK  -->
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>

</head>
<body>

	<section class="sign-in">
		<div class="container pt-3 text-center">
			<div class="row rounded g-0 mt-5">
				<div class="col-lg-6 d-none d-lg-block">
					<img class="img-fluid w-100 h-100 bg-color-col1"
						src="${pageContext.request.contextPath }/ConsultX/images/signin.jpg" alt="">
				</div>
				<div
					class="col-lg-6 col-sm-12 col-md-12 text-center py-5 bg-color-col2 ">
					<h1 class="pt-3">ConsultX</h1>
					<p class="fw-light mt-4">Welcome to ConsultX – Your Trusted
						Partner in Growth and Guidance.</p>
					<h3 class="mb-5">Login</h3>

					<div class="container text-center">
						<form action="requestform" method="post">
							<div class="custom-input-group">
								<span> <i class="fa-solid fa-message fs-3 me-4"
									style="color: #ffffff;"></i> <input type="text"
									class="custom-input" placeholder="Email or phone number"
									name="email_phone"></span>
							</div>
							<div class="custom-hr-tag mb-4"></div>
							<div class="custom-input-group">
								<span> <i class="fa-solid fa-key fs-3 me-4"
									style="color: #ffffff;"></i> <input type="password"
									class="custom-input" placeholder="password" name="password"></span>
							</div>
							<div class="custom-hr-tag mb-4"></div>

							<button class="btn btn-outline-light btn-lg" type="submit">Submit</button>
						</form>
					</div>

					<div class="row mt-4 ms-4">
						<div class="col-5">
							<div class="custom-bt-tag"></div>
						</div>
						<div class="col-1 text-white">or</div>
						<div class="col-5">
							<div class="custom-bt-tag"></div>
						</div>
					</div>
					<div class="input-group text-white mt-4">
						<span class="ms-5">I'm new member ! <a
							class="ms-3 nav-link d-inline signup-btn"
							href="${pageContext.request.contextPath }/signup">Signup</a></span>
					</div>
				</div>
			</div>
			</div>
	</section>
	
	<c:if test="${not empty validMessage }">
		<script>
		Swal.fire({
			  title: "${validMessage}",
			  text: "Redirecting.....",
			  icon: "success",
			  showConfirmButton:false,
			  timer:2000
			}).then(()=>{
				window.location.href="${pageContext.request.contextPath}/user";
			});
		</script>
	</c:if>
	
	<c:if test="${not empty invalidMessage }">
		<script>
		Swal.fire({
			  title: "Error !",
			  text: "${invalidMessage}",
			  icon: "error",
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

</body>
</html>