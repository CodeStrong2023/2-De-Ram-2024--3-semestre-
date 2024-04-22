
package paquete1;

class Clase2 extends Clase1 {
    String attDefault = "valor por default";

    //Clase2() {
    //    System.out.println("constructor default");
    //}
    
    public Clase2(){
        super();
        this.attDefault = "modificando el ett default";
        System.out.println("att default" + this.attDefault);
        this.metodoDefault();
    }
    
    void metodoDefault(){
        System.out.println("metodo default");
    }
    
    
}
