public interface FormaPagamento {
    double receberPagament0(String identificadorPagamento, double valor);
    double reembolsar();
    String emitirComprovante;

}
