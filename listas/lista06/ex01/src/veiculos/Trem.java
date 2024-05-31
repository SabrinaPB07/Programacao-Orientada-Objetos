package veiculos;

public class Trem implements Veiculo{
    private String estacao;
    private String buzina;

    public Trem(String estacao){
        this.estacao = estacao;
    }
    public Trem(){
        
    }

   @Override
    public void acelerar(){
        System.out.println("THIC THIC THIC THIC");
    }

   @Override
   public void frear(){
        System.out.println("shhhhhhhhhhhh...");
    }

   public void setEstacao(String estacao){
        this.estacao = estacao;
    }
   public void getEstacao(){
        System.out.println("proxima estaçao: " + this.estacao + " desembarque pelo lado esquerdo do trem.");
    }

   public void setBuzina(String buzina){
        this.buzina = buzina;
    }
   public void getBuzina(){
        System.out.println("PIUUUUUIIIIIIIII");
    }
}
