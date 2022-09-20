package com.example.projectfullstack.Model;
import java.io.Serializable;
import java.util.List;

public class NewRecipePOJOModel implements Serializable{

    private Long idRecipe;
    private String nameRecipe;
    private int idRecipeCategory;
    private int cantidadIngredient;
    private int priceRecipe;
    private int kcalRecipe;
    private List<IngredientModel> ingredientsList;

    public NewRecipePOJOModel() {
    }

    public NewRecipePOJOModel(Long idRecipe, String nameRecipe, int idRecipeCategory, int cantidadIngredient, int priceRecipe, int kcalRecipe, List<IngredientModel> ingredientsList) {
        this.idRecipe = idRecipe;
        this.nameRecipe = nameRecipe;
        this.idRecipeCategory = idRecipeCategory;
        this.cantidadIngredient = cantidadIngredient;
        this.priceRecipe = priceRecipe;
        this.kcalRecipe = kcalRecipe;
        this.ingredientsList = ingredientsList;
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

    public int getCantidadIngredient() {
        return cantidadIngredient;
    }

    public void setCantidadIngredient(int cantidadIngredient) {
        this.cantidadIngredient = cantidadIngredient;
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
        return "NewRecipePOJOModel{" +
                "idRecipe=" + idRecipe +
                ", nameRecipe='" + nameRecipe + '\'' +
                ", idRecipeCategory=" + idRecipeCategory +
                ", cantidadIngredient=" + cantidadIngredient +
                ", priceRecipe=" + priceRecipe +
                ", kcalRecipe=" + kcalRecipe +
                ", ingredientsList=" + ingredientsList +
                '}';
    }
}
