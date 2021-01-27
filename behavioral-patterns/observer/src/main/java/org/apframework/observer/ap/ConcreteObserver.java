package org.apframework.observer.ap;

public class ConcreteObserver implements Observer {

    private int status;

    @Override
    public void update(Subject subject) {
        System.out.println("status change : " + subject);
    }
}
