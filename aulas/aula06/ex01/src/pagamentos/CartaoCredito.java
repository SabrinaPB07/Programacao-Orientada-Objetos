public class CartaoCredito implements FormaPagamento {
    private String numeroCartao;
    private double limite;
    private double limiteUsado;

      
    @override
    public double receberPagamento(String chave, double valor){
      if ((limiteUsado + valor) < limite ) {
        System.out.println("compra aprovada!");
        limiteUsado = limiteUsado + valor;
        return valor;
      }
      System.out.println("compra reprovada!");
      return 0.0;
    }

    @override
    public double reembolsar(){
       this.limiteUsado = this.limiteUsado - valor;
       return valor;
    }
    
    @override
    public String emitirComprovante(){
       return "Comprovante!";
    }
}
