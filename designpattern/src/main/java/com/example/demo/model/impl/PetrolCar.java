package com.example.demo.model.impl;

import com.example.demo.model.Car;

public class PetrolCar implements Car {

    @Override
    public void checkEngine() {
        System.out.println("This is a petrol Car");
    }

    @Override
    public void fillUpTank(String fuel) {
        System.out.println("PETROL filling up");
    }
}
