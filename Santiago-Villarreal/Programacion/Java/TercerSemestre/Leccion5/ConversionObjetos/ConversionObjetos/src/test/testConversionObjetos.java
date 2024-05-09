package test;

import javax.print.attribute.SupportedValuesAttribute;

import domain.*;

public class testConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        System.out.println("Empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles());
        // empleado.getTipoEscritura();
        //Downcasting
        ((Escritor)empleado).getTipoEscritura();
        // Escritor.getTipoEscritura();

        // Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
}
