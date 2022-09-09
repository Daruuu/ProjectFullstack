package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.IngredientModel;
import com.example.projectfullstack.Model.RecipeModel;
import com.example.projectfullstack.Repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class RecipeServiceImpl implements RecipeService{

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    private RecipeRepository recipeRepo;

    //ADD NEW RECIPE

    @Override
    public int createNewRecipe(String nameRecipe, ArrayList<IngredientModel> ingredientsArr, String idCategoryRecipe) {

        ingredientsArr.forEach(System.out::println);
        //ingredientsArr.forEach((arr) -> System.out.println(arr));
        String insertQueryTableNewRecipes = "INSERT INTO new_recipes(" +
                "id_new_recipes," +
                "ingredients_id_ingredient," +
                "cantidad_ingredient)" +
                "VALUES(?,?,?)";

        String insertQueryTableRecipe = "INSERT INTO recipe(" +
                "name_recipe," +
                "id_recipe_category," +
                "price_recipe," +
                "kcal_recipe)" +
                "VALUES(?,?,?,?)";

        return jdbcTemplate.update(insertQueryTableNewRecipes, new Object[]{  });
        //return insertQueryRecipe;
        //new recipes ==> ingrediente cantidad, id_new_recipe
        //recipes ==>
    }
    
    //LIST ALL RECIPES
    @Override
    public Iterable<RecipeModel> getRecipeList() {
        return recipeRepo.findAll();
    }

    //GET RECIPE BY ID
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
