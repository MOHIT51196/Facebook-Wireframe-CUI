package com.bmpl.projectA.users.signup.helper;

import com.bmpl.projectA.users.signup.dto.RegisterDTO;

public interface IRegisterHelper {
	
	public void RegisterValidation(RegisterDTO registerDTO,String re_password);

}
