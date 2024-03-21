# Login and Registration Web Application

This is a simple web application built using Servlets, JSP, JDBC, and MySQL. It provides functionalities for user login, registration, and viewing embedded videos. The project also includes session management to track user sessions.

## Features

- User registration: Allows new users to register by providing their full name, username, password, email, and phone number.
- User login: Existing users can log in using their username and password.
- Viewing embedded videos: Users can view embedded YouTube videos on the videos page.
- Logout: Users can log out from the application.

## Session Management

Session management is implemented to maintain user sessions throughout their interaction with the application. Here's how it works:

- **Session creation**: When a user logs in successfully, a session is created for that user.
- **Session tracking**: The server assigns a unique session ID to each session, which is stored as a cookie in the user's browser.
- **Session invalidation**: When a user logs out explicitly or when the session expires, the session is invalidated, and the user is redirected to the login page.

Session management ensures that users remain authenticated and authorized while navigating through different pages of the application. It helps maintain the user's state and provides a seamless browsing experience.

## Usage

- **Register** as a new user by providing the required information.
- **Log in** with your username and password.
- Upon successful login, you will be **redirected to the welcome page** where your user details are displayed along with a button to view videos.
- Clicking on the **videos button** will **redirect you to the videos section** where you can view embedded videos.
- **Log out** from the application at any time.

## Technologies Used

- Java Servlets: Handling server-side logic.
- JavaServer Pages (JSP): Generating dynamic web content.
- JDBC (Java Database Connectivity): Connecting to the MySQL database.
- MySQL: Database management system for storing user information.
- HTML and CSS: Front-end design and layout.
- Apache Tomcat (or any other Servlet container): Server for deploying and running the application.

