package com.bmpl.projectA.users.signin.helper;

import com.bmpl.projectA.users.dto.UserDTO;
import com.bmpl.projectA.users.signin.dao.LoginDAO;
import com.bmpl.projectA.users.signin.dto.LoginDTO;

public class LoginHelper {
private LoginDAO loginDAO=new LoginDAO();	
private UserDTO userDTO=new UserDTO();
//private Message message=new Message();

private String err_username="\n\t\t\t[!] Username Invalid  ( missing character '@' or '.')";
private String err_validate="\n\t\t\t[!] Please enter some values in the fields";
private String err_login="\n\t\t\t[!] Invalid Username or Password";
private String err_status="NO_LOGIN_ACCESS";
private String login_status="LOGIN_ACCESS";

	
	private boolean isValidate(LoginDTO loginDTO) {
		boolean isValid=false;
		
		
		if(loginDTO.getUsername().trim().length()!=0 
				&& loginDTO.getPassword().trim().length()!=0 ){
			
				if(loginDTO.getUsername().contains("@") && loginDTO.getUsername().contains(".")){
					isValid=true;
				}
				
				else{
					userDTO.getUserMessage().setMessage(err_username);
				}
		}
		else{
			userDTO.getUserMessage().setMessage(err_validate);
		}	
		return isValid;

	}
	
	public UserDTO isUserExist(LoginDTO loginDTO){
		
		if(isValidate(loginDTO)){
			
			if(loginDAO.isAuthenticUser(loginDTO)){
				
				userDTO=loginDAO.getUserData(loginDTO);
				userDTO.getUserMessage().setStatus(login_status);
				userDTO.getUserMessage().setMessage("\n\n\t\t\t\t	Welcome "+loginDTO.getUsername());
				
				
			}
			
			else{
				userDTO.getUserMessage().setMessage(err_login);
				userDTO.getUserMessage().setStatus(err_status);
			}
		}
		
		else{
			userDTO.getUserMessage().setStatus(err_status);
		}
		
		return userDTO;
	}
}
