package paquete2;

import paquete1.Clase1;

public class Clase3 extends Clase1 {
    public Clase3(){
        super("Protected");
        this.atributoProtected = "Accedemos desde la clase hija al atributo protected";
        this.atributoPublic = "Es totalmente publico";
    }
}
