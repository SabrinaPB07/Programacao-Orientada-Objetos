package animais;

public class Gato implements Animal {
    private String pular;
    private String soninho;

    public Gato(){
        
    }
    @Override
    public void emitirSom(){
        System.out.println("miauuu, meoww");
    }

    @Override
    public void comer(){
        System.out.println("hmmm que delicia, o gatinho está comendo um peixe fresquinho hmmm");
    }

    public void setSoninho(String soninho){
        this.soninho = soninho;
    }
    public void getSoninho(){
        System.out.println("faça silencio!!!!! o gato está dormindo!");
    }

    public void setPular(String pular){
        this.pular = pular;
    }
    public void getPular(){
        System.out.println("uooou! o gato pula em todos os cantos da casa! ");
    }
}
