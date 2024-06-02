package carta;

public final class CartaPulo extends Carta {
    public CartaPulo(){
        super("Pulo");
    }

        @Override
        public void exibirInformacoes(){
            System.out.println(String.format(
                """
                Nome: %s,
                Revelada: %s

                Ação: Pula a vez do jogador!
                """,

                super.nome,
                super.revelada
            ));
        }

        public void exibirInformacoes(boolean chamarMae){
            if (chamarMae) {
                super.exibirInformacoes();
                return;
            }

            this.exibirInformacoes();
        }

        @Override
        public void realizarAcao(){
            System.out.println("fulano jogou a carta pular e passou a vez de Ciclano!");
        }
    
}
