package org.apframework.state.ap;

import org.apframework.state.ap.state.StartState;
import org.apframework.state.ap.state.StopState;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.change(new StopState());
        context.change(new StartState());
    }
}
