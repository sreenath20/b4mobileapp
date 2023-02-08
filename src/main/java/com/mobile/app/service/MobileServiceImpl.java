package com.mobile.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.app.entity.Category;
import com.mobile.app.entity.Mobile;
import com.mobile.app.repository.CategoryRepository;
import com.mobile.app.repository.MobileRepository;

@Service
public class MobileServiceImpl implements MobileService {

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private MobileRepository mobileRepository;


	

	@Override
	public Mobile addMobileToCatogoryById(Mobile mobile, Integer categoryId) {
		
		Optional<Category> optCategory = this.categoryRepository.findById(categoryId);
		if(optCategory.isEmpty()) {
			// handle exception
		}
		Category foundCategory = optCategory.get();
		Mobile newMobile = this.mobileRepository.save(mobile);// add new mobile to DB
		foundCategory.getMobiles().add(newMobile); // add managed mobile to catogory list
		this.categoryRepository.save(foundCategory); // persist category
		return newMobile;
	}

	@Override
	public List<Mobile> getAllMobiles() {
		
		return this.mobileRepository.findAll();
	}
}
