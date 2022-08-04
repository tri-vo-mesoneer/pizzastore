package com.tri.pizzastore.mapper;

import com.tri.pizzastore.dto.PizzaDto;
import com.tri.pizzastore.entity.PizzaEntity;
import org.mapstruct.Mapper;

@Mapper
public interface PizzaMapper {
    PizzaDto toDto(PizzaEntity pizzaEntity);
    PizzaEntity toEntity(PizzaDto pizzaDto);
}
