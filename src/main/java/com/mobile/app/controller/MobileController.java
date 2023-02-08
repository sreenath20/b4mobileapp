package com.mobile.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.app.entity.Mobile;
import com.mobile.app.service.MobileService;

@RestController
public class MobileController {

	@Autowired
	private MobileService mobileService;
	
	@PostMapping("/mobile/{catId}")
	public Mobile addMoileToCategory(@RequestBody Mobile mobile, @PathVariable("catId") Integer catId) {
		
		return this.mobileService.addMobileToCatogoryById(mobile, catId);
	}
}
