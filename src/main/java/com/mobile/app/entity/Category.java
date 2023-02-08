package com.mobile.app.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	private Integer id;
	private String name;

	@OneToMany
	private List<Mobile> mobiles = new ArrayList<>();

	public Category() {
		super();
	}

	public Category(Integer id, String name, List<Mobile> mobiles) {
		super();
		this.id = id;
		this.name = name;
		this.mobiles = mobiles;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Mobile> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}

}
