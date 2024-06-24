
package Paquete1;

public class ClaseHija2 extends Clase2 {
    public ClaseHija2(){
        super();
        this.AtributoDefault = "Modificación del atributo Default";
        System.out.println("AtributoDefault = " + this.AtributoDefault);
        this.MetodoDefault();
    }
}
