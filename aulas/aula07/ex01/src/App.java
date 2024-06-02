public class App {
    public static void main(String[] args) throws Exception {
        Carta carta = new CartaPulo();
        Carta carta2 = new AlterarOFuturo();

        carta.exibirInformacoes();
        carta.realizarAcao();

        carta2.exibirInformacoes();
        carta2.realizarAcao();
    }
}
