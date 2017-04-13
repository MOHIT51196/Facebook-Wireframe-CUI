package com.bmpl.projectA.users.dto;

import java.util.ArrayList;

import com.bmpl.projectA.users.miscdata.UserMiscData;
import com.bmpl.projectA.users.posts.UserPosts;
import com.bmpl.projectA.users.signup.dto.RegisterDTO;

public class UserDTO extends RegisterDTO{
	private ArrayList<UserPosts> userPosts=new ArrayList<UserPosts>();
	private UserMiscData userDataMisc=new UserMiscData();
	
	
	public UserMiscData getUserDataMisc() {
		return userDataMisc;
	}
	public void setUserDataMisc(UserMiscData userDataMisc) {
		this.userDataMisc = userDataMisc;
	}
	public ArrayList<UserPosts> getUserPosts() {
		return userPosts;
	}
	public void setUserPosts(ArrayList<UserPosts> userPosts) {
		this.userPosts = userPosts;
	}
}
