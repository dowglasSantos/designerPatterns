package singleton.simpleSingleton;

public class Singleton {
    public static void main(String[] args) {
        System.out.println("***** Designer Patterns Singleton *****");

        SingletonSimple singleton = SingletonSimple.getSingletonSimple("Valor Imultavel");
        SingletonSimple singleton1 = SingletonSimple.getSingletonSimple("Valor Imultavel 1");

        System.out.println("Valor 0: " + singleton.getValue());
        System.out.println("Valor 1: " + singleton1.getValue());
    }
}
