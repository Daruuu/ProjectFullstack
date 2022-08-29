package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.IngredientModel;
import com.example.projectfullstack.Model.RecipeModel;
import com.example.projectfullstack.Repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    private IngredientRepository ingredientRepo;

    @Override
    public void addNewIngredient(IngredientModel ingredientModel) {
        ingredientRepo.save(ingredientModel);
    }

    @Override
    public boolean comprobarIngredient(String nameIngredient) throws SQLException {
        String queryComprobar = "SELECT name_ingredient FROM ingredients WHERE ";
        return false;
    }


    @Override
    public Iterable<IngredientModel> getIngredientList() {
        return ingredientRepo.findAll();
    }

    @Override
    public IngredientModel updateIngredient(IngredientModel ingredientModel, Long idIngredient) {
        return ingredientRepo.save(ingredientModel);
    }

    @Override
    public void deleteIngredientById(Long idIngredient) {
        ingredientRepo.deleteById(idIngredient);
    }

    @Override
    public IngredientModel getIngredientById(Long idIngredient) {
        Optional<IngredientModel> optional = ingredientRepo.findById(idIngredient);
        IngredientModel ingredient = null;
        if (optional.isPresent())
            ingredient = optional.get();
        else
            throw new RuntimeException("Ingredient NOT FOUND for id:" + idIngredient);
        return ingredient;
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
