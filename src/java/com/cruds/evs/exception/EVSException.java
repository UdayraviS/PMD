package com.cruds.evs.exception;

public class EVSException extends Exception{

	private String exceptionInfo;

	public EVSException(String exceptionInfo) {
		super();
		this.exceptionInfo = exceptionInfo;
	}

	public String getExceptionInfo() {
		return exceptionInfo;
	}

	public void setExceptionInfo(String exceptionInfo) {
		this.exceptionInfo = exceptionInfo;
	}
}
