package test;

import paquete1.Clase1;
import paquete2.Clase3;

public class TestModificadoresDeAcceso {
    public static void main(String[] args) {
        Clase1 clase1= new Clase1();
        //Clase1 clase1= new Clase1("Un string"); 
        System.out.println("clase1 = " + clase1);
        clase1.metodoPublico();
        Clase3 claseHija = new Clase3();
        System.out.println("claseHija = " + claseHija);

    }
}
