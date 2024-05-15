public class Personagens {
    String nome;
    boolean ehUsuarioDeStand;
    int qi;
    String nomeStandPersonagem;
    int forcaStand;

    public void invocarStand(){
        if (ehUsuarioDeStand = true) {
            System.out.println(nome + " invocou seu Stand chamado: " + nomeStandPersonagem);
        } else{
            System.out.println(nome + " não possui Stand e nâo consegue ver outros Stands");
        }
    }

    public void reclamar(){
        System.out.println("ai vacilão, cai dentro!");
    }

    public void morrer(){
        System.out.println("AHRGGA AAA!");
        System.out.println(nome + " morreu :(");
    }



}
