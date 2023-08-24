<%@page import="com.Entity.EnquiryBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Profile</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<style>
body {
	background-color: #f8f9fa;
}

.card {
	border-radius: 10px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

.card-header {
	background-color: #007bff;
	color: #fff;
	border-top-left-radius: 10px;
	border-top-right-radius: 10px;
	padding: 1rem;
	text-align: center;
	font-weight: bold;
}

.card-body {
	padding: 2rem;
}

img.img-fluid {
	max-width: 100%;
	border-radius: 5px;
}

h3 {
	margin-top: 0;
	font-weight: bold;
	color: #007bff;
	text-align: center;
}

h5, h6 {
	margin: 0;
	font-weight: bold;
}

.details-label {
	color: #007bff;
	font-weight: bold;
}
</style>
</head>
<c:set var="registerBean" value="${sessionScope.RegisterObj}" />
<c:if test="${registerBean eq null}">
	<c:set var="registerBean" value="${sessionScope.RecentRegisterObj}" />
</c:if>
<body>
	<%@include file="LoginHedder.jsp"%>
	<div class="container mt-5">
		<div class="card">
			<div class="card-header">
				<h3>Student Profile</h3>
			</div>
			<div class="card-body">
				<div class="row">
					<div class="col-md-4 text-center">
						<!-- Add an image here -->
						<img src="data:image/jpeg;base64,${registerBean.getGetprofile()}"
							alt="Student Profile Image" class="img-fluid">
					</div>
					<div class="col-md-8">
						<div class="details-container">
							<h6 class="details-label">Student Id:</h6>
							<h5>${registerBean.getId()}</h5>
						</div>
						<div class="details-container">
							<h6 class="details-label">Name:</h6>
							<h5>${registerBean.getName()}</h5>
						</div>
						<div class="details-container">
							<h6 class="details-label">Email Id:</h6>
							<h5>${registerBean.getEmail()}</h5>
						</div>
						<div class="details-container">
							<h6 class="details-label">Contact Number:</h6>
							<h5>${registerBean.getContactNo()}</h5>
						</div>
						<div class="details-container">
							<h6 class="details-label">Date Of Birth:</h6>
							<h5>${registerBean.getDateOfBirth()}</h5>
						</div>
						<div class="details-container">
							<h6 class="details-label">Course:</h6>
							<h5>${registerBean.getCourse()}</h5>
						</div>
						<!-- Add more student details here -->
					</div>
				</div>
			</div>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
