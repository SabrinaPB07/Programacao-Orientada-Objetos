package animais;

public class Vaca implements Animal {
    private String carinho;
    private String descerEscada;


    public Vaca(){

    }

    @Override
    public void comer(){
        System.out.println("a vaquinha está comendo grama hmmmmm");
    }

    @Override
    public void emitirSom(){
        System.out.println("MUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    public void setCarinho(String carinho){
        this.carinho = carinho;
    }
    public void getCarinho(){
        System.out.println("que bonitinhoo, a vaca está amando seus carinhos nela :D");
    }

    public void setDescerEscada(String descerEscada){
        this.descerEscada = descerEscada;
    }
    public void getDescerEscada(){
        System.out.println("vacas não sabem descer escadas KKKKKKKKKKKKkkk... tadinhas :(");
    }


}
