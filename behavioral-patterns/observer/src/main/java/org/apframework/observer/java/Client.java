package org.apframework.observer.java;

import java.util.Observable;

public class Client {

    public static void main(String[] args) {
        ConcreteObservable observable = new ConcreteObservable();
        observable.addObserver(new ConcreteObserver());
        observable.addObserver(new ConcreteObserver());

        observable.changeStatus(1);
        observable.notifyObservers();

        observable.changeStatus(2);
        observable.notifyObservers();
    }

}
