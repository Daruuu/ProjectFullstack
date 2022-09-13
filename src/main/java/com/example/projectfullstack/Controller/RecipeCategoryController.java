package com.example.projectfullstack.Controller;

import com.example.projectfullstack.Model.RecipeCategoriesModel;
import com.example.projectfullstack.Services.RecipeCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class RecipeCategoryController {
    @Autowired
    private RecipeCategoriesService recipeCategoriesService;

    @RequestMapping(value = "/allRecipesCategory", method = RequestMethod.GET)
    //  localhost:8080/api/allRecipesCategory
    public Iterable<RecipeCategoriesModel> getAllCategoryRecipe() {
        return recipeCategoriesService.getRecipeCategoryList();
    }
}
