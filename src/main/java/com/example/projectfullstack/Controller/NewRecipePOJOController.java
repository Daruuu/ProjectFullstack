package com.example.projectfullstack.Controller;

import com.example.projectfullstack.Model.NewRecipePOJO;
import com.example.projectfullstack.Services.NewRecipePOJOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class NewRecipePOJOController {

    @Autowired
    private NewRecipePOJOService newRecipePOJOService;
    @RequestMapping(value = "/IntroDataRecipes", method = RequestMethod.POST)
    //  localhost:8080/api/newRecipe
    //  localhost:8080/api/IntroDataRecipes
    public void createNewRecipe(@RequestBody List<NewRecipePOJO> objectPojo,long idRecipe, String nameRecipe, int idRecipeCategory, int cantidadIngredient, int priceRecipe, int kcalRecipe ){
        newRecipePOJOService.addNewRecipe((NewRecipePOJO) objectPojo);
        System.out.println(objectPojo);
    }
}
/*
    @RequestMapping(value = "/newRecipe", method = RequestMethod.POST)
    //  localhost:8080/api/newRecipe
    public void crearReceta(@RequestBody List<NewRecipePOJO> arrNewRecipe, long idRecipe, String nameRecipe, int idRecipeCategory, int priceRecipe, int kcalRecipe){
        newRecipeService.addNewRecipe((NewRecipePOJO) arrNewRecipe);

        System.out.println(arrNewRecipe);
 */
