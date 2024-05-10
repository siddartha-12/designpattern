package observerpattern;

public class PrintTemperature implements Observer{
    private Station station;
    PrintTemperature(Station station)
    {
        this.station = station;
        this.station.subscribe(this);
    }

    @Override
    public void update(int temperature) {
        printTemperature(temperature);
    }
    private void printTemperature(int temperature)
    {
        System.out.println("current temperature" + temperature);
    }
}
