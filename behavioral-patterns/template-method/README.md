# 模板方法模式介绍

### 模板方法模式：

定义一个操作中的算法骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。

个人理解： 抽象父类

### 核心：

处理某个流程的代码已经都具备，但是其中某个节点的代码暂时不能确定。因此，我们采用工厂方法模式，将这个节点的代码实现转移给子类完成。即：处理步骤在父类中定义好，具体的实现延迟到子类中定义。

说白了，就是将一些相同操作的代码，封装成一个算法的骨架。核心的部分留在子类中操作，在父类中只把那些骨架做好。

### 例如：

1.去银行办业务，银行给我们提供了一个模板就是：先取号，排对，办理业务（核心部分我们子类完成），给客服人员评分，完毕。

这里办理业务是属于子类来完成的，其他的取号，排队，评分则是一个模板。

2.去餐厅吃饭，餐厅给提供的一套模板就是：先点餐，等待，吃饭（核心部分我们子类完成），买单

这里吃饭是属于子类来完成的，其他的点餐，买单则是餐厅提供给我们客户的一个模板。
   
### 总结

什么时候用模板方法模式？

实现一些操作时，整体步骤很固定，但是呢。就是其中一小部分容易变，这时候可以使用模板方法模式，将容易变的部分抽象出来，供子类实现。

### 参考

* [Java23种设计模式学习笔记](http://www.cnblogs.com/meet/p/5116504.html)
* [java-design-patterns](https://github.com/iluwatar/java-design-patterns)

