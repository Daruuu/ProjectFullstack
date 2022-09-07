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
    private Long nameRecipe;
    @Column(name = "price_recipe")
    private Long priceRecipe;
    @Column(name = "kcal_recipe")
    private Long kcalRecipe;

    public RecipeModel(Long idRecipe, Long nameRecipe, Long priceRecipe, Long kcalRecipe) {
        this.idRecipe = idRecipe;
        this.nameRecipe = nameRecipe;
        this.priceRecipe = priceRecipe;
        this.kcalRecipe = kcalRecipe;
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

    public Long getPriceRecipe() {return priceRecipe;}

    public void setPriceRecipe(Long priceRecipe) {this.priceRecipe = priceRecipe;}

    public Long getKcalRecipe() {return kcalRecipe;}

    public void setKcalRecipe(Long kcalRecipe) {this.kcalRecipe = kcalRecipe;}

    @Override
    public String toString() {
        return "RecipeModel{" +
                "idRecipe=" + idRecipe +
                ", nameRecipe=" + nameRecipe +
                ", priceRecipe=" + priceRecipe +
                ", kcalRecipe=" + kcalRecipe +
                '}';
    }
}
