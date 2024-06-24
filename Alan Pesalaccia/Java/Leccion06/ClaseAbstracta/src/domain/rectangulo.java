package domain;

public class rectangulo extends FiguraGeometrica {
    public rectangulo(String tipoFigura) {
        super(tipoFigura);
    }
    @Override
    public void dibujar() { // implementando metodo
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
    }
}
