package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Jose");
        System.out.println(persona.getNombre());

        persona.setApellido("Perez");
        System.out.println(persona.getApellido());
    }
}