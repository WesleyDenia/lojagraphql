package com.lojagraphql.lojagraphql.modules.product.resolver;

import com.lojagraphql.lojagraphql.modules.category.domain.CategoryResponse;
import com.lojagraphql.lojagraphql.modules.product.domain.Product;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class GetProductResolver implements GraphQLQueryResolver {
    public Product getProduct(UUID id){
        UUID categoryId = UUID.fromString("6cfbd90e-0e3e-4afb-a61a-60597101ce27");
        return Product.builder()
                .id(id)
                .name("Rato")
                .image("https://www.worten.pt/i/69eab96609be7d000104e0b2dfde6d5915d7614c.jpg")
                .categoryResponse( new CategoryResponse(categoryId, "Eletronicos"))
                .stock(10).build();
    }
}
