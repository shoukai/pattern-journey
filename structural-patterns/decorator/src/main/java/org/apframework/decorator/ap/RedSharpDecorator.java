package org.apframework.decorator.ap;

public class RedSharpDecorator extends ShapeDecorator{

    public RedSharpDecorator(Sharp sharp) {
        super(sharp);
    }

    @Override
    public void draw() {
        System.out.println("red decorator begin");
        super.draw();
        System.out.println("red decorator end");
    }

}
