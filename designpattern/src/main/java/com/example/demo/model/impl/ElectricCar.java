package com.example.demo.model.impl;

import com.example.demo.model.Car;

public class ElectricCar implements Car {

    @Override
    public void checkEngine() {
        System.out.println("This is an electric Car");
    }

    @Override
    public void fillUpTank(String fuel) {
        if (fuel.equalsIgnoreCase("electricity")) {
            System.out.println("CHARGING");
		} else {
			System.out.println("Invalid fuel!");
		}
        
    }
}

