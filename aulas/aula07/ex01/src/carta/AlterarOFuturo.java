package carta;

public class AlterarOFuturo extends Carta {
    public AlterarOFuturo(){
        super("Alterar o futuro");
    }

    @Override
    public void exibirInformacoes(){
        SYstem.out.println(String.format(
            """
            Nome: %s,
            Revelada: %s

            Ação: altera as proximas 3 cartas.
            """;
        ))
    }

    public void exibirInformacoes(boolean chamarMae){
        if (chamarMae) {
            super.exibirInformacoes();
            return;
        }

        this.exibirInformacoes();
    }
    
    public void realizarAcao(){
        System.out.println("fulano altera as proximas 3 cartas ")
    }
}
