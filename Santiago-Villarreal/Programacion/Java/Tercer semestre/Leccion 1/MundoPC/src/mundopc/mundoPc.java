
package mundopc;

import ar.com.system2023.MundoPC.*;

public class mundoPc {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Bluetooth","HP");
        Raton ratonHP = new Raton("Bluetooth","HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth","Gamer");
        Raton ratonGamer = new Raton("Bluetooth","Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        Orden Orden1 = new Orden ();  
        Orden Orden2 = new Orden ();
        Orden1.agregarComputadora(computadoraHP);
        Orden1.agregarComputadora(computadoraGamer);
        Orden1.mostrarOrden();
        
        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas", monitorHP,tecladoGamer,ratonHP);
        Orden2.agregarComputadora(computadorasVarias);
        Orden1.mostrarOrden();
        Orden2.mostrarOrden();
    }
    /*  Crear más objetos de tipo computadora con todos sus elementos
        Completar una lista en el objeto orden1 que llegue a los 10 elemnentos
        Probar los metodos al máximo rendimiento
    */
}
