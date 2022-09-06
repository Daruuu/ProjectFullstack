package com.example.projectfullstack.Repository;

import com.example.projectfullstack.Model.IngredientCategoryModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientCategoryRepository extends CrudRepository<IngredientCategoryModel, Integer > {
}
