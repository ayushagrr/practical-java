package com.example.practicaljava.service.impl;

import com.example.practicaljava.entity.Car;
import com.example.practicaljava.entity.Engine;
import com.example.practicaljava.entity.Tire;
import com.example.practicaljava.service.Interface.CarService;
import com.example.practicaljava.util.RandomDateUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class RandomCarService implements CarService {

    @Override
    public Car geenerateCar() {

        var brand = BRANDS.get(ThreadLocalRandom.current().nextInt(0,BRANDS.size()));
        var color = COLORS.get(ThreadLocalRandom.current().nextInt(0,COLORS.size()));
        var type = TYPES.get(ThreadLocalRandom.current().nextInt(0,TYPES.size()));

        var fuel = FUELS.get(ThreadLocalRandom.current().nextInt(FUELS.size()));
        var horsePower = ThreadLocalRandom.current().nextInt(100,221);

        var engine  = new Engine();
        engine.setFuelType(fuel);
        engine.setHorsePower(horsePower);


        var tires = new ArrayList<Tire>();
        for(int i =0;i<3;i++){
            var tire = new Tire();
            var manufacturer = TIRE_MANUFACTURERS.get(ThreadLocalRandom.current().nextInt(TIRE_MANUFACTURERS.size()));
            var size = ThreadLocalRandom.current().nextInt(15,18);
            var price = ThreadLocalRandom.current().nextInt(200,401);

            tire.setManufacturer(manufacturer);
            tire.setSize(size);
            tire.setPrice(price);

            tires.add(tire);
        }

        var secretFeature  = ThreadLocalRandom.current().nextBoolean() ?"Can fly":null;


        int randomCount = ThreadLocalRandom.current().nextInt(ADDITIONAL_FEATURES.size());

        var additionalFeatures = new ArrayList<String>();
        for(int i =0;i<randomCount;i++){
            additionalFeatures.add(ADDITIONAL_FEATURES.get(i));
        }
        var available = ThreadLocalRandom.current().nextBoolean();
        var price = ThreadLocalRandom.current().nextInt(5000,12001);
        var firstReleaseDate = RandomDateUtil.generateLocalRandomDate();

        var result =  new Car(brand,color,type,price,available,firstReleaseDate);
        result.setAdditionalFeatures(additionalFeatures);
        result.setEngine(engine);
        result.setTires(tires);
        result.setSecreteFeature(secretFeature);
        return result;
    }



}
