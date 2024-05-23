import loja.Loja;
import loja.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Loja loja = new Loja();
        loja.setNome("Stardust Games");

        Produto produto1 = new Produto();
        produto1.setNome("Red Dead Redemption 2");
        produto1.setPreco(100);
        produto1.setDescricao("esse jogo eh top");
        loja.adicionarProduto(produto1);

        Produto produto2 = new Produto();
        produto2.setNome("Resident Evil 2 Remake");
        produto2.setPreco(64);
        produto2.setDescricao("O melhor Resident Evil da historia!!");
        loja.adicionarProduto(produto2);

        Produto produto3 = new Produto();
        produto3.setNome("God of War ragnarok");
        produto3.setPreco(150);
        produto3.setDescricao("nao sei, nunca joguei :(");
        loja.adicionarProduto(produto3);
        

        loja.listarProdutos();
    }
}
