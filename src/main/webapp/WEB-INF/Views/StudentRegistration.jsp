<%@page import="com.Entity.EnquiryBean"%>
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
	text-align: center;
	background-color: #f0f0f0;
}

.table {
	width: 400px;
	border-collapse: collapse;
}

th, td {
	padding: 8px;
	text-align: left;
	border-bottom: 1px solid #ddd;
}

.container {
	max-width: 100%;
	margin: 20px auto;
	padding: 20px;
	background-color: #ffffff;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.header {
	margin-bottom: 20px;
}

.header h1 {
	margin: 0;
	font-size: 28px;
}

.camera-container {
	display: flex;
	flex-direction: column;
	align-items: center;
	margin-top: 20px;
}

.camera-frame {
	width: 250px;
	height: 250px;
	border-radius: 50%;
	overflow: hidden;
	margin-bottom: 10px;
	border: 1px solid #ccc;
}

#videoStream {
	width: 100%;
	height: 100%;
	max-width: 100%;
	border-radius: 50%;
}

#photoCanvas {
	width: 100%;
	max-width: 100%;
	height: 100%;
}

.camera-container .buttons {
	display: flex;
	justify-content: space-between;
	max-width: 640px;
	width: 80%;
}

.camera-container button {
	padding: 10px 20px;
	font-size: 16px;
	border: none;
	background-color: #007BFF;
	color: #fff;
	cursor: pointer;
	transition: background-color 0.3s;
}

.camera-container button:hover {
	background-color: #0056b3;
}

.photo-input {
	margin-top: 10px;
}

.btn-primary {
	width: 100px;
}

.submit-button {
	margin-top: 20px;
	text-align: center;
}
</style>
</head>
<c:set var="registerBean" value="${sessionScope.RegisterObj}" />
<c:if test="${registerBean eq null}">
	<c:set var="registerBean" value="${sessionScope.RecentRegisterObj}" />
