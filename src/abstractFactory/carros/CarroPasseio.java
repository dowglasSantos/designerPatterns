package abstractFactory.carros;

import abstractFactory.interfaces.ICarroPasseio;

public class CarroPasseio implements ICarroPasseio {
    @Override
    public void carroModerno() {
        System.out.println("carro de passeio moderno sendo fabricado");
    }

    @Override
    public void carroClassico() {
        System.out.println("carro de passeio classico sendo fabricado");
    }
}
