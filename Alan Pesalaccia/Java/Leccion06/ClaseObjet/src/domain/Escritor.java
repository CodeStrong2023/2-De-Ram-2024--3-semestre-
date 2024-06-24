package domain;

public class Escritor extends Empleado {
    final  TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    //Metodo para sobreescribir
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", tipoEscritura: " + tipoEscritura.getDescripcion();
    }
    @Override
    public String toString() {
        return super.toString() + ", tipoEscritura: " + tipoEscritura.getDescripcion();
    }
    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
}
