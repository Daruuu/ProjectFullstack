package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.IngredientModel;
import com.example.projectfullstack.Model.RecipeModel;
import java.util.List;

public interface IngredientService{

//BASIC METHODS USING CRUD

    //save & create new Ingredient
    IngredientModel saveNewIngredient(IngredientModel ingredientModel);

    // list ingredient
    List<IngredientModel> fetchIngredientList();

    //update ingredient
    IngredientModel updateIngredient(IngredientModel ingredientModel, Long idIngredient);

    //delete ingredient
    void deleteIngredientById(Long idIngredient);

    //listar ingredients per ID
    public IngredientModel getIngredientById(Long idIngredient);


// SEARCH METHODS RECIPES FRONTED

    //save & create new recipe
    public String createNewRecipe(IngredientModel ingredientModel, String nameRecipe, String categoryRecipe);

    //list recipes
    List<RecipeModel> fetchRecipeList();

    //delete recipe by ID
    void deleteRecipeById(Long idRecipe);

//FILTERS FRONTED

    //listar ingredients per CATEGORY






}
