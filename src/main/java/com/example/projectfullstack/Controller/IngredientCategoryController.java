package com.example.projectfullstack.Controller;

import com.example.projectfullstack.Model.IngredientCategoryModel;
import com.example.projectfullstack.Services.IngredientCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class IngredientCategoryController {
    @Autowired
    private IngredientCategoryService ingredientCategoryService;

    @RequestMapping(value = "/allIngredientsCategory", method = RequestMethod.GET)
    //  localhost:8080/api/allIngredientsCategory
    public Iterable<IngredientCategoryModel> getAllCategoryIngredients() {
        return ingredientCategoryService.getCategoryIngredientList();
    }

}
