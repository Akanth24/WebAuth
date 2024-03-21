
<%@ page import="com.akanth.Dao.welcomeDao,com.akanth.UserData"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Welcome</title>
<link rel="stylesheet" type="text/css" href="styles.css">

</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	if (session.getAttribute("username") == null) {
		response.sendRedirect("login.jsp");
		return;
	}
	welcomeDao welDao = new welcomeDao();

	String username = session.getAttribute("username").toString();

	UserData data = welDao.getUserDetails(username);

	String fullname = data.fullname;
	String phone = data.phone;
	String email = data.email;
	%>

	<div class="welcome-container">
		<h1>Welcome</h1>
		<div class="user-info">
			<label>Full Name:</label> <span><%=fullname%></span>
		</div>
		<div class="user-info">
			<label>Username:</label> <span><%=username%></span>
		</div>
		<div class="user-info">
			<label>Phone Number:</label> <span><%=phone%></span>
		</div>
		<div class="user-info">
			<label>Email:</label> <span><%=email%></span>
		</div>
		<div class="buttons">
			<a href="videos.jsp" class="button">Go to videos</a> <a
				href="https://www.google.com" target="_blank" class="button">Go
				to Google</a>
		</div>

		<a href="Logout" class="logout-btn">Logout</a>
	</div>
</body>
</html>
