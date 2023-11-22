package com.uttara.Test;

import java.io.Serializable;
import java.util.Objects;

public class RegBean implements Serializable{
	
	private String uname,email,pass,rpass;

	public RegBean() {
		System.out.println("in public no arg constr in RegBean");
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(email, pass, rpass, uname);
	}


    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegBean other = (RegBean) obj;
		return Objects.equals(email, other.email) && Objects.equals(pass, other.pass)
				&& Objects.equals(rpass, other.rpass) && Objects.equals(uname, other.uname);
	}

    @Override
	public String toString() {
		return "RegBean [uname=" + uname + ", email=" + email + ", pass=" + pass + ", rpass=" + rpass + "]";
	}


    public String getEmail() {
		return email;
	}
	
	

	public String getPass() {
		return pass;
	}
	
	public String getRpass() {
		return rpass;
	}
	
	public String getUname() {
		return uname;
	}

	public void setEmail(String email) {
		this.email = email;
		System.out.println("in set email : " + email );
	}
	
	public void setPass(String pass) {
		this.pass = pass;
		System.out.println("in set setPass : " + pass );
	}
	
	public void setRpass(String rpass) {
		this.rpass = rpass;
		System.out.println("in set setRpass : " + rpass );
	}
	
	public void setUname(String uname) {
		this.uname = uname;
		System.out.println("in set setUname : " + uname );
	}
	
}
