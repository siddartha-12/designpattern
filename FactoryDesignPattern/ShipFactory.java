package FactoryDesignPattern;

public class ShipFactory implements Factory{
    @Override
    public Vechile createVechile() {
        return new Ship();
    }
}
