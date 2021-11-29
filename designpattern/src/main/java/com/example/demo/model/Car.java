package com.example.demo.model;

/**
 * The Interface Car.
 */
public interface Car {

	/**
	 * Check engine.
	 */
	void checkEngine();

	/**
	 * Fill up tank. This method is used for Adapter patter.
	 * 
	 * @param fuel the fuel
	 */
	void fillUpTank(String fuel);
}
