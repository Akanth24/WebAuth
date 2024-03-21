<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Videos</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
}

.videos-container {
	max-width: 800px;
	margin: 0 auto;
	padding: 20px;
	background-color: #fff;
	border-radius: 8px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

h1 {
	text-align: center;
	margin-bottom: 20px;
}

.video {
	margin-bottom: 20px;
}

.video iframe {
	width: 100%;
	height: 315px; /* Adjust the height as needed */
	border: none;
}

.logout-btn, .back-btn {
	display: block;
	text-align: center;
	padding: 10px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	text-decoration: none;
	margin-top: 20px;
	color: #fff;
}

.logout-btn {
	background-color: #dc3545;
}

.logout-btn:hover {
	background-color: #c82333;
}

.back-btn {
	background-color: #007bff;
}

.back-btn:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
	<%
	
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	if (session.getAttribute("username") == null) {
		response.sendRedirect("login.jsp");
	}
	%>

	<div class="videos-container">
		<h1>Videos</h1>

		<!-- Embedded YouTube videos -->
		<div class="video">
			<iframe width="560" height="315"
				src="https://www.youtube.com/embed/_aSS66X30Ag?si=NQaZo1E2d4EIDkIW"
				title="YouTube video player" frameborder="0"
				allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
				allowfullscreen></iframe>
		</div>
		<div class="video">
			<iframe width="560" height="315"
				src="https://www.youtube.com/embed/ivT0cjLSkPk?si=F8YuVGzvN2i0HrCn"
				title="YouTube video player" frameborder="0"
				allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
				allowfullscreen></iframe>
		</div>
		<div class="video">
			<iframe width="560" height="315"
				src="https://www.youtube.com/embed/TyskcLbCkqE?si=6ffgkBqZafZH_SJ1"
				title="YouTube video player" frameborder="0"
				allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
				allowfullscreen></iframe>
		</div>

		<!-- Logout button -->
		<a href="Logout" class="logout-btn">Logout</a>

		<!-- Back button to return to welcome page -->
		<a href="welcome.jsp" class="back-btn">Back to Welcome Page</a>
	</div>

</body>
</html>
