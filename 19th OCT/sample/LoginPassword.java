package com.vidhyac.sample;

import java.util.Scanner;

public class LoginPassword {
	String username;
	String password;
	String checkuser;
	String checkpswd;
	//int count;
	

	public LoginPassword() {
		username = "Vidhya";
		password = "Capgemini";
	}


	public void check() {	
		Scanner scanner = new Scanner(System.in);
		for(int count=1;count<=3;count++){
			System.out.println("Enter User Name: ");
			checkuser = scanner.nextLine();
			System.out.println("Enter Password: ");
			checkpswd = scanner.nextLine();
			
					if (checkuser.equals(username) && checkpswd.equals(password)) {
						System.out.println("Welcome " + username);
						break;
			
					}
					if(count==3)
						System.out.println("Contact Admin");
					
		}
		
		
					
}
}


