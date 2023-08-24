<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>

<title>Login Form</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<style>
body {
	padding-top: 50px;
}

.login-form {
	margin-top: 50px;
	padding: 20px;
	border: 1px solid #ccc;
	border-radius: 5px;
	box-shadow: 0 0 10px #ccc;
}

h2 {
	text-align: center;
}

.form-group {
	margin-bottom: 20px;
}

.btn {
	width: 100%;
}

.login-form {
	width: 500px;
	max-width: 100%;
}
</style>
</head>
<body>
	<%@include file="Hedder.jsp"%>
	<h2 align="center">
		<span style="color: green;">${msg }</span>
	</h2>
	<div class="container">
		<div class="d-flex justify-content-center">
			<form action="loginhandler" method="post" class="login-form">
				<h2>Login Form</h2>
				<div class="form-group">
					<label for="username">Username:</label> <input type="text"
						class="form-control" id="username" name="email" required>
				</div>
				<div class="form-group">
					<label for="password">Password:</label> <input type="password"
						class="form-control" id="password" name="password" required>
				</div>
				<button type="submit" class="btn btn-primary">Login</button>
			</form>
		</div>
	</div>
	<h2 align="center">
		<span style="color: crimson;">${error }</span>
	</h2>
</body>
</html>
