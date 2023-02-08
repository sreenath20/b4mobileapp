package com.mobile.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {

	@Id
	private Integer id;
	private String mode;
	
	public Payment() {
		super();
	}
	public Payment(Integer id, String mode) {
		super();
		this.id = id;
		this.mode = mode;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	
}
