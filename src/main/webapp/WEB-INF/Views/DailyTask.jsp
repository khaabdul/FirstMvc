<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.Entity.RegisterBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	padding: 50px 10px;
}

input {
	margin-bottom: 15px;
}
</style>
</head>
<c:set var="registerBean" value="${sessionScope.RegisterObj}" />
<c:if test="${registerBean eq null}">
	<c:set var="registerBean" value="${sessionScope.RecentRegisterObj}" />
</c:if>
<body class="d-flex" style="flex-direction: column;">
	<%@include file="LoginHedder.jsp"%>

	<div class="card"
		style="width: 700px; max-width: 100%; margin-inline: auto; margin-top: 50px; margin-bottom: 50px;">

		<div class="card-header">

			<h1 class="text-center text-success">Daily Task</h1>

		</div>

		<form class="card-body" action="dailyTask" method="post">
			<label class="form-label">Student Id</label> <input type="text"
				class="form-control" name="Student_Id"
				value="${registerBean.getId()}" readonly> <label
				class="form-label">Enter your name</label> <input type="text"
				class="form-control" name="name" value="${registerBean.getName()}"
				readonly> <label class="form-label">Enter your phone
				number</label> <input type="text" pattern="[0-9]{10}" name="phoneNumber"
				value="${registerBean.getContactNo()}" class="form-control" readonly>

			<div class="interview-question">
				<label class="form-label">Enter Todays Tasks</label> <input
					type="text" name="task-1" class="form-control" value="1)">
			</div>



			<input type="text" class="form-control no-interview-question"
				readonly value="1" name="totalTask">

			<div class="d-flex justify-content-center">

				<button type="button" class="btn btn-danger minus mx-2">-</button>
				<button type="button" class="btn btn-primary plus mx-2">+</button>

			</div>




			<div class="difficult-question">

				<label class="form-label">Enter Douts</label> <input type="text"
					name="douts-1" class="form-control" value="Q:1) ?">

			</div>

			<input type="text" class="form-control no-difficult-question"
				readonly value="1" name="totalDouts">

			<div class="d-flex justify-content-center">

				<button type="button" class="btn btn-danger d-minus mx-2">-</button>
				<button type="button" class="btn btn-primary d-plus mx-2">+</button>

			</div>


			<div class="text-center">
				<input type="submit" class="btn btn-outline-success mt-2">
			</div>


		</form>
	</div>

	<script>
		const interviewContainer = document
				.querySelector('.interview-question')
		const plus = document.querySelector('.plus')
		const minus = document.querySelector('.minus')
		const noInterview = document.querySelector('.no-interview-question')

		const difficultContainer = document
				.querySelector('.difficult-question')
		const Dplus = document.querySelector('.d-plus')
		const Dminus = document.querySelector('.d-minus')
		const DInterview = document.querySelector('.no-difficult-question')

		let count = 1

		plus.onclick = function() {

			count++;

			let input = document.createElement('input')
			input.name = 'task-' + count
			input.classList.add('form-control')
			input.value = count+ ")"
			noInterview.value = count 

			interviewContainer.appendChild(input)

		}

		minus.onclick = function() {

			if (count != 1) {

				count--

				let inputs = interviewContainer.children
				let input = inputs[inputs.length - 1]
				interviewContainer.removeChild(input)
				noInterview.value = count

			}

		}

		//difficult questions starts here

		let Dcount = 1;

		Dplus.onclick = function() {

			Dcount++

			let input = document.createElement('input')
			input.name = 'douts-' + Dcount
			input.classList.add('form-control')
			input.value = 'Q:' + Dcount + ') ?'
			DInterview.value = Dcount

			difficultContainer.appendChild(input)

		}

		Dminus.onclick = function() {

			if (Dcount != 1) {

				Dcount--

				let inputs = difficultContainer.children
				let input = inputs[inputs.length - 1]
				DInterview.value = Dcount
				difficultContainer.removeChild(input)

			}

		}
	</script>

</body>
</html>