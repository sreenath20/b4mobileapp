package com.mobile.app.service;

import java.util.List;

import com.mobile.app.entity.Mobile;

public interface MobileService {
	
	Mobile addMobileToCatogoryById(Mobile mobile, Integer categoryId);
	List<Mobile> getAllMobiles();
}
