package com.example.demo.model.impl;

import com.example.demo.model.Car;

/**
 * The Class ElectricCar.
 */
public class ElectricCar implements Car {

	/**
	 * Check engine.
	 */
	@Override
	public void checkEngine() {
		System.out.println("This is an electric Car");
	}

	/**
	 * Fill up tank.
	 *
	 * @param fuel the fuel
	 */
	@Override
	public void fillUpTank(String fuel) {
		if (fuel.equalsIgnoreCase("electricity")) {
			System.out.println("CHARGING");
		} else {
			System.out.println("Invalid fuel!");
		}

	}
}
