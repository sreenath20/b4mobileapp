package com.mobile.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.app.entity.Category;
import com.mobile.app.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/category")
	public Category addCategory(@RequestBody Category category) {
		
		return this.categoryService.createCategory(category);
	}
	@GetMapping("categories")
	public List<Category> getAllCategories(){
		return this.categoryService.getAllCategory();
	}

}
