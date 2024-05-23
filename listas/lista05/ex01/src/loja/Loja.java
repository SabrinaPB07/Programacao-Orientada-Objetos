package loja;

import java.util.ArrayList;

public class Loja {
    private String nome;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Loja(String nome, ArrayList<Produto> produtos){
        this.nome = nome;
        this.produtos = produtos;
    }
    public Loja(){

    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setProdutos (ArrayList<Produto> produtos){
        this.produtos = produtos;
    }
    public ArrayList<Produto> getProdutos(){
        return this.produtos;
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void listarProdutos(){
        for (Produto produto : produtos) {
            System.out.println(produto.getNome());
        }
    }

}
