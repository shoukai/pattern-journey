package org.apframework.bridge.ap.computer;

import org.apframework.bridge.ap.Brand;
import org.apframework.bridge.ap.Computer;

public class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }

    public void run(){
        System.out.println("charge the power");
        super.run();
    }
}
