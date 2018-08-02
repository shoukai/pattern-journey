package org.apframework.cnblog;

//具体命令类
class ConcreteCommand implements Command {

    //持有真正执行命令对象的引用
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        super();
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //调用接收者执行命令的方法
        receiver.action();
    }
}