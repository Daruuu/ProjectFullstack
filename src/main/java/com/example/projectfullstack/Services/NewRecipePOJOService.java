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
        /*
        // Posible problema: Estamos haciendo multiples consultas de sql solo para
        // cambiar el id de un ingrediente y su cantidad.
        for (int i = 0; i < newRecipePOJOModel.getIngredientsList().size(); ++i) {
            String insertQueryTableNewRecipes = "INSERT INTO new_recipes(" +
                    "id_new_recipes," +
                    "ingredients_id_ingredient" +
                    "cantidad_ingredient" +
                    "VALUES(?,?.?)";

            jdbcTemplate.update(insertQueryTableNewRecipes,
                    newRecipePOJOModel.getIdRecipe(),
                    newRecipePOJOModel.getIngredientsList().get(i).getIdIngredient(),
                    newRecipePOJOModel.getIngredientsList().get(i).getCantidadIngredient(),
            );
        }
         */

        String insertQueryTableNewRecipes = "INSERT INTO new_recipes(" +
                "id_new_recipes," +
                //"ingredientsList" +
                "cantidad_ingredient" +
                "VALUES(?,?.?)";
        jdbcTemplate.update(insertQueryTableNewRecipes,
                newRecipePOJOModel.getIdRecipe(),
                //newRecipePOJOModel.getIngredientsList(),
                newRecipePOJOModel.getCantidadIngredient()
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
/*
    public void addListIngredients(IngredientModel ingredientModel, String idIngredient, String cantidadIngredient) {
        List<IngredientModel> ingredientList = new ArrayList<IngredientModel>();
        ingredientList.add(idIngredient);
        ingredientList.add(cantidadIngredient);
    }
 */
}
