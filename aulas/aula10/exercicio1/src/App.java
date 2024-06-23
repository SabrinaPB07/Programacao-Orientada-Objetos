public class App {
    public static void main(String[] args) throws Exception {
        Caixa<String> caixa = new Caixa<>("Sapatos");
        Caixa<Integer> caixa2 = new Caixa<>(42);
        // nao é uma lista!!!!!!!!!!!!!!! nao confundirrrrrrrr!!!!!!
        //List<T> - ai sim é listaaaaaaaa

        System.out.println(caixa.getConteudo());
        System.out.println(caixa2.getConteudo());
    }
}
