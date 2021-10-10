package com.lojagraphql.lojagraphql.modules.order.domain;

import com.lojagraphql.lojagraphql.modules.client.domain.ClientResponse;
import com.lojagraphql.lojagraphql.modules.product.domain.Product;
import lombok.Builder;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
@Builder
public class Order {
    UUID id;
    ClientResponse clientResponse;
    Product product;
    LocalDateTime date;
}
