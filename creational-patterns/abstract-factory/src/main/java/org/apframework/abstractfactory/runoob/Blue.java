package org.apframework.abstractfactory.runoob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Blue implements Color {

    private static final Logger LOGGER = LoggerFactory.getLogger(Blue.class);

    @Override
    public void fill() {
        LOGGER.info("Inside Blue::fill() method.");
    }
}
