package paquete1;

public class ClaseHija2 extends Clase2{
    public ClaseHija2(){
        super();
        this.atributoDefault = "Modificación del atributo Default";
        System.out.println("AtributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    }
}
