package com.lojagraphql.lojagraphql.modules.category.model;

import com.lojagraphql.lojagraphql.modules.product.model.Product;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "categories")
public class Category {
    @Id
    private UUID id;
    private String name;

    @OneToMany(targetEntity = Product.class)
    private List<Product> products;
}
