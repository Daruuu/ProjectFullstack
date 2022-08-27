package com.example.projectfullstack.Model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class RecipeModel {


    @Id
    private Long idRecipe;
    private Long idCategory;
    private String nameCategory;
    //private ArrayList <IngredientModel> ingredientEntityArraylist = new ArrayList<>();

    //CONSTRUCTORS

    public RecipeModel() {
    }

    public RecipeModel(Long idRecipe, Long idCategory, String nameCategory) {
        this.idRecipe = idRecipe;
        this.idCategory = idCategory;
        this.nameCategory = nameCategory;
    }

    //GETTERS & SETTERS

    public Long getIdRecipe() {
        return idRecipe;
    }

    public void setIdRecipe(Long idRecipe) {
        this.idRecipe = idRecipe;
    }

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }


    //toSTRING


    @Override
    public String toString() {
        return "RecipeModel{" +
                "idRecipe=" + idRecipe +
                ", idCategory=" + idCategory +
                ", nameCategory='" + nameCategory + '\'' +
                '}';
    }
}
