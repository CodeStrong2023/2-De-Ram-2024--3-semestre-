
package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {12, 18, 25, 32};//Sintaxis resumida
        for (int edad: edades){//Sintaxis del For Each
            System.out.println("edad = " + edad);
        }
           Persona personas[] = {new Persona("Ramon"),new Persona("Grego"),new Persona("Margarita"),new Persona("Miguel")};
        
        //ForEach
        for (Persona persona: personas){
            System.out.println("persona = "+ persona);
        }
    }  
}
