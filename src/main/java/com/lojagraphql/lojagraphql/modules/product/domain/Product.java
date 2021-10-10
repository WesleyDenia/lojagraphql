package com.lojagraphql.lojagraphql.modules.product.domain;

import com.lojagraphql.lojagraphql.modules.category.domain.CategoryResponse;
import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class Product {
    UUID id;
    CategoryResponse categoryResponse;
    String name;
    String image;
    String description;
    int stock;
}
