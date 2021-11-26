package com.example.demo.factories;

import com.example.demo.AbstractCarFactory;
import com.example.demo.model.Car;
import com.example.demo.model.impl.ElectricCar;
import com.example.demo.model.impl.HydrogenCar;
import lombok.Data;

@Data
public class EcoCar extends AbstractCarFactory {

    @Override
    public Car getCar(String string) {
        if("hydrogen".equals(string)) {
            return new HydrogenCar();
        } else if ("electric".equals(string)) {
            return new ElectricCar();
        }
        return null;
    }
}
