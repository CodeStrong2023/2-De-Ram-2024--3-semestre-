
package Test;

import Paquete1.Clase1;
import Paquete2.Clase3;

public class TestModificadoresAcceso {
    public static void main (String[] args){
        Clase1 clase1 = new Clase1();
        System.out.println("Clase1 = " + clase1.AtributoPublic);
        clase1.MetodoPublico();
        
        Clase3 claseHija = new Clase3();
        System.out.println("ClaseHija = " + claseHija);
    }
}
