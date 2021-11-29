package com.example.demo.factories;

import com.example.demo.AbstractCarFactory;
import com.example.demo.model.Car;
import com.example.demo.model.impl.ElectricCar;
import com.example.demo.model.impl.HydrogenCar;
import lombok.Data;

/**
 * The Class EcoCar is a Factory.
 */
@Data
public class EcoCar extends AbstractCarFactory {

	/**
	 * Gets the car.
	 *
	 * @param string the string
	 * @return the car
	 */
	@Override
	public Car getCar(String string) {
		if ("hydrogen".equals(string)) {
			return new HydrogenCar();
		} else if ("electric".equals(string)) {
			return new ElectricCar();
		}
		return null;
	}
}
