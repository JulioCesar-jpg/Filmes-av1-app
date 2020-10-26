package com.mycompany.filmes.app.models;

public class Customers {
	private String name;
	private String cpf;
	private String password;
	private String birth;
	
	public Customers(String name, String cpf, String password, String birth) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.password = password;
		this.birth = birth;
	}
	
	public Customers(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
}
