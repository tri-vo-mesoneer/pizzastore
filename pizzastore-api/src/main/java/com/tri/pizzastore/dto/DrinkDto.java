package com.tri.pizzastore.dto;

import lombok.Data;

@Data
public class DrinkDto {
    private Long id;
    private String name;
    private String description;
    private Double price;
}
