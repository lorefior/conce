package com.escuela.usuario.valido;
public class Usuario {
	public Usuario() {
		super();
	}
	private String user;
	private String pass;
	
	public Usuario(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	
	
	}
}