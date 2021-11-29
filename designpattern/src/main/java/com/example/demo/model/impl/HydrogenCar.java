package com.example.demo.model.impl;

import com.example.demo.model.Car;

/**
 * The Class HydrogenCar.
 */
public class HydrogenCar implements Car {

	/**
	 * Check engine.
	 */
	@Override
	public void checkEngine() {
		System.out.println("This is a hydrogen Car");
	}

	/**
	 * Fill up tank.
	 *
	 * @param fuel the fuel
	 */
	@Override
	public void fillUpTank(String fuel) {
		if (fuel.equalsIgnoreCase("hydrogen")) {
			System.out.println("HYDROGEN fill up");
		} else {
			System.out.println("Invalid fuel!");
		}
	}
}
