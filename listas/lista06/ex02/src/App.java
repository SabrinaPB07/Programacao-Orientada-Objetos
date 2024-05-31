import java.util.ArrayList;

import animais.Animal;
import animais.Cabra;
import animais.Gato;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Gato> gatos = new ArrayList<>();
        ArrayList<Cabra> cabras = new ArrayList<>();

        gatos.add(new Gato());
        gatos.get(0).comer();
        gatos.get(0).emitirSom();
        gatos.get(0).getArranhar();
        gatos.get(0).getRonronar();

        cabras.add(new Cabra());
        cabras.get(0).comer();
        cabras.get(0).emitirSom();
        cabras.get(0).getLamber();
        cabras.get(0).getCabecada();
        
    }
}
