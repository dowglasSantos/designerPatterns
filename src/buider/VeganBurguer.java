package buider;

public class VeganBurguer extends BuildBurguer{
    @Override
    public void buildBun() {
        burguer.setBun("Vegan White Bread");
    }
    @Override
    public void buildMeat() {
        burguer.setMeat("Vegan Beef");
    }
    @Override
    public void buildSalad() {
        burguer.setSalad("Vegan Iceberg");
    }
    @Override
    public void buildCheese() {
        burguer.setCheese("Vegan American Cheese");
    }
    @Override
    public void buildSauce() {
        burguer.setSauce("Vegan Secret Sauce");
    }
}
