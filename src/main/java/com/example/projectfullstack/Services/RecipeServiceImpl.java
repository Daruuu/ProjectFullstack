package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.IngredientModel;
import com.example.projectfullstack.Repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;

public class RecipeServiceImpl implements RecipeService{

    @Autowired
    JdbcTemplate jdbcTemplate;
    private RecipeRepository recipeRepo;
    @Override
    public void createNewRecipe(String nameRecipe, ArrayList<IngredientModel> ingredients, String idCategoryRecipe) {
        //ArrayList<IngredientModel>
        ingredients = new ArrayList<>();
        String sql = "INSERT into new_recipes()";
        return 0;
    }
}
