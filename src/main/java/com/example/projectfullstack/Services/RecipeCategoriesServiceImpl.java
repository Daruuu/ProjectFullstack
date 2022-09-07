package com.example.projectfullstack.Services;

import com.example.projectfullstack.Model.RecipeCategoriesModel;
import com.example.projectfullstack.Repository.RecipeCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeCategoriesServiceImpl implements RecipeCategoriesService{
    @Autowired
    private RecipeCategoriesRepository recipeCategoriesRepository;
    @Override
    public Iterable<RecipeCategoriesModel> getRecipeCategoryList(){
        return recipeCategoriesRepository.findAll();
    };
}
