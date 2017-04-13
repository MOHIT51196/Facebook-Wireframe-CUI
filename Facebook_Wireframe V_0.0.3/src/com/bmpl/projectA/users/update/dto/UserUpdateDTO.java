package com.bmpl.projectA.users.update.dto;

import com.bmpl.projectA.users.posts.UserPosts;

public class UserUpdateDTO {
	
	private UserPosts userPosts=new UserPosts();

	public UserPosts getUserPosts() {
		return userPosts;
	}

	public void setUserPosts(UserPosts userPosts) {
		this.userPosts = userPosts;
	}
	

}
