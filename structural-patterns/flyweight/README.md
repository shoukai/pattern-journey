# 享元模式
## 相关概念
### 模式意图
意图：运用共享技术有效地支持大量细粒度的对象。
概念：它使用共享物件，用来尽可能减少内存使用量以及分享资讯给尽可能多的相似物件；它适合用于只是因重复而导致使用无法令人接受的大量内存的大量物件。通常物件中的部分状态是可以分享。常见做法是把它们放在外部数据结构，当需要使用时再将它们传递给享元。

### 模式示例
![](/flyweight/doc/pic-01.jpg)

围棋中的享元模式，在围棋中，所有的白色或黑色的（形状、大小，颜色都一样）只是位置不同，那像这样的情况，可以使用享元模式。

### 模式解析
如果项目中有很多完全相同或相似的对象，则可以使用享元模式，节省内存。享元对象能做到共享的关键就是区分了内部状态和外部状态。
1. 内部状态：可以共享，不会随环境变化而变化
2. 外部状态：不可以共享，会随环境变化而变化

![](/flyweight/doc/pic-02.png)

* 优点
1. 极大的减少内存中对象的数量
2. 相同或相似对象内存中只存在一份，极大的节约资源，提高系统性能
3. 外部状态相对独立，不影响内部状态
* 缺点
1. 模式较复杂，使程序逻辑复杂化
2. 为了节省内存，共享了内部状态，分离出外部状态，而读取外部状态使运行时间变长。

## 相关代码
享元类接口：可以共享的有颜色、大小、形状
```
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
```
具体享元类：颜色是共享的，
```
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
```
享元工厂：ChessFlyWeightFactory
```
/**
 * 享元工厂
 * FlyweightFactory（享元工厂类）：创建并管理享元对象，享元池一般设计成键值对
 */
public class ChessFlyWeightFactory {
    //享元池：存放享元对象
    private static Map<String, ChessFlyWeight> map= new HashMap<>();

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
}
```
坐标类
```
/**
 * 坐标类（外部状态）：棋子位置
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
```
主函数
```
public static void main(String[] args) {
    ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");//黑1
    ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");//黑2
    System.out.println(chess1 == chess2);//结果为true，相同或相似对象内存中只存在一份

    //使用享元的外部状态
    chess1.display(new Coordinate(10, 10));//黑1在10,10的位置
    chess2.display(new Coordinate(20, 20));//黑2在20,20的位置
}
```
结果
```
true
棋子颜色：黑色
棋子位置：(10,10)
棋子颜色：黑色
棋子位置：(20,20)
```

# 参考
* [Java23种设计模式学习笔记](http://www.cnblogs.com/meet/p/5116504.html)
* [java-design-patterns](https://github.com/iluwatar/java-design-patterns)
* [享元模式_百度百科](https://baike.baidu.com/item/%E4%BA%AB%E5%85%83%E6%A8%A1%E5%BC%8F/10541959)
* [Flyweight](http://java-design-patterns.com/patterns/flyweight/)
