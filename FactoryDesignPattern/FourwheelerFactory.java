package FactoryDesignPattern;

public class FourwheelerFactory implements Factory{
    @Override
    public Vechile createVechile() {
        return new FourWheeler();
    }
}
