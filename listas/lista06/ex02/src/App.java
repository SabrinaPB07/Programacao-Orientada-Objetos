import java.util.ArrayList;

import animais.Animal;
import animais.Vaca;
import animais.Gato;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Gato> gatos = new ArrayList<>();
        ArrayList<Vaca> vacas = new ArrayList<>();

        gatos.add(new Gato());
        gatos.get(0).comer();
        gatos.get(0).emitirSom();
        gatos.get(0).getPular();
        gatos.get(0).getSoninho();

        vacas.add(new Vaca());
        vacas.get(0).comer();
        vacas.get(0).emitirSom();
        vacas.get(0).getCarinho();
        vacas.get(0).getDescerEscada();
        
    }
}
