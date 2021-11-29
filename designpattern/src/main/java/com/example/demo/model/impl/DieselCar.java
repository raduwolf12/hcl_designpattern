package com.example.demo.model.impl;

import com.example.demo.model.Car;


/**
 * The Class DieselCar.
 */
public class DieselCar implements Car {

	/**
	 * Check engine.
	 */
	@Override
	public void checkEngine() {
		System.out.println("This is a diesel Car");
	}

	/**
	 * Fill up tank.
	 *
	 * @param fuel the fuel
	 */
	@Override
	public void fillUpTank(String fuel) {
		if (fuel.equalsIgnoreCase("diesel")) {
			System.out.println("DIESEL filling up");
		} else {
			System.out.println("Invalid fuel!");
		}
	}
}
