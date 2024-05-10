package test;

import domain.Empleado;
import domain.Escritor;
import domain.TipoEscritura;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;

        empleado = new Escritor("Juna", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles());

        // DownCasting
        ((Escritor)empleado).getTipoEscritura();

        Escritor escritor = (Escritor)empleado;
        escritor.getTipoEscritura();

        // Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
}
