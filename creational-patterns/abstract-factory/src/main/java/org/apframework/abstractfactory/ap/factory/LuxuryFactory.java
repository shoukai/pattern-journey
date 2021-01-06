package org.apframework.abstractfactory.ap.factory;

import org.apframework.abstractfactory.ap.CarFactory;
import org.apframework.abstractfactory.ap.Engine;
import org.apframework.abstractfactory.ap.Seat;
import org.apframework.abstractfactory.ap.engine.LuxuryEngine;
import org.apframework.abstractfactory.ap.seat.LuxurySeat;

public class LuxuryFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }
}
