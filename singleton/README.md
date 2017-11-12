# 单例模式介绍

### 单例模式：

保证一个类只有一个实例，并且提供一个访问该实例的全局访问点。

### 单例模式优点：

1. 只生成一个实例，系统开销比较小

2. 单例模式可以在系统设置全局的访问点，优化共享资源的访问。

### 常见单例模式分类

主要：

* 饿汉式

线程安全，调用效率高，但是不能延时加载

eg: IvoryTower

* 懒汉式

线程安全，调用效率不高，但是可以延时加载

eg: ThreadSafeLazyLoadedIvoryTower

其他：

* 双重检测锁式

由于JVM底层内部模型原因，偶尔会出问题。不建议使用

eg：ThreadSafeDoubleCheckLocking

* 静态内部类式

线程安全，调用效率高。但是可以延时加载

eg：InitializingOnDemandHolderIdiom

* 枚举单例

线程安全，调用效率高，不能延时加载

### 参考

* [单例模式（Singleton）](http://www.cnblogs.com/meet/p/5116398.html)
* [java-design-patterns](https://github.com/iluwatar/java-design-patterns)