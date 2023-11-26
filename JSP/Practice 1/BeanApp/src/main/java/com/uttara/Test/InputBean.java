package com.uttara.Test;

import java.io.Serializable;

public class InputBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
	

	public InputBean() {
		System.out.println("public no arg constr in InputBean");
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println(" name : " + name);
	}
	
	public void setEmail(String email) {
		this.email = email;
		System.out.println(" email : " + email);
	}

	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return " name : " + name + " email : " + email;
	}
	
	public boolean equals(Object e) {
		
		if(e instanceof InputBean) {
			
			InputBean b = (InputBean)e;
			
			if(this.name.equals(b.name) && this.email.equals(b.email)) {
				return true;
			}
			
		}
		throw new IllegalArgumentException("Invalid Object");
	}
	
	public int hashCode() {
		return (name + email).hashCode();
	}

}
