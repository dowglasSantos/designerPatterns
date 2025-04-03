package abstractFactory.fabrica;

import abstractFactory.carros.CarroEsportivo;
import abstractFactory.carros.CarroPasseio;
import abstractFactory.interfaces.ICarroPasseio;
import abstractFactory.interfaces.IFabrica;
import abstractFactory.interfaces.ICarroEsportivo;

public class Ford implements IFabrica {
    @Override
    public ICarroPasseio carroPasseio() {
        return new CarroPasseio();
    }

    @Override
    public ICarroEsportivo carroEsportivo() {
        return new CarroEsportivo();
    }
}
