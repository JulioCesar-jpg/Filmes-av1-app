package com.mycompany.filmes.app.db;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import com.mycompany.filmes.app.models.Customers;

public class CustomersDB {

	static public List<Customers> customersList;
// op
	public CustomersDB(ServletContext context) {
		if (context.getAttribute("customersList") != null) {
			this.customersList = (List) context.getAttribute("customersList");
		} else {
			this.customersList = new ArrayList<>();
			context.setAttribute("customersList", this.customersList);
		}
	}

	public void save(Customers customer) {
		this.customersList.add(customer);
		System.out.println("Log --- " + customersList);
	}

	public void listAll() {
	}
}
