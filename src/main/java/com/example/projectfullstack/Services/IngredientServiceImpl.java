package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.IngredientModel;
import com.example.projectfullstack.Model.RecipeModel;
import com.example.projectfullstack.Repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    private IngredientRepository ingredientRepo;

    // ADD NEW INGREDIENT
    @Override
    public void addNewIngredient(IngredientModel ingredientModel) {
        ingredientRepo.save(ingredientModel);
    }
/*
    @Override
    public boolean comprobarIngredient(String nameIngredient) throws SQLException {
        String queryComprobar = "SELECT name_ingredient FROM ingredients WHERE ";
        return false;
    }
 */

    //LIST ALL INGREDIENTS
    @Override
    public Iterable<IngredientModel> getIngredientList() {
        return ingredientRepo.findAll();
    }

    //UPDATE INGREDIENT BY ID
    @Override
    public IngredientModel updateIngredient(IngredientModel ingredientModel, Long idIngredient) {
        return ingredientRepo.save(ingredientModel);
    }

    //DELETE BY ID
    @Override
    public void deleteIngredientById(Long idIngredient) {
        ingredientRepo.deleteById(idIngredient);
    }

    @Override
    public IngredientModel getIngredientById(Long idIngredient) {
        Optional<IngredientModel> optional = ingredientRepo.findById(idIngredient);
        IngredientModel ingredient = null;
        if (optional.isPresent())
            ingredient = optional.get();
        else
            throw new RuntimeException("Ingredient NOT FOUND for id:" + idIngredient);
        return ingredient;
    }
}
