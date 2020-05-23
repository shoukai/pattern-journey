package org.apframework.abstractfactory.runoob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Green implements Color {

    private static final Logger LOGGER = LoggerFactory.getLogger(Green.class);

    @Override
    public void fill() {
        LOGGER.info("Inside Green::fill() method.");
    }
}