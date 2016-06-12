package com.foody.rest.dto;

public class AdminUser extends DataTransferStatusBean {
	String userName;
	String password;
	String pin;
	
	AdminUser(){
		this.userName = new String();
		this.password = new String();
		this.pin = new String();
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "AdminUser [userName=" + userName + ", password=" + password + ", pin=" + pin + "]";
	}
	
//	public String toString() {
//		return "AdminUser [userName=" + userName + ", password=" + password + ", pin=" + pin + ", statusCode="
//				+ statusCode + ", statusMessage=" + statusMessage + ", errorBean=" + errorBean + ", getUserName()="
//				+ getUserName() + ", getPassword()=" + getPassword() + ", getPin()=" + getPin() + "]";
//	}
	
	
}
