package com.bmpl.projectA.users.signup.helper;

import com.bmpl.projectA.users.signup.dto.RegisterDTO;
import com.bmpl.projectA.users.userfactory.RegisterFactory;

public class RegisterHelper  implements IRegisterHelper{

	
	
	private String err_username="\n\t\t\t[!] Username already exists";
	private String err_password="\n\t\t\t[!] Password doesnt match";
	private String task_done="\n\t\t\t\tYour account is Successfully registered  !";
	
	private String err_status="NO_REGISTER_ACCESS";
	private String register_status="REGISTER_ACCESS";
	private String err_phone="\n\t\t\t[!] Phone number invalid";
	
	
	private boolean isPasswordCheck(String password,String re_password) {
		
		boolean password_check=false;
		
		if(password.equals(re_password))
			password_check=true;
		
		return password_check;

	}
	
	private boolean isPhonenumberCheck(String user_phNumber) {
		boolean phone_check=false;
		
		if(user_phNumber.trim().length()==10){
			
			
			for(int i=0;i<user_phNumber.length();i++){
			
			if(Character.isDigit(user_phNumber.charAt(i))){
				phone_check=true;
			}
			
			else{
				phone_check=false;
				break;
			}
			
			}
		}
		
		return phone_check;

	}
	
	@Override
	public void RegisterValidation(RegisterDTO registerDTO,String re_password) {
		
		
		try {
			if(RegisterFactory.getObjectDAO().findUser(registerDTO)){
				registerDTO.getUserMessage().setMessage(err_username);
				registerDTO.getUserMessage().setStatus(err_status);
			}
			
			else{
					if(isPasswordCheck(registerDTO.getPassword(),re_password)){
						if(isPhonenumberCheck(registerDTO.getPhonenumber())){
						RegisterFactory.getObjectDAO().Register(registerDTO);
						
						registerDTO.getUserMessage().setMessage(task_done);
						registerDTO.getUserMessage().setStatus(register_status);
						}
						
						else{
							registerDTO.getUserMessage().setMessage(err_phone);
							registerDTO.getUserMessage().setStatus(err_status);
						}
					}
					else{
						registerDTO.getUserMessage().setMessage(err_password);
						registerDTO.getUserMessage().setStatus(err_status);
					}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}

}
