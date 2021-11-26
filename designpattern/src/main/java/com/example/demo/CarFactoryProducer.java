package com.example.demo;

import com.example.demo.factories.ClassicCar;
import com.example.demo.factories.EcoCar;

public class CarFactoryProducer {

    public static AbstractCarFactory produceCarFactory(String string) {
        if("classic".equalsIgnoreCase(string)) {
            return new ClassicCar();
        } else if("eco".equalsIgnoreCase(string)) {
            return new EcoCar();
        }
        return null;
    }
}
