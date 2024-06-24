package test;

import domain.Empleado;

public class testClassObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);

        if (empleado1 == empleado2) {
            System.out.println("Tienen la misma referencia en memoria");
        } else {
            System.out.println("Tienen distinta referencia en memoria");
        }
        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("Tienen el mismo hashcode");
        } else {
            System.out.println("Tienen distinto hashcode");
        }
    }
}
