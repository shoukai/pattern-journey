package org.apframework.prototype.ap;

import java.util.Date;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        long current = System.currentTimeMillis();

        ShadowSheep shadowSheep = new ShadowSheep("robot0", new Date(current));
        ShadowSheep robotSheep = (ShadowSheep) shadowSheep.clone();
        System.out.println(shadowSheep);
        System.out.println(robotSheep);

        shadowSheep.getBirthDay().setTime(current + 1000);

        System.out.println(shadowSheep);
        System.out.println(robotSheep);

        System.out.println("——");

        DeepSheep deepSheep = new DeepSheep("robot2", new Date(current));
        DeepSheep robotDeep = (DeepSheep) deepSheep.clone();
        System.out.println(deepSheep);
        System.out.println(robotDeep);

        deepSheep.getBirthDay().setTime(current + 1000);

        System.out.println(deepSheep);
        System.out.println(robotDeep);
    }

}
