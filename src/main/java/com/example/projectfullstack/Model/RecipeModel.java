package com.example.projectfullstack.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class RecipeModel {
    @Id
    private Long idRecipe;
    private String name;
    //private ArrayList <IngredientModel> ingredientEntityArraylist;

    //CONSTRUCTORS
    public RecipeModel() {
    }

    public RecipeModel(String name){
        this.name = name;
    }

    //GETTERS & SETTERS
    public void setId(Long id) {
        this.idRecipe = id;
    }

    public Long getId() {
        return idRecipe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //toSTRING

    @Override
    public String toString() {
        return "RecipeModel{" +
                "idRecipe=" + idRecipe +
                ", name='" + name + '\'' +
                '}';
    }
}
