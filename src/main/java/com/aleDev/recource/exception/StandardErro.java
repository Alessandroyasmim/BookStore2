package com.aleDev.recource.exception;

public class StandardErro {

	private Integer status;
	private String error;
	private Long timestamp;
	
	
	public StandardErro(Long timestamp, Integer status, String error) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
	}
	
	public StandardErro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	
}
