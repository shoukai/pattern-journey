# 工厂方法模式

工厂模式实现了创建者和调用者的分离

工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。

**意图**：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。

**主要解决**：主要解决接口选择的问题。

**何时使用**：我们明确地计划不同条件下创建不同实例时。

**如何解决**：让其子类实现工厂接口，返回的也是一个抽象的产品。

**关键代码**：创建过程在其子类执行。

### 工厂模式分类：

1. 简单工厂模式

2. 工厂方法模式：定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法使一个类的实例化延迟到其子类

    *个人理解：定义了各个工厂的创建方法，各个工厂自行实现创建方法，客户端决定使用哪个工厂*

3. 抽象工厂模式：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。

### 工厂方法模式

```java
//工厂接口
public interface CarFactory {
    //创建汽车方法
    Car createCar();
}
//创建比亚迪汽车的工厂
public class BydFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Byd();
    }
}
//创建奥迪的工厂
public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
 
//测试工厂方法
public class TestFactoryMethod {
    public static void main(String[] args) {
        /**
         * 工厂方法模式好处在于，以后如果再增加一辆车。只需再实现CarFactory接口即可。避免了OCP开闭原则
         * 不用在原来的代码上修改，只需新增类即可。
         * 例如:增加一辆奔驰，增加一个奔驰工厂BenzFactory即可。更好扩展
         */
        Car audi = new AudiFactory().createCar();
        Car byd = new BydFactory().createCar();
        audi.run();
        byd.run();
    }
}
```

### runoob 示例类图

![](http://cdn.apframework.com/4482e74b3458f017645f25c6e29629ab.jpg)

### 参考

* [Java23种设计模式学习笔记](http://www.cnblogs.com/meet/p/5116504.html)
* [java-design-patterns](https://github.com/iluwatar/java-design-patterns)
* [工厂模式-菜鸟教程](https://www.runoob.com/design-pattern/factory-pattern.html)