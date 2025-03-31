package singleton.thredSingleton;

public class Singleton {
    public static void main(String[] args) {
        System.out.println("***** Designer Patterns Singleton *****");

        Thread thredOne = new Thread(new ThredOne());
        Thread thredTwo = new Thread(new ThredTwo());
        thredOne.start();
        thredTwo.start();
    }

    static class ThredOne implements Runnable {
        @Override
        public void run() {
            SingletonThred singletonThred = SingletonThred.getSingletonThred("Valor 0");
            System.out.println("ThredOne: " + singletonThred.getValue());
        }
    }

    static class ThredTwo implements Runnable {
        @Override
        public void run() {
            SingletonThred singletonThred1 = SingletonThred.getSingletonThred("Valor 1");
            System.out.println("ThredTwo: " + singletonThred1.getValue());
        }
    }
}
