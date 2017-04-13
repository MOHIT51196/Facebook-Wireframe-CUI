package com.bmpl.projectA.users.signin.dao;

import com.bmpl.projectA.users.database.Database;
import com.bmpl.projectA.users.dto.UserDTO;
import com.bmpl.projectA.users.signin.dto.LoginDTO;

public class LoginDAO extends Database implements ILoginDAO {
	
	public boolean isAuthenticUser(LoginDTO loginDTO){
		boolean isAuthentic=false;
		
		if(isDataCorrect(loginDTO)){
			isAuthentic=true;
			
		}
		
		return isAuthentic;
	}
	
	public UserDTO getUserData(LoginDTO loginDTO){
		return super.getDatabase((UserDTO)loginDTO);
	}

}
