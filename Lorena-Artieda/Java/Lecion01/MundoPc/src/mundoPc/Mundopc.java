package mundoPc;

import ar.com.system2024.mundopc.*;

public class Mundopc {
    public static void main(String[] args) {
        //Creamos el primer objeto de tipo computadora
        Monitor monitorHp= new Monitor("HP", 17);
        Raton ratonHp = new Raton("USB", "noga");
        Teclado tecladoHp= new Teclado("USB", "noga");
        Computadora computadoraHp= new Computadora("Computadora HP", monitorHp, tecladoHp, ratonHp);
        System.out.println(computadoraHp);

        //Creamos un nuevo objeto de tipo computadora
        Monitor monitorGamer= new Monitor("HyperX", 32);
        Raton ratonGamer = new Raton("bluetooth", "HyperX");
        Teclado tecladoGamer= new Teclado("bluetooth", "HyperX");
        Computadora computadoraGamer= new Computadora("Computadora gamer", monitorGamer, tecladoGamer, ratonGamer);
        System.out.println(computadoraGamer);

        //Computadoras de diferentes marcas

        Monitor monitorLg= new Monitor("LG", 23);
        Raton ratonLg = new Raton("USB", "LG");
        Teclado tecladoLg= new Teclado("USB", "LG");
        Computadora computadoraLg= new Computadora("Computadora LG", monitorLg, tecladoLg, ratonLg);
        System.out.println(computadoraLg);

        Monitor monitorSamsung= new Monitor("Samsung", 19);
        Raton ratonSamsung = new Raton("USB", "Samsung");
        Teclado tecladoSamsung= new Teclado("USB", "Samsung");
        Computadora computadoraSamsung= new Computadora("Computadora Samsung", monitorSamsung, tecladoSamsung, ratonSamsung);
        System.out.println(computadoraSamsung);

        Monitor monitorRca= new Monitor("Rca", 14);
        Raton ratonRca = new Raton("USB", "Rca");
        Teclado tecladoRca= new Teclado("USB", "Rca");
        Computadora computadoraRca= new Computadora("Computadora Rca", monitorRca, tecladoRca, ratonRca);
        System.out.println(computadoraRca);





        //Creamos una orden y agregamos las computadoras creadas anteriormente
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadoraHp);

        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraHp);
        orden2.agregarComputadora(computadoraGamer);
        orden2.agregarComputadora(computadoraRca);
        orden2.agregarComputadora(computadoraLg);
        orden2.agregarComputadora(computadoraSamsung);
        orden2.mostrarOrden();
    }
}
