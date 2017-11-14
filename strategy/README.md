# 策略模式介绍

### 策略模式：

它定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化不会影响到使用算法的客户。

### 例如：

商场中的收银软件，内部是怎么针对不同的商品打不同的折扣呢？又或者，是怎么根据不同会员等级打不同的折扣呢？

其实内部就是定义了一个算法家族，给每个会员或者商品都指定一个特定的算法，根据不同的算法，打不同的折扣。

![alt text](./etc/strategy_1.png "Strategy")

Java 8 代码

```java
dragonSlayer = new DragonSlayer(() -> LOGGER.info("With your Excalibur you severe the dragon's head!"));
dragonSlayer.goToBattle();
dragonSlayer.changeStrategy(() -> LOGGER.info("You shoot the dragon with the magical crossbow and it falls dead on the ground!"));
dragonSlayer.goToBattle();
dragonSlayer.changeStrategy(() -> LOGGER.info("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!"));
dragonSlayer.goToBattle();
```