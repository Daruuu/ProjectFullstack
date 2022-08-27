package com.example.projectfullstack.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class IngredientModel implements Serializable {

    @Id
    private long idIngredient;
    private String name;
    private int peso;
    private int kcal;
    private double grasas;
    private double grasas_saturadas;
    private double carbohidratos;
    private double carbohidratos_azucares;
    private int fibra;
    private double proteinas;
    private double sal;

    //CONSTRUCTORS

    public IngredientModel() {
    }

    public IngredientModel(String name, int peso, int kcal, double grasas, double grasas_saturadas, double carbohidratos, double carbohidratos_azucares, int fibra, double proteinas, double sal) {
        this.name = name;
        this.peso = peso;
        this.kcal = kcal;
        this.grasas = grasas;
        this.grasas_saturadas = grasas_saturadas;
        this.carbohidratos = carbohidratos;
        this.carbohidratos_azucares = carbohidratos_azucares;
        this.fibra = fibra;
        this.proteinas = proteinas;
        this.sal = sal;
    }

    public IngredientModel(long id, String name, int peso, int kcal, double grasas, double grasas_saturadas, double carbohidratos, double carbohidratos_azucares, int fibra, double proteinas, double sal) {
        this.idIngredient = id;
        this.name = name;
        this.peso = peso;
        this.kcal = kcal;
        this.grasas = grasas;
        this.grasas_saturadas = grasas_saturadas;
        this.carbohidratos = carbohidratos;
        this.carbohidratos_azucares = carbohidratos_azucares;
        this.fibra = fibra;
        this.proteinas = proteinas;
        this.sal = sal;
    }
    //GETTERS & SETTERS


    public void setIdIngredient(long id) {
        this.idIngredient = id;
    }

    public long getIdIngredient() {
        return idIngredient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public double getGrasas() {
        return grasas;
    }

    public void setGrasas(double grasas) {
        this.grasas = grasas;
    }

    public double getGrasas_saturadas() {
        return grasas_saturadas;
    }

    public void setGrasas_saturadas(double grasas_saturadas) {
        this.grasas_saturadas = grasas_saturadas;
    }

    public double getCarbohidratos() {
        return carbohidratos;
    }

    public void setCarbohidratos(double carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    public double getCarbohidratos_azucares() {
        return carbohidratos_azucares;
    }

    public void setCarbohidratos_azucares(double carbohidratos_azucares) {
        this.carbohidratos_azucares = carbohidratos_azucares;
    }

    public int getFibra() {
        return fibra;
    }

    public void setFibra(int fibra) {
        this.fibra = fibra;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    //toSTRING

    @Override
    public String toString() {
        return "Ingredients{" +
                "id=" + idIngredient +
                ", name='" + name + '\'' +
                ", peso=" + peso +
                ", kcal=" + kcal +
                ", grasas=" + grasas +
                ", grasas_saturadas=" + grasas_saturadas +
                ", carbohidratos=" + carbohidratos +
                ", carbohidratos_azucares=" + carbohidratos_azucares +
                ", fibra=" + fibra +
                ", proteinas=" + proteinas +
                ", sal=" + sal +
                '}';
    }
}
