package org.apframework.bridge.ap;

public class Computer {

    private Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void run() {
        System.out.println("power on");
        brand.brand();
        System.out.println("system run");
    }
}
