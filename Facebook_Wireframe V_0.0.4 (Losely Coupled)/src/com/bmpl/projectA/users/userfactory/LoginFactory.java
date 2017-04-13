package com.bmpl.projectA.users.userfactory;

import java.util.ResourceBundle;

import com.bmpl.projectA.users.signin.dao.ILoginDAO;
import com.bmpl.projectA.users.signin.helper.ILoginHelper;

public class LoginFactory {
	
	private LoginFactory(){}
	
	public static ILoginDAO getObjectDAO() throws Exception{
		ResourceBundle rs = ResourceBundle.getBundle("config");
		return (ILoginDAO)Class.forName(rs.getString("user_login_dao")).newInstance();

	}
	
	public static ILoginHelper getObjectHelper() throws Exception{
		ResourceBundle rs = ResourceBundle.getBundle("config");
		return (ILoginHelper)Class.forName(rs.getString("user_login_helper")).newInstance();
	}

}
