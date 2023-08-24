<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>IT Institute Registration Form</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<!-- Custom CSS -->
<style>
body {
	background-color: #f7f7f7;
}

.container {
	max-width: 500px;
	margin: 50px auto;
	padding: 20px;
	background-color: #fff;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.form-group label {
	font-weight: bold;
}
</style>
</head>

<body>
	<%@include file="Hedder.jsp"%>
	<h2 align="center">
		<span style="color: crimson;">${exist }</span>
	</h2>
	<div class="container">
		<h2 class="text-center mb-4">Registration Form</h2>
		<form action="regesterhandler" method="post">
			<div class="form-group">
				<label for="fullName">Full Name</label> <input type="text"
					class="form-control" id="fullName" name="name"
					placeholder="Enter your full name" required>
			</div>

			<div class="form-group">
				<label for="email">Email Address</label> <input type="email"
					class="form-control" id="email" name="email"
					placeholder="Enter your email address" required>
			</div>

			<div class="form-group">
				<label for="phoneNumber">Phone Number</label> <input type="tel"
					class="form-control" id="phoneNumber" name="number"
					placeholder="Enter your phone number" required>
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					class="form-control" id="password" name="password"
					placeholder="Enter your password" required>
			</div>
			<div class="form-group">
				<label for="confromPassword">Confrom Password</label> <input
					type="password" class="form-control" id="confromPassword"
					name="confromPassword" placeholder="Enter your comfrompassword"
					required>
			</div>

			<button type="submit" class="btn btn-primary btn-block">Submit</button>
		</form>
		<h2 align="center">
			<span style="color: crimson;">${error }</span>
		</h2>
		<h2 align="center">
			<span style="color: crimson;">${msg }</span>
		</h2>
	</div>

	<!-- Bootstrap JS (optional) -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.1/dist/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>
