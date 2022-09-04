package com.example.projectfullstack.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ingredient_category")
public class CategoryIngredientModel {
    @Id
    @Column(name = "id_category")
    private int idCategory;
    @Column(name = "name_category")
    private String nameCategory;

    public CategoryIngredientModel() {
    }

    public CategoryIngredientModel(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public CategoryIngredientModel(int idCategory, String nameCategory) {
        this.idCategory = idCategory;
        this.nameCategory = nameCategory;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    @Override
    public String toString() {
        return "CategoryIngredientModel{" +
                "idCategory=" + idCategory +
                ", nameCategory='" + nameCategory + '\'' +
                '}';
    }
}
