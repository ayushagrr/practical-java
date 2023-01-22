package com.example.practicaljava.service.Interface;

import com.example.practicaljava.entity.Car;

import java.util.List;

public interface CarService {

    List<String> BRANDS = List.of("Toyota","Honda","Ford");
    List<String> COLORS = List.of("Red","Black","White");
    List<String> TYPES = List.of("Sedan","SUV","MPV");

    Car geenerateCar();
}
