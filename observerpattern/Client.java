package observerpattern;

public class Client {
    public static void main(String[] args) {
        Station station = new Station();
        PrintAverage printAverage = new PrintAverage(station);
        PrintTemperature printTemperature = new PrintTemperature(station);
        station.update(10);
        station.update(20);
    }
}
