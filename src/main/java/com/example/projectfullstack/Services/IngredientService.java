package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.IngredientModel;
import com.example.projectfullstack.Model.RecipeModel;

import java.sql.SQLException;
import java.util.List;

public interface IngredientService{

//BASIC METHODS USING CRUD
    //save new Ingredient
    void addNewIngredient(IngredientModel ingredientModel);

    // list ingredient
    Iterable<IngredientModel> getIngredientList();

    //update ingredient
    IngredientModel updateIngredient(IngredientModel ingredientModel, Long idIngredient);

    //delete ingredient
    void deleteIngredientById(Long idIngredient);

    //listar ingredients per ID
    IngredientModel getIngredientById(Long idIngredient);


// SEARCH METHODS RECIPES FRONTED

    //save & create new recipe
    String createNewRecipe(IngredientModel ingredientModel, String nameRecipe, String categoryRecipe);

    //list recipes
    List<RecipeModel> fetchRecipeList();

    //delete recipe by ID
    void deleteRecipeById(Long idRecipe);

//FILTERS FRONTED

    //listar ingredients per CATEGORY


//METHODS TO CALL IN ADDINGREDIENT()

    boolean comprobarIngredient(String nameIngredient) throws SQLException;






}
