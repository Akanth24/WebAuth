package com.akanth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.akanth.Dao.RegistrationDao;

public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fullname = request.getParameter("fullname");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");

		// Check if passwords match
		if (!password.equals(confirmPassword)) {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html><body><h2>Passwords do not match.</h2></body></html>");
			return; // Stop further processing
		}

//		creating UserData model

		UserData data = new UserData(fullname, username, confirmPassword, phone, email);

		RegistrationDao register = new RegistrationDao();
		if (register.registrationCheck(data)) {
			response.sendRedirect("login.jsp");
		} else {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html><body><h2>Registration failed....</h2></body></html>");
		}

	}
}
