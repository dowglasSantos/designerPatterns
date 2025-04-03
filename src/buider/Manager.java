package buider;

public class Manager {
    private BuildBurguer build;

    public void setBurguer(BuildBurguer build) {
        this.build = build;
    }

    public BuildBurguer getBuild() {
        return build;
    }

    public Burguer createBurguer() {
        build.buildBun();
        build.buildMeat();
        build.buildSalad();
        build.buildCheese();
        build.buildSauce();
        return build.build();
    };
}
