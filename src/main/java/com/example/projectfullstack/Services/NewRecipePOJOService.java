package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.IngredientModel;
import com.example.projectfullstack.Model.NewRecipeModel;
import com.example.projectfullstack.Model.NewRecipePOJOModel;
import com.example.projectfullstack.Model.RecipeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewRecipePOJOService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addNewRecipe(NewRecipePOJOModel newRecipePOJOModel, RecipeModel recipeModel) {

        String insertQueryTableNewRecipes = "INSERT INTO new_recipes(" +
                "id_new_recipes," +
                "ingredients" +
                "VALUES(?,?)";
        jdbcTemplate.update(insertQueryTableNewRecipes,
                newRecipePOJOModel.getIdRecipe()
        );
        String insertQueryTableRecipe = "INSERT INTO recipes(" +
                "name_recipe," +
                "id_recipe_category," +
                "price_recipe," +
                "kcal_recipe)" +
                "VALUES(?,?,?,?)";
        jdbcTemplate.update(insertQueryTableRecipe,
                recipeModel.getNameRecipe(),
                recipeModel.getIdRecipeCategory(),
                recipeModel.getPriceRecipe(),
                recipeModel.getKcalRecipe()
        );
    }

    public void listaIngredients(IngredientModel ingredientModel, String idIngredient, String cantidadIngredient){
        List<?> ingredientList = new ArrayList<IngredientModel>();
            ingredientList.add(idIngredient);
            ingredientList.add(cantidadIngredient);
        };

    }
}
