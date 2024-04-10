
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
        
        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas", monitorHP,tecladoGamer,ratonHP);
        Orden2.agregarComputadora(computadorasVarias);

         /*  Crear más objetos de tipo computadora con todos sus elementos
        Completar una lista en el objeto orden1 que llegue a los 10 elemnentos
        Probar los metodos al máximo rendimiento
        */

        Monitor monitorLG = new Monitor("LG",21);
        Teclado tecladoLG = new Teclado("USB","LG");
        Raton ratonLG = new Raton("USB","LG");
        Computadora computadoraLG = new Computadora("PC LG", monitorLG, tecladoLG, ratonLG);
        Orden2.agregarComputadora(computadoraLG);

        Monitor monitorSamsung = new Monitor("Samsung",17);
        Teclado tecladoLogitech = new Teclado("USB", "Logitech");
        Raton ratonLogitech = new Raton("Bluetooth", "Logitech");
        Computadora computadoraSamsung = new Computadora("PC samsung", monitorSamsung, tecladoLogitech, ratonLogitech);
        Orden1.agregarComputadora(computadoraSamsung);

        Monitor monitorAsus = new Monitor("Asus",23);
        Teclado tecladoRazr = new Teclado("Bluetooth","Razr");
        Raton ratonRazr = new Raton("Bluetooth","Razr");
        Computadora computadoraAsus = new Computadora("Pc Asus", monitorAsus, tecladoRazr, ratonRazr);
        Computadora computadoraEscritorio = new Computadora("Pc Escritorio", monitorLG, tecladoLogitech, ratonRazr);
        Computadora computadoraCasa = new Computadora("Pc casa", monitorSamsung, tecladoHP, ratonLogitech);
        Computadora computadoraOficina = new Computadora("PC oficina", monitorAsus, tecladoLG, ratonLG);
        Computadora ComputadoraOficina2 = new Computadora("PC Oficina", monitorSamsung, tecladoLogitech, ratonHP);
        Orden1.agregarComputadora(ComputadoraOficina2);
        Orden1.agregarComputadora(computadoraOficina);
        Orden1.agregarComputadora(computadoraCasa);
        Orden1.agregarComputadora(computadoraAsus);
        Orden1.agregarComputadora(computadoraEscritorio);

        Orden1.mostrarOrden();
        Orden2.mostrarOrden();


    }

}
