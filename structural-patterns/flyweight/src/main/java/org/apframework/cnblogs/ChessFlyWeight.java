package org.apframework.cnblogs;

/**
 * 享元类接口：可以共享的有颜色，大小，形状
 * FlyWeight（抽象享元类）：通常是一个接口或者抽象类，声明公共方法，
 * 这些方法可以向外界提供对象的内部状态，设置外部状态。
 */
public interface ChessFlyWeight {

    //这里只设置一个颜色,大小和形状省略
    void setColor(String c);

    String getColor();
    //显示棋子
    void display(Coordinate c);
}
