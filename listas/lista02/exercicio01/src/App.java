import java.net.Socket;
import java.security.DrbgParameters.Reseed;
import java.util.Scanner;

public class App {

    private static final int NUMERO_DE_PERGUNTAS = 3;
    private static String[] respostas = new String[NUMERO_DE_PERGUNTAS];
    private static String[] gabarito = new String[NUMERO_DE_PERGUNTAS];
    private static Scanner SCAN = new Scanner(System.in);


    public static void main(String[] args) throws Exception {
        String nomeDoJogador = receberNomeEFormatarNomeDojogador();
        comecarQuiz(nomeDoJogador);
        fazerPrimeiraPergunta(nomeDoJogador);
        fazerSegundaPergunta(nomeDoJogador);
        fazerTerceiraPergunta(nomeDoJogador);
        apresentarResultado(nomeDoJogador);
        agradecerJogador(nomeDoJogador);
    }

    public static String receberNomeEFormatarNomeDojogador(){
        System.out.println
        ( """
        você é um verdadeiro Jojofag?
        Digite o seu nome para começar o quiz:      
        """
        ); 

       String nomeDoJogador = (SCAN.nextLine());

        if (nomeDoJogador.isBlank()) {
            return "NPC";
        }

        nomeDoJogador.trim();
        String[] nomeCopleto = nomeDoJogador.split(" ");
        String primeiroNome = nomeCopleto[0];
        String primeiraLetraDoNome = String.valueOf(primeiroNome.charAt(0));
        String primeiroNomeSemInicial = primeiroNome.substring(1);
        String nomeFormatado = primeiraLetraDoNome.toUpperCase() + primeiroNomeSemInicial.toLowerCase();

        return nomeFormatado;
    }

    public static void comecarQuiz(String nomeDoJogador){
        System.out.println(String.format(
        """
        Vamos comneçar,  %s!!
        Mas antes, preciso te explicar uma coisa:
        Se a letra das alternativas enviadas forem diferentes das disponiveis, tambem será considerado errado.

        Aperte ENTER para começar.
        """,
        nomeDoJogador
        ));
        SCAN.nextLine();
    }

    public static void fazerPrimeiraPergunta(String nome){
        String resposta = "";
        do{
            System.out.println(
            """
            O arco Jojo: battle Tendency (parte 2) gira em torno de quem?

            A - Jotaro Kujo
            B - Joseph Joestar
            C - Jonathan Joestar
            """
            );

            resposta = SCAN.nextLine();
        }while (ehUmarespostaValida(resposta));

        gabarito[0] = "B";
        respostas[0] = resposta; 

    }

    public static void fazerSegundaPergunta(String nome){
        String resposta = "";
        do {
            System.out.println(
            """
            O que é um stand?

            A - É uma energia que só é usada com a ajuda dos outros
            B - É um poder invocado por causa da fúria que está sentindo
            C - É a manifestação da energia vital de seu usuário
            """
            );

            resposta = SCAN.nextLine();
        }while (ehUmarespostaValida(resposta));

        gabarito[1] = "C";
        respostas[1] = resposta;
    }

    
    public static void fazerTerceiraPergunta(String nome){
        String resposta = "";
        do {
            System.out.println(
            """
            Com qual objeto Dio se torna um vampiro?

            A - flecha de stand
            B - mascara de pedra
            C - um osso
            """
            );

            resposta = SCAN.nextLine();
        }while (ehUmarespostaValida(resposta));

        gabarito[2] = "B";
        respostas[2] = resposta;
    }    

    public static boolean ehUmarespostaValida(String resposta){
        if (resposta.isBlank()) {
            System.out.println(
            """
            Sua resposta não pode ser vazia!
            Vamos enviar a pergunta novamente.         
            """
            );
            return false;
        }

        return true;
    }

    public static void apresentarResultado(String nomeDoJogador){
        System.out.println(String.format(
        """
        %s vamos ver se você realmente é um Jojofag.
        Veja quais perguntas você acertou
        """,

        nomeDoJogador
        ));

        for (int i = 0; i < NUMERO_DE_PERGUNTAS; i++){
            System.out.println(String.format(
                "%s - %s",
                (i + 1),
                respostas[i].equalsIgnoreCase(gabarito[i]) ? "ACERTOU" : "ERROU"
            ));
        }
    }

    public static void agradecerJogador(String nomeDoJogador){
        System.out.println(String.format(
        """
        Muito obrigada por participar do quiz, %s!!        
        """,
        nomeDoJogador
        ));
    }
}