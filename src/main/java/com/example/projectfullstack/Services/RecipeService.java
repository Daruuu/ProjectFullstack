package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.IngredientModel;
import com.example.projectfullstack.Model.RecipeModel;

import java.util.ArrayList;


public interface RecipeService {

    //save & create new recipe
    void createNewRecipe(String nameRecipe,ArrayList<IngredientModel> ingredients, String idCategoryRecipe);

    //LIST ALL RECIPES
    Iterable<RecipeModel> getRecipeList();

    //Buscar receta by ID
    RecipeModel getRecipeById(Long idRecipe);
}
