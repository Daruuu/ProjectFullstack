package com.example.projectfullstack.Repository;

import com.example.projectfullstack.Model.NewRecipePOJO;

public interface NewRecipePOJORepository {
    void addNewRecipe(NewRecipePOJO newRecipePOJO);
    int deleteNewRecipe(long id);
}
