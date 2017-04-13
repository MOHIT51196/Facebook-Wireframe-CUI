package com.bmpl.projectA.users.userfactory;

import java.util.ResourceBundle;

import com.bmpl.projectA.users.update.dao.IUserUpdateDAO;
import com.bmpl.projectA.users.update.helper.IUserUpdateHelper;

public class UserFactory {

	private UserFactory(){}
	
	public static IUserUpdateDAO getObjectDAO() throws Exception{
		
		ResourceBundle rs = ResourceBundle.getBundle("config");
		return (IUserUpdateDAO)Class.forName(rs.getString("user_update_dao")).newInstance();
	}
	
	public static IUserUpdateHelper getObjectHelper() throws Exception{
		
		ResourceBundle rs = ResourceBundle.getBundle("config");
		return (IUserUpdateHelper)Class.forName(rs.getString("user_update_helper")).newInstance();
	}
}
