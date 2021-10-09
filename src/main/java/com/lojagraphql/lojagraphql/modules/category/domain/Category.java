package com.lojagraphql.lojagraphql.modules.category.domain;

import lombok.Value;

import java.util.UUID;

@Value
public class Category {
    UUID id;
    String name;
}
