package com.example.demo.model.impl;

import com.example.demo.model.Car;

public class DieselCar implements Car {

    @Override
    public void checkEngine() {
        System.out.println("This is a diesel Car");
    }

    @Override
    public void fillUpTank(String fuel) {
        if (fuel.equalsIgnoreCase("diesel")) {
            System.out.println("DIESEL filling up");
		} else {
			System.out.println("Invalid fuel!");
		}
    }
}
