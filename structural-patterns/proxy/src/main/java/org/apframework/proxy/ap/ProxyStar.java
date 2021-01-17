package org.apframework.proxy.ap;

/**
 * 代理角色（明星经纪人）：
 */
public class ProxyStar implements Star {

    private Star star;//真实对象的引用（明星）

    @Override
    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("ProxyStar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket()");
    }

    @Override
    public void sing() {
        star.sing();//真实对象的操作（明星唱歌）
    }

    @Override
    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney()");
    }

    public ProxyStar(Star star) {//通过构造器给真实角色赋值
        this.star = star;
    }
}
