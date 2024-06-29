package test;

import domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 10000);
        empleado1 = new Gerente("Jose", 5000, "Sistemas");
        //System.out.println("gerente1= "+ gerente1.obtenerDetalle());
        //System.out.println("empleado1 = "+ empleado1.obtenerDetalle());
        imprimir(empleado1);

    }
    public static void imprimir(Empleado empleado){
        String detalles= empleado.obtenerDetalle();
        System.out.println("detalles= " + detalles);
    }
}
