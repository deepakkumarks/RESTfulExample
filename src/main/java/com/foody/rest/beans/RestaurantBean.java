package com.foody.rest.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RestaurantBean {
	
	String restaurantId;
	String restaurantEmailId;
	String restaurantPassword;
	
	public RestaurantBean(){
		String restaurantId = "";
		String restaurantEmailId = "";
		String restaurantPassword = "";
	}
	
	public RestaurantBean(String restaurantId, String restaurantEmailId, String restaurantPassword){
		this.restaurantId = restaurantId;
		this.restaurantEmailId = restaurantEmailId;
		this.restaurantPassword = restaurantPassword;
	}
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantEmailId() {
		return restaurantEmailId;
	}
	public void setRestaurantEmailId(String restaurantEmailId) {
		this.restaurantEmailId = restaurantEmailId;
	}
	public String getRestaurantPassword() {
		return restaurantPassword;
	}
	public void setRestaurantPassword(String restaurantPassword) {
		this.restaurantPassword = restaurantPassword;
	}
	@Override
	public String toString() {
		return "RestaurantBean [restaurantId=" + restaurantId + ", emailId=" + restaurantEmailId + ", password=" + restaurantPassword
				+ ", getRestaurantId()=" + getRestaurantId() + ", getRestaurantEmailId()=" + getRestaurantEmailId() + ", getRestaurantPassword()="
				+ getRestaurantPassword() + "]";
	}
	
	
	

}
