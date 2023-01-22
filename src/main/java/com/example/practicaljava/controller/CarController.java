package com.example.practicaljava.controller;

import com.example.practicaljava.entity.Car;
import com.example.practicaljava.service.Interface.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/api/car/v1")
public class CarController {

    private Logger LOG = LoggerFactory.getLogger(CarController.class);

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/random",method = RequestMethod.GET)
    public Car randomCar(){
      return carService.geenerateCar();
    }

    @PostMapping(value = "/echo")
    public String echo(@RequestBody Car car){
        LOG.info("Car is {}",car);
        return car.toString();
    }
    @GetMapping(value = "/random-cars")
    public List<Car> randomCars(){
        var result = new ArrayList<Car>();

        for(int i =0;i< ThreadLocalRandom.current().nextInt(1,10);i++){
            result.add(carService.geenerateCar());
        }
        return result;
    }

}
