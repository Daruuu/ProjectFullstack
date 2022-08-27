package com.example.projectfullstack.Controller;

import com.example.projectfullstack.Model.IngredientModel;
import com.example.projectfullstack.Services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MainController {

    @Autowired
    private IngredientService ingredientService;

    @PostMapping(value = "/ingredients")
    public IngredientModel saveIngredient(@Validated @RequestBody IngredientModel ingredientModel){
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
@RequestMapping(value = "/buscar/{id}")
    public ResponseEntity<IngredientModel> findIngredientById(@PathVariable(value = "id") Long idIngredient){

    Optional<IngredientModel> ingrediente = Optional.ofNullable(ingredientService.getIngredientById(idIngredient));

    if (ingrediente.isPresent()) {  //return 200 Ok
        return ResponseEntity.ok().body(ingrediente.get());
    } else {                        //return notfound
        return ResponseEntity.notFound().build();
    }

    }
}
