package com.example.projectfullstack.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CategoryModel {
    @Id
    private int idCategory;
    private String nameCategory;

    public CategoryModel() {
    }

    public CategoryModel(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public CategoryModel(int idCategory, String nameCategory) {
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
        return "CategoryModel{" +
                "idCategory=" + idCategory +
                ", nameCategory='" + nameCategory + '\'' +
                '}';
    }
}
