package paquete1;

public class ClaseHija2 extends Clase2{
    public ClaseHija2(){
        super();
        this.atributoDefault= "Modifificacion del atributo default";
        System.out.println("atributoDefault = " + atributoDefault);
        this.metodoDefault();
    }


}