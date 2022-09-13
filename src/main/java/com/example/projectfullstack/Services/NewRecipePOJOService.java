package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.NewRecipePOJO;
import com.example.projectfullstack.Repository.NewRecipePOJORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class NewRecipePOJOService implements NewRecipePOJORepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addNewRecipe(NewRecipePOJO newRecipePOJO) {

        String insertQueryTableNewRecipes = "INSERT INTO new_recipes(" +
                "id_new_recipes," +
                "ingredients_id_ingredient," +
                "cantidad_ingredient)" +
                "VALUES(?,?,?)";
        jdbcTemplate.update(insertQueryTableNewRecipes,
                newRecipePOJO.getIdRecipe(),
                newRecipePOJO.getIngredientsList(),
                newRecipePOJO.getCantidadIngredient());
        String insertQueryTableRecipe = "INSERT INTO recipes(" +
                "name_recipe," +
                "id_recipe_category," +
                "price_recipe," +
                "kcal_recipe)" +
                "VALUES(?,?,?,?)";
        jdbcTemplate.update(insertQueryTableRecipe,
                newRecipePOJO.getNameRecipe(),
                newRecipePOJO.getIdRecipeCategory(),
                newRecipePOJO.getPriceRecipe(),
                newRecipePOJO.getKcalRecipe());
    }

    @Override
    public int deleteNewRecipe(long id) {
        return 0;
    }

}
