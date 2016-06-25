package com.foody.rest.serviceImpl;

import java.util.HashMap;

import com.foody.rest.beans.RestaurantBean;
import com.foody.rest.constants.FoodyRestConstants;
import com.foody.rest.dto.DataTransferStatusBean;
import com.foody.rest.dto.RestaurantLoginBean;

public class RestaurantServiceImpl {
	
	public static final String INVALID_RESTAURANT_DETAILS = "-1";
	
	public HashMap<String, RestaurantBean> restaurantDetailsMap = new HashMap<String, RestaurantBean>();

		
	public boolean isValidRestaurantLoginDetail(RestaurantLoginBean restaurantLoginDetails){
		boolean isValid = false;
		RestaurantBean restaurantBean = getRestaurantDetails(restaurantLoginDetails);
		if(restaurantBean!=null && restaurantBean.getRestaurantId()!=null 
				&& restaurantBean.getRestaurantId().trim().length() > 0
				&& !restaurantBean.getRestaurantId().equals(INVALID_RESTAURANT_DETAILS)){
			isValid = true;
		}
		return isValid;
	}
	
	public RestaurantBean getRestaurantDetails(RestaurantLoginBean restaurantLoginDetails){
		RestaurantBean restaurantBean = new RestaurantBean();
		if(restaurantLoginDetails!=null){
			if(restaurantLoginDetails.getRestaurantEmailId()!=null 
					&& restaurantLoginDetails.getRestaurantEmailId().trim().length() > 0
					&& restaurantLoginDetails.getRestaurantPassword()!=null 
					&& restaurantLoginDetails.getRestaurantPassword().trim().length() > 0){
				restaurantBean = (RestaurantBean)getRestaurantDetailsFromMap().get(restaurantLoginDetails.getRestaurantEmailId());
			} else {
				restaurantBean.setRestaurantId(INVALID_RESTAURANT_DETAILS);
			}
		}
		
		return restaurantBean;
	}
	
//	public DataTransferStatusBean createRestaurantLogin(RestaurantLoginBean restaurantLoginDetails){
//		DataTransferStatusBean statusBean = new DataTransferStatusBean();
//		//Already restaurant present
//		if(isValidRestaurantLoginDetail(restaurantLoginDetails)){
//			statusBean.setStatusCode(FoodyRestConstants.STATUS_CODE_FAILURE);
//			statusBean.getErrorBean().setErrorCode(FoodyRestConstants.ERR_CODE_RESTAURANT_ALREADY_PRESENT);
//			statusBean.getErrorBean().setErrorMessage(FoodyRestConstants.ERR_MSSG_RESTAURANT_ALREADY_PRESENT);
//		} else {
//			//create new restaurant
//			statusBean.setStatusCode(FoodyRestConstants.STATUS_CODE_CREATE_RESTAURANT_LOGIN);
//			statusBean.setStatusMessage(FoodyRestConstants.STATUS_MSSG_CREATE_RESTAURANT_LOGIN);
//			statusBean.getErrorBean().setErrorCode(FoodyRestConstants.ERROR_CODE_NO_ERROR);
//		}
//		return statusBean;
//	}
	
//	public DataTransferStatusBean createRestaurantLogin(RestaurantLoginBean restaurantLoginDetails){
//	DataTransferStatusBean statusBean = new DataTransferStatusBean();
//	//Already restaurant present
//	if(isValidRestaurantLoginDetail(restaurantLoginDetails)){
//		statusBean.setStatusCode(FoodyRestConstants.STATUS_CODE_FAILURE);
//		statusBean.getErrorBean().setErrorCode(FoodyRestConstants.ERR_CODE_RESTAURANT_ALREADY_PRESENT);
//		statusBean.getErrorBean().setErrorMessage(FoodyRestConstants.ERR_MSSG_RESTAURANT_ALREADY_PRESENT);
//	} else {
//		//create new restaurant
//		statusBean.setStatusCode(FoodyRestConstants.STATUS_CODE_CREATE_RESTAURANT_LOGIN);
//		statusBean.setStatusMessage(FoodyRestConstants.STATUS_MSSG_CREATE_RESTAURANT_LOGIN);
//		statusBean.getErrorBean().setErrorCode(FoodyRestConstants.ERROR_CODE_NO_ERROR);
//	}
//	return statusBean;
//}
	
	private HashMap getRestaurantDetailsFromMap(){
		restaurantDetailsMap.put("indi@gmail.com", new RestaurantBean("1", "indi@gmail.com", "indi"));
		restaurantDetailsMap.put("maxi@gmail.com", new RestaurantBean("2", "maxi@gmail.com", "maxi"));
		return restaurantDetailsMap;
	}

}
