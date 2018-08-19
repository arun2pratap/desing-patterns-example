package com.dp.observer;

public interface Subject {
    void subscribe(Observer1 observer);
    void unSubscribe(Observer1 observer1);
    void notifyObservers();
}
