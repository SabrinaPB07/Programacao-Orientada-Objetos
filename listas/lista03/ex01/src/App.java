import java.util.Scanner;

public class App {

    private static Scanner SCAN = new Scanner(System.in);
    private static final int ANO_ATUAL = 2024;

    public static void main(String[] args) throws Exception {
        int anoDigitado = receberAnoDeNascimento();
    }

    public static int receberAnoDeNascimento(){
        System.out.println("Digite o ano que você nasceu:");
        int anoDigitado = Integer.parseInt(SCAN.nextLine());
        int resultado = ANO_ATUAL - anoDigitado;
        System.out.println("até o final de 2024 você terá " + resultado + " anos");

        return resultado;
    }
}
