<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Question Page</title>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<style>
/* Custom CSS for the container */
.outer-container {
	border: 1px solid #ccc;
	padding: 20px;
	border-radius: 10px;
	max-width: 1200px;
	margin: 50px auto;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
}

/* Add some spacing between the question and answer */
.question-container {
	margin-bottom: 20px;
}

/* Style the question */
#question {
	font-size: 18px;
	font-weight: bold;
	margin-bottom: 10px;
}

/* Style the submit button */
.btn-primary {
	width: 30%;
}
</style>
</head>
<body>
	<%@include file="LoginHedder.jsp"%>
	<div class="outer-container">
		<div class="container mt-4">
			<form action="answer" method="post">
				<div class="question-container">
					<p id="question" >Q:) What is the capital of France?</p>
					<div class="form-group">
						<label for="answer">Your Answer:</label> <input type="text"
							class="form-control" id="answer" name="answer" required>
					</div>
					<div align="center">
						<button type="submit" class="btn btn-primary">Submit
							Answer</button>
					</div>
				</div>
			</form>
		</div>
	</div>


	<!-- Bootstrap JS (optional, only if you need JavaScript features) -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
