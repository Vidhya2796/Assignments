package com.vidhyac.dao;

import java.util.ArrayList;

import com.vidhyac.pojo.User;

public class UserDAO {
	ArrayList<User> userList;
	
	public UserDAO(){
		userList = new ArrayList<>();
		userList.add(new User("Vidhya", "java", "Admin"));
		userList.add(new User("Sachin", "sql", "User"));
		userList.add(new User("Rahul", "java", "Admin"));
	}
	
	public String getUserType(String userName,String password) {
		for (User user : userList) {
			if (user.getUserName().equals(userName) && user.getPassword().equals(password)) 
			{
				return user.getUserType();
			}
		}
		throw new InvalidUserException("User name and password doesn't exist...");
	}
}
