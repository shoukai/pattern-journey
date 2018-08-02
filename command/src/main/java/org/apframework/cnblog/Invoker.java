package org.apframework.cnblog;

//请求者/调用者：发起执行命令请求的对象
public class Invoker {
    //持有命令对象的引用
    private Command command;

    public Invoker(Command command) {
        super();
        this.command = command;
    }

    //请求者调用命令对象执行命令的那个execute方法
    public void call() {
        command.execute();
    }

    public static void main(String[] args) {
        //通过请求者（invoker）调用命令对象（command），命令对象中调用了命令具体执行者（Receiver）
        Command command = new ConcreteCommand(new Receiver());
        Invoker invoker = new Invoker(command);
        invoker.call();
    }
}