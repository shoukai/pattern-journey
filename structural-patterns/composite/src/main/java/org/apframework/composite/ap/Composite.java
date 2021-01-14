package org.apframework.composite.ap;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private final List<Component> list = new ArrayList<>(16);

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println(depth + " : Composite of " + name);
        list.forEach(p -> p.display(depth + 1));
    }
}
