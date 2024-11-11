package com.hadiyasa.dependency_injection.engine.impl;

import com.hadiyasa.dependency_injection.engine.Engine;

public class GasolineEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("Vroom...");
    }
}
