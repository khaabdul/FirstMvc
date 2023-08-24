<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>TechSkill Nav Bar</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style>
/* Optional custom styles */
body {
	padding-top: 70px; /* To account for the fixed navbar height */
}

section {
	min-height: 400px; /* Set a minimum height for content sections */
	padding: 20px 0;
}
</style>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
		<div class="navbar-brand">
			<form action="loginhome" method="get">
				<button type="submit" class="nav-link btn btn-link">TechSkill
					Institute</button>
			</form>
		</div>
		<%=new Date()%>
		<!-- <a class="navbar-brand" href="#">TechSkill Institute</a> -->
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item">
					<form action="loginhome" method="get">
						<button type="submit" class="nav-link btn btn-link">Home
						</button>
					</form>
				</li>
				<li class="nav-item active">
					<form action="enquiry" method="get">
						<button type="submit" class="nav-link btn btn-link">Enquiry
						</button>
					</form>
				</li>
				<li class="nav-item">
					<form action="studentregistration" method="get">
						<button type="submit" class="nav-link btn btn-link">Student
							Register</button>
					</form>
				</li>
				<li class="nav-item">
					<form action="feesDetails" method="get">
						<button type="submit" class="nav-link btn btn-link">Fees
							Detils</button>
					</form>
				</li>

				<li class="nav-item">
					<form action="interviewdetails">
						<button type="submit" class="nav-link btn btn-link">InterViewDetails</button>
					</form>
				</li>
				<li class="nav-item">
					<form action="dailytask">
						<button type="submit" class="nav-link btn btn-link">Daily
							Task</button>
					</form>
				</li>
				<li class="nav-item">
					<form action="profile">
						<button type="submit" class="nav-link btn btn-link">Profil</button>
					</form>
				</li>
				<li class="nav-item">
					<form action="logout" method="post">
						<button type="submit" class="nav-link btn btn-link">Logout</button>
					</form>
				</li>
			</ul>
		</div>
	</nav>
</body>
</html>
