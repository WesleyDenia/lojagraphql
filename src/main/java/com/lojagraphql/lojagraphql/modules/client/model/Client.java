package com.lojagraphql.lojagraphql.modules.client.model;

import com.lojagraphql.lojagraphql.modules.order.model.Order;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Client {
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(targetEntity = Order.class)
    private List<Order> orders;
}