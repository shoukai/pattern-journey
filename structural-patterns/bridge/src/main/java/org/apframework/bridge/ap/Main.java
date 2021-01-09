package org.apframework.bridge.ap;

import org.apframework.bridge.ap.brand.Dell;
import org.apframework.bridge.ap.brand.Mac;
import org.apframework.bridge.ap.computer.Desktop;
import org.apframework.bridge.ap.computer.Laptop;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Laptop(new Dell());
        computer1.run();

        System.out.println("--");

        Computer computer2 = new Laptop(new Mac());
        computer2.run();

        System.out.println("--");

        Computer computer3 = new Desktop(new Dell());
        computer3.run();

        System.out.println("--");

        Computer computer4 = new Desktop(new Mac());
        computer4.run();

        System.out.println("--");

    }
}
