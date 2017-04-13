package com.bmpl.projectA.users.update.dao;

import com.bmpl.projectA.users.database.Database;
import com.bmpl.projectA.users.dto.UserDTO;

public class UserUpdateDAO extends Database {

	public void update(UserDTO userDTO) {
		
		updateDatabase(userDTO);

	}
}
