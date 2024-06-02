
package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5, 6, 7, 8, 9, 10};
        for (int edad: edades) {
            System.out.println("Edad: " + edad);
        }
        
        Persona personas[] = {new Persona("Juan"), new Persona("Gianni"), new Persona("Belen")};
        
    
        for (Persona persona : personas) {
            System.out.println("Persona: " + persona.getNombre());
        }
        
    }
}
