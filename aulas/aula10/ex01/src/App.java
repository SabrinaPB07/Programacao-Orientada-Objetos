public class App {
    public static void main(String[] args) throws Exception {
        Garrafa<Suco> garrafa = new garrafa<>(new Suco());
        Garrafa<Refrigerante> garrafa2 = new Garrafa<>(new Refrigerante());
        // nao é lista

        garrafa.exibirInfo();
        garrafa2.exibirInfo();
    }
}
