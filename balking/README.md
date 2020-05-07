
## Intent
Balking Pattern is used to prevent an object from executing certain code if it is an
incomplete or inappropriate state

Balking Pattern用于防止对象在状态不完整或不适当时执行某些代码

![alt text](./etc/balking.png "Balking")

## Applicability
Use the Balking pattern when

* you want to invoke an action on an object only when it is in a particular state
* objects are generally only in a state that is prone to balking temporarily
but for an unknown amount of time

在以下情况下使用Balking模式

* 您只想在对象处于特定状态时才对其调用操作
* 对象通常仅处于易于暂时停止但状态未知的状态

## Related patterns
* Guarded Suspension Pattern
* Double Checked Locking Pattern
