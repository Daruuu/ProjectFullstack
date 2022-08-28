package com.example.projectfullstack.Repository;

import com.example.projectfullstack.Model.IngredientModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
//interfaz la cual implementa x metodos
//crudRepo es una interfaz que contiene metodos para operaciones CRUD

@Repository
public interface IngredientRepository extends CrudRepository<IngredientModel, Long> {

    //Optional<IngredientModel> findbyName();
}
