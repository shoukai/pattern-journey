package org.apframework.factory.ap.model;

import org.apframework.factory.ap.Car;

public class Audi implements Car {
    @Override
    public void run() {
        System.out.println("Audi Run");
    }
}
