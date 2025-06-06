<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search box</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<div class="container mt-5 py-5 bg-primary bd-3s" style="width: 50%">
			<form action="search">
				<h3 class="text-center text-white">MY SEARCH</h3>
				<div class="row">
					<div class="col-12">
						<textarea class="form-control" id="exampleFormControlTextarea1"
							rows="3" placeholder="Search anything here ......"
							name="querybox"></textarea>
					</div>
					<div class="col-12 text-center">
						<button type="submit" class="btn btn-outline-light mt-2">search</button>
					</div>
				</div>
			</form>

		</div>

	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>