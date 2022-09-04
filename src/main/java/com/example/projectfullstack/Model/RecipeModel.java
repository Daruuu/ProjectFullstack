package com.example.projectfullstack.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "recipes")
public class RecipeModel {

    @Id
    @Column(name = "id_recipe")
    private Long idRecipe;
    @Column(name = "name_recipe")
    private Long nameRecipe;

    public RecipeModel(Long idRecipe, Long nameRecipe) {
        this.idRecipe = idRecipe;
        this.nameRecipe = nameRecipe;
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

    @Override
    public String toString() {
        return "RecipeModel{" +
                "idRecipe=" + idRecipe +
                ", nameRecipe=" + nameRecipe +
                '}';
    }
}
