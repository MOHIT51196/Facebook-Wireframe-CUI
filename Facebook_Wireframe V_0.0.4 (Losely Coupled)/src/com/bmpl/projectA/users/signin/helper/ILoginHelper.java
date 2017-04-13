package com.bmpl.projectA.users.signin.helper;

import com.bmpl.projectA.users.dto.UserDTO;
import com.bmpl.projectA.users.signin.dto.LoginDTO;

public interface ILoginHelper {
	
	public UserDTO isUserExist(LoginDTO loginDTO);

}
