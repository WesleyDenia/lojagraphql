package com.lojagraphql.lojagraphql.modules.client.resolver;

import com.lojagraphql.lojagraphql.modules.client.domain.Client;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class GetClientResolver implements GraphQLQueryResolver {
    public Client getClient(UUID id) {
        return new Client(id, "Wesley");
    }
}
