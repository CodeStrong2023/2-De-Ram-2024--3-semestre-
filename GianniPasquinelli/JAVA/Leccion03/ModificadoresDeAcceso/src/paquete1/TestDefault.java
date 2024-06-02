
package paquete1;

public class TestDefault {
    public static void main(String[] args) {
       // Clase2 clase2 = new Clase2();
        ClaseHija2 claseH2 = new ClaseHija2();
        claseH2.attDefault = "no se entiende nada";
        System.out.println("claseH2 att def " + claseH2.attDefault);
        
        Clase4 clase4 = new Clase4("clarisimo");
        
    }
}
