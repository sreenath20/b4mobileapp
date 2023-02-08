package com.mobile.app.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Cart {
	@Id
	private Integer id;
	
	@ManyToMany
	private Map<Integer,Mobile> mobilesMap = new HashMap<>();

	public Cart() {
		super();
	}

	public Cart(Integer id, Map<Integer, Mobile> mobilesMap) {
		super();
		this.id = id;
		this.mobilesMap = mobilesMap;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Map<Integer, Mobile> getMobilesMap() {
		return mobilesMap;
	}

	public void setMobilesMap(Map<Integer, Mobile> mobilesMap) {
		this.mobilesMap = mobilesMap;
	}
	
	

}
