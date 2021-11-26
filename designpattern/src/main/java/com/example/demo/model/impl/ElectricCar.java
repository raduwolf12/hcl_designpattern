package com.example.demo.model.impl;

import com.example.demo.model.Car;

public class ElectricCar implements Car {

    @Override
    public void checkEngine() {
        System.out.println("This is an electric Car");
    }

    @Override
    public void fillUpTank(String fuel) {
        System.out.println("CHARGING");
    }
}

