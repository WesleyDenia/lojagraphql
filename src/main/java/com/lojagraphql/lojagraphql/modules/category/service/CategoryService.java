package com.lojagraphql.lojagraphql.modules.category.service;

import com.lojagraphql.lojagraphql.modules.category.domain.CategoryResponse;
import com.lojagraphql.lojagraphql.modules.category.domain.CategoryInput;
import com.lojagraphql.lojagraphql.modules.category.model.Category;
import com.lojagraphql.lojagraphql.modules.category.repository.CategoryRepository;
import com.lojagraphql.lojagraphql.modules.category.translator.CategoryTranslator;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;
    private CategoryTranslator categoryTranslator;

    public CategoryService(
            CategoryRepository repository,
            CategoryTranslator modelToDomain
    ) {
        this.categoryRepository = repository;
        this.categoryTranslator = modelToDomain;
    }

    public CategoryResponse getCategoryById(UUID id) {
        Optional<Category> category = this.categoryRepository.findById(id);

        if (!category.isEmpty()) {
            return this.categoryTranslator.translate(category.get());
        }
        return null;
    }

    public CategoryResponse createCategory(CategoryInput input) {
        Category category = categoryTranslator.translateBack(input);
        category.setId(UUID.randomUUID());

        return categoryTranslator.translate(categoryRepository.save(category));
    }
}
