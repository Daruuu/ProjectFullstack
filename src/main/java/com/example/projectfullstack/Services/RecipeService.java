package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.IngredientModel;

import java.util.ArrayList;


public interface RecipeService {

    //save &create new recipe
    int createNewRecipe(String nameRecipe,ArrayList<IngredientModel> ingredients, String idCategoryRecipe);

}
