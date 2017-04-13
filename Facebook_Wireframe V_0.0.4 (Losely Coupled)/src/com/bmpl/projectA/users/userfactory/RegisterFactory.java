package com.bmpl.projectA.users.userfactory;

import java.util.ResourceBundle;

import com.bmpl.projectA.users.signup.dao.IRegisterDAO;
import com.bmpl.projectA.users.signup.helper.IRegisterHelper;

public class RegisterFactory {
	
	private RegisterFactory(){}
	
	public static IRegisterHelper getObjectHelper() throws Exception{
		
		ResourceBundle rs =ResourceBundle.getBundle("config");
		return (IRegisterHelper)Class.forName(rs.getString("user_register_helper")).newInstance();
	}
	
	public static IRegisterDAO getObjectDAO() throws Exception{
		
		ResourceBundle rs = ResourceBundle.getBundle("config");
		return (IRegisterDAO)Class.forName(rs.getString("user_register_dao")).newInstance();
	}

}
