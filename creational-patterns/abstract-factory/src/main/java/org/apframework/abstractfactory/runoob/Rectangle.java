package org.apframework.abstractfactory.runoob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rectangle implements Shape {
    private static final Logger LOGGER = LoggerFactory.getLogger(Rectangle.class);
    @Override
    public void draw() {
        LOGGER.info("Inside Rectangle::draw() method.");
    }
}