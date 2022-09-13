package com.example.projectfullstack.Controller;

import com.example.projectfullstack.Model.RecipeModel;
import com.example.projectfullstack.Services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;
/*
    @RequestMapping(value = "/addRecipe", method = RequestMethod.POST)
    public String createNewRecipe(@Validated @RequestBody RecipeModel recipeModel) {
        try {
            recipeService.getRecipeList(recipeModel);
            return "saved new recipe";
        } catch (Exception e) {
            return "failed to add new recipe";
        }
    }
 */

    @RequestMapping(value = "/allRecipes", method = RequestMethod.GET)
    //  localhost:8080/api/allRecipes
    public Iterable<RecipeModel> getAllRecipe() {
        return recipeService.getRecipeList();
    }

    @RequestMapping(value = "/buscarReceta/{id}", method = RequestMethod.GET)
    // localhost:8080/api/buscarReceta/
    public ResponseEntity<RecipeModel> getRecipeById(@PathVariable(value = "id") Long idRecipe) {

        Optional<RecipeModel> recipe = Optional.ofNullable(recipeService.getRecipeById(idRecipe));
        return recipe.map(recipeModel -> ResponseEntity.ok().body(recipeModel)).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
