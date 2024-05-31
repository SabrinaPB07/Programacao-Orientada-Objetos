import java.util.ArrayList;

import veiculos.Carro;
import veiculos.Trem;
import veiculos.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Carro> carros = new ArrayList<>();
        ArrayList<Trem> trens = new ArrayList<>();

        carros.add(new Carro("formula 1"));
        carros.get(0).acelerar();
        carros.get(0).getBuzina();
        carros.get(0).frear();

        trens.add(new Trem("Japão - Liberdade"));
        trens.get(0).acelerar();
        trens.get(0).getBuzina();
        trens.get(0).getEstacao();
        trens.get(0).frear();
    }
}
