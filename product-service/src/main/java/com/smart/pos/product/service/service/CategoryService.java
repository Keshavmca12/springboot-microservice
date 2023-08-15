package com.smart.pos.product.service.service;

import java.util.List;

import com.smart.pos.product.service.dto.CategoryDTO;
import com.smart.pos.product.service.exception.ProductServiceException;

public interface CategoryService {

	String save(CategoryDTO categoryDTO);
	
	List<CategoryDTO> getCategory();

	String update(CategoryDTO categoryDTO) throws ProductServiceException;

}
