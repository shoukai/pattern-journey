package org.apframework.decorator.ap;

import org.apframework.decorator.ap.sharp.Circle;
import org.apframework.decorator.ap.sharp.Rectangle;

public class Main {
    public static void main(String[] args) {
        ShapeDecorator superRedRectangle = new RedSharpDecorator(new Rectangle());
        superRedRectangle.draw();

        System.out.println("--");

        ShapeDecorator superRedCircle = new RedSharpDecorator(new Circle());
        superRedCircle.draw();
    }
}
