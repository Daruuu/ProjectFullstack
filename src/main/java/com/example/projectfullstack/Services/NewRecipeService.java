package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.NewRecipePOJO;
import com.example.projectfullstack.Repository.NewRecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class NewRecipeService implements NewRecipeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addNewRecipe(NewRecipePOJO newRecipePOJO) {
        String insertQueryTableNewRecipes = "INSERT INTO new_recipes(" +
                "id_new_recipes," +
                "ingredients_id_ingredient," +
                "cantidad_ingredient)" +
                "VALUES(?,?,?)";
        return jdbcTemplate.update(insertQueryTableNewRecipes, newRecipePOJO.getIdRecipe(),
                newRecipePOJO.getIngredientsList(),
                newRecipePOJO.getKcalRecipe());
    }

    @Override
    public int deleteNewRecipe(long id) {
        return 0;
    }
    /*
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
     */

}
