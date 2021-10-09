package com.lojagraphql.lojagraphql.modules.order.resolver;

import com.lojagraphql.lojagraphql.modules.order.domain.Order;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class GetOrderResolver implements GraphQLQueryResolver {
    public Order getOrder(UUID id){
        return Order.builder()
                .id(id)
                .date(LocalDateTime.now())
                .build();
    }
}
