public class Pix implements FormaPagamento {
    private String chave;
    private double valor;
    private String data = LocalDate.now().ToString();
    
    @override
    public double receberPagamento(String chave, double valor){
        this.chave = chave;
        this.valor = valor;
        System.out.println("recebido de:  " + this.chave + "valor: " + valor);
    }

    @override
    public double reembolsar(){
        System.out.println("Enviando para a chave: " + this.chave);
        return this.valor;
    }
    
    @override
    public String emitirComprovante(){
        return String.format("valor: %s%n Data %s", this.valor, this.data);
    }
}
