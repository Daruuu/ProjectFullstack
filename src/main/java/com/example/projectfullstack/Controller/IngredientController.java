package com.example.projectfullstack.Controller;

import com.example.projectfullstack.Model.*;
import com.example.projectfullstack.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST}, maxAge = 3600)

@RestController
@RequestMapping(value = "/api")
public class IngredientController {
    @Autowired
    private IngredientService ingredientService;

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
}