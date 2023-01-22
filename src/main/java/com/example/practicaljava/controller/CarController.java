package com.example.practicaljava.controller;

import com.example.practicaljava.entity.Car;
import com.example.practicaljava.service.Interface.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car/v1")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/random",method = RequestMethod.GET)
    public Car randomCar(){
      return carService.geenerateCar();
    }

}
