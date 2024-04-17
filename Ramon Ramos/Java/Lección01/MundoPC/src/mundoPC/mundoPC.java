package mundoPC;

import ar.com.system2024.mundopc.*;

public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);//Importar la clase
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora ComputadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        //Creamos otro objeto, denominado Gamer
        Monitor monitorGamer = new Monitor("Gamer", 32);//Importar la clase
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora ComputadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        //Creamos otro objeto, denominado Samsung
        Monitor monitorSamsung = new Monitor("Gamer", 32);//Importar la clase
        Teclado tecladoSamsung = new Teclado("Bluetooth", "Samsung");
        Raton ratonSamsung = new Raton("Bluetooth", "Samsung");
        Computadora ComputadoraSamsung = new Computadora("Computadora Samsung", monitorSamsung, tecladoSamsung, ratonSamsung);
        
        
        Orden orden1  = new Orden();//Inicializamos el arreglo vacío
        Orden orden2 = new Orden();//Una nueva lista para el objeto 2
        Orden orden3 = new Orden();//Una nueva lista para el objeto 3
        
        orden1.agregarComputadora(ComputadoraHP);
        orden1.agregarComputadora(ComputadoraGamer);
        orden1.agregarComputadora(ComputadoraSamsung);
        
        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
        orden2.agregarComputadora(computadorasVarias);
        orden3.agregarComputadora(ComputadoraSamsung);
        

        orden1.agregarComputadora(ComputadoraHP);
        orden2.agregarComputadora(ComputadoraGamer);
        orden3.agregarComputadora(ComputadoraSamsung);

        orden1.mostrarOrden();
        orden2.mostrarOrden();
        orden3.mostrarOrden();
    }
}
