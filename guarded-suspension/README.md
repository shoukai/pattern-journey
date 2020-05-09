## Page

* [警戒暂停](https://java-design-patterns.com/patterns/guarded-suspension/)

## Intent
Use Guarded suspension pattern to handle a situation when you want to execute a method on object which is not in a proper state.

当您要在状态不正确的对象上执行方法时，请使用保护的挂起模式来处理这种情况。

![Guarded Suspension diagram](./etc/guarded-suspension.png)

## Applicability
Use Guarded Suspension pattern when the developer knows that the method execution will be blocked for a finite period of time

当开发人员知道方法执行将在有限的时间段内被阻止时，请使用Guarded Suspension模式

## Related patterns
* Balking 
