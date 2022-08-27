package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.IngredientModel;
import com.example.projectfullstack.Model.RecipeModel;
import com.example.projectfullstack.Repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService{

    @Autowired
    private IngredientRepository ingredientRepository;

    @Override
    public IngredientModel saveNewIngredient(IngredientModel ingredientModel) {
        return ingredientRepository.save(ingredientModel);
    }

    @Override
    public List<IngredientModel> fetchIngredientList() {
        List<IngredientModel> ingredients = new ArrayList<>();
        ingredientRepository.findAll().forEach(ingredients::add);
        return ingredients;
        //return (List<IngredientModel>) ingredientRepository.findAll();
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
