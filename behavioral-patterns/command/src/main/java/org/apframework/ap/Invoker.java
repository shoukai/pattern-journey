package org.apframework.ap;

//请求者/调用者：发起执行命令请求的对象
public class Invoker {
    //持有命令对象的引用
    private final Command command;

    public Invoker(Command command) {
        super();
        this.command = command;
    }

    //请求者调用命令对象执行命令的那个execute方法
    public void call() {
        command.execute();
    }
}