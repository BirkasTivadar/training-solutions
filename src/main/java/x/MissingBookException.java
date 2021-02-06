package x;

public class MissingBookException extends RuntimeException {
    public MissingBookException(String message) {
        super(message);
    }
}
