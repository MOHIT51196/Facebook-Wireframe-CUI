import java.util.Scanner;

import com.bmpl.projectA.users.view.MainView;

public class TestClass {
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		boolean  isContinue=true;
		
		
		do{
			MainView mainView=new MainView();
			mainView.UserView();
			
			System.out.print("\n\nClose the Facebook Tab ?  : ");
			String choice_continue=in.next();
			
			if(choice_continue.trim().toLowerCase().charAt(0)=='y')
				System.exit(0);
				
		}while(isContinue);
		
		System.out.println("---------------------------->  APPLICATION CLOSED  <----------------------------");
		in.close();
	}
}
