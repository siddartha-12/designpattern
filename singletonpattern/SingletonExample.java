package singletonpattern;
public class SingletonExample {
    private static SingletonExample singletonExampleInstance;
    private  SingletonExample()
    {

    }

    public static SingletonExample getSingletonExampleInstance() {
        if(singletonExampleInstance==null)
        {
            synchronized (SingletonExample.class)
            {
                if(singletonExampleInstance == null) {
                    singletonExampleInstance = new SingletonExample();
                }
            }
        }
        return singletonExampleInstance;
    }
}
