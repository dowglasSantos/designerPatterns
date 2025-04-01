package buider;

public class ChesseBurguer extends BuildBurguer{
    @Override
    void buildBun() {
        burguer.setBun("White Bread");
    }

    @Override
    void buildMeat() {
        burguer.setMeat("Beef");
    }

    @Override
    void buildSalad() {
        burguer.setSalad("Iceberg");
    }

    @Override
    void buildCheese() {
        burguer.setCheese("Amarican Cheese");
    }

    @Override
    void buildSauce() {
        burguer.setSauce("Secret Sauce");
    }
}
