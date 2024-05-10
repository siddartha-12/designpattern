package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Station implements Observable{
    private List<Observer> observers;
    private int temperature;
    Station()
    {
        this.observers = new ArrayList<>();
        this.temperature=0;
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        for(Observer observer : this.observers)
        {
            observer.update(this.temperature);
        }
    }

    @Override
    public void unSubscribe(Observer observer) {
        observers.remove(observer);
    }
}
