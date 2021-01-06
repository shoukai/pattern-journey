package org.apframework.factory.ap;

import org.apframework.factory.ap.factory.AudiFactory;
import org.apframework.factory.ap.factory.BydFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory audiFactory = new AudiFactory();
        audiFactory.createCar().run();
        CarFactory bydFactory = new BydFactory();
        bydFactory.createCar().run();
    }
}
