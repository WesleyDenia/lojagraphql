package com.lojagraphql.lojagraphql.modules.category.translator;

import com.lojagraphql.lojagraphql.modules.category.domain.Category;
import com.lojagraphql.lojagraphql.modules.category.domain.CategoryInput;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CategoryTranslator {

    public Category translate(com.lojagraphql.lojagraphql.modules.category.model.Category category){
        return new Category(category.getId(), category.getName());
    }

    public com.lojagraphql.lojagraphql.modules.category.model.Category translateBack(CategoryInput category){
        com.lojagraphql.lojagraphql.modules.category.model.Category categoryReturn =
                new com.lojagraphql.lojagraphql.modules.category.model.Category();

        categoryReturn.setName(category.getName());
        categoryReturn.setId(UUID.randomUUID());

        return categoryReturn;
    }
}
