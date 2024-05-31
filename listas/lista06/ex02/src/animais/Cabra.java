package animais;

public class Cabra implements Animal {
    private String lamber;
    private String cabecada;


    public Cabra(){

    }

    @Override
    public void comer(){
        System.out.println("nham nham, a cabra está comendo grama");
    }

    @Override
    public void emitirSom(){
        System.out.println("MÉÉÉÉÉÉÉÉÉÉÉÉÉÉÉÉÉÉÉÉÉÉÉÉÉÉÉÉÉ.....     meh");
    }

    public void setLamber(String lamber){
        this.lamber = lamber;
    }
    public void getLamber(){
        System.out.println("slir slirf, a cabra lambeu a cabeça de alguém :O");
    }

    public void setCabecada(String cabecada){
        this.cabecada = cabecada;
    }
    public void getCabecada(){
        System.out.println("A cabra deu uma cabeçada em um visitante da fazenda em que ela morava,e ele foi parar na China");
    }


}
