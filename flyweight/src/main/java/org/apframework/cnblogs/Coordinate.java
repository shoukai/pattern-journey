package org.apframework.cnblogs;

import lombok.Data;

/**
 * 坐标类（外部状态）：棋子位置
 * UnsharedConcreteFlyWeight（非共享享元类）：不能被共享的子类可以设计为非共享享元类
 */
@Data
public class Coordinate {

    //坐标位置
    private int x, y;

    public Coordinate(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
}