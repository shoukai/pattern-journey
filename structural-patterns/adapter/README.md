# 适配器模式介绍

### 适配器模式：
将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的类可以一起工作。

结构图:

![](http://cdn.apframework.com/59266b03cb60c519160311f4d1b54711.jpg)

### 例如：

NBA中的球员来自不同国家，而世界标准语言是英语。那他们不会英语，也不能各自学习所有国家的语言。所以，最好的办法就是请不同的翻译

将这些球员国家的语言翻译成英语。而这些翻译就是适配器

### 适配器模式分类：

1、类适配器模式（不推荐使用）：由于类适配器模式需要多重继承对一个接口对另一个接口进行适配，而C#,Java不支持多重继承。

2、对象适配器模式：采用组合的方式

### 适配器和代理区别

**意图不同**：

适配器模式：适配器模式（英语：adapter pattern）有时候也称包装样式或者包装。将一个类的接口转接成用户所期待的。一个适配使得因接口不兼容而不能在一起工作的类工作在一起，做法是将类自己的接口包裹在一个已存在的类中。

代理模式：为其他对象提供一种代理以控制对这个对象的访问。在某些情况下，一个对象不适合或者不能直接引用另一个对象，而代理对象可以在客户端和目标对象之间起到中介的作用。

**功能不同**

适配器模式是因为新旧接口不一致导致出现了客户端无法得到满足的问题，但是，由于旧的接口是不能被完全重构掉的，因为我们还想使用实现了这个接口的一些服务。那么为了使用以前实现旧接口的服务，我们就应该把新的接口转换成旧接口；实现这个转换的类就是抽象意义的转换器

代理提供的接口和原本的接口是一样的，代理模式的作用是不把实现直接暴露给client，而是通过代理这个层，代理能够做一些处理。


### 参考

* [Java23种设计模式学习笔记](http://www.cnblogs.com/meet/p/5116504.html)
* [java-design-patterns](https://github.com/iluwatar/java-design-patterns)
