package com.bmpl.projectA.users.update.helper;

import com.bmpl.projectA.users.dto.UserDTO;
import com.bmpl.projectA.users.update.dto.UserUpdateDTO;

public interface IUserUpdateHelper {

	public void doPost(UserDTO userDTO,UserUpdateDTO userUpdateDTO);
}
