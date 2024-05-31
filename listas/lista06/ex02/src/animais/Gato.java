package animais;

public class Gato implements Animal {
    private String arranhar;
    private String ronronar;

    public Gato(){
        
    }
    @Override
    public void emitirSom(){
        System.out.println("meeoooow, meooooow");
    }

    @Override
    public void comer(){
        System.out.println("O gatinho quase destroi a casa exigindo sua comidinha, então sem opção, seu dono serve o pobre gatinho aproveita sua deliciosa ração");
    }

    public void setRonronar(String ronronar){
        this.ronronar = ronronar;
    }
    public void getRonronar(){
        System.out.println("ownn que fofura, o gatinho esta ronronando!!");
    }

    public void setArranhar(String arranhar){
        this.arranhar = arranhar;
    }
    public void getArranhar(){
        System.out.println("INHEEEEU!!! ohh não!!! as cortinas foram rasgadas pelo gato!!! ");
    }
}
