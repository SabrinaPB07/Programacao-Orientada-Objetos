import java.util.ArrayList;

public class Luta {
    ArrayList<Personagens> personagensAdicionados = new ArrayList<>();
    Sheldoncooper sheldon = new Sheldoncooper();
    

    public void atacar(){
        for (int i = 0; i < personagensAdicionados.size(); i++){
            if (personagensAdicionados.get(i).ehUsuarioDeStand) {
                personagensAdicionados.get(i).invocarStand();
                 System.out.println("atacou e seu Stand grita: ORAAAAAAAAAAA");

            } else {
                System.out.println(personagensAdicionados.get(i).nome + "nao tem stand," + 
                " entao morreu atingido por um");
                personagensAdicionados.get(i).morrer();
            }
        }
    }

    public void vencerOuPerder(){
        for (int i = 0; i < personagensAdicionados.size(); i++){
            if (personagensAdicionados.get(i).forcaStand > sheldon.forcaStand) {
                System.out.println("Parabéns, você derrotou Sheldon cooper!!");
            } else {
                personagensAdicionados.get(i).morrer();
            }
        }
    }

    public void confrontoDeQi(){
        for (int i = 0; i < personagensAdicionados.size(); i++){
            if (personagensAdicionados.get(i).qi > sheldon.qi ) {
                System.out.println("sheldon viu que você era mais inteligente, entâo morreu");
                sheldon.morrer();
            } else{
                System.out.println("Sheldon te considera burro, então riu de você");
                sheldon.rir();
                sheldon.zoar();
            }

        }
    }
}
