package com.tka.july13.entity;

public class Z_user {
	private int id;
	private String name;
	private String email;
	
	public Z_user() {
		super();
	}
	
	public Z_user(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	 @Override
	    public String toString() {
	        return "Z_user [id=" + id +
	               ", name=" + name +
	               ", email=" + email + "]";
	    }
}
