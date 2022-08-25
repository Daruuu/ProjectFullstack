package com.example.projectfullstack.Controller;

import com.example.projectfullstack.Model.IngredientModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestingController {

    IngredientModel ingredientsModel = new IngredientModel();
    @GetMapping(value = "/greeting")
    public String greeting(){
        return "Hello World from Springboot!";
    }

    @RequestMapping(value = "/testpoint", method = RequestMethod.GET)
    public IngredientModel testingEndPoint(){
        return ingredientsModel;
    }
}
