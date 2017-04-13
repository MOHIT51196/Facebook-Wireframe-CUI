package com.bmpl.projectA.users.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.bmpl.projectA.users.dto.UserDTO;
import com.bmpl.projectA.users.miscdata.UserMiscData;
import com.bmpl.projectA.users.posts.UserPosts;
import com.bmpl.projectA.users.signin.view.LoginView;
import com.bmpl.projectA.users.signup.view.RegisterView;
import com.bmpl.projectA.users.update.view.UserUpdateView;

public class MainView {
	
	private static Scanner in=new Scanner(System.in);
	
	private UserDTO userDTO=new UserDTO();
	private LoginView loginView=new LoginView();
	private RegisterView registerView=new RegisterView();
	private UserUpdateView userUpdateView=new UserUpdateView();

	
	
	public void UserView() throws Exception {
		
		System.out.println("\n\t**************************** Welcome to FACEBOOK *******************************\n");
		
		System.out.println("Choose one of the options below :\n");
		
		System.out.println("\t\t\t\t\t1.Sign-Up (To register your facebbok account)");
		System.out.println("\t\t\t\t\t2.Sign-In (If you are already have a facebook account)");
		
		System.out.print("YOUR CHOICE : >	");
		
//		try{
		int choice=in.nextInt();
		

		switch(choice){ 
		
		case 1 : 
			registerView.doRegister(userDTO);
			System.out.println(userDTO.getUserMessage().getMessage());
			
			if(userDTO.getUserMessage().getStatus().equals("NO_REGISTER_ACCESS")){
				break;
			}
			
		case 2 :
				
			userDTO=loginView.doLogin(userDTO);
			System.out.println(userDTO.getUserMessage().getMessage());
			
			if(userDTO.getUserMessage().getStatus().equals("LOGIN_ACCESS")){
				
				boolean  isLogout=false;
				
					do{
					bringTimelineHeader(userDTO.getUserDataMisc());
					
					bringTimeline(userDTO);
					
					bringTimelinePost(userDTO.getUserPosts());
					
					bringTimelineUpdate(userDTO);
					
					System.out.print("\n\n\t-----> LOGOUT from Facebook ?  : ");
					String login_continue=in.next();
					
					if(login_continue.trim().toLowerCase().charAt(0)=='y')
						isLogout=true;
					
					else{
						
					}
						
					}while(!isLogout);
				
			}
			
			break;
			
		default :	System.out.println("\n\t\t\t[!] INVALID REQUEST"); 
			
		}
		
//		}
//		
//		catch (InputMismatchException err){
//			System.out.println("\n\t\t\t[!] ERROR : INVALID REQUEST FROM THE USER");
//		}
//		
		
	}
	
	private void bringTimeline(UserDTO userDTO) {
		
		System.out.println("\n\nNAME  		 : "+userDTO.getName().toUpperCase());
		System.out.println("BORN ON 	 : "+userDTO.getDob());
		System.out.println("EMAIL 		 : "+userDTO.getEmail());
		System.out.println("PHONE NUMBER     : "+userDTO.getPhonenumber()+"  ( privacy setting > Visible : Only me )");
		System.out.println("GENDER 		 : "+userDTO.getGender());
		System.out.println("\n\n\n\t\t\t------------------------- TIMELINE ------------------------------\n\n");
		
	}
	
	private void bringTimelineHeader(UserMiscData userMiscData) {
		
		System.out.println("\n\n------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\tF A C E B O O K");
		
		System.out.println("\t\t\t\t\t\t\t\t[ FRIEND REQUESTS "+userMiscData.getFriend_request()
						+" ]  [ MESSAGES "+userMiscData.getAccount_messages()
						+" ]  [ NOTIFICATION "+userMiscData.getNotifications()+" ]");
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
	}

	private void bringTimelinePost(ArrayList<UserPosts> userPosts) {
		
		int indent_index=0;
		
		for(UserPosts user_fbpost : userPosts ){
			
			if(indent_index!=0){
				System.out.println("\n\t------------------------------------------------------------------------------------------------------------------\n");
			}
			System.out.println(userDTO.getName().toUpperCase() + "\n[ posted on "+user_fbpost.getPost_date()+" ]  : \n");
			
			
			System.out.println("\n"+user_fbpost.getPost());
			System.out.println("\n\n\t\tLIKES : "+user_fbpost.getLikes());
			System.out.println("\t\tCOMMENT : "+user_fbpost.getComments());
			
			if(user_fbpost.getComment_value().trim().length()!=0) {
				System.out.println("\t\t --> OTHER USER  commented : :  "+user_fbpost.getComment_value());
			}
			
		indent_index++;
		}
	}
	
	private void bringTimelineUpdate(UserDTO userDTO) throws Exception{
		
		System.out.print("\n\n\t-----> Want to update your Timeline ?  :  ");
		String update_choice=in.next();
		
		if(update_choice.trim().toLowerCase().charAt(0)=='y'){
			userUpdateView.updatePost(userDTO);
			
			System.out.println("\n\t\t\tSuccessfully Posted..........");
		}
		
		else{
			System.out.println("\n\t\t\t[*] No updation done");
		}
			
	}

}
