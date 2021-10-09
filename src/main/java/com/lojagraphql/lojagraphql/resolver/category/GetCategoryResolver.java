package com.lojagraphql.lojagraphql.resolver.category;

import com.lojagraphql.lojagraphql.domain.Category;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class GetCategoryResolver implements GraphQLQueryResolver {
    public Category getCategory(UUID id) {
        return new Category(id, "Eletronicos");
    }
}
