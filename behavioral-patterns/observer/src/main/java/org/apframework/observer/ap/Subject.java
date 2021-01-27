package org.apframework.observer.ap;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private int status;

    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    public void notifyAllObserver() {
        observerList.forEach(p -> p.update(this));
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "status=" + status +
                '}';
    }
}
