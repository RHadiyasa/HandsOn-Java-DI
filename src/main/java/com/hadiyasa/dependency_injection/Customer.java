package com.hadiyasa.dependency_injection;

import com.hadiyasa.dependency_injection.car.Car;

public class Customer {
    private String name;
    private Car car;

    public Customer(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void drive(){
        car.getEngine().startEngine();
        System.out.println(this.name + " driving " + this.car.getName());
    }
}
