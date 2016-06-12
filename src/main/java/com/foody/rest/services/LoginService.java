package com.foody.rest.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.foody.rest.constants.FoodyRestConstants;
import com.foody.rest.dto.AdminUser;
import com.foody.rest.dto.ErrorBean;
import com.foody.rest.serviceImpl.LoginServiceImpl;

@Path("/login")
public class LoginService {
	LoginServiceImpl loginServiceImpl = new LoginServiceImpl();
	@GET
	@Path("/{param}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMsg(@PathParam("param") String msg) {
		String output = "Jersey say : " + msg;
		System.out.println("output1:+ "+ output);
 
		return output;
//		return Response.status(200).entity(output).build();
 
	}
	
	@POST
	@Path("verifyDetailsForAdminLogin")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String verifyDetailsForAdminLogin(AdminUser adminUser){
		String response = "";
		ErrorBean errorBean = new ErrorBean();
		boolean isUserValid = false;
		
		System.out.println("verifyDetailsForAdminLogin-->Request23: " + adminUser.toString());
		if(adminUser.getUserName()!=null 
					&& adminUser.getPassword()!=null 
					&& adminUser.getPin()!=null){
			
			isUserValid = loginServiceImpl.isUserValid(adminUser.getUserName(), adminUser.getPassword(), adminUser.getPin());
			
			if(isUserValid){
				adminUser.setStatusCode(FoodyRestConstants.STATUS_CODE_SUCCESS);
				adminUser.setStatusMessage(FoodyRestConstants.ADMIN_LOGIN_SUCCESS);
				errorBean.setErrorCode(FoodyRestConstants.ERROR_CODE_NO_ERROR);
				adminUser.setErrorBean(errorBean);		
			} else {
				adminUser.setStatusCode(FoodyRestConstants.STATUS_CODE_FAILURE);
				//adminUser.setStatusMessage(FoodyRestConstants.ADMIN_LOGIN_SUCCESS);
				errorBean.setErrorCode(FoodyRestConstants.ERR_CODE_INVALID_USER);
				errorBean.setErrorMessage(FoodyRestConstants.ERR_MSSG_INVALID_USER);
				adminUser.setErrorBean(errorBean);
			}
			
		} else {
			adminUser.setStatusCode(FoodyRestConstants.STATUS_CODE_FAILURE);
			adminUser.setStatusMessage(FoodyRestConstants.ADMIN_LOGIN_FAILURE);
			errorBean.setErrorCode(FoodyRestConstants.ERROR_CODE_ERROR);
			errorBean.setErrorMessage(FoodyRestConstants.ERR_MSSG_NO_USER_PWD_PIN);
			adminUser.setErrorBean(errorBean);
		}
		System.out.println("verifyDetailsForAdminLogin--> Response: " + adminUser.toString());
		return response;
	}
	

}
