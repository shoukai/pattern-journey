package org.apframework.decorator.ap;

import org.apframework.decorator.ap.sharp.Circle;
import org.apframework.decorator.ap.sharp.Rectangle;

public class Main {
    public static void main(String[] args) {
        Sharp superRedRectangle = new RedSharpDecorator(new Rectangle());
        superRedRectangle.draw();

        System.out.println("--");

        Sharp superRedCircle = new RedSharpDecorator(new Circle());
        superRedCircle.draw();
    }
}
