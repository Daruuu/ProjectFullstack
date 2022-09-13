package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.RecipeModel;


public interface RecipeService {

    //save & create new recipe
    //int createNewRecipe(String nameRecipe, ArrayList<IngredientModel> ingredients, String idCategoryRecipe);

    //LIST ALL RECIPES
    Iterable<RecipeModel> getRecipeList();

    //Buscar receta by ID
    RecipeModel getRecipeById(Long idRecipe);
}
