package org.apframework.proxy.ap;

/**
 * 抽象角色：提供代理角色和真实角色对外提供的公共方法
 */
public interface Star {
    void confer();//面谈
    void signContract();//签合同
    void bookTicket();//订票
    void sing();//唱歌
    void collectMoney();//收尾款
}
