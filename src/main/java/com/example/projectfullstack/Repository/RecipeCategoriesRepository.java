package com.example.projectfullstack.Repository;
import com.example.projectfullstack.Model.RecipeCategoriesModel;
import com.example.projectfullstack.Model.RecipeModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeCategoriesRepository extends CrudRepository <RecipeCategoriesModel,Long> {
}
