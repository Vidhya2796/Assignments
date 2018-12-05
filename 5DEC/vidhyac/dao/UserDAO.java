package com.vidhyac.dao;

import java.util.ArrayList;

import com.vidhyac.pojo.User;

public class UserDAO implements IUserDAO{
	ArrayList<User> userList;
	//this is a dummy database to store user values
	public UserDAO(){
		userList = new ArrayList<>();
		userList.add(new User("Vidhya", "java", "Admin"));
		userList.add(new User("Sachin", "sql", "User"));
		userList.add(new User("Rahul", "java", "Admin"));
	}
	
	public String getUserType(String userName,String password) {
		//why Iam using POJO class like User..because I want a table form database..and each row shld contain UN,PSWD and USERTYPE
		//If I'm using POJO class means Iteration becomes easy by using for each loop
		for (User user : userList) {
			if (user.getUserName().equals(userName) && user.getPassword().equals(password)) 
			{
				return user.getUserType();
				
				
			}
		}
		throw new InvalidUserException("User name and password doesn't exist...");
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(String userName, String oldPassword,
			String newPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUser(String userName) {
		// TODO Auto-generated method stub
		
	}
}
