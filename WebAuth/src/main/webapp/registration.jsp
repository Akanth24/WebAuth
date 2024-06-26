
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Registration</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.login-container {
	background-color: #ffffff;
	padding: 30px;
	border-radius: 8px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
	width: 300px;
}

h1 {
	text-align: center;
	margin-bottom: 20px;
}

label {
	font-weight: bold;
}

input[type="text"], input[type="password"], input[type="number"], input[type="email"]
	{
	width: calc(100% - 20px);
	padding: 10px;
	margin-bottom: 20px;
	border: 1px solid #ccc;
	border-radius: 4px;
}

input[type="submit"] {
	width: 100%;
	padding: 10px;
	background-color: #007bff;
	color: #fff;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
	<div class="login-container">
		<h1>Registration</h1>
		<form action="Register" method="post">
			<label for="fullname">Full Name:</label><br> <input type="text"
				id="fullname" name="fullname" required><br> <label
				for="username">Username:</label><br> <input type="text"
				id="username" name="username" required><br> <label
				for="password">Password:</label><br> <input type="password"
				id="password" name="password" required><br> <label
				for="confirmPassword">Confirm Password:</label><br> <input
				type="password" id="confirmPassword" name="confirmPassword" required><br>
			<label for="phone">Phone Number:</label><br> <input type="text"
				id="phone" name="phone" required><br> <label
				for="email">Email:</label><br> <input type="email" id="email"
				name="email" required><br> <input type="submit"
				value="Register">
		</form>
		<p>
			Already have an account? <a href="login.jsp">Register here</a>.
		</p>
	</div>
</body>
</html>
