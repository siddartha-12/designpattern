package FactoryDesignPattern;

public class Client {
    public static void main(String[] args) {

        Factory fourwheelerFactory = new FourwheelerFactory();
        VechileProducer vechileProducer = new VechileProducer(fourwheelerFactory);
        Vechile vechile = vechileProducer.getVechile();
        vechile.printDetails();


        Factory shipFactory = new ShipFactory();
        VechileProducer vechileProducer2 = new VechileProducer(shipFactory);
        Vechile vechile2 = vechileProducer2.getVechile();
        vechile2.printDetails();
    }
}
