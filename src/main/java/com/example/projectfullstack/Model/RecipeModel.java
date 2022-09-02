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

    @Column(name = "id_recipe_category")
    private int idRecipeCategory;

    public RecipeModel(Long idRecipe, Long nameRecipe, int idRecipeCategory) {
        this.idRecipe = idRecipe;
        this.nameRecipe = nameRecipe;
        this.idRecipeCategory = idRecipeCategory;
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

    public int getIdRecipeCategory() {
        return idRecipeCategory;
    }

    public void setIdRecipeCategory(int idRecipeCategory) {
        this.idRecipeCategory = idRecipeCategory;
    }

    @Override
    public String toString() {
        return "RecipeModel{" +
                "idRecipe=" + idRecipe +
                ", nameRecipe=" + nameRecipe +
                ", idRecipeCategory=" + idRecipeCategory +
                '}';
    }
}
