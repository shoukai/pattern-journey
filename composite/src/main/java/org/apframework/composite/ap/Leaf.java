package org.apframework.composite.ap;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("no action");
    }

    @Override
    public void remove(Component component) {
        System.out.println("no action");
    }

    @Override
    public void display(int depth) {
        System.out.println(depth + " : Leaf of " + name);
    }
}
