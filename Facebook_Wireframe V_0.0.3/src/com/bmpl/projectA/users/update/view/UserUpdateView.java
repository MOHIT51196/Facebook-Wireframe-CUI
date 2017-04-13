package com.bmpl.projectA.users.update.view;

import java.util.Scanner;

import com.bmpl.projectA.users.dto.UserDTO;
import com.bmpl.projectA.users.update.dto.UserUpdateDTO;
import com.bmpl.projectA.users.update.helper.UserUpdateHelper;

public class UserUpdateView {

	private Scanner in=new Scanner(System.in);
	
	private UserUpdateDTO userUpdateDTO=new UserUpdateDTO();
	private UserUpdateHelper userUpdateHelper= new UserUpdateHelper();
	
	public void updatePost(UserDTO userDTO) {
		
		System.out.println("\n\n\tWhats on your mind ? ");
		System.out.println("\n\t\t ---->  ");
		
		String new_post=in.nextLine();
		
		userUpdateDTO.getUserPosts().setPost("\n\t\t\t"+new_post);
		
		
		
		userUpdateHelper.doPost(userDTO,userUpdateDTO);
		

	}
}
