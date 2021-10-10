package com.lojagraphql.lojagraphql.modules.product.resolver;

import com.lojagraphql.lojagraphql.modules.category.domain.CategoryResponse;
import com.lojagraphql.lojagraphql.modules.order.domain.Order;
import com.lojagraphql.lojagraphql.modules.product.domain.Product;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class GetProductByOrderResolver implements GraphQLResolver<Order> {
    UUID productId = UUID.fromString("6cfbd90e-0e3e-4afb-a61a-60597101ce30");
    UUID categoryId = UUID.fromString("6cfbd90e-0e3e-4afb-a61a-60597101ce27");

    public Product product(Order order){
        return Product.builder()
                .id(productId)
                .name("Rato")
                .image("https://www.worten.pt/i/69eab96609be7d000104e0b2dfde6d5915d7614c.jpg")
                .categoryResponse( new CategoryResponse(categoryId, "Eletronicos"))
                .stock(10).build();
    }
}
