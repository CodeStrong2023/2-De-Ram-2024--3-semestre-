package test;

import domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 10000);
        imprimir(empleado1);
        empleado1 = new Gerente("José", 5000, "Sistemas");
        imprimir(empleado1);
    }

    public static void imprimir(Empleado empleado){
        String detalles = empleado.obtenerDetalles();
        System.out.println("Detalles = " + detalles);
    }



}
