package singleton.simpleSingleton;

public class SingletonSimple {
    private static SingletonSimple singletonSimple;
    private String value;

    // Constructor
    private SingletonSimple(String value) {
        this.value = value;
    }

    // Instanciando a Classe
    public static SingletonSimple getSingletonSimple(String value) {
        if(singletonSimple == null) {
            singletonSimple = new SingletonSimple(value);
        }

        return singletonSimple;
    };

    public String getValue() {
        return value;
    };
}
