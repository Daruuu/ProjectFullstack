package com.example.projectfullstack.Model;

import java.io.Serializable;
import java.util.List;

public class NewRecipePOJO {
    private long idRecipe;
    private String nameRecipe;
    private int idRecipeCategory;
    private int priceRecipe;
    private int kcalRecipe;
    private List<IngredientModel> ingredientsList;


    public NewRecipePOJO() {
    }

    public NewRecipePOJO(long idRecipe, String nameRecipe, int idRecipeCategory, int priceRecipe, int kcalRecipe, List<IngredientModel> ingredientsArrayList) {
        this.idRecipe = idRecipe;
        this.nameRecipe = nameRecipe;
        this.idRecipeCategory = idRecipeCategory;
        this.priceRecipe = priceRecipe;
        this.kcalRecipe = kcalRecipe;
        this.ingredientsList = ingredientsArrayList;
    }


    public long getIdRecipe() {
        return idRecipe;
    }

    public void setIdRecipe(long idRecipe) {
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

    public List<IngredientModel> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(List<IngredientModel> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }

    @Override
    public String toString() {
        return "NewRecipePOJO{" +
                "idRecipe=" + idRecipe +
                ", nameRecipe='" + nameRecipe + '\'' +
                ", idRecipeCategory=" + idRecipeCategory +
                ", priceRecipe=" + priceRecipe +
                ", kcalRecipe=" + kcalRecipe +
                ", ingredientsList=" + ingredientsList +
                '}';
    }
}
