package org.apframework.abstractfactory.ap;

import org.apframework.abstractfactory.ap.factory.LowCarFactory;
import org.apframework.abstractfactory.ap.factory.LuxuryFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory luxuryCarFactory = new LuxuryFactory();
        Engine luxuryCarFactoryEngine = luxuryCarFactory.createEngine();
        luxuryCarFactoryEngine.start();
        luxuryCarFactoryEngine.run();
        Seat luxuryCarFactorySeat = luxuryCarFactory.createSeat();
        luxuryCarFactorySeat.color();
        luxuryCarFactorySeat.seat();

        System.out.println("----- 华丽的分割线 ----- ");

        CarFactory lowCarFactory = new LowCarFactory();
        Engine lowCarFactoryEngine = lowCarFactory.createEngine();
        lowCarFactoryEngine.start();
        lowCarFactoryEngine.run();
        Seat lowCarFactorySeat = lowCarFactory.createSeat();
        lowCarFactorySeat.color();
        lowCarFactorySeat.seat();
    }
}
