package org.apframework.abstractfactory.ap.seat;

import org.apframework.abstractfactory.ap.Seat;

public class LuxurySeat implements Seat {
    @Override
    public void seat() {
        System.out.println("奢华");
    }

    @Override
    public void color() {
        System.out.println("皮质");
    }
}
