package org.apframework.abstractfactory.runoob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Red implements Color {
    private static final Logger LOGGER = LoggerFactory.getLogger(Red.class);
    @Override
    public void fill() {
        LOGGER.info("Inside Red::fill() method.");
    }
}