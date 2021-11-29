package com.example.demo;

import com.example.demo.model.Car;

public class DesignpatternApplication {

	public static void main(String[] args) {
		AbstractCarFactory classicFactory = CarFactoryProducer.produceCarFactory("classic");
		AbstractCarFactory ecoFactory = CarFactoryProducer.produceCarFactory("eco");

		System.out.println(classicFactory);
		System.out.println(ecoFactory);

		Car petrolCar = classicFactory.getCar("petrol");
		Car dieselCar = classicFactory.getCar("diesel");
		Car hydrogenCar = ecoFactory.getCar("hydrogen");
		Car electricCar = ecoFactory.getCar("electric");

		petrolCar.checkEngine();
		dieselCar.checkEngine();
		hydrogenCar.checkEngine();
		electricCar.checkEngine();
		
		petrolCar.fillUpTank("gpl");
		petrolCar.fillUpTank("cng");
		petrolCar.fillUpTank("petrol");
		dieselCar.fillUpTank("diesel");
		hydrogenCar.fillUpTank("hydrogen");
		electricCar.fillUpTank("electricity");
		electricCar.fillUpTank("");

	}

}
