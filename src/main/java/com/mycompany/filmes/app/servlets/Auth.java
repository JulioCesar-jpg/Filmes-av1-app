package com.mycompany.filmes.app.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mycompany.filmes.app.db.CustomersDB;
import com.mycompany.filmes.app.db.MovieList;
import com.mycompany.filmes.app.models.Movies;

@WebServlet("/auth")
public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;

	MovieList movies = new MovieList();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String password = req.getParameter("password");

		if (CustomersDB.customersList != null) {
			for (int i = 0; i < CustomersDB.customersList.size(); i++) {
				if (name.equalsIgnoreCase(CustomersDB.customersList.get(i).getName())
						&& password.equals(CustomersDB.customersList.get(i).getPassword())) {

					HttpSession session = req.getSession();
					session.setAttribute("logger_user", CustomersDB.customersList.get(i));
					session.setMaxInactiveInterval(5);
					
					res.sendRedirect("home.jsp");
				}
			}
		} else {
			res.sendRedirect("cadastro.jsp");
		}
	}

}