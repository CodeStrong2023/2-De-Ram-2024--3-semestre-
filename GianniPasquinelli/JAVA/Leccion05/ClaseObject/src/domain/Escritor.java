package domain;

public class Escritor extends Empleado {
    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Tipo de escritura: " + tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Escritor{");
        sb.append("tipoEscritura=").append(tipoEscritura);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
}
