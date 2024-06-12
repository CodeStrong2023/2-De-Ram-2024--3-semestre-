package excepciones;

public class OperacionExcepcion extends RuntimeException {
    public OperacionExcepcion(String msg) {
        super(msg);
    }
}