package exceptions;

public class NomeInvalidoException extends Exception {
    public NomeInvalidoException(){
        super("nome eh onbrigatorio");
    }
}
