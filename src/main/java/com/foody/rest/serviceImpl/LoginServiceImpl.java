package com.foody.rest.serviceImpl;

public class LoginServiceImpl {
	public boolean isUserValid(String username, String password, String pin){
		boolean isUserValid = false;
		int isUserPresent = getUser(username, password, pin);
		if(isUserPresent > 0)
			isUserValid = true;
		return isUserValid;
	}
	
	public int getUser(String username, String password, String pin){
		int userCount = 0;
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){
			userCount = 1;
		}
		return userCount;
	}
}