</c:if>
<body>
	<%@include file="LoginHedder.jsp"%>
	<div class="container">
		<div class="header">
			<h1 align="center">Registration Form</h1>
		</div>
		<form action="studentregister" method="post"
			enctype="multipart/form-data">
			<div class="camera-container">
				<div class="camera-frame">
					<video id="videoStream" autoplay muted></video>
					<canvas id="photoCanvas" style="display: none;"></canvas>
					<input type="hidden" id="imageDataInput" name="imageData" value="">
				</div>



				<div class="buttons">
					<button type="button" onclick="startCamera()">Start Camera</button>
					<button type="button" onclick="takePhoto()">Take Photo</button>
					<button type="button" onclick="selectPhoto()">Select Photo</button>
				</div>
				<input type="file" id="photoInput" name="profilephoto"
					class="photo-input" accept="image/*"
					onchange="handleSelectedPhoto(event)" style="display: none;">
			</div>
			<table>
				<tr>
					<th><label for="applicantName">Applicant Name:</label></th>
					<td><input type="text" value="${ registerBean.getName()}"
						name="name"></td>
				</tr>
				<tr>
					<th><label for="address">Residential Address:</label></th>
					<td><input type="text" value="${ registerBean.getAddress()}"
						name="address"></td>
				</tr>
				<tr>
					<th><label for="applicantName">Gender:</label></th>
					<td><input type="text" value="${ registerBean.getGender()}"
						name="gender"></td>
				</tr>
				<tr>
					<th><label for="applicantName">Marital Status:</label></th>
					<td><input type="text"
						value="${ registerBean.getMarritualStatus()}"
						name="marritualStatus"></td>
				</tr>


				<tr>
					<th><label for="dob">Date of Birth:</label></th>
					<td><input type="date"
						value="${ registerBean.getDateOfBirth()}" name="dateOfBirth"></td>
				</tr>
				<tr>
					<th><label for="pan">Identity Proof (PAN):</label></th>
					<td><input type="text" id="panNumber" name="panNumber"
						required="required"></td>
					<td>
						<h6 align="center">
							<span style="color: cremson;">${pan }</span>
						</h6>
					</td>
				</tr>

				<tr>
					<th><label for="aadhar">Address Proof (Aadhar No):</label></th>
					<td><input type="number" id="adharNumber" name="adharNumber"
						required="required"></td>
					</td>
					<td>
						<h6 align="center">
							<span style="color: cremson;">${adhar }</span>
						</h6>
					</td>

				</tr>
				<tr>
					<th><label for="email">Email Id:</label></th>
					<td><input type="email" value="${ registerBean.getEmail()}"
						name="email"></td>
				</tr>
				<tr>
					<th><label for="contact">Contact No:</label></th>
					<td><input type="tel" value="${ registerBean.getContactNo()}"
						name="contactNo"></td>
				</tr>
				<tr>
					<th><label for="gender">Courses:</label></th>
					<td><select id="course" name="course" required>
							<option value="">Select Courses</option>
							<option value="java">Java</option>
							<option value="c++">C++</option>
							<option value="html">Html</option>
					</select></td>
				</tr>
				<tr>
					<th><label for="applicantName">Academic Qualification:</label></th>
					<td><input type="text"
						value="${ registerBean.getQualification()}" name="Qualification"></td>
				</tr>
				<tr>
					<th>Qualification Detail</th>
					<th>Name of School/College</th>
					<th>Percentage</th>
					<th>Year of Passing</th>
				</tr>
				<tr>
					<th>SSC:</th>
					<td><input type="text"
						value="${ registerBean.getSscSchoolName()}" name="sscSchoolName"></td>
					<td><input type="text"
						value="${ registerBean.getSscPercentage()}" name="sscPercentage"></td>
					<td><input type="text"
						value="${ registerBean.getSscYearOfPassing()}"
						name="sscYearOfPassing"></td>
				</tr>
				<tr>
					<th>HSC:</th>
					<td><input type="text"
						value="${ registerBean.getHscSchoolName()}" name="hscSchoolName"></td>
					<td><input type="text"
						value="${ registerBean.getHscPercentage()}" name="hscPercentage"></td>
					<td><input type="text"
						value="${ registerBean.getHscYearOfPassing()}"
						name="hscYearOfPassing"></td>
				</tr>
				<tr>
					<th>Graduate:</th>
					<td><input type="text"
						value="${ registerBean.getGraduationCollegeName()}"
						name="graduationCollegeName"></td>
					<td><input type="text"
						value="${ registerBean.getGraduationPercentage()}"
						name="graduationPercentage"></td>
					<td><input type="text"
						value="${ registerBean.getGraduationYearOfPassing()}"
						name="graduationYearOfPassing"></td>
				</tr>
				<tr>
					<th>Post Graduate:</th>
					<td><input type="text"
						value="${ registerBean.getPostgraduationQualification()}"
						name="postgraduationQualification"></td>
					<td><input type="text"
						value="${ registerBean.getPostgraduationPercentage()}"
						name="postgraduationPercentage"></td>
					<td><input type="text"
						value="${ registerBean.getPostgraduationYearOfPassing()}"
						name="postgraduationYearOfPassing"></td>
				</tr>

			</table>
			<div class="submit-button">
				<button type="submit" onclick="submitForm()">Submit</button>
			</div>
		</form>
	</div>
	<h2 align="center">
		<span style="color: crimson;">${exist }</span>
	</h2>
	<h2 align="center">
		<span style="color: crimson;">${reg }</span>
	</h2>

	<script>
    let mediaStream;

    function startCamera() {
      if (navigator.mediaDevices && navigator.mediaDevices.getUserMedia) {
        navigator.mediaDevices.getUserMedia({ video: { facingMode: 'environment' } })
          .then(function (stream) {
            mediaStream = stream;
            const videoStream = document.getElementById('videoStream');
            videoStream.style.display = 'block';
            const photoCanvas = document.getElementById('photoCanvas');
            photoCanvas.style.display = 'none';
            videoStream.srcObject = stream;
          })
          .catch(function (error) {
            console.error('Error accessing the camera: ', error);
          });
      } else {
        console.error('getUserMedia API not supported in this browser.');
      }
    }

    function takePhoto() {
      const videoStream = document.getElementById('videoStream');
      const photoCanvas = document.getElementById('photoCanvas');
      const context = photoCanvas.getContext('2d');
      photoCanvas.width = videoStream.videoWidth;
      photoCanvas.height = videoStream.videoHeight;
      context.drawImage(videoStream, 0, 0, photoCanvas.width, photoCanvas.height);
      videoStream.style.display = 'none';
      photoCanvas.style.display = 'block';

      if (mediaStream) {
        mediaStream.getTracks().forEach(function (track) {
          track.stop();
        });
      }
    }
    function selectPhoto() {
      const photoInput = document.getElementById('photoInput');
      photoInput.click();
    }

    function handleSelectedPhoto(event) {
      const selectedPhoto = event.target.files[0];
      if (selectedPhoto && selectedPhoto.type.startsWith('image/')) {
        const reader = new FileReader();
        reader.onload = function (e) {
          const img = new Image();
          img.onload = function () {
            const photoCanvas = document.getElementById('photoCanvas');
            const context = photoCanvas.getContext('2d');
            photoCanvas.width = img.width;
            photoCanvas.height = img.height;
            context.drawImage(img, 0, 0);
          };
          img.src = e.target.result;
          const videoStream = document.getElementById('videoStream');
          videoStream.style.display = 'none';
          const photoCanvas = document.getElementById('photoCanvas');
          photoCanvas.style.display = 'block';
        };
        reader.readAsDataURL(selectedPhoto);
      }
    }
    function submitForm() {
        const photoCanvas = document.getElementById('photoCanvas');
        const imageData = photoCanvas.toDataURL('image/jpeg'); // Convert canvas to Data URL
        const imageDataInput = document.getElementById('imageDataInput');
        imageDataInput.value = imageData; // Set the Data URL as the value of the hidden input field

        // Submit the form to another JSP page with the Data URL as a parameter
        const form = document.createElement('form');
        form.method = 'post';
        form.action = 'studentregister'; // Replace 'another-page.jsp' with the actual JSP page URL
        form.style.display = 'none';
        const input = document.createElement('input');
        input.type = 'hidden';
        input.name = 'imageData';
        input.value = imageData;
        form.appendChild(input);
        document.body.appendChild(form);
        form.submit();
      }
  </script>
</body>
</html>
