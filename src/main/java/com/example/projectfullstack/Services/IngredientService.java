package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.IngredientModel;

public interface IngredientService{

//BASIC METHODS USING CRUD

    //save new Ingredient
    void addNewIngredient(IngredientModel ingredientModel);

    // list ALL ingredients
    Iterable<IngredientModel> getIngredientList();

    //update ingredient by ID
    IngredientModel updateIngredient(IngredientModel ingredientModel, Long idIngredient);

    //delete ingredient by ID
    void deleteIngredientById(Long idIngredient);

    //buscar ingrediente per ID
    IngredientModel getIngredientById(Long idIngredient);

}
