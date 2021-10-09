package com.lojagraphql.lojagraphql.modules.client.model;

import com.lojagraphql.lojagraphql.modules.order.model.Order;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "clients")
public class Client {
    @Id
    private UUID id;

    @Column(nullable = false)
    private String name;

    @OneToMany(targetEntity = Order.class)
    private List<Order> orders;
}