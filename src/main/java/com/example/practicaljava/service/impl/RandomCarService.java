package com.example.practicaljava.service.impl;

import com.example.practicaljava.entity.Car;
import com.example.practicaljava.service.Interface.CarService;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class RandomCarService implements CarService {

    @Override
    public Car geenerateCar() {

        var brand = BRANDS.get(ThreadLocalRandom.current().nextInt(0,BRANDS.size()));
        var color = COLORS.get(ThreadLocalRandom.current().nextInt(0,COLORS.size()));
        var type = TYPES.get(ThreadLocalRandom.current().nextInt(0,TYPES.size()));

        return new Car(brand,color,type);
    }



}
