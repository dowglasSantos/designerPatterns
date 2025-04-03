package abstractFactory;

import abstractFactory.fabrica.Ford;

public class App {
    public static void main(String[] args) {
        System.out.println("***** abstractFactory *****");
        Ford ford = new Ford();

        ford.carroEsportivo().carroClassico();
        ford.carroEsportivo().carroModerno();

        ford.carroPasseio().carroClassico();
        ford.carroPasseio().carroModerno();
    }
}
