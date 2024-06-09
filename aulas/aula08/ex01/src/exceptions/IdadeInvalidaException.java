package exceptions;

public class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(){
        super("idade não pode ser negativa");
    }
}
