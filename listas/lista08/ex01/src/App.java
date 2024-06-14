import java.util.Scanner;

import exception.NomeInvalidoException;
import exception.PrecoInvalidoException;
import loja.Produto;

public class App {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        do{
            try{
                Produto produto = new Produto(
                    scanner.nextLine(),
                     Double.parseDouble(produto.getPreco());

                     System.out.println(produto.getNome());
                     System.out.println(produto.getPreco());
                     break;
            }catch(NomeInvalidoException | PrecoInvalidoException e){
                System.out.println(e.getMessage());
            }catch(Exception e){
                System.out.println("Ocorreu um erro, tente novamente!");
            }
        }while(true);

    }
}
