package Test;

import Enumeraciones.Continentes;
import Enumeraciones.Dias;

import java.util.concurrent.ConcurrentHashMap;

public class TestEnumeracion {
    public static void main(String[] args) {

        System.out.println("Dia 1: " + Dias.LUNES);
        indicarDiaSemana(Dias.MARTES);
        System.out.println("Continente No. 4: "+ Continentes.AMERICA);
        System.out.print("No. de paises en el 4to continente: "
                + Continentes.AMERICA.getPaises()
                + "\nNumero de habitantes del 4to continente: "
                + Continentes.AMERICA.getHabitantes());
    }
    private static void indicarDiaSemana(Dias dias){

        switch (dias){
        case LUNES:
        System.out.println(Dias.LUNES + " Primer dia de la semana");
        break;
        case MARTES:
            System.out.println(Dias.MARTES + " segundo dia de la semana");
        break;
        case MIERCOLES:
            System.out.println(Dias.LUNES +" Tercer dia de la semana");
        break;
        case JUEVES:
            System.out.println(Dias.JUEVES +" Cuarto dia de la semana");
        break;
        case VIERNES:
            System.out.println(Dias.VIERNES + " Quinto dia de la semana");
        break;
        case SABADO:
            System.out.println(Dias. SABADO + " Sexto dia de la semana");
        break;
            case DOMINGO:
                System.out.println(Dias.DOMINGO + " Septimo dia de la semana");
                break;
                default:
                System.out.println("No es un dia correcto");
    }}
}
