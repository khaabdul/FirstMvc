<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.Entity.RegisterBean"%>
<%@page import="com.Entity.FeesReceiptBean"%>
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
<c:set var="registerBean" value="${sessionScope.RegisterObj}" />
<c:if test="${registerBean eq null}">
	<c:set var="registerBean" value="${sessionScope.RecentRegisterObj}" />
</c:if>
<c:set var="feesReceiptBean" value="${sessionScope.fees}" />
<c:if test="${feesReceiptBean eq null}">
	<c:set var="feesReceiptBean" value="${sessionScope.Recentfees}" />
</c:if>
<c:set var="totalfees" value="0" />

<c:set var="feespaid" value="0" />

<c:set var="course" value="${registerBean.course}" />

<c:choose>
	<c:when test="${course.equalsIgnoreCase('java')}">
		<c:set var="totalfees" value="30000" />
	</c:when>
	<c:when test="${course.equalsIgnoreCase('html')}">
		<c:set var="totalfees" value="25000" />
	</c:when>
	<c:when test="${course.equalsIgnoreCase('c++')}">
		<c:set var="totalfees" value="20000" />
	</c:when>
</c:choose>

<body>
	<%@include file="LoginHedder.jsp"%>
	<div class="container">
		<h2 class="text-center mb-4">Fees Receipt</h2>
		<form action="feesrec" method="post">
			<div class="form-group">
				<label for="fullName">Student Id</label> <input type="text"
					class="form-control" id="fullName" name="id"
					value="${registerBean.getId()}" required readonly>
			</div>
			<div class="form-group">
				<label for="fullName">Full Name</label> <input type="text"
					class="form-control" id="fullName" name="name"
					value="${registerBean.getName()}" required readonly>
			</div>
			<div class="form-group">
				<label for="fullName">Email Id</label> <input type="text"
					class="form-control" id="email" name="email"
					value="${registerBean.getEmail()}" required readonly>
			</div>

			<div class="form-group">
				<label for="phoneNumber">Phone Number</label> <input type="tel"
					class="form-control" id="phoneNumber" name="number"
					value="${registerBean.getContactNo()}" required readonly>
			</div>
			<div class="form-group">
				<label for="fullName">Courses Selected</label> <input type="text"
					class="form-control" id="fullName" name="course"
					value="${registerBean.getCourse()}" required readonly>
			</div>
			<div class="form-group">
				<label for="fullName">Instalment No</label> <input type="number"
					class="form-control" id="instalmentNo" name="instalmentNo"
					value="${feesReceiptBean.getInstalmentNo()+1}" required readonly>
			</div>

			<div class="form-group">
				<label for="totalFees">Total Fees</label> <input type="text"
					class="form-control" value="${totalfees }" id="totalFees"
					name="totalFees" required readonly>
			</div>

			<div class="form-group">
				<label for="totalFees">TotalfeesPaid</label> <input type="text"
					class="form-control"
					value="${ feesReceiptBean.getTotalfeesPaid()+0}" id="totalfeesPaid"
					name="totalfeesPaid" required readonly>
			</div>
			<div class="form-group">
				<label for="totalFees">Balance Fees</label> <input type="text"
					class="form-control"
					value="${totalfees - feesReceiptBean.getTotalfeesPaid() }"
					id="feesPaid" name="balanceFees" required readonly>
			</div>



			<div class="form-group">
				<label for="email">Amount To Pay</label> <input type="text"
					class="form-control" id="feesAmount" name="feesAmount"
					placeholder="Enter Amount to pay" required>
			</div>
			<div class="form-group">
				<label for="courses">Payment Mode:</label> <select
					name="paymentMode" id="courses" class="form-control" required>
					<option value="">Select Mode</option>
					<option value="cash">Cash</option>
					<option value="online">Online</option>
				</select>
			</div>
			<button type="submit" class="btn btn-primary btn-block">Submit</button>
		</form>

		<h2 align="center">
			<span style="color: crimson;">${fe }</span>
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
