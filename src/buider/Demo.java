package buider;

public class Demo {
    public static void main(String[] args) {
        System.out.println("***** Hamburgueria *****");
        Manager manager = new Manager();
        manager.setBurguer(new ChesseBurguer());
        Burguer burguer = manager.createBurguer();
        burguer.print();
    }
}
