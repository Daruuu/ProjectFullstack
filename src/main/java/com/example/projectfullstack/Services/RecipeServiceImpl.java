package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.IngredientModel;
import com.example.projectfullstack.Model.RecipeModel;
import com.example.projectfullstack.Repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.Optional;

public class RecipeServiceImpl implements RecipeService{

    @Autowired
    JdbcTemplate jdbcTemplate;
    private RecipeRepository recipeRepo;
    //ADD NEW RECIPE
    @Override
    public void createNewRecipe(String nameRecipe, ArrayList<IngredientModel> ingredients, String idCategoryRecipe) {
        //ArrayList<IngredientModel>
        ingredients = new ArrayList<>();
        String sql = "INSERT into new_recipes()";
    }
    
    //LIST ALL RECIPES
    @Override
    public Iterable<RecipeModel> getRecipeList() {
        return recipeRepo.findAll();
    }

    //GET BY ID
    @Override
    public RecipeModel getRecipeById(Long idRecipe) {
        Optional<RecipeModel> optional = recipeRepo.findById(idRecipe);
        RecipeModel recipe = null;
        if (optional.isPresent())
            recipe = optional.get();
        else
            throw new RuntimeException("Recipe NOT FOUND for id:" + idRecipe);
        return recipe;
    }
}
