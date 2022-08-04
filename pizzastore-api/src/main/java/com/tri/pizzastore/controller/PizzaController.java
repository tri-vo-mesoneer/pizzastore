package com.tri.pizzastore.controller;

import com.tri.pizzastore.dto.PizzaDto;
import com.tri.pizzastore.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/pizzas")
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/all")
    public String getAll() {
        return "Hello";
    }

    @PostMapping("/add")
    public ResponseEntity<PizzaDto> add(@RequestBody PizzaDto pizzaDto) {
        PizzaDto result = pizzaService.add(pizzaDto);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
}
