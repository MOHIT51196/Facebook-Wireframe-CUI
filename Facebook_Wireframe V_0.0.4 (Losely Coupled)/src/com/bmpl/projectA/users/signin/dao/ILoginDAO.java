package com.bmpl.projectA.users.signin.dao;

import com.bmpl.projectA.users.dto.UserDTO;
import com.bmpl.projectA.users.signin.dto.LoginDTO;

 public interface ILoginDAO {
	public boolean isAuthenticUser(LoginDTO loginDTO);
	public UserDTO getUserData(LoginDTO loginDTO);

}
