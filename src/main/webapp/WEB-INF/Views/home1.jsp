<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>TechSkill Institute</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<!-- Add your custom CSS file if you have one -->
<!-- <link rel="stylesheet" href="custom.css"> -->
<style>
/* Add any additional custom CSS here */
body {
	padding-top: 70px; /* To account for the fixed navbar height */
}

.jumbotron {
	background-image: url("path/to/your/image.jpg");
	background-size: cover;
	height: 500px;
	display: flex;
	align-items: center;
	justify-content: center;
	color: #fff;
	text-align: center;
}

.jumbotron h1 {
	font-size: 48px;
	font-weight: bold;
	text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
}

.jumbotron p {
	font-size: 24px;
	text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
}
</style>
</head>
<body>
<%@include file="Hedder.jsp" %>
	<!-- Navigation Bar -->
<!-- 	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
		<a class="navbar-brand" href="#">TechSkill Institute</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a class="nav-link" href="#home">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#about">About</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#courses">Courses</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#contact">Contact</a>
				</li>
			</ul>
		</div>
	</nav> -->

	<!-- Jumbotron / Hero Section -->
	<section id="home" class="jumbotron">
		<div class="container">
			<h1>Welcome to TechSkill Institute</h1>
			<p>Learn and Excel in Cutting-Edge Technologies</p>
			<!-- Add a CTA button if needed -->
			<!-- <a href="#courses" class="btn btn-primary btn-lg">Explore Courses</a> -->
		</div>
	</section>

	<!-- About Section -->
	<section id="about" class="container mt-5">
		<div class="row">
			<div class="col-md-6">
				<h2>About TechSkill Institute</h2>
				<p>TechSkill Institute is a leading educational institution that
					offers comprehensive and hands-on courses in various technology
					domains. We are committed to providing high-quality education and
					empowering our students to thrive in the ever-evolving tech
					industry.</p>
			</div>
			<div class="col-md-6">
				<!-- Add an image related to the institute -->
				<!-- <img src="path/to/your/image.jpg" alt="TechSkill Institute"> -->
			</div>
		</div>
	</section>

	<!-- Courses Section -->
	<!-- <section id="courses" class="bg-light py-5">
		<div class="container">
			<h2 class="text-center mb-4">Our Courses</h2>
			<div class="row">
				<div class="col-md-4 mb-4">
					<div class="card">
						<img src="path/to/course1.jpg" class="card-img-top" alt="Course 1">
						<div class="card-body">
							<h5 class="card-title">Course 1</h5>
							<p class="card-text">Course description goes here.</p>
						</div>
					</div>
				</div>
				<div class="col-md-4 mb-4">
					<div class="card">
						<img src="path/to/course2.jpg" class="card-img-top" alt="Course 2">
						<div class="card-body">
							<h5 class="card-title">Course 2</h5>
							<p class="card-text">Course description goes here.</p>
						</div>
					</div>
				</div>
				<div class="col-md-4 mb-4">
					<div class="card">
						<img src="path/to/course3.jpg" class="card-img-top" alt="Course 3">
						<div class="card-body">
							<h5 class="card-title">Course 3</h5>
							<p class="card-text">Course description goes here.</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section> -->

	<!-- Contact Section -->
	<!-- <section id="contact" class="container mt-5">
		<h2>Contact Us</h2>
		<p>Have questions? Contact our team for assistance.</p>
		Add your contact form or contact details here
	</section>
 -->
	<!-- Footer -->
	<footer class="bg-dark text-white py-3 text-center">
		<p>&copy; 2023 TechSkill Institute. All rights reserved.</p>
	</footer>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
