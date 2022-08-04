package com.tri.pizzastore.dto;

import com.tri.pizzastore.enums.PizzaCrust;
import com.tri.pizzastore.enums.PizzaSize;
import lombok.Data;

@Data
public class PizzaDto {
    private Long id;
    private String name;
    private String description;
    private PizzaSize size;
    private PizzaCrust crust;
    private Double price;
}
