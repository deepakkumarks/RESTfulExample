package com.foody.rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User extends DataTransferStatusBean {
	String username;
	String password;
	String pin;
	
	User(){
		this.username = new String();
		this.password = new String();
		this.pin = new String();
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
		return "AdminUser [userName=" + username + ", password=" + password + ", pin=" + pin + "]";
	}
	
//	public String toString() {
//		return "AdminUser [userName=" + userName + ", password=" + password + ", pin=" + pin + ", statusCode="
//				+ statusCode + ", statusMessage=" + statusMessage + ", errorBean=" + errorBean + ", getUserName()="
//				+ getUserName() + ", getPassword()=" + getPassword() + ", getPin()=" + getPin() + "]";
//	}
	
	
}
