package com.lojagraphql.lojagraphql.modules.client.domain;

import lombok.Value;

import java.util.UUID;

@Value
public class Client {
    UUID id;
    String name;
}
