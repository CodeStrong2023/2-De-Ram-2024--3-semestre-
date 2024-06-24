
package Test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args){
        int Edades[] = {5,6,7,8}; // Sintaxis resumida.
        for (var Edad: Edades){ // Sintaxis del ForEach
            System.out.println("Edad = " + Edad);
        }
        
        Persona Personas[] = {new Persona("Juan"), new Persona ("Carla"), new Persona ("Beatriz")};
        
        //ForEach
        
        for (Persona persona: Personas){
            System.out.println("Persona = " + persona);
        }
        
    }
}
