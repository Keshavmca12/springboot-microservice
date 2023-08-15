package com.smart.pos.product.service.repository;


import  org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.smart.pos.product.service.entity.Category;

@Repository
public interface CategoryRepository extends MongoRepository<Category, Integer>  {

	
}
