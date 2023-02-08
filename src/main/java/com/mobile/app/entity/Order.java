package com.mobile.app.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

	@Id
	private Integer id;

	@OneToOne
	private Payment payment;

	@ManyToMany
	// private Map<Integer,Mobile> mobilesMap = new HashMap<>();
	private List<Mobile> mobiles = new ArrayList<>();

	public Order() {
		super();
	}

//	public Order(Integer id, Payment payment, Map<Integer, Mobile> mobilesMap) {
//		super();
//		this.id = id;
//		this.payment = payment;
//		this.mobilesMap = mobilesMap;
//	}
	

	public Integer getId() {
		return id;
	}

	public Order(Integer id, Payment payment, List<Mobile> mobiles) {
	super();
	this.id = id;
	this.payment = payment;
	this.mobiles = mobiles;
}

	public void setId(Integer id) {
		this.id = id;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public List<Mobile> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}

//	public Map<Integer, Mobile> getMobilesMap() {
//		return mobilesMap;
//	}
//
//	public void setMobilesMap(Map<Integer, Mobile> mobilesMap) {
//		this.mobilesMap = mobilesMap;
//	}

}
