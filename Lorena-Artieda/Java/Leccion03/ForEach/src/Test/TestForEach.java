package Test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[]= {5,6,7,8};

        for (int edad : edades){//Sintaxis del for each
            System.out.println("edad: "+ edad);

        }

        Persona personas[]= {new Persona("Juan"), new Persona("Marcos"), new Persona("Mario")};

        //For each
        for (Persona persona : personas){
            System.out.println("Persona: "+ persona);
        }
    }

}
