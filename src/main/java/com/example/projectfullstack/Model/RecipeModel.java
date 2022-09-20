package com.example.projectfullstack.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipes")
public class RecipeModel {

    @Id
    @Column(name = "id_recipe")
    private Long idRecipe;
    @Column(name = "name_recipe")
    private String nameRecipe;
    @Column(name = "id_recipe_category")
    private int idRecipeCategory;
    @Column(name = "price_recipe")
    private int priceRecipe;
    @Column(name = "kcal_recipe")
    private int kcalRecipe;


    public RecipeModel() {
    }

    public RecipeModel(String nameRecipe, int idRecipeCategory, int priceRecipe, int kcalRecipe) {
        this.nameRecipe = nameRecipe;
        this.idRecipeCategory = idRecipeCategory;
        this.priceRecipe = priceRecipe;
        this.kcalRecipe = kcalRecipe;
    }

    public RecipeModel(Long idRecipe, String nameRecipe, int idRecipeCategory, int priceRecipe, int kcalRecipe) {
        this.idRecipe = idRecipe;
        this.nameRecipe = nameRecipe;
        this.idRecipeCategory = idRecipeCategory;
        this.priceRecipe = priceRecipe;
        this.kcalRecipe = kcalRecipe;
    }

    public Long getIdRecipe() {
        return idRecipe;
    }

    public void setIdRecipe(Long idRecipe) {
        this.idRecipe = idRecipe;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public void setNameRecipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;
    }

    public int getIdRecipeCategory() {
        return idRecipeCategory;
    }

    public void setIdRecipeCategory(int idRecipeCategory) {
        this.idRecipeCategory = idRecipeCategory;
    }

    public int getPriceRecipe() {
        return priceRecipe;
    }

    public void setPriceRecipe(int priceRecipe) {
        this.priceRecipe = priceRecipe;
    }

    public int getKcalRecipe() {
        return kcalRecipe;
    }

    public void setKcalRecipe(int kcalRecipe) {
        this.kcalRecipe = kcalRecipe;
    }

    @Override
    public String toString() {
        return "RecipeModel{" +
                "idRecipe=" + idRecipe +
                ", nameRecipe='" + nameRecipe + '\'' +
                ", idRecipeCategory=" + idRecipeCategory +
                ", priceRecipe=" + priceRecipe +
                ", kcalRecipe=" + kcalRecipe +
                '}';
    }
}
