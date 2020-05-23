package org.apframework.abstractfactory.runoob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Square implements Shape {

    private static final Logger LOGGER = LoggerFactory.getLogger(Square.class);

    @Override
    public void draw() {
        LOGGER.info("Inside Square::draw() method.");
    }
}
