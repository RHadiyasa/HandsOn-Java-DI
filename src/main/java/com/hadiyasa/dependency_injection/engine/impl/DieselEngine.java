package com.hadiyasa.dependency_injection.engine.impl;

import com.hadiyasa.dependency_injection.engine.Engine;

public class DieselEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("mber...");
    }
}
