package com.mycompany.filmes.app.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.filmes.app.db.CustomersDB;
import com.mycompany.filmes.app.models.Customers;

@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String cpf = req.getParameter("cpf");
		String birth = req.getParameter("birth");
		
		Customers customer = new Customers(name, cpf, password, birth );
		
        CustomersDB customerDB = new CustomersDB(getServletContext());
        customerDB.save(customer);
        
        res.sendRedirect("login.jsp");
	}


}
