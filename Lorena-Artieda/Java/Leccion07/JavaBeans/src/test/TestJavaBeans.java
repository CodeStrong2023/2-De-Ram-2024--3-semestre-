package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona= new Persona();

        persona.setNombre("Juan");
        persona.setApellido("Perez");
        System.out.println(persona);
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Apellido: "+persona.getApellido());

    }
}
