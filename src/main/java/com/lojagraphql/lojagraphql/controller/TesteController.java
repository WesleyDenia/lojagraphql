package com.lojagraphql.lojagraphql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TesteController {

    @GetMapping("/teste")
    public String hello(){
        return "Hello Word";
    }
}
