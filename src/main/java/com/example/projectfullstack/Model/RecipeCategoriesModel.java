package com.example.projectfullstack.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="recipe_category")
public class RecipeCategoriesModel {
    @Id
    @Column(name="id_recipe_category")
    private Long idRecipeCategory;
    @Column(name="name_recipe_category")
    private String nameRecipeCategory;

    public RecipeCategoriesModel (Long idRecipeCategory, String nameRecipeCategory) {
        this.idRecipeCategory = idRecipeCategory;
        this.nameRecipeCategory = nameRecipeCategory;
    }

    public Long getIdRecipeCategory() {
        return idRecipeCategory;
    }

    public void setIdRecipeCategory(Long idRecipeCategory) {
        this.idRecipeCategory = idRecipeCategory;
    }

    public String getNameRecipeCategory() {
        return nameRecipeCategory;
    }

    public void setNameRecipeCategory(String nameRecipeCategory) {
        this.nameRecipeCategory = nameRecipeCategory;
    }


    @Override
    public String toString(){
        return "RecipeCategoryModel{" + "idRecipeCategory=" + idRecipeCategory +
                ", nameRecipe=" + nameRecipeCategory +
                "}";
    }
}
