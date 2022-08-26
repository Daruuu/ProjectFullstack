package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.IngredientModel;
import com.example.projectfullstack.Model.RecipeModel;
import com.example.projectfullstack.Repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IngredientServiceImpl implements IngredientService{


    @Autowired
    private IngredientRepository ingredientRepository;



    @Override
    public List<IngredientModel> getAllIngredients() {
        return null;
    }

    @Override
    public IngredientModel saveIngredient(IngredientModel ingredientModel) {
        return null;
    }

    @Override
    public List<IngredientModel> searchIngredientList() {
        return null;
    }

    @Override
    public RecipeModel updateRecipe(IngredientModel ingredientModel, Long ingredientId) {
        return null;
    }

    @Override
    public RecipeModel deleteRecipeById(Long idRecipe) {
        ingredientRepository.deleteById(idRecipe);
        return null;
    }
}
