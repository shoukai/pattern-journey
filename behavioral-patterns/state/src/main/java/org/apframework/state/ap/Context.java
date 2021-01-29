package org.apframework.state.ap;

public class Context {
    private State state;

    public void change(State state) {
        this.state = state;
        System.out.println("change state");
        state.handle();
    }
}
