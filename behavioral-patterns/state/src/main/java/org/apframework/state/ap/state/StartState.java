package org.apframework.state.ap.state;

import org.apframework.state.ap.State;

public class StartState implements State {

    @Override
    public void handle() {
        System.out.println("state is started");
    }
}
