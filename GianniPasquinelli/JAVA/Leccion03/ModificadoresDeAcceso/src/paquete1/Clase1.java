
package paquete1;

public class Clase1 {
    public String atributoPublico = "valor atributo publico";
    protected String attProtected = "Valor atributo protected";
    
    public Clase1() {
        System.out.println("Costructor publico");
    }
    protected Clase1(String atributoPublico){
        System.out.println("constructor protected");
    }
    
    public void metodoPublico() {
        System.out.println("metodo publico");
    }
    
    protected void metodoProtected(){
        System.out.println("metodo protected");
    }
    
    
}
