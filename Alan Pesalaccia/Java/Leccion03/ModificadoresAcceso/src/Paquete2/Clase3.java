
package Paquete2;

import Paquete1.Clase1;

public class Clase3 extends Clase1{
    public Clase3(){
        super("protected");
        this.atributoProtected = "Accedemos desde la clase hija";
        System.out.println("AtributoProtected = " + this.atributoProtected);
        this.AtributoPublic = "Es totalmente público";
    }
            
}
