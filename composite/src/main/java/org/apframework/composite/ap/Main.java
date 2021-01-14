package org.apframework.composite.ap;

public class Main {

    public static void main(String[] args) {
        Component root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Component firstPart = new Composite("PartA");
        firstPart.add(new Leaf("Leaf C"));
        firstPart.add(new Leaf("Leaf D"));

        Component secondPart = new Composite("PartB");
        secondPart.add(new Leaf("Leaf E"));
        secondPart.add(new Leaf("Leaf F"));

        firstPart.add(secondPart);

        root.add(firstPart);
        root.add(new Leaf("Leaf G"));

        root.display(0);
    }

}
