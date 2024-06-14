package test;

import domain.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 10000);
        determinarTipo(empleado1);
        empleado1 = new Gerente("Jose", 5000, "Sistemas");
        determinarTipo(empleado1);
    }
    public static void determinarTipo(Empleado empleado){
        Object o = null;
        if (empleado instanceof Gerente){
            System.out.println("Es de tipo gerente");
            Gerente gerente =  (Gerente) empleado;
            //((Gerente) empleado).getDepartamento();
        }
        else if(empleado instanceof  Empleado){
            System.out.println("Es de tipo empleado");

        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }

    }
}
