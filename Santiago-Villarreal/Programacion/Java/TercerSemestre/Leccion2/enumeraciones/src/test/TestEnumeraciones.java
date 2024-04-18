package TercerSemestre.Leccion2.enumeraciones.src.test;

import TercerSemestre.Leccion2.enumeraciones.src.enumeraciones.Continentes;
import TercerSemestre.Leccion2.enumeraciones.src.enumeraciones.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        //System.out.println("Día 1: " + Dias.LUNES);
        //indicarDiaSemana(Dias.MARTES);
        /*
         No utilizar comillas, se accede con operador de punto
         */
        System.out.println("Continente No.4"+ Continentes.AMERICA);
        System.out.println("No. de paises en el 4to contienente: " + Continentes.AMERICA.getPaises());
        System.out.println("Habitantes en el 4to continenete: " + Continentes.AMERICA.getHabitantes());
    }

    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer día de la semana");
                break;   
            case JUEVES:
                System.out.println("Cuarto día de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto día de la semana");
                break;
            default:
                System.out.println("Error: dato erróneo");
        }
    }

}
