package org.apframework.adapter.ap;

public class Main {
    public static void main(String[] args) {
        Target target = new Adapter(new ToBuUse());
        target.process();
    }
}
