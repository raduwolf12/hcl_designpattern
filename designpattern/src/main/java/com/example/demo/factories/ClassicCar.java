package com.example.demo.factories;

import com.example.demo.AbstractCarFactory;
import com.example.demo.model.Car;
import com.example.demo.model.impl.DieselCar;
import com.example.demo.model.impl.PetrolCar;
import lombok.Data;

@Data
public class ClassicCar extends AbstractCarFactory {

    @Override
    public Car getCar(String string) {
        if("diesel".equals(string)) {
            return new DieselCar();
        } else if ("petrol".equals(string)) {
            return new PetrolCar();
        }
        return null;
    }
}
