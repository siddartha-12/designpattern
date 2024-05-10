package observerpattern;

public class PrintAverage implements Observer{
    private Station station;
    private int n = 0;
    private int sum =0;
    PrintAverage(Station station)
    {
        this.station = station;
        this.station.subscribe(this);
        this.sum = 0;
        this.n = 0;
    }

    @Override
    public void update(int temperature) {
        this.sum+=temperature;
        this.n+=1;
        printAverage();
    }
    private void printAverage()
    {
        System.out.println("Average temperature" + this.sum/this.n);
    }
}
