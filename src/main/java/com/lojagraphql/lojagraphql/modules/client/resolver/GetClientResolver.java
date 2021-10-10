package com.lojagraphql.lojagraphql.modules.client.resolver;

import com.lojagraphql.lojagraphql.modules.client.domain.ClientResponse;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class GetClientResolver implements GraphQLQueryResolver {
    public ClientResponse getClient(UUID id) {
        return new ClientResponse(id, "Wesley");
    }
}
