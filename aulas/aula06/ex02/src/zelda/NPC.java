public class NPC implements Interativo {
    private ArrayList<String> falas;
    private String localizacao;

    @override
    public void interagir(){
        Random random = new Random();
        int indiceFala = random.netxtInt(falas.size());
        System.out.println(falas.get(indiceFala));
    }

}
