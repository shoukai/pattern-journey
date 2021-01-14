package org.apframework.decorator.ap.sharp;

import org.apframework.decorator.ap.Sharp;

public class Rectangle implements Sharp {
    @Override
    public void draw() {
        System.out.println("rectangle");
    }
}
