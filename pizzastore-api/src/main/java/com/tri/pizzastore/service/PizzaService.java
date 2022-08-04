package com.tri.pizzastore.service;

import com.tri.pizzastore.dto.PizzaDto;
import com.tri.pizzastore.entity.PizzaEntity;
import com.tri.pizzastore.mapper.PizzaMapper;
import com.tri.pizzastore.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    private PizzaMapper pizzaMapper;
    public PizzaDto add(PizzaDto pizzaDto) {
        PizzaEntity pizzaEntity = pizzaMapper.toEntity(pizzaDto);
        pizzaEntity = (PizzaEntity) pizzaRepository.save(pizzaEntity);
        return pizzaMapper.toDto(pizzaEntity);
    }
}
