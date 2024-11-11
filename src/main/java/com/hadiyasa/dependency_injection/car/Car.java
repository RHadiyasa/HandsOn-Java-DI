package com.hadiyasa.dependency_injection.car;

import com.hadiyasa.dependency_injection.engine.Engine;

public class Car {
    // Tight Coupling
    // Membuat instance langsung di dalam classnya
    // private Engine engine = new Engine();

    // Loose Coupling
    // Membuat instance dari luar object yang dibutuhkan (Dependency Injection)
    // Object diinject melalui constructor atau setter

    /**
     * Bedanya
     * Tight Coupling -> Karena langsung diinstance di dalam kelas,
     * maka sulit untuk mengganti atau mengubah dependency tersebut.
     * cth: kelas A membuat instance dari kelas B secara langsung.
     * private Engine engine = new Engine(); -> langsung
     *
     * Loose Coupling -> Dependency disuntik melalui DI, menggunakan abstract / interface.
     * */
    private String name;
    private Engine engine;

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void start(){
        engine.startEngine();
    }

    public String getName() {
        return name;
    }
}
