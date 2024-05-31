package veiculos;

public class Aviao implements Veiculo{
    private String destino;
    private String turbulencia;

    public Aviao(String destino){
        this.destino = destino;
    }
    public Aviao(){
        
    }

   @Override
    public void acelerar(){
        System.out.println("THIC THIC THIC THIC");
    }

   @Override
   public void frear(){
        System.out.println("shhhhhhhhhhhh...");
    }

   public void setDestino(String destino){
        this.destino = destino;
    }
   public void getDestino(){
        System.out.println("iremos decolar em: " + this.destino + " por vavor, nao retirem o cinto de segurança");
    }

   public void setturbulencia(String turbulencia){
        this.turbulencia = turbulencia;
    }
   public void getTurbulencia(){
        System.out.println("O AVIÃO ESTÁ COM LEVES TURBULÊNCIAS. não se preocupem, coloquem o cinto de segurança");
    }
}
