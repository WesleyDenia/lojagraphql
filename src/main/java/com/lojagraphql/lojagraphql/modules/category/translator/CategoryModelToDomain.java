package com.lojagraphql.lojagraphql.modules.category.translator;

import com.lojagraphql.lojagraphql.modules.category.domain.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryModelToDomain {

    public Category translate(com.lojagraphql.lojagraphql.modules.category.model.Category category){
        return new Category(category.getId(), category.getName());
    }
}
