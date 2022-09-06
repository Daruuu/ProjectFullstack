package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.IngredientCategoryModel;
import com.example.projectfullstack.Repository.IngredientCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientCategoryServiceImpl implements IngredientCategoryService {
    @Autowired
    private IngredientCategoryRepository ingredientCategoryRepository;

    @Override
    public Iterable<IngredientCategoryModel> getCategoryIngredientList() {
        return ingredientCategoryRepository.findAll();
    }
}
