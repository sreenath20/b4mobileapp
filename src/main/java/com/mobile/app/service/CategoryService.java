package com.mobile.app.service;

import java.util.List;

import com.mobile.app.entity.Category;

public interface CategoryService {

	Category createCategory(Category category);
	List<Category> getAllCategory();
}
