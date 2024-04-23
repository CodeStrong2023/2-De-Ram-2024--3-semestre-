package paquete1;

import paquete1.Clase2;
import paquete2.Clase4;

public class TestDefault {
    public static void main(String[] args) {
        //Clase2 clase2 = new Clase2();
        ClaseHija2 claseh2 = new ClaseHija2();
        claseh2.atributoDefault = "Cambio desde la prueba";
        System.out.println("claseh2.atributoDefault = " + claseh2.atributoDefault);
        Clase4 clase4 = new Clase4("Publico");
        clase4.setAtribitoPrivate("Cambio");
        System.out.println(" Clase 4= " + clase4.getAtribitoPrivate());
    }

}