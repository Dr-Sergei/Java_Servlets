package com.serlets;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;

import com.abc.dao.DAO;
import com.abc.entity.User;

public class LogginProfiler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LogginProfiler() {
		super();
	}

//Servlet: arbeitet mit Daten vom HTTP Request

//HttpServletRequest: nimmt Daten von HTTP_request    

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		jakarta.servlet.RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
		dispatcher.forward(req, res);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		List<User> users = DAO.userList;
		boolean result = false;

		for (User user : users) {

			if (user.getName().equals(username) && user.getPassword().equals(password)) {
				result = true;
			}
		}
		if (result) {
			request.setAttribute("user", username);

			jakarta.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		} else {
			jakarta.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("errorPasswordOrLogin.jsp");
			dispatcher.forward(request, response);

		}

		doGet(request, response);
	}

}
