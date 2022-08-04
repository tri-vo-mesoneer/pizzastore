package com.tri.pizzastore.entity;

import com.tri.pizzastore.enums.PizzaCrust;
import com.tri.pizzastore.enums.PizzaSize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pizza")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PizzaEntity {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "size")
    private PizzaSize size;

    @Column(name = "crust")
    private PizzaCrust crust;

    @Column(name = "price")
    private Double price;
}
