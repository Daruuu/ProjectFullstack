package com.example.projectfullstack.Controller;

import com.example.projectfullstack.Model.IngredientModel;
import com.example.projectfullstack.Services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private IngredientService ingredientService;

    @PostMapping(value = "/ingredients")
    public IngredientModel saveIngredient(@RequestBody IngredientModel ingredientModel){
        return ingredientService.saveNewIngredient(ingredientModel);
    }

    @RequestMapping(value = "/listaIngredients", method = RequestMethod.GET)
    public List<IngredientModel> fetchIngredientList(){
        return ingredientService.fetchIngredientList();
    }

    @RequestMapping(value = "/ingredient/update/{id}", method = RequestMethod.PUT)
    public IngredientModel updateIngredient(IngredientModel ingredientModel, @PathVariable("id") Long idIngredient){
        return ingredientService.updateIngredient(ingredientModel, idIngredient);
    }

    @RequestMapping(value = "/ingredient/delete/{id}", method = RequestMethod.DELETE)
    public String deleteIngredientById(@PathVariable("id")Long idIngredient ){
        ingredientService.deleteIngredientById(idIngredient);
        return "deleted successful!";
    }
}
