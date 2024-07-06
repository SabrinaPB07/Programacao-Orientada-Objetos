package locadora;

import java.util.ArrayList;
import java.util.List;

public class Filme implements AudioVisual {
    private String titulo;
    private String diretor;
    private List<String> atores = new ArrayList<>();

    public Filme(String titulo, String diretor, List<String> atores){
        this.titulo = titulo;
        this.diretor = diretor;
        this.atores = atores;
    }

    @Override
    public void exibirInfo(){
        System.out.println(this.titulo);
        System.out.println(this.diretor);

        for (String ator : atores) {
            System.out.println(ator);
        }
    }

    @Override
    public boolean equals(Object objeto){
        if (super.equals(objeto)) {
            return true;
        }

        if (objeto instanceof Filme) {
            Filme filme = (Filme) objeto;
            if (filme.getTitulo().equals(this.titulo)) {
                return true;
            }
        }

        return false;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    public String getDiretor(){
        return this.diretor;
    }

    public void setAtores(List<String> atores){
        this.atores = atores;
    }
    public List<String> getAtores(){
        return this.atores;
    }
}
