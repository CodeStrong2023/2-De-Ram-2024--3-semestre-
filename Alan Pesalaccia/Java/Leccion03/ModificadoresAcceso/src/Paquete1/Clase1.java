
package Paquete1;

public class Clase1 {
    public String AtributoPublic = "Valor atributo public";
    protected String atributoProtected = "valor atributo protected";
    
    public Clase1(){
        System.out.println("Constructor public");
    }
    
    protected Clase1(String atributoPublic){
        System.out.println("Constructor protected");
    }
    
    public void MetodoPublico(){
        System.out.println("Método public");
    }
    
    protected void MetodoProtected(){
        System.out.println("Método protected");
    }
}
