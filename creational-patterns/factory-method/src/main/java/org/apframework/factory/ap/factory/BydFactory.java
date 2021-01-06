package org.apframework.factory.ap.factory;

import org.apframework.factory.ap.Car;
import org.apframework.factory.ap.CarFactory;
import org.apframework.factory.ap.model.Byd;

public class BydFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Byd();
    }
}
