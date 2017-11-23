package HeadFirst02.IMPL;

import HeadFirst02.ISubject.Display;
import HeadFirst02.ISubject.Observer;
import HeadFirst02.ISubject.Subject;

public class ElementDisplay implements Observer, Display{
    private float temp;
    private float humidity;
    private Subject subject;

    public ElementDisplay(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float presure) {
        this.humidity = humidity;
        this.temp =temp;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current temp is " + temp
            +"And Current humidity is" + humidity
        );
    }
}
