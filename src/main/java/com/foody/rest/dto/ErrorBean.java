package com.foody.rest.dto;

public class ErrorBean {
	String errorCode;
	String errorMessage;
	
	public ErrorBean(){
		this.errorCode = new String();
		this.errorMessage = new String();
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "ErrorBean [errorCode=" + errorCode + ", errorMessage=" + errorMessage + "]";
	}
	
}
