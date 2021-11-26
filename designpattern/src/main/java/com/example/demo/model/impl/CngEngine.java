package com.example.demo.model.impl;

import com.example.demo.model.GasEngine;

public class CngEngine implements GasEngine{
	@Override
	public void fillUpGas() {
		System.out.println("Filling up CNG");
	}
}
