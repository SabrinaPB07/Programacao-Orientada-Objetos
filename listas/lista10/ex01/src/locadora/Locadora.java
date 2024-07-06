package locadora;

import java.util.ArrayList;
import java.util.List;

public class Locadora<T extends AudioVisual> {
    private List<T> acervo = new ArrayList<>();


    public void adicionarItem(T item){
        this.acervo.add(item);
    }

    public void listarItems(){
        for (T itens : acervo) {
            System.out.println(itens);
        }
    }

   public void buscarItem(String titulo){
        for (T t : acervo) {
            if (t instanceof Filme) {
                Filme filme = (Filme) t;
                if(filme.getTitulo().equalsIgnoreCase(titulo)){
                    System.out.println(filme);
                }
            }
        } 
   }

}
