package com.example.projectfullstack.Controller;

import com.example.projectfullstack.Model.*;
import com.example.projectfullstack.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST}, maxAge = 3600)
@RestController
@RequestMapping(value = "/api")
public class MainController {
    @Autowired
    private IngredientService ingredientService;
    @Autowired
    private IngredientCategoryService ingredientCategoryService;
    @Autowired
    private RecipeCategoriesService recipeCategoriesService;
    @Autowired
    private RecipeService recipeService;
    //@Autowired
    //private NewRecipePOJOService newRecipePOJOService;

    //CREATE NEW INGREDIENT
    @RequestMapping(value = "/addIngredient", method = RequestMethod.POST)
    //  http://localhost:8080/api/addIngredient
    public String addNewIngredient(@Validated @RequestBody IngredientModel ingredientModel) {
        try {
            ingredientService.addNewIngredient(ingredientModel);
            return "saved new ingredient";
        } catch (Exception e) {
            return "failed add new ingredient";
        }
    }

    //SHOW ALL INGREDIENTS
    @RequestMapping(value = "/allIngredients", method = RequestMethod.GET)
    //  http://localhost:8080/api/allIngredients
    public Iterable<IngredientModel> getIngredientsList() {
        return ingredientService.getIngredientList();
    }

    //UPDATE INGREDIENT BY ID
    @PutMapping(value = "/updateIngredient/{id}")
    //  localhost:8080/api/update/id
    public IngredientModel updateIngredient(@Validated @RequestBody IngredientModel ingredientModel, @PathVariable(value = "id") Long idIngredient) {
        return ingredientService.updateIngredient(ingredientModel, idIngredient);
    }

    //DELETE INGREDIENT BY ID
    @DeleteMapping(value = "/delete/{id}")
    //  http://localhost:8080/api/delete/id
    public String deleteIngredientById(@PathVariable(value = "id") Long idIngredient) {
        ingredientService.deleteIngredientById(idIngredient);
        return "ingredient deleted successfully! with id: " + idIngredient;
    }

    //BUSCAR INGREDIENTE POR ID
    @RequestMapping(value = "/buscar/{id}", method = RequestMethod.GET)
    //  http://localhost:8080/api/buscar/
    public ResponseEntity<IngredientModel> getIngredientById(@PathVariable(value = "id") Long idIngredient) {

        Optional<IngredientModel> ingrediente = Optional.ofNullable(ingredientService.getIngredientById(idIngredient));
        return ingrediente.map(ingredientModel -> ResponseEntity.ok().body(ingredientModel)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    //ENDPOINTS INGREDIENTS CATEGORIES

    @RequestMapping(value = "/allIngredientCategory", method = RequestMethod.GET)
    //  localhost:8080/api/allIngredientCategory
    public Iterable<IngredientCategoryModel> getAllCategoryIngredients() {
        return ingredientCategoryService.getCategoryIngredientList();
    }

    //ENDPOINTS RECIPES CATEGORIES

    @RequestMapping(value = "/allRecipesCategory", method = RequestMethod.GET)
    //  localhost:8080/api/allRecipesCategory
    public Iterable<RecipeCategoriesModel> getAllCategoryRecipe() {
        return recipeCategoriesService.getRecipeCategoryList();
    }
//ENDPOINTS FRONTED:

    //CREATE NEW RECIPE:
    @RequestMapping(value = "/addRecipe", method = RequestMethod.POST)
    public String createNewRecipe(@Validated @RequestBody RecipeModel recipeModel) {
        try {
            //recipeService.createNewRecipe();
            return "saved new ingredient";
        } catch (Exception e) {
            return "failed add new ingredient";
        }
    }

    //ENDPOINT RECIPES
    @RequestMapping(value = "/allRecipes", method = RequestMethod.GET)
    //  localhost:8080/api/allRecipesCategory
    public Iterable<RecipeModel> getAllRecipe() {
        return recipeService.getRecipeList();
    }

    //ENDPOINT SEARCH RECIPE BY ID
    @RequestMapping(value = "/buscarReceta/{id}", method = RequestMethod.GET)
    public ResponseEntity<RecipeModel> getRecipeById(@PathVariable(value = "id") Long idRecipe) {

        Optional<RecipeModel> recipe = Optional.ofNullable(recipeService.getRecipeById(idRecipe));
        return recipe.map(recipeModel -> ResponseEntity.ok().body(recipeModel)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @RequestMapping(value = "/testt", method = RequestMethod.POST)
    //  http://localhost:8080/api/add
    public void testt(@Validated @RequestBody List<IngredientModel> ingredientList) {
        ingredientList.forEach(item ->{
            System.out.println(item.toString());
        });
    }

    @RequestMapping(value = "/newRecipe", method = RequestMethod.POST)
    //  localhost:8080/api/newRecipe
    public void crearReceta(@Validated @RequestBody List<NewRecipePOJO> arrNewRecipe){
        System.out.println(arrNewRecipe);
    }
/*
    public String createRecipeHtml(@Validated @RequestBody NewRecipePOJO newRecipePOJO){
        try {
            newRecipePOJOService.createNewRecipeFronted(newRecipePOJO);
            return "saved new ingredient";
        } catch (Exception e) {
            return "failed add new ingredient";
        }
    }

 */



}