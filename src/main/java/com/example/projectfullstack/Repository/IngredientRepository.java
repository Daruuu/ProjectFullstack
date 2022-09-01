package com.example.projectfullstack.Repository;

import com.example.projectfullstack.Model.IngredientModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends CrudRepository<IngredientModel, Long> {
}
