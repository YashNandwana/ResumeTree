package com.resumetree.resumetree.repositories;

import com.resumetree.resumetree.models.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String>
{

}
