package Registrydesignpattern;

public interface Registry <T>{
    public T get(String key);
    public void register(String key, T template);
    public void unRegister(String key);
    public T clone(String key);
}
