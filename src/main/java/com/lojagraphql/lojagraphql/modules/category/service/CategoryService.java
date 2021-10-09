package com.lojagraphql.lojagraphql.modules.category.service;

import com.lojagraphql.lojagraphql.modules.category.domain.Category;
import com.lojagraphql.lojagraphql.modules.category.repository.CategoryRepository;
import com.lojagraphql.lojagraphql.modules.category.translator.CategoryModelToDomain;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;
    private CategoryModelToDomain categoryModelToDomain;

    public CategoryService(CategoryRepository repository, CategoryModelToDomain modelToDomain){
        this.categoryRepository = repository;
        this.categoryModelToDomain = modelToDomain;
    }

    public Category getCategoryById(UUID id){
        Optional<com.lojagraphql.lojagraphql.modules.category.model.Category> category =
                this.categoryRepository.findById(id);

        if(!category.isEmpty()){
            return this.categoryModelToDomain.translate(category.get());
        }
        return null;
    }
}
