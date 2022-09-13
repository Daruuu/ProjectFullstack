package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.RecipeModel;
import com.example.projectfullstack.Repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
@Service
public class RecipeServiceImpl implements RecipeService{

    @Autowired
    private RecipeRepository recipeRepo;

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