package com.example.practicaljava.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDate;
import java.util.List;

public class Car {
    private String brand;
    private String color;
    private String type;
    private int price;

    private List<String> additionalFeatures;

    public List<String> getAdditionalFeatures() {
        return additionalFeatures;
    }

    public void setAdditionalFeatures(List<String> additionalFeatures) {
        this.additionalFeatures = additionalFeatures;
    }

    private boolean available;

    @JsonFormat(pattern ="dd-MMMM-yyyy")
    private LocalDate firstReleaseDate;

    private Engine engine;
    private List<Tire> tires;

    @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
    private String secreteFeature;

    public String getSecreteFeature() {
        return secreteFeature;
    }

    public void setSecreteFeature(String secreteFeature) {
        this.secreteFeature = secreteFeature;
    }

    public Car() {
    }


    public Car(String brand, String color, String type, int price, boolean available, LocalDate firstReleaseDate) {
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.price = price;
        this.available = available;
        this.firstReleaseDate = firstReleaseDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDate getFirstReleaseDate() {
        return firstReleaseDate;
    }

    public void setFirstReleaseDate(LocalDate firstReleaseDate) {
        this.firstReleaseDate = firstReleaseDate;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public void setTires(List<Tire> tires) {
        this.tires = tires;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", additionalFeatures=" + additionalFeatures +
                ", available=" + available +
                ", firstReleaseDate=" + firstReleaseDate +
                ", engine=" + engine +
                ", tires=" + tires +
                ", secreteFeature='" + secreteFeature + '\'' +
                '}';
    }
}
