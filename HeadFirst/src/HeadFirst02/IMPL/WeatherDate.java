package HeadFirst02.IMPL;

import HeadFirst02.ISubject.Observer;
import HeadFirst02.ISubject.Subject;

import java.util.ArrayList;

public class WeatherDate implements Subject {
    private float temp;
    private float humidity;
    private float pressure;
    private ArrayList<Observer> observers;

    public void setElements(float temp,float humidity,float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        elementChage();
    }

    public void elementChage(){
        notifyObservers();
    }

    public WeatherDate(){
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temp,humidity,pressure);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>0){
            observers.remove(observer);
        }
    }
}
