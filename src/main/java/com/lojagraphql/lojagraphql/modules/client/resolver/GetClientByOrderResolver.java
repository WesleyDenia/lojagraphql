package com.lojagraphql.lojagraphql.modules.client.resolver;

import com.lojagraphql.lojagraphql.modules.client.domain.ClientResponse;
import com.lojagraphql.lojagraphql.modules.order.domain.Order;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class GetClientByOrderResolver implements GraphQLResolver<Order>{
    UUID clientId = UUID.fromString("6cfbd90e-0e3e-4afb-a61a-60597101ce27");

    public ClientResponse client(Order order){
        return new ClientResponse(clientId, "Wesley");
    }
}
