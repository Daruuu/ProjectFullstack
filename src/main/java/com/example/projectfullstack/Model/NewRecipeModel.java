package com.example.projectfullstack.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "new_recipes")
public class NewRecipeModel {

    @Id
    @Column(name = "recipes_id_recipe")
    private Long recipesIdRecipe;     //
    @Column(name = "id_new_recipes")
    private Long idNewRecipe;
    @Column(name = "ingredients_id_ingredient")
    private int idIngredientFromIngredients;
    @Column(name = "cantidad_ingredient")
    private int cantidadIngredient;


    public NewRecipeModel() {
    }

    public NewRecipeModel(Long recipesIdRecipe, Long idNewRecipe, int idIngredientFromIngredients, int cantidadIngredient) {
        this.recipesIdRecipe = recipesIdRecipe;
        this.idNewRecipe = idNewRecipe;
        this.idIngredientFromIngredients = idIngredientFromIngredients;
        this.cantidadIngredient = cantidadIngredient;
    }

    public NewRecipeModel(Long idNewRecipe, int idIngredientFromIngredients, int cantidadIngredient) {
        this.idNewRecipe = idNewRecipe;
        this.idIngredientFromIngredients = idIngredientFromIngredients;
        this.cantidadIngredient = cantidadIngredient;
    }

    public NewRecipeModel(Long recipesIdRecipe) {
        this.recipesIdRecipe = recipesIdRecipe;
    }

    public Long getRecipesIdRecipe() {
        return recipesIdRecipe;
    }

    public void setRecipesIdRecipe(Long recipesIdRecipe) {
        this.recipesIdRecipe = recipesIdRecipe;
    }

    public Long getIdNewRecipe() {
        return idNewRecipe;
    }

    public void setIdNewRecipe(Long idNewRecipe) {
        this.idNewRecipe = idNewRecipe;
    }

    public int getIdIngredientFromIngredients() {
        return idIngredientFromIngredients;
    }

    public void setIdIngredientFromIngredients(int idIngredientFromIngredients) {
        this.idIngredientFromIngredients = idIngredientFromIngredients;
    }

    public int getCantidadIngredient() {
        return cantidadIngredient;
    }

    public void setCantidadIngredient(int cantidadIngredient) {
        this.cantidadIngredient = cantidadIngredient;
    }

    @Override
    public String toString() {
        return "NewRecipeModel{" +
                "recipesIdRecipe=" + recipesIdRecipe +
                ", idNewRecipe=" + idNewRecipe +
                ", idIngredientFromIngredients=" + idIngredientFromIngredients +
                ", cantidadIngredient=" + cantidadIngredient +
                '}';
    }
}
