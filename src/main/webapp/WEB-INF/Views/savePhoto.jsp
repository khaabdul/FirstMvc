<%-- <%@page import="com.Entity.Image"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.Base64"%>

<%
String imageData = request.getParameter("photoData");
if (imageData != null && !imageData.isEmpty()) {
	// Decode the base64-encoded image data
	byte[] decodedImageData = Base64.getDecoder().decode(imageData.split(",")[1]);
	out.print(decodedImageData);
	Image image = new Image();
	image.setImage(decodedImageData);

} else {
	// Handle the case when no photo is captured
	out.print("No photo captured.");
}
%> --%>
