
package Paquete1;

class Clase2 {
    String AtributoDefault = "Valor de atributo default";
    
    Clase2(){
        System.out.println("Constructor Default");
    }
    /*
    public Clase2(){
        super();
        this.AtributoDefault = "Modificación del atributo default";
        System.out.println("AtributoDefault = " + this.AtributoDefault);
        this.MetodoDefault();
    }
    */
    
    void MetodoDefault(){
        System.out.println("Método Default");
    }
}
