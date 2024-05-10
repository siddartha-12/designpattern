package singletonpattern;

public class Client {
    public static void main(String[] args) {
        for(int i=1;i<10;i++) {
            Thread t = new Thread(() -> {
                System.out.println(SingletonExample.getSingletonExampleInstance());
            });
            t.start();
        }

    }
}
