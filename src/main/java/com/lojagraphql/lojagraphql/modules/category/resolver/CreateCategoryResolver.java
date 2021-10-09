package com.lojagraphql.lojagraphql.modules.category.resolver;

import com.lojagraphql.lojagraphql.modules.category.domain.Category;
import com.lojagraphql.lojagraphql.modules.category.domain.CategoryInput;
import com.lojagraphql.lojagraphql.modules.category.service.CategoryService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;


@Component
public class CreateCategoryResolver implements GraphQLMutationResolver {
    private CategoryService categoryService;

    public CreateCategoryResolver(CategoryService service){
        this.categoryService = service;
    }

    public Category createCategory(CategoryInput categoryInput) {
        return categoryService.createCategory(categoryInput);
    }
}
