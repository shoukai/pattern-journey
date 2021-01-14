package org.apframework.decorator.ap;

public class ShapeDecorator implements Sharp {

    private Sharp sharp;

    public ShapeDecorator(Sharp sharp) {
        this.sharp = sharp;
    }

    @Override
    public void draw() {
        System.out.println("decorator begin");
        sharp.draw();
        System.out.println("decorator end");
    }
}
