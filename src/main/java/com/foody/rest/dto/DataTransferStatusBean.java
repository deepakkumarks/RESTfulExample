package com.foody.rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DataTransferStatusBean {
	String statusCode;
	String statusMessage;
	ErrorBean errorBean;
	
	public DataTransferStatusBean(){
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

	@Override
	public String toString() {
		return "DataTransferStatusBean [statusCode=" + statusCode + ", statusMessage=" + statusMessage + ", errorBean="
				+ errorBean + ", getStatusCode()=" + getStatusCode() + ", getStatusMessage()=" + getStatusMessage()
				+ ", getErrorBean()=" + getErrorBean() + "]";
	}


	
}
