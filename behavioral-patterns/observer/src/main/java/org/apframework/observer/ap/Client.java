package org.apframework.observer.ap;

public class Client {
    public static void main(String[] args) {

        Subject subject = new Subject();
        subject.addObserver(new ConcreteObserver());
        subject.addObserver(new ConcreteObserver());
        subject.addObserver(new ConcreteObserver());

        subject.setStatus(1);
        subject.notifyAllObserver();

        subject.setStatus(2);
        subject.notifyAllObserver();
    }
}
