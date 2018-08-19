package com.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherForecast implements Subject {

    private List<Observer1> observers = new ArrayList();
    private int temp1;
    private int temp2;

    @Override
    public void subscribe(Observer1 observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribe(Observer1 observer1) {

    }

    @Override
    public void notifyObservers() {
        observers.forEach( ob -> ob.update(temp1, temp2));
    }

    public void update(int temp1, int temp2){
        this.temp1 = temp1;
        this.temp2 = temp2;
        temprateureChange();
    }

    private void temprateureChange() {
        notifyObservers();
    }
}
