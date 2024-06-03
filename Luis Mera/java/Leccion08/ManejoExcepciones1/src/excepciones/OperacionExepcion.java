package excepciones;

public class OperacionExepcion extends RuntimeException {
    public OperacionExepcion(String msg) {
        super(msg);
    }
}
