package paquete2;

import paquete1.Clase1;

public class Clase3 extends Clase1 {
    public Clase3(){
        super("protected");
        this.atributoProtected = "Acceder desde la clase hija";
        System.out.println("AtributoProtected = " + this.atributoProtected);
        this.atributoPublic = "Es totalmente publico"; 
    }
}
