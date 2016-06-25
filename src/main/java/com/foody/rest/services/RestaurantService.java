package com.foody.rest.services;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.foody.rest.constants.FoodyRestConstants;
import com.foody.rest.dto.DataTransferStatusBean;
import com.foody.rest.dto.RestaurantLoginBean;
import com.foody.rest.serviceImpl.RestaurantServiceImpl;

@Path("/restaurant")
public class RestaurantService {

	RestaurantServiceImpl restaurantServiceImpl = new RestaurantServiceImpl();
	
	Logger log = Logger.getLogger("RestaurantService");
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public DataTransferStatusBean createRestaurantLogin(RestaurantLoginBean restaurantLoginDetails){
		DataTransferStatusBean statusBean = new DataTransferStatusBean();
		log.log(Level.INFO,  restaurantLoginDetails.toString());
		//Already restaurant present
		if(restaurantServiceImpl.isValidRestaurantLoginDetail(restaurantLoginDetails)){
			statusBean.setStatusCode(FoodyRestConstants.STATUS_CODE_FAILURE);
			statusBean.getErrorBean().setErrorCode(FoodyRestConstants.ERR_CODE_RESTAURANT_ALREADY_PRESENT);
			statusBean.getErrorBean().setErrorMessage(FoodyRestConstants.ERR_MSSG_RESTAURANT_ALREADY_PRESENT);
		} else {
			//create new restaurant
			statusBean.setStatusCode(FoodyRestConstants.STATUS_CODE_CREATE_RESTAURANT_LOGIN);
			statusBean.setStatusMessage(FoodyRestConstants.STATUS_MSSG_CREATE_RESTAURANT_LOGIN);
			statusBean.getErrorBean().setErrorCode(FoodyRestConstants.ERROR_CODE_NO_ERROR);
		}
		log.log(Level.INFO,  statusBean.toString());
		return statusBean;
	}
	
}
