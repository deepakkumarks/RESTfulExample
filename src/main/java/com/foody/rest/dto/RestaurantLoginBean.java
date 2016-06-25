package com.foody.rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RestaurantLoginBean {
	
	String restaurantEmailId;
	String restaurantPassword;
	
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
		return "RestaurantLoginBean [restaurantEmailId=" + restaurantEmailId + ", restaurantPassword=" + restaurantPassword + "]";
	}
	
	

}
