package com.bmpl.projectA.users.signin.dto;

import com.bmpl.projectA.users.message.Message;

public class LoginDTO {
	private String username;
	private String password;
	public Message userMessage=new Message();


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Message getUserMessage() {
		return userMessage;
	}
	public void setUserMessage(Message userMessage) {
		this.userMessage = userMessage;
	}

}
