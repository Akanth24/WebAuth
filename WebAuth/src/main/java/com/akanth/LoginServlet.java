package com.akanth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.akanth.Dao.LoginDao;
import com.akanth.Dao.welcomeDao;

public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        LoginDao login = new LoginDao();
        
        if (login.loginCheck(username, password)) {
            // Successful login
        	
        	HttpSession session = request.getSession();
        	session.setAttribute("username", username);
        	
        	response.sendRedirect("welcome.jsp");
//        	RequestDispatcher rd = request.getRequestDispatcher("welcomeServlet");
//        	rd.forward(request, response);
        	
        } else {
            // Failed login
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body><h2>Login failed. Invalid username or password.</h2></body></html>");
        }
	}

}
