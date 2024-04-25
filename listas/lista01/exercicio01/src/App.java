import java.util.Scanner;

public class App {

    private static final Scanner SCAN = new Scanner(System.in);
    private static final int TAMANHO_VETOR = 10;
    private static  boolean parametroEncontrado = false;


    public static void main(String[] args) throws Exception {
        int[] vetor = new int[TAMANHO_VETOR];
        int parametro = 0;
        receberVetor(vetor);
        receberParametro(vetor, parametro);
    }

    public static void receberVetor (int[] vetor) {
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite um numero:");
            vetor[i] = Integer.parseInt(SCAN.nextLine());
        }
    }

    public static void receberParametro (int[] vetor, int parametro) {
        System.out.println("digite um numero para ser buscado:");
        parametro = Integer.parseInt(SCAN.nextLine());
       

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == parametro) {
                parametroEncontrado = true;
            }
        }
        
        if (parametroEncontrado) {
            System.out.println("ACHEI");
        }
        else {
            System.out.println("NÃO ACHEI");
        }
        

    }

    
        
}
