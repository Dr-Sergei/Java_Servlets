package com.serlets;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;

public class LogginProfiler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LogginProfiler() {
		super();
	}

//Servlet: arbeitet mit Daten vom HTTP Request

//HttpServletRequest: nimmt Daten von HTTP_request    

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		jakarta.servlet.RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
		dispatcher.forward(req, res);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username =request.getParameter("username");
		String password = request.getParameter("password");
		
		String user = "wsergei85";
		String pw="222";
		
		if(user.equals(username)&& pw.equals(password)) {
			request.setAttribute("user",user);
			
			jakarta.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		}else {
			jakarta.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("errorPasswordOrLogin.jsp");
			dispatcher.forward(request, response);
			
		}
		
		
		doGet(request, response);
	}

}
