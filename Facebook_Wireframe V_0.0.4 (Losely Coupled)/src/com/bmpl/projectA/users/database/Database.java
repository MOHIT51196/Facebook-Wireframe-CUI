package com.bmpl.projectA.users.database;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import com.bmpl.projectA.users.dto.UserDTO;
import com.bmpl.projectA.users.miscdata.UserMiscData;
import com.bmpl.projectA.users.posts.UserPosts;
import com.bmpl.projectA.users.signin.dto.LoginDTO;
import com.bmpl.projectA.users.signup.dto.RegisterDTO;

public class Database {
	
	private static ArrayList <UserDTO> database=new ArrayList <UserDTO>();
	private ArrayList <UserPosts> userPosts=new ArrayList<>();
	private UserPosts single_userPost =new UserPosts();
	private UserMiscData single_userMiscData=new UserMiscData();

	
	private String post="\t\t\tLorem Ipsum is simply dummy text of the printing and typesetting industry. "
			+ "\n\t\t\tLorem Ipsum has been the industry's standard dummy text ever since the 1500s, "
			+ "\n\t\t\twhen an unknown printer took a galley of type and scrambled it to make a type specimen book. "
			+ "\n\t\t\tIt has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. "
			+ "\n\t\t\tIt was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, "
			+ "\n\t\t\tand more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
	
////	-----------------SINGLETON CLASS-------------------
//	private static Database usersDatabase;
//	public static Database getClassObject(){
//		if(usersDatabase==null){
//			usersDatabase=new Database();
//		}
//		
//		return usersDatabase;
//	}
	
	
	public Database(){
		
		prepareDummyDatabase(userPosts,single_userMiscData);
		
		
//		forms a database stimulation
		UserDTO user1=new UserDTO();
		user1.setUsername("mohit@yahoo.com");
		user1.setPassword("mohit123");
		user1.setName("mohit malhotra");
		user1.setEmail("mohit@yahoo.com");
		user1.setPhonenumber("98115726");
		user1.setGender("male");
		user1.setDob("05/11/1996");
		user1.setUserPosts(userPosts);
		user1.setUserDataMisc(single_userMiscData);
		
		database.add(user1);
		
		UserDTO user2=new UserDTO();
		user2.setUsername("mukul@gmail.com");
		user2.setPassword("mukul123");
		user2.setName("mukul juneja");
		user2.setEmail("mukul@gmail.com");
		user2.setPhonenumber("88475262");
		user2.setGender("male");
		user2.setDob("01/01/1996");
		user2.setUserPosts(userPosts);
		user2.setUserDataMisc(single_userMiscData);
		
		database.add(user2);
		
		UserDTO user3=new UserDTO();
		user3.setUsername("amit@gmail.com");
		user3.setPassword("amit123");
		user3.setName("amit srivastava");
		user3.setEmail("amit@gmail.com");
		user3.setPhonenumber("78986542");
		user3.setGender("male");
		user3.setDob("02/02/1996");
		user3.setUserPosts(userPosts);
		user3.setUserDataMisc(single_userMiscData);
		
		database.add(user3);
		
		UserDTO user4=new UserDTO();
		user4.setUsername("riya@yahoo.com");
		user4.setPassword("riya123");
		user4.setName("riya mehra");
		user4.setEmail("riya@yahoo.com");
		user4.setPhonenumber("56354277");
		user4.setGender("female");
		user4.setDob("03/03/1996");
		user4.setUserPosts(userPosts);
		user4.setUserDataMisc(single_userMiscData);
		
		database.add(user4);
	}
	
	
	private void prepareDummyDatabase(ArrayList<UserPosts> userPosts,UserMiscData single_userMiscData){
		single_userPost.setPost(post);
		single_userPost.setLikes(72);
		single_userPost.setComments(1);
		single_userPost.setComment_value("Thats true , i agree with this completely");
		single_userPost.setPost_date(new Date());
		
		userPosts.add(single_userPost);
		
		single_userMiscData.setFriend_request(12);
		single_userMiscData.setAccount_messages(22);
		single_userMiscData.setNotifications(13);
	}
	
	
	private UserPosts prepareDummyPost(){
		
		String welcome_post="\t\t\t Hi ! I am there on Facebook";
		
		single_userPost.setPost(welcome_post);
		single_userPost.setLikes(0);
		single_userPost.setComments(0);
		single_userPost.setComment_value("");
		single_userPost.setPost_date(new Date());
		
		
		
		return single_userPost;
	}
	
	
	private UserMiscData prepareDummyMiscData(){
		
		single_userMiscData.setFriend_request(0);
		single_userMiscData.setAccount_messages(0);
		single_userMiscData.setNotifications(0);
		
		return single_userMiscData;
		
	}
	
	
	
	
	public boolean isDataCorrect(LoginDTO loginDTO){
		boolean data_exist=false;
				
		for(UserDTO data : database){
			if(data.getUsername().equals(loginDTO.getUsername()) 
					&& data.getPassword().equals(loginDTO.getPassword()) )
				data_exist=true;
		}
		
		return data_exist;
	}
	
	public boolean isUserExist(LoginDTO loginDTO){
		boolean data_exist=false;
				
		for(UserDTO data : database){
			if(data.getUsername().equals(loginDTO.getUsername()) )
				data_exist=true;
		}
		
		return data_exist;
	}
	
	public UserDTO getDatabase(UserDTO userDTO){
		
		
			for(UserDTO user : database){
				
				if(user.getUsername().equals(userDTO.getUsername())){
					return user;
				}
		}
			
				return null;
	}
	
	public void putDatabase(RegisterDTO registerDTO){
		
		UserDTO userDTO=(UserDTO)registerDTO;
		
		userDTO.getUserPosts().add(prepareDummyPost());
		userDTO.setUserDataMisc(prepareDummyMiscData());
		
		database.add(userDTO);
		
	}
	
	public void updateDatabase(UserDTO userDTO){
				
		Iterator<UserDTO> iterator =database.iterator();
		
		while(iterator.hasNext()){
			
			UserDTO user=iterator.next();
			
			if(user.getUsername().equals(userDTO.getUsername())){
				
				database.remove(user);
				break;
				
			}
			

		}
		database.add(userDTO);
		
	}

}

