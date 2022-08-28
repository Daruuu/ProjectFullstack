package com.example.projectfullstack.Controller;

import com.example.projectfullstack.Model.IngredientModel;
import com.example.projectfullstack.Services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class MainController {

    @Autowired
    private IngredientService ingredientService;

    private IngredientModel ingredientModel;

    @GetMapping(value = "/test")
    public String testFunction(){
        return "Hello world";
    }


    @PostMapping(value = "/add")
    //http://localhost:8080/api/add
    public String addNewIngredient(@Validated @RequestBody IngredientModel ingredientModel){
        try{
            ingredientService.addNewIngredient(ingredientModel);
            return "saved new ingredient";
        }catch (Exception e){
            return "failed add new ingredient";
        }
    }
    /*
    public IngredientModel saveIngredient(@Validated @RequestBody IngredientModel ingredientModel) {
        return ingredientService.saveNewIngredient(ingredientModel);
    }*/

    @RequestMapping(value = "/all", method = RequestMethod.GET)//  http://localhost:8080/api/all

    public Iterable<IngredientModel> fetchIngredientList() {
        return ingredientService.getIngredientList();
    }

    @RequestMapping(value = "/ingredient/update/{id}", method = RequestMethod.PUT)
    //localhost:8080/api/update/id
    public IngredientModel updateIngredient(IngredientModel ingredientModel, @PathVariable("id") Long idIngredient) {
        return ingredientService.updateIngredient(ingredientModel, idIngredient);
    }

    @RequestMapping(value = "/ingredient/delete/{id}", method = RequestMethod.DELETE)

    public String deleteIngredientById(@PathVariable("id") Long idIngredient) {
        ingredientService.deleteIngredientById(idIngredient);
        return "deleted successful!";
    }

    @RequestMapping(value = "/buscar/{id}") //http://localhost:8080/api/buscar/

    public ResponseEntity<IngredientModel> findIngredientById(@PathVariable(value = "id") Long idIngredient) {

        Optional<IngredientModel> ingrediente = Optional.ofNullable(ingredientService.getIngredientById(idIngredient));
        return ingrediente.map(ingredientModel -> ResponseEntity.ok().body(ingredientModel)).orElseGet(() -> ResponseEntity.notFound().build());
    /*
    if (ingrediente.isPresent()) {  //return 200 Ok
        return ResponseEntity.ok().body(ingrediente.get());
    } else {                        //return notfound
        return ResponseEntity.notFound().build();
    }
     */
    }
}
