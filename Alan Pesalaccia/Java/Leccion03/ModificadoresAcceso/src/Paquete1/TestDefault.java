
package Paquete1;

import Paquete2.Clase4;

public class TestDefault {
    public static void main(String[] args){
        ClaseHija2 ClaseH2 = new ClaseHija2();
        ClaseH2.AtributoDefault = "Cambio desde la prueba";
        System.out.println("ClaseH2 Atributo Default = " + ClaseH2.AtributoDefault);
        
        Clase4 clase4 = new Clase4("Público");
        System.out.println(clase4.getAtributoPrivate());
        clase4.setAtributoPrivate("Cambio");
        
        System.out.println("Clase4 = " + clase4.getAtributoPrivate());
    }
}
