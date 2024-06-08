package test;

import domain.Empleado;
import domain.Gerente;

public class TestSobreEscritura {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 23000);
        Gerente gerente = new Gerente("Luis", 300.44, "Sistemas");
//        System.out.println(gerente.obtenerDetalles());
//        System.out.println(empleado1.obtenerDetalles());

        imprimir(empleado1);
        imprimir(gerente);
    }

    public static void imprimir(Empleado empleado){
        System.out.println(empleado.obtenerDetalles());
    }
}