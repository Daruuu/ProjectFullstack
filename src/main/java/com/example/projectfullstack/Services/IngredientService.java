package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.IngredientModel;
import com.example.projectfullstack.Model.RecipeModel;
import com.example.projectfullstack.Repository.IngredientRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public interface IngredientService{
    // adding 3 methods to finding all ingredients,
    // select or count ingredients,
    // delete ingredient in new recipe
    // delete by id recipe or ingredient of recipe



    /*
    private final IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }


    //llamamos a ingredientesRepo para que nos muestre todos los ingredientes
    public List<IngredientModel> findAll(){
        var list = ingredientRepository.findAll();
        var ingredients = new ArrayList<IngredientModel>();
        //return (List<IngredientModel>) list.iterator();
        //return ingredients.contains(list);
        return null;
    }

    public void deleteById(Long idIngredient){
        ingredientRepository.deleteById(idIngredient);
    }
*/
    //listar todos los ingredientes
    List<IngredientModel> getAllIngredients();

    //save operations
    public IngredientModel saveIngredient(IngredientModel ingredientModel);

    // read ingredient
    List<IngredientModel> searchIngredientList();

    //create recipe


    //update recipe
    RecipeModel updateRecipe(IngredientModel ingredientModel, Long ingredientId);

    //delete recipe
    RecipeModel deleteRecipeById(Long idRecipe);


}
