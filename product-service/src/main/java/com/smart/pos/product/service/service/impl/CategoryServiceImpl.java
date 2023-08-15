package com.smart.pos.product.service.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.smart.pos.product.service.dto.CategoryDTO;
import com.smart.pos.product.service.entity.Category;
import com.smart.pos.product.service.exception.ProductServiceException;
import com.smart.pos.product.service.repository.CategoryRepository;
import com.smart.pos.product.service.service.CategoryService;
import com.smart.pos.product.service.util.ModelMapperUtil;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public String save(CategoryDTO categoryDTO) {
		Category category = ModelMapperUtil.map(categoryDTO, Category.class);
		category = categoryRepository.insert(category);
		return category.getId();
	}

	@Override
	public List<CategoryDTO> getCategory() {
		List<Category> categories =categoryRepository.findAll();
		List<CategoryDTO> categoryDTOs = ModelMapperUtil.mapAll(categories, CategoryDTO.class);
		return categoryDTOs;
	}
	
	@Override
	public String update(CategoryDTO categoryDTO) throws ProductServiceException {
		if(categoryDTO.getId() == null) {
			throw new ProductServiceException("Category not found");
		}
		Category category = new Category();
		category.setId(categoryDTO.getId());
		Example<Category> example = Example.of(category);
		Optional<Category>  optional= categoryRepository.findOne(example);
		if(!optional.isPresent()) {
			throw new ProductServiceException("Category not found");
		}
		Category categoryData = ModelMapperUtil.map(categoryDTO, Category.class);
		categoryRepository.save(category);
		return categoryData.getId();
	} 

}
