package singleton.thredSingleton;

public class SingletonThred {
    private static SingletonThred singleton;
    private String value;

    private SingletonThred(String value) {
        this.value = value;
    }

    public static SingletonThred getSingletonThred(String value) {
        if(singleton == null) {
            singleton = new SingletonThred(value);
        }

        return singleton;
    }

    public String getValue() {
        return value;
    }
}