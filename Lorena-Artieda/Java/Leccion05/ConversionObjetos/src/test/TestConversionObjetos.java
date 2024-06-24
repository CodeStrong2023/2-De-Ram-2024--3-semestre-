package test;

import domain.Empleado;
import domain.Escritor;
import domain.TipoEscritura;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        System.out.println("Empleado= "+ empleado);
        System.out.println(empleado.obtenerDetalle()); //Si queremos acceder a metodos de Escritor
        //Downcasting
        ((Escritor) empleado).getTipoEscritura(); //Tenemos 2 ociones: esta es una
        Escritor escritor= (Escritor)empleado;//Esta es la segunda opcion
        escritor.getTipoEscritura();

        //Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalle());
    }
}
