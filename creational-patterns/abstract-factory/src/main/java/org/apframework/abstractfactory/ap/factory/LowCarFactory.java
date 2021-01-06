package org.apframework.abstractfactory.ap.factory;

import org.apframework.abstractfactory.ap.CarFactory;
import org.apframework.abstractfactory.ap.Engine;
import org.apframework.abstractfactory.ap.Seat;
import org.apframework.abstractfactory.ap.engine.LowEngine;
import org.apframework.abstractfactory.ap.seat.LowSeat;

public class LowCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new LowEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }
}
