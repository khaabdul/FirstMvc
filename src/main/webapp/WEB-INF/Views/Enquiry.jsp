<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Techskills IT Solution</title>
<style>
body {
	font-family: Arial, sans-serif;
}

.container {
	max-width: 700px;
	margin: 0 auto;
	padding: 20px;
	background-color: #ffffff;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h1 {
	text-align: center;
	margin-bottom: 20px;
}

.header {
	display: flex;
	align-items: center;
	justify-content: space-between;
	margin-bottom: 20px;
}

.company-info {
	flex: 1;
}

.company-info h2 {
	margin: 0;
}

.company-info p {
	margin: 0;
}

.photo-frame {
	width: 190px;
	height: 190px;
	border: 2px solid #ddd;
	border-radius: 50%;
	overflow: hidden;
}

.photo {
	width: 100%;
	height: 100%;
	object-fit: cover;
}

table {
	width: 100%;
	border-collapse: collapse;
}

th, td {
	padding: 8px;
	text-align: left;
	border-bottom: 1px solid #ddd;
}

.form-group input, .form-group select {
	width: 100%;
	padding: 8px;
	border: 1px solid #ccc;
	border-radius: 8px;
	box-sizing: border-box;
}

.form-group input[type="submit"] {
	background-color: #4CAF50;
	color: #fff;
	cursor: pointer;
}

#photo-preview {
	width: 120px;
	height: 120px;
	border-radius: 50%;
	object-fit: cover;
}

#camera-button, .ok-btn {
	padding: 8px;
	background-color: #4CAF50;
	color: #fff;
	cursor: pointer;
}

.photo-container {
	text-align: center;
}

.circular-image {
	border-radius: 50%;
}
</style>
</head>
<body>
	<%@include file="LoginHedder.jsp"%>
	<h2 align="center">
		<span style="color: green;">${succefull }</span>
	</h2>
	<div class="company-info">
		<form action="enquirY" method="post">
			<table>
				<tr>
					<!-- <th>Form no :<input type="text" name="form"></th> -->
					<th><h3 align="center">Enquiry Form</h3>
				</tr>
			</table>
			<table>
				<tr>
					<th><label for="applicantName">Applicant Name:</label></th>
					<td><input type="text" value="${studentObj.getName() }"
						name="name" required></td>
				</tr>
				<tr>
					<th><label for="address">Residential Address:</label></th>
					<td><textarea id="address" name="address" required></textarea></td>
				</tr>
				<tr>
					<th><label for="gender">Gender:</label></th>
					<td><select id="gender" name="gender" required>
							<option value="">Select gender</option>
							<option value="Male">Male</option>
							<option value="Female">Female</option>
					</select></td>
				</tr>
				<tr>
					<th><label for="maritalStatus">Marital Status:</label></th>
					<td><select id="marritualStatus" name="marritualStatus"
						required>
							<option value="">Select marital status</option>
							<option value="Single">Single</option>
							<option value="Married">Married</option>
							<option value="Divorced">Divorced</option>
							<option value="Widowed">Widowed</option>
					</select></td>
				</tr>
				<tr>
					<th><label for="dob">Date of Birth:</label></th>
					<td><input type="date" id="dateOfBirth" name="dateOfBirth"
						required></td>
				</tr>
				<tr>
					<th><label for="email">Email Id:</label></th>
					<td><input type="email" value="${studentObj.getEmail() }"
						name="email" required></td>
				</tr>
				<tr>
					<th><label for="contact">Contact No:</label></th>
					<td><input type="tel" value="${studentObj.getNumber()}"
						name="contactNo" required></td>
				</tr>

				<tr>
					<th>Academic Qualification</th>
					<td><input type="radio" name="Qualification" value="graduate" />
						Graduate</td>
					<td><input type="radio" name="Qualification"
						value="undergraduate" /> Undergraduate</td>
					<td><input type="radio" name="Qualification" value="backlog" />
						Graduate With Backlog</td>
				</tr>
				<tr>
					<th>Qualification Detail</th>
					<th>Name of School/College</th>
					<th>Percentage</th>
					<th>Year of Passing</th>
				</tr>
				<tr>
					<th>SSC:</th>
					<td><input type="text" name="sscSchoolName"
						required="required"></td>
					<td><input type="text" name="sscPercentage"></td>
					<td><input type="text" name="sscYearOfPassing"></td>
				</tr>
				<tr>
					<th>HSC:</th>
					<td><input type="text" name="hscSchoolName"></td>
					<td><input type="text" name="hscPercentage"></td>
					<td><input type="text" name="hscYearOfPassing"></td>
				</tr>
				<tr>
					<th>Graduate:</th>
					<td><input type="text" name="graduationCollegeName"></td>
					<td><input type="text" name="graduationPercentage"></td>
					<td><input type="text" name="graduationYearOfPassing"></td>
				</tr>
				<tr>
					<th>Post Graduate:</th>
					<td><input type="text" name="postgraduationQualification"></td>
					<td><input type="text" name="postgraduationPercentage"></td>
					<td><input type="text" name="postgraduationYearOfPassing"></td>
				</tr>

			</table>
			<div style="text-align: center;">
				<button type="submit" class="btn btn-primary btn-block">Submit</button>
			</div>
		</form>
	</div>
	<h2 align="center">
		<span style="color: crimson;">${already }</span>
	</h2>
	<h2 align="center">
		<span style="color: crimson;">${first }</span>
	</h2>
	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

</body>
</html>




