package com.bmpl.projectA.users.signup.view;

import java.util.Scanner;

import com.bmpl.projectA.users.signup.dto.RegisterDTO;
import com.bmpl.projectA.users.userfactory.RegisterFactory;

public class RegisterView {
	private Scanner in=new Scanner(System.in);
	
	public void doRegister(RegisterDTO registerDTO) throws Exception{
		

	
		System.out.println("\n\n\t**************************** SIGN UP *******************************\n");
		
		System.out.print("Enter your name : ");
		String name=in.nextLine();
		
		System.out.print("Enter your email : ");
		String email=in.next();
		
		System.out.print("Enter your phone : ");
		String phone=in.next();
		
		System.out.print("Enter your Date of Birth : ");
		String dob=in.next();
		
		System.out.print("Enter your gender : ");
		String gender=in.next();
		
		System.out.print("Enter your password : ");
		String password=in.next();
		
		System.out.println("R-enter the password : ");
		String re_password=in.next();
		
		
		registerDTO.setName(name);
		registerDTO.setUsername(email);
		registerDTO.setEmail(email);
		registerDTO.setPhonenumber(phone);
		registerDTO.setDob(dob);
		registerDTO.setGender(gender);
		registerDTO.setPassword(password);
		
		
		RegisterFactory.getObjectHelper().RegisterValidation(registerDTO, re_password);
	}

}
