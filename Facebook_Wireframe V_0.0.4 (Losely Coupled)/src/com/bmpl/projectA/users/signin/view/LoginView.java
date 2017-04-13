package com.bmpl.projectA.users.signin.view;

import java.util.Scanner;

import com.bmpl.projectA.users.dto.UserDTO;
import com.bmpl.projectA.users.signin.dto.LoginDTO;
import com.bmpl.projectA.users.userfactory.LoginFactory;

public class LoginView {
	private Scanner in=new Scanner(System.in);
	private UserDTO userDTO=new UserDTO();

	
	public UserDTO doLogin(LoginDTO loginDTO) throws Exception {
	
	if(loginDTO.getUserMessage().getStatus()==null){
		loginDTO.userMessage.setStatus("");
		
		
	}
	if(!loginDTO.getUserMessage().getStatus().equals("REGISTER_ACCESS")){	
		
		System.out.println("\n\n\t**************************** SIGN IN *******************************\n");
		System.out.print("\nEnter the Username : ");
		String username=in.next();
		System.out.print("\nEnter the Password : ");
		String password=in.next();
		
		
		loginDTO.setUsername(username);
		loginDTO.setPassword(password);
	}
	
		
		userDTO=LoginFactory.getObjectHelper().isUserExist(loginDTO);

		
		return userDTO;
	}


}
