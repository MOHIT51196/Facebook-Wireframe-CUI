package com.bmpl.projectA.users.signup.dao;

import com.bmpl.projectA.users.database.Database;
import com.bmpl.projectA.users.signup.dto.RegisterDTO;

public class RegisterDAO extends Database{
	
	
	public boolean findUser(RegisterDTO registerDTO) {
		
		boolean found_user=false;
		
		if(isUserExist(registerDTO)){
			found_user=true;
		}

		return found_user;
	}
	
	public void Register(RegisterDTO registerDTO) {
	
		super.putDatabase(registerDTO);
		
	}
	


}
