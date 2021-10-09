package com.lojagraphql.lojagraphql.modules.category.resolver;

import com.lojagraphql.lojagraphql.modules.category.domain.Category;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class GetCategoryResolver implements GraphQLQueryResolver {
    public Category getCategory(UUID id) {
        return new Category(id, "Eletronicos");
    }
}
