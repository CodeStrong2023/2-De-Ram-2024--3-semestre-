package domain;

public class Escritor extends Empleado {
    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscitura){
        super(nombre, sueldo);
        this.tipoEscritura=tipoEscitura;
    }

    //Metodo para sobreescribir

    @Override
    public String obtenerDetalle(){
        return super.obtenerDetalle() + ", Tipo escritura: "+ tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor{" +
                "tipoEscritura=" + tipoEscritura +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }

}
