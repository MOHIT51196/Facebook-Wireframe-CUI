package com.bmpl.projectA.users.signup.dao;

import com.bmpl.projectA.users.signup.dto.RegisterDTO;

public interface IRegisterDAO {
	
	public void Register(RegisterDTO registerDTO) ;
	public boolean findUser(RegisterDTO registerDTO) ;

}
