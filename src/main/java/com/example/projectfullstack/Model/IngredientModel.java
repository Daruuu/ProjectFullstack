package com.example.projectfullstack.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class IngredientModel implements Serializable {

    @Id
    private long idIngredient;
    private String nameIngredient;
    private int peso;
    private String medicion;
    private int kcal;
    private float grasas;
    private float grasaSaturadas;
    private float carbohidratos;
    private float carbohidratosAzucares;
    private int fibra;
    private float proteinas;
    private float sal;
    private float precio;

    public IngredientModel() {
    }

    public IngredientModel(String nameIngredient, int peso, String medicion, int kcal, float grasas, float grasaSaturadas, float carbohidratos, float carbohidratosAzucares, int fibra, float proteinas, float sal, float precio) {
        this.nameIngredient = nameIngredient;
        this.peso = peso;
        this.medicion = medicion;
        this.kcal = kcal;
        this.grasas = grasas;
        this.grasaSaturadas = grasaSaturadas;
        this.carbohidratos = carbohidratos;
        this.carbohidratosAzucares = carbohidratosAzucares;
        this.fibra = fibra;
        this.proteinas = proteinas;
        this.sal = sal;
        this.precio = precio;
    }

    public IngredientModel(long idIngredient, String nameIngredient, int peso, String medicion, int kcal, float grasas, float grasaSaturadas, float carbohidratos, float carbohidratosAzucares, int fibra, float proteinas, float sal, float precio) {
        this.idIngredient = idIngredient;
        this.nameIngredient = nameIngredient;
        this.peso = peso;
        this.medicion = medicion;
        this.kcal = kcal;
        this.grasas = grasas;
        this.grasaSaturadas = grasaSaturadas;
        this.carbohidratos = carbohidratos;
        this.carbohidratosAzucares = carbohidratosAzucares;
        this.fibra = fibra;
        this.proteinas = proteinas;
        this.sal = sal;
        this.precio = precio;
    }

    public long getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(long idIngredient) {
        this.idIngredient = idIngredient;
    }

    public String getNameIngredient() {
        return nameIngredient;
    }

    public void setNameIngredient(String nameIngredient) {
        this.nameIngredient = nameIngredient;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getMedicion() {
        return medicion;
    }

    public void setMedicion(String medicion) {
        this.medicion = medicion;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public float getGrasas() {
        return grasas;
    }

    public void setGrasas(float grasas) {
        this.grasas = grasas;
    }

    public float getGrasaSaturadas() {
        return grasaSaturadas;
    }

    public void setGrasaSaturadas(float grasaSaturadas) {
        this.grasaSaturadas = grasaSaturadas;
    }

    public float getCarbohidratos() {
        return carbohidratos;
    }

    public void setCarbohidratos(float carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    public float getCarbohidratosAzucares() {
        return carbohidratosAzucares;
    }

    public void setCarbohidratosAzucares(float carbohidratosAzucares) {
        this.carbohidratosAzucares = carbohidratosAzucares;
    }

    public int getFibra() {
        return fibra;
    }

    public void setFibra(int fibra) {
        this.fibra = fibra;
    }

    public float getProteinas() {
        return proteinas;
    }

    public void setProteinas(float proteinas) {
        this.proteinas = proteinas;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "IngredientModel{" +
                "idIngredient=" + idIngredient +
                ", nameIngredient='" + nameIngredient + '\'' +
                ", peso=" + peso +
                ", medicion='" + medicion + '\'' +
                ", kcal=" + kcal +
                ", grasas=" + grasas +
                ", grasaSaturadas=" + grasaSaturadas +
                ", carbohidratos=" + carbohidratos +
                ", carbohidratosAzucares=" + carbohidratosAzucares +
                ", fibra=" + fibra +
                ", proteinas=" + proteinas +
                ", sal=" + sal +
                ", precio=" + precio +
                '}';
    }
}
