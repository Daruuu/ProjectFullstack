package com.example.projectfullstack.Controller;

import com.example.projectfullstack.Model.IngredientModel;
import com.example.projectfullstack.Model.NewRecipePOJOModel;
import com.example.projectfullstack.Model.RecipeModel;
import com.example.projectfullstack.Repository.IngredientRepository;
import com.example.projectfullstack.Services.NewRecipePOJOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class NewRecipePOJOController {

    @Autowired
    IngredientRepository ingredientRepository;

    @Autowired
    NewRecipePOJOService newRecipePOJOService;

    @RequestMapping(value = "/IntroDataRecipes", method = RequestMethod.POST)
    //  localhost:8080/api/newRecipe
    //  localhost:8080/api/IntroDataRecipes
    public void createNewRecipe(@RequestBody NewRecipePOJOModel objectPojo) {
        System.out.println(objectPojo.toString());
        //newRecipePOJOService.addNewRecipe((NewRecipePOJOModel) objectPojo);
    }

    @RequestMapping(value = "/newss", method = RequestMethod.POST)
    //  localhost:8080/api/newss
    public void newRecipe(NewRecipePOJOModel newRecipePOJOModel, RecipeModel recipeModel){
        newRecipePOJOService.addNewRecipe(newRecipePOJOModel,recipeModel);

    }


    @RequestMapping(value = "/newRecipe", method = RequestMethod.POST)
    //  localhost:8080/api/newRecipe
    public void crearReceta(@RequestBody(required=false) NewRecipePOJOModel arrNewRecipe) {
        System.out.println(arrNewRecipe.toString());
/*
        List<IngredientModel> ingredientsList = arrNewRecipe.getIngredientsList();
        ingredientsList.forEach(ingredient -> {
            System.out.println(ingredient.getNameIngredient());
        });*/
        //newRecipePOJOService.addNewRecipe((NewRecipePOJOModel) arrNewRecipe);
        //newRecipePOJOService.addNewRecipePOJO(arrNewRecipe);
    }
}
/*
    @RequestMapping(value = "/newRecipe", method = RequestMethod.POST)
    //  localhost:8080/api/newRecipe
    public void crearReceta(@RequestBody List<NewRecipePOJOModel> arrNewRecipe, long idRecipe, String nameRecipe, int idRecipeCategory, int priceRecipe, int kcalRecipe){
        newRecipeService.addNewRecipe((NewRecipePOJOModel) arrNewRecipe);

        System.out.println(arrNewRecipe);
 */
