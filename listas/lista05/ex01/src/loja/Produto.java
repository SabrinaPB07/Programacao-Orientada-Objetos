package loja;

public class Produto {
    private String nome;
    private int preco;
    private String descricao;

    public Produto(String nome, boolean estaEmEstoque, int preco, String descricaoDoProuto){
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricaoDoProuto;
    }
    public Produto(){

    }

    public void ExibirAtributrosProduto(){
        System.out.println(this.nome);
        System.out.println(this.preco);
        System.out.println(this.descricao);
    }


    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setPreco(int preco){
        this.preco = preco;
    }
    public int getPreco(){
        return this.preco;
    }

    public void setDescricao(String descricaoDoProduto){
        this.descricao = descricaoDoProduto;
    }
    public String getDescricao(){
        return this.descricao;
    }
}
