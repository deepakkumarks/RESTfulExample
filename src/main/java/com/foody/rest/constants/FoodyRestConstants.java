package com.foody.rest.constants;

public class FoodyRestConstants {
	//STATUS CODE 
	public static final String STATUS_CODE_SUCCESS = "1";
	public static final String STATUS_CODE_FAILURE = "10";
	
	//ERROR CODE
	public static final String ERROR_CODE_NO_ERROR = "0";
	public static final String ERROR_CODE_ERROR = STATUS_CODE_FAILURE;
	
	//Login Service
	public static final String ADMIN_LOGIN_SUCCESS = "Admin Login Success";
	public static final String ADMIN_LOGIN_FAILURE = "Admin Login Failure";
	
	public static final String ERR_CODE_NO_USER_PWD_PIN = "21";
	public static final String ERR_MSSG_NO_USER_PWD_PIN = "No Username/Password/Pin is entered in page.";
	public static final String ERR_CODE_INVALID_USER = "22";
	public static final String ERR_MSSG_INVALID_USER = "Invalid Username/Password/Pin is entered.";
	
	//Restaurant Service
	public static final String STATUS_CODE_CREATE_RESTAURANT_LOGIN = "30";
	public static final String STATUS_MSSG_CREATE_RESTAURANT_LOGIN = "New Restaurant Login is created successfully";
	
	public static final String ERR_CODE_INVALID_EMAILID_PWD = "31";
	public static final String ERR_MSSG_INVALID_EMAILID_PWD = "Invalid EmailID/Password is entered.";
	
	public static final String ERR_CODE_RESTAURANT_ALREADY_PRESENT = "32";
	public static final String ERR_MSSG_RESTAURANT_ALREADY_PRESENT = "Already given Email ID is registered for another restaurant";
	
}
