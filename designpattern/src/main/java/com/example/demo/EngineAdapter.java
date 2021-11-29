package com.example.demo;

import com.example.demo.model.Car;
import com.example.demo.model.GasEngine;
import com.example.demo.model.impl.CngEngine;
import com.example.demo.model.impl.GplEngine;

/**
 * The Class EngineAdapter.
 */
public class EngineAdapter implements Car {

	/**
	 * The gas engine. This variable is used to store either the class GplEngine or
	 * the class CngEngine
	 */
	GasEngine gasEngine;

	/**
	 * Instantiates a new engine adapter.
	 *
	 * @param fuel the fuel
	 */
	public EngineAdapter(String fuel) {

		if (fuel.equalsIgnoreCase("gpl")) {
			gasEngine = new GplEngine();

		} else if (fuel.equalsIgnoreCase("cng")) {
			gasEngine = new CngEngine();
		}
	}

	/**
	 * Fill up tank. This is the method we use to fill up the tank.
	 * 
	 * @param fuel the fuel
	 */
	@Override
	public void fillUpTank(String fuel) {
		if (fuel.equalsIgnoreCase("gpl")) {
			gasEngine.fillUpGas();

		} else if (fuel.equalsIgnoreCase("cng")) {
			gasEngine.fillUpGas();
		}
	}

	/**
	 * Check engine.
	 */
	@Override
	public void checkEngine() {
		System.out.println("Dual engine");
	}

}
