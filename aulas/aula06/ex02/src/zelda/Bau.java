public class Bau implements Interativo{
    private String item;
    private boolean estaTrancado;
    private int raridade;

    @override
    public void interagir(){
        if (!estaTrancado) {
            System.out.println("Encontrou o item: " + item;);
        } else {
            System.out.println("procure uma chave!");
        }
    }
}
