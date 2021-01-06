package org.apframework.abstractfactory.ap.seat;

import org.apframework.abstractfactory.ap.Seat;

public class LowSeat implements Seat {
    @Override
    public void seat() {
        System.out.println("舒适");
    }

    @Override
    public void color() {
        System.out.println("布质");
    }
}
