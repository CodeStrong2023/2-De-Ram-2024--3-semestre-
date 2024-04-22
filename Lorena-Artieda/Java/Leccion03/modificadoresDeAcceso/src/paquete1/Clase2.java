package paquete1;
//Modificador de acceso default o package
//Solo se puede usar dentro del mismo paquete
class Clase2 extends Clase1 {
    String atributoDefault = "Valor del atributo default";

    /*Clase2(){
        System.out.println("Constructor Default");
    }*/
    public Clase2(){
        super();
        this.atributoDefault = "Modificacion del atributo default";
        System.out.println("atributoDefault = " + atributoDefault);
        this.metodoDefault();
    }
    void metodoDefault(){
        System.out.println("Metodo Default");
    }
}
