package com.lojagraphql.lojagraphql.modules.product.model;

import com.lojagraphql.lojagraphql.modules.category.model.Category;
import com.lojagraphql.lojagraphql.modules.order.model.Order;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Product {

    @Id
    private UUID id;
    private String name;
    private String image;
    private String description;

    @ManyToOne
    private Category category;

    @OneToMany(targetEntity = Order.class)
    private List<Order> orders;
}
