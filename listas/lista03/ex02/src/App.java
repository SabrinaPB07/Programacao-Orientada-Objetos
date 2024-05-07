import java.util.Scanner;

public class App {

    private static Scanner SCAN = new Scanner(System.in);
    private static final int QUANTIDADE_DE_NOTAS = 3;
    private static int[] notas = new int[QUANTIDADE_DE_NOTAS];
    public static void main(String[] args) {
        int media = receberNotasDosCriticos();
        imprimirResultado(media);
    }

    public static int receberNotasDosCriticos(){
        int somatorio = 0;
        for (int i = 0; i < QUANTIDADE_DE_NOTAS; i++){ 
            System.out.println("Digite a nota de um critico:");
            notas[i] = Integer.parseInt(SCAN.nextLine());
            somatorio = notas[i] + somatorio;
        }
        int resultado = somatorio / QUANTIDADE_DE_NOTAS;
        return resultado;
    }

    public static void imprimirResultado(int resultado){
        System.out.println(resultado);
    }
}
