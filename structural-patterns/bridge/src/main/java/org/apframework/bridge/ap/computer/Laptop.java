package org.apframework.bridge.ap.computer;

import org.apframework.bridge.ap.Brand;
import org.apframework.bridge.ap.Computer;

public class Laptop extends Computer {
    public Laptop(Brand brand) {
        super(brand);
    }

    public void run() {
        System.out.println("turn on");
        super.run();
    }
}
