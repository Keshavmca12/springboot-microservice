package com.smart.pos.product.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.pos.product.service.dto.CategoryDTO;
import com.smart.pos.product.service.event.ProductEvent;
import com.smart.pos.product.service.exception.ProductServiceException;
import com.smart.pos.product.service.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@PostMapping(ProductEvent.ADD_CATEGORY)
	public String addCategory(@RequestBody CategoryDTO category) {
		String categoryId = categoryService.save(category);
		return categoryId;
	}

	@GetMapping(ProductEvent.GET_CATEGORY)
	public List<CategoryDTO> getCategories() {
		return categoryService.getCategory();
	}
	
	@PutMapping(ProductEvent.UPDATE_CATEGORY)
	public String updateCategory(@RequestBody CategoryDTO category) {
		String categoryId = null;
		try {
			categoryId = categoryService.update(category);
		} catch (ProductServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return categoryId;
	}

}
