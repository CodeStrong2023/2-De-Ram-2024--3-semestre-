
package paquete2;

import paquete1.Clase1;

public class Clase3 extends Clase1 {
    public Clase3(){
        super("protected");
        this.atributoprotected = "Accedemos desde la clase hija";
        System.out.println("AtrubutoProtected = " + this.atributoprotected);
        this.atributoPublic = "es totalmente publico";
    }
}
