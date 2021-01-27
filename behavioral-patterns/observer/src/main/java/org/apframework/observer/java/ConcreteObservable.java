package org.apframework.observer.java;

import java.util.Observable;

// 正常的dto
public class ConcreteObservable extends Observable {

    private int status;

    public int getStatus() {
        return status;
    }

    public void changeStatus(int status) {
        this.status = status;
        setChanged();
    }

    @Override
    public String toString() {
        return "ConcreteObservable{" +
                "status=" + status +
                '}';
    }
}
