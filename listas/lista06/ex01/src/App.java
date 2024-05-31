import java.util.ArrayList;

import veiculos.Carro;
import veiculos.Aviao;
import veiculos.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Carro> carros = new ArrayList<>();
        ArrayList<Aviao> avioes = new ArrayList<>();

        carros.add(new Carro("formula 1"));
        carros.get(0).acelerar();
        carros.get(0).getBuzina();
        carros.get(0).frear();

        avioes.add(new Aviao("Paris - França"));
        avioes.get(0).acelerar();
        avioes.get(0).getTurbulencia();
        avioes.get(0).getDestino();
        avioes.get(0).frear();
    }
}
