package test;

import domain.Persona;

public class TestBloqueInicializacion {
    public static void main(String[] args) {
        Persona persona= new Persona();
        System.out.println("persona = " + persona);
        Persona persona1= new Persona();
        System.out.println("persona = " + persona1);
    }
}
