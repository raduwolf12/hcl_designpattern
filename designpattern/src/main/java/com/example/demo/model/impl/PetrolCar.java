package com.example.demo.model.impl;

import com.example.demo.EngineAdapter;
import com.example.demo.model.Car;

/**
 * The Class PetrolCar.
 */
public class PetrolCar implements Car {

	/**
	 * The engine adapter. We use this class to take the method from the GasEngine
	 * interface.
	 */
	EngineAdapter engineAdapter;

	/**
	 * Check engine.
	 */
	@Override
	public void checkEngine() {
		System.out.println("This is a petrol Car");
	}

	/**
	 * Fill up tank. This method is using the engine adapter to execute the
	 * fillUpTank function based on cng or gpl.
	 *
	 * @param fuel the fuel
	 */
	@Override
	public void fillUpTank(String fuel) {

		if (fuel.equalsIgnoreCase("petrol")) {
			System.out.println("PETROL filling up");
		} else if (fuel.equalsIgnoreCase("gpl") || fuel.equalsIgnoreCase("cng")) {
			engineAdapter = new EngineAdapter(fuel);
			engineAdapter.fillUpTank(fuel);
		} else {
			System.out.println("Invalid fuel!");
		}

	}

}
