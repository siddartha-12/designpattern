package observerpattern;

public interface Observable {
    public void subscribe(Observer observer);
    public void update(int temperature);
    public void unSubscribe(Observer observer);
}
