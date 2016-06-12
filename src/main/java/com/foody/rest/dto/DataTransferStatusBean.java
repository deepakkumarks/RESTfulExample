package com.foody.rest.dto;

public class DataTransferStatusBean {
	String statusCode;
	String statusMessage;
	ErrorBean errorBean;
	
	DataTransferStatusBean(){
		this.statusCode = new String();
		this.statusMessage = new String();
		this.errorBean = new ErrorBean();
	}
	
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public ErrorBean getErrorBean() {
		return errorBean;
	}
	public void setErrorBean(ErrorBean errorBean) {
		this.errorBean = errorBean;
	}
}
