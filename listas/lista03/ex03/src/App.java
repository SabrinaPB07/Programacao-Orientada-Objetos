import java.util.Scanner;

public class App {

    private static Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("digite uma palavra para ser comparada:");
        String palavra1 =SCAN.nextLine();
        System.out.println("digite outra palavra para ser comparada:");
        String palavra2 =SCAN.nextLine();

        compararAsPalavras(palavra1, palavra2);
    }

    public static void compararAsPalavras(String palavra1, String palavra2){
        if (palavra1.equals(palavra2)) {
            System.out.println("As palavras sao identicas");
        }
        else if (palavra1.equalsIgnoreCase(palavra2)){
            System.out.println("As palavras sao iguais ignorando maiusculo e minusculo");
        }
        else {
            System.out.println("As palavras sao diferentes");
        }
    }
}
