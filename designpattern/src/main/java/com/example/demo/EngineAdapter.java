package com.example.demo;

import com.example.demo.model.Car;
import com.example.demo.model.GasEngine;
import com.example.demo.model.impl.CngEngine;
import com.example.demo.model.impl.GplEngine;

/**
 * The Class EngineAdapter.
 */
public class EngineAdapter implements Car {

	/** The gas engine. */
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
	 * Fill up tank.
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
