package test;

import domain.Empleado;
import domain.Escritor;
import domain.TipoEscritura;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);

        System.out.println("empleado = " + empleado.obtenerDetalles());
        //empleado.getTipoEscritura();  No se puede hacer

        //Downcasting
        //((Escritor)empleado).getTipoEscritura(); // tenemos 2 opciones esta es una
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();

        //Upcasting
        Empleado empleado2 = escritor;
        System.out.println("empleado2 = " + empleado2);
    }
}
