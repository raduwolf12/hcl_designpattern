package com.example.demo.model.impl;

import com.example.demo.model.GasEngine;


/**
 * The Class CngEngine.
 */
public class CngEngine implements GasEngine {
	
	/**
	 * Fill up gas.
	 */
	@Override
	public void fillUpGas() {
		System.out.println("Filling up CNG");
	}
}
