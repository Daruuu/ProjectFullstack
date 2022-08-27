package com.example.projectfullstack.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class RecipeModel {

    @Id
    private Long idRecipe;
    private Long nameRecipe;
    //private ArrayList <IngredientModel> ingredientEntityArraylist = new ArrayList<>();


    public RecipeModel(Long idRecipe, Long nameRecipe) {
        this.idRecipe = idRecipe;
        this.nameRecipe = nameRecipe;
    }

    public RecipeModel() {
    }

    public Long getIdRecipe() {
        return idRecipe;
    }

    public void setIdRecipe(Long idRecipe) {
        this.idRecipe = idRecipe;
    }

    public Long getNameRecipe() {
        return nameRecipe;
    }

    public void setNameRecipe(Long nameRecipe) {
        this.nameRecipe = nameRecipe;
    }

    @Override
    public String toString() {
        return "RecipeModel{" +
                "idRecipe=" + idRecipe +
                ", nameRecipe=" + nameRecipe +
                '}';
    }
}
