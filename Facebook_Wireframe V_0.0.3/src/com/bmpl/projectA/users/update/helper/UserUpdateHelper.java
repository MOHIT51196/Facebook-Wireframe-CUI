package com.bmpl.projectA.users.update.helper;

import java.util.Date;

import com.bmpl.projectA.users.dto.UserDTO;
import com.bmpl.projectA.users.update.dao.UserUpdateDAO;
import com.bmpl.projectA.users.update.dto.UserUpdateDTO;

public class UserUpdateHelper {
	
	private UserUpdateDAO userUpdateDAO=new UserUpdateDAO();

	private boolean isPostExist(UserUpdateDTO userUpdateDTO) {
		
		boolean isExist=false;
		
		if(userUpdateDTO.getUserPosts().getPost().trim().length()!=0)
			isExist=true;
		
		return isExist;

	}
	
	private void completeUpdatePost(UserUpdateDTO userUpdateDTO) {
		
		if(userUpdateDTO.getUserPosts().getLikes()==0)
			userUpdateDTO.getUserPosts().setLikes(0);
		
		if(userUpdateDTO.getUserPosts().getComments()==0)
			userUpdateDTO.getUserPosts().setComments(0);
		
		if(userUpdateDTO.getUserPosts().getComment_value()==null)
			userUpdateDTO.getUserPosts().setComment_value("");
		
		userUpdateDTO.getUserPosts().setPost_date(new Date());

	}
	
	public void doPost(UserDTO userDTO,UserUpdateDTO userUpdateDTO) {
		
		if(isPostExist(userUpdateDTO)){
			
			completeUpdatePost(userUpdateDTO);
		}
		
		userDTO.getUserPosts().add(userUpdateDTO.getUserPosts());
		
		userUpdateDAO.update(userDTO);

	}
}
