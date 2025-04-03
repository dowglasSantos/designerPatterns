package abstractFactory.carros;

import abstractFactory.interfaces.ICarroEsportivo;

public class CarroEsportivo implements ICarroEsportivo {
    @Override
    public void carroModerno() {
        System.out.println("carro esportivo moderno sendo fabricado");
    }

    @Override
    public void carroClassico() {
        System.out.println("carro esportivo classico sendo fabricado");
    }
}
