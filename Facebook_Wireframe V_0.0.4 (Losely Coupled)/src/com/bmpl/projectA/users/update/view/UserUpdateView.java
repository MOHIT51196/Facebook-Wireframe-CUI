package com.bmpl.projectA.users.update.view;

import java.util.Scanner;

import com.bmpl.projectA.users.dto.UserDTO;
import com.bmpl.projectA.users.update.dto.UserUpdateDTO;
import com.bmpl.projectA.users.userfactory.UserFactory;

public class UserUpdateView {

	private Scanner in=new Scanner(System.in);
	
	private UserUpdateDTO userUpdateDTO=new UserUpdateDTO();
	
	public void updatePost(UserDTO userDTO) throws Exception{
		
		System.out.println("\n\n\tWhats on your mind ? ");
		System.out.println("\n\t\t ---->  ");
		
		String new_post=in.nextLine();
		
		userUpdateDTO.getUserPosts().setPost("\n\t\t\t"+new_post);
		
		
		
		UserFactory.getObjectHelper().doPost(userDTO,userUpdateDTO);
		

	}
}
