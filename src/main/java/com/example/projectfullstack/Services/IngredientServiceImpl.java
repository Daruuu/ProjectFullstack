package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.IngredientModel;
import com.example.projectfullstack.Model.RecipeModel;
import com.example.projectfullstack.Repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService{

    @Autowired
    private IngredientRepository ingredientRepository;

    @Override
    public void addNewIngredient(IngredientModel ingredientModel) {
        ingredientRepository.save(ingredientModel);
    }

    @Override
    public Iterable<IngredientModel> getIngredientList() {
        return ingredientRepository.findAll();
    }

    @Override
    public IngredientModel updateIngredient(IngredientModel ingredientModel, Long idIngredient) {
        return ingredientRepository.save(ingredientModel);
    }

    @Override
    public void deleteIngredientById(Long idIngredient) {
        ingredientRepository.deleteById(idIngredient);
    }

    @Override
    public IngredientModel getIngredientById(Long idIngredient) {
        return ingredientRepository.findById(idIngredient).get();
    }


    // RECIPES METHODS
    @Override
    public String createNewRecipe(IngredientModel ingredientModel, String nameRecipe, String categoryRecipe) {
        return null;
    }

    @Override
    public List<RecipeModel> fetchRecipeList() {
        return null;
    }

    @Override
    public void deleteRecipeById(Long idRecipe) {

    }
}
