package com.hadiyasa.dependency_injection;

import com.hadiyasa.dependency_injection.car.Car;
import com.hadiyasa.dependency_injection.engine.Engine;
import com.hadiyasa.dependency_injection.engine.impl.DieselEngine;
import com.hadiyasa.dependency_injection.engine.impl.ElectricEngine;
import com.hadiyasa.dependency_injection.engine.impl.GasolineEngine;

public class Main {
    public static void main(String[] args) {
        Engine dieselEngine = new DieselEngine();
        Engine gasolineEngine = new GasolineEngine();
        Engine electricEngine = new ElectricEngine();

        Car tesla = new Car("Tesla", electricEngine);
        Car honda = new Car("Honda", gasolineEngine);
        Car elf =  new Car("Truck", dieselEngine);

        Customer rafi = new Customer("Rafi", tesla);
        rafi.drive();

        Customer olla = new Customer("Olla", honda);
        olla.drive();

        Customer rahma = new Customer("Rahma", elf);
        rahma.drive();
    }
}
