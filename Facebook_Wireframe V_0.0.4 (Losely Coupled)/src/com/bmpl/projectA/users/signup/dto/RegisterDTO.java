package com.bmpl.projectA.users.signup.dto;

import com.bmpl.projectA.users.signin.dto.LoginDTO;

public class RegisterDTO extends LoginDTO {
	
	private String name;
	private String phonenumber;
	private String email;
	private String dob;
	private String gender;
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email.trim();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name.trim();
	}
	
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber.trim();
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob.trim();
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender.trim();
	}

}
