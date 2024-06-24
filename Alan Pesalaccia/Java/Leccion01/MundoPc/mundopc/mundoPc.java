import Java.Leccion01.MundoPc.*;

public class mundoPc {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13); //importar la clase
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

        //Creamos otros objetos de diferente marca
        Monitor monitorGamer = new Monitor("Gamer", 32); //importar la clase
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gammer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        //Creamos mas objetos de otras marcas
        Monitor monitorSamsung = new Monitor("Samsung", 24);
        Monitor monitorViewSonic = new Monitor("ViewSonic", 32);
        Monitor monitorMac = new Monitor("Mac", 24);
        Teclado tecladoMac = new Teclado("Blutooth", "Mac");
        Raton ratonMac = new Raton("Bluetooh", "Mac");
        Teclado tecladoGenerico = new Teclado("Cable", "Generico");
        Raton ratonGenerico = new Raton("Cable", "Generico");


        Computadora computadoraVarias = new Computadora("Computadora de varios dispositivos", monitorGamer, tecladoHP, ratonHP);

        //Agregamos mas marcas de computadora para la tarea.
        Computadora computadoraSamsung = new Computadora("Computadora Samsung", monitorSamsung, tecladoGenerico, ratonGenerico);
        Computadora computadoraMac = new Computadora("Computadora Mac", monitorMac, tecladoMac, ratonMac);
        Computadora computadoraViewSonic = new Computadora("Computadora Samsung", monitorViewSonic, tecladoGenerico, ratonGenerico);
        Computadora computadoraViewSonicGamer = new Computadora("Computadora ViewSonic con teclado y raton Gamers", monitorViewSonic, tecladoGamer, ratonGamer);
        Computadora computadoraSamsungGamer = new Computadora("Computadora Samsung con teclado y raton Gamers", monitorViewSonic, tecladoGamer, ratonGamer);
        Computadora computadoraGamerGen = new Computadora("Computadora Gamer con teclado y raton generico", monitorGamer, tecladoGenerico, ratonGenerico);
        Computadora computadoraVarias2 = new Computadora("Computadora de varios dispositivos 2", monitorGamer, tecladoMac, ratonGenerico);
        Computadora computadoraVarias3 = new Computadora("Computadora de varios dispositivos 3", monitorSamsung, tecladoMac, ratonGamer);

        Orden orden1 = new Orden();//inicializamos el arreglo vacio
        Orden orden2 = new Orden(); //Una nueva lista para el objeto orden2

        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden2.agregarComputadora(computadoraVarias);

        //orden2.mostrarOrden();
        //orden1.mostrarOrden();

        //Crear mas objetos de tipo computadora con todos sus elementos
        //completar una lista en el objeto orden1 que llegue a los 10 elementos
        //probar de esta manera los métodos al maximo rendimiento

        Orden orden3 = new Orden(); //Una orden que supere los 10 items

        orden3.agregarComputadora(computadoraVarias);
        orden3.agregarComputadora(computadoraGamer);
        orden3.agregarComputadora(computadoraMac);
        orden3.agregarComputadora(computadoraViewSonicGamer);
        orden3.agregarComputadora(computadoraVarias2);
        orden3.agregarComputadora(computadoraVarias3);
        orden3.agregarComputadora(computadoraSamsung);
        orden3.agregarComputadora(computadoraSamsungGamer);
        orden3.agregarComputadora(computadoraViewSonic);
        orden3.agregarComputadora(computadoraGamerGen);

        orden3.mostrarOrden(); //mostramos la orden 3

        orden3.agregarComputadora(computadoraGamer); //agregamos una computadora mas a la orden para ver el error

        orden3.mostrarOrden();
    }
}
