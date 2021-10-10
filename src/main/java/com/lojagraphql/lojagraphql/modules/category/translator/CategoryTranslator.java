package com.lojagraphql.lojagraphql.modules.category.translator;

import com.lojagraphql.lojagraphql.modules.category.domain.CategoryResponse;
import com.lojagraphql.lojagraphql.modules.category.domain.CategoryInput;
import com.lojagraphql.lojagraphql.modules.category.model.Category;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CategoryTranslator {

    public CategoryResponse translate(Category category){
        return new CategoryResponse(category.getId(), category.getName());
    }

    public Category translateBack(CategoryInput category){
        Category categoryReturn = new Category();
        categoryReturn.setName(category.getName());

        return categoryReturn;
    }
}
