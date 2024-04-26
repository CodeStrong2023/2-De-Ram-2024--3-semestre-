package test;

import domain.Empleado;
import domain.Gerente;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 23000);
        determinarTip(empleado1);
        Gerente gerente = new Gerente("Luis", 300.44, "Sistemas");
        determinarTip(gerente);


    }

    public static void determinarTip(Empleado empleado){
            // instanceOf significa instancia de cierto tipo
        if(empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente) empleado;
            System.out.println(gerente.getDepartamento());
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo Empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }
}
