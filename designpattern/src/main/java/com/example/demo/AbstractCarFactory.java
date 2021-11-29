package com.example.demo;

import com.example.demo.model.Car;

/**
 * A factory for creating AbstractCar objects.
 */
public abstract class AbstractCarFactory {
	
	/**
	 * Gets the car.
	 *
	 * @param string the string
	 * @return the car
	 */
	public abstract Car getCar(String string);
}
