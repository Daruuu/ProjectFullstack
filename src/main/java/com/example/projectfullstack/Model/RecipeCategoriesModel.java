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

    @Column(name = "image_recipe_category")
    private String url;

    public RecipeCategoriesModel (Long idRecipeCategory, String nameRecipeCategory, String url) {
        this.idRecipeCategory = idRecipeCategory;
        this.nameRecipeCategory = nameRecipeCategory;
        this.url = url;
    }

    public RecipeCategoriesModel() {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "RecipeCategoriesModel{" +
                "idRecipeCategory=" + idRecipeCategory +
                ", nameRecipeCategory='" + nameRecipeCategory + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
