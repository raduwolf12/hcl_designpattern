package com.example.demo.model.impl;

import com.example.demo.model.Car;

public class HydrogenCar implements Car {

	@Override
	public void checkEngine() {
		System.out.println("This is a hydrogen Car");
	}

	@Override
	public void fillUpTank(String fuel) {
		if (fuel.equalsIgnoreCase("hydrogen")) {
			System.out.println("HYDROGEN fill up");
		} else {
			System.out.println("Invalid fuel!");
		}
	}
}
