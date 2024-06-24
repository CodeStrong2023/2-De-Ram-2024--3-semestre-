package test;

import domain.Empleado;
import domain.Gerente;

public class TestInstanseOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 10000);
      determinarTipo(empleado1);
        empleado1= new Gerente("Jose", 5000, "Sistemas");
       // determinarTipo(empleado1);
    }
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("es de tipo gerente");
            ((Gerente) empleado).getDepartamento();
        }else if(empleado instanceof Empleado){
          //  System.out.println("Es de tipo Empleado");
         //   ((Gerente) empleado).getDepartamento();
        }else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }

}
