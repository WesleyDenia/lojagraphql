package com.lojagraphql.lojagraphql.modules.order.model;

import com.lojagraphql.lojagraphql.modules.client.model.Client;
import com.lojagraphql.lojagraphql.modules.product.model.Product;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
public class Order {

    @Id
    private UUID id;

    private LocalDateTime date;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Product product;
}
