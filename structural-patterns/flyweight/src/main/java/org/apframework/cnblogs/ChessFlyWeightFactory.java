package org.apframework.cnblogs;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * FlyweightFactory（享元工厂类）：创建并管理享元对象，享元池一般设计成键值对
 */
public class ChessFlyWeightFactory {
    //享元池：存放享元对象
    private static Map<String, ChessFlyWeight> map = new HashMap<>();

    //提供一个享元工厂:创建和管理棋子
    public static ChessFlyWeight getChess(String color) {
        if (map.get(color) != null) {
            return map.get(color);
        } else {
            ChessFlyWeight chess = new ConcreteFlyWeight(color);
            map.put(color, chess);
            return chess;
        }
    }

    public static void main(String[] args) {
        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");//黑1
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");//黑2
        System.out.println(chess1 == chess2);//结果为true，相同或相似对象内存中只存在一份

        //使用享元的外部状态
        chess1.display(new Coordinate(10, 10));//黑1在10,10的位置
        chess2.display(new Coordinate(20, 20));//黑2在20,20的位置

    }
}