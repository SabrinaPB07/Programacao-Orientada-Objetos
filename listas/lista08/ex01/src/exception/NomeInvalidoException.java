package exception;

public class NomeInvalidoException extends Exception {
    public NomeInvalidoException(){
        super("O nome do produto não pode ter menos de 3 caracteres");
    }
}
