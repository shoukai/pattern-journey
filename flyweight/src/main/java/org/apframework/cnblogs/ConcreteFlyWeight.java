package org.apframework.cnblogs;

//享元的具体实现：ConcreteFlyWeight（具体享元类）：为内部状态提供成员变量进行存储
class ConcreteFlyWeight implements ChessFlyWeight {

    private String color;//这里就是为内部状态提供成员变量进行存储

    //构造的时候初始化color属性
    public ConcreteFlyWeight(String color) {
        super();
        this.color = color;
    }

    @Override
    public void setColor(String c) {
        this.color = c;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色：" + color);
        System.out.println("棋子位置：(" + c.getX() + "," + c.getY() + ")");
    }
}
