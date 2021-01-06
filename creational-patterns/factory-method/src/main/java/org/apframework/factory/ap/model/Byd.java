package org.apframework.factory.ap.model;

import org.apframework.factory.ap.Car;

public class Byd implements Car {
    @Override
    public void run() {
        System.out.println("Byd Run");
    }
}
