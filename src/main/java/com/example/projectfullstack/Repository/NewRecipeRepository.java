package com.example.projectfullstack.Repository;

import com.example.projectfullstack.Model.NewRecipePOJO;

public interface NewRecipeRepository {
    int addNewRecipe(NewRecipePOJO newRecipePOJO);
    int deleteNewRecipe(long id);
}
