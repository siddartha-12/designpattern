package FactoryDesignPattern;

public class VechileProducer {
    private Vechile vechile;
    VechileProducer(Factory factory)
    {
        vechile = factory.createVechile();
    }
    public Vechile getVechile()
    {
        return vechile;
    }
}
