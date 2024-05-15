/* este programa se resume em Jojo misturado com the big bang theory*/

public class App {
    public static void main(String[] args) throws Exception {
        Personagens personagem = new Personagens();
        personagem.nome = "Jotaro Kujo";
        personagem.ehUsuarioDeStand = true;
        personagem.qi = 95;
        personagem.nomeStandPersonagem = "Star Platinum";
        personagem.forcaStand = 10;

        Personagens personagemDois = new Personagens();
        personagem.nome = "Kakyoin Noriaki";
        personagem.ehUsuarioDeStand = true;
        personagem.qi = 200;
        personagem.nomeStandPersonagem = "Hierophant Green";
        personagem.forcaStand = 9;

        Luta luta = new Luta();
        luta.personagensAdicionados.add(personagem);
        luta.personagensAdicionados.add(personagemDois);
        
        luta.atacar();
        luta.vencerOuPerder();
        luta.confrontoDeQi();
    }
}
