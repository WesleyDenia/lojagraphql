package com.lojagraphql.lojagraphql.modules.category.resolver;

import com.lojagraphql.lojagraphql.modules.category.domain.CategoryResponse;
import com.lojagraphql.lojagraphql.modules.category.service.CategoryService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class GetCategoryResolver implements GraphQLQueryResolver {

    private CategoryService categoryService;

    public GetCategoryResolver(CategoryService service){
        this.categoryService = service;
    }

    public CategoryResponse getCategory(UUID id) {
        return categoryService.getCategoryById(id);
    }
}
