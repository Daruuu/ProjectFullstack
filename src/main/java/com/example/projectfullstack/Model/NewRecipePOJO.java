package com.example.projectfullstack.Model;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;

public class NewRecipePOJO implements Serializable{

    private int idRecipe;
    //@Column(name = "name_recipe")
    private String nameRecipe;
    //@Column(name = "id_recipe_category")
    private int idRecipeCategory;

    private int cantidadIngredient;
    //@Column(name = "price_recipe")
    private int priceRecipe;
    //@Column(name = "kcal_recipe")
    private int kcalRecipe;
    private List<IngredientModel> ingredientsList;

    public NewRecipePOJO() {
    }

    public NewRecipePOJO(int idRecipe, String nameRecipe, int idRecipeCategory, int cantidadIngredient, int priceRecipe, int kcalRecipe, List<IngredientModel> ingredientsList) {
        this.idRecipe = idRecipe;
        this.nameRecipe = nameRecipe;
        this.idRecipeCategory = idRecipeCategory;
        this.cantidadIngredient = cantidadIngredient;
        this.priceRecipe = priceRecipe;
        this.kcalRecipe = kcalRecipe;
        this.ingredientsList = ingredientsList;
    }


    public long getIdRecipe() {
        return idRecipe;
    }

    public void setIdRecipe(int idRecipe) {
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
        return "NewRecipePOJO{" +
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
