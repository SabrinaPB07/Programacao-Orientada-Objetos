package exception;

public class PrecoInvalidoException extends Exception{
    public PrecoInvalidoException(){
        super("o preço não pode ser negativado ou 0");
    }
}
