package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;
import static enumeraciones.Dias.LUNES;


public class TestEneumeraciones {
    public static void main(String[] args) {
        System.out.println("Día 1: " + Dias.LUNES);
        indicarDiaSemana(Dias.JUEVES);
        System.out.println("Continente n° 4: " + Continentes.AMERICA);
        System.out.println("Numero de paises " + Continentes.AMERICA.getPaises());
        System.out.println("Numero de habitantes: " + Continentes.AMERICA.getHabitantes());
        System.out.println("Continente n° 1: " + Continentes.AFRICA);
        System.out.println("Numero de paises " + Continentes.AFRICA.getPaises());
        System.out.println("Numero de habitantes: " + Continentes.AFRICA.getHabitantes());
        System.out.println("Continente n° 2: " + Continentes.ASIA);
        System.out.println("Numero de paises " + Continentes.ASIA.getPaises());
        System.out.println("Numero de habitantes: " + Continentes.ASIA.getHabitantes());
        System.out.println("Continente n° 3: " + Continentes.EUROPA);
        System.out.println("Numero de paises " + Continentes.EUROPA.getPaises());
        System.out.println("Numero de habitantes: " + Continentes.EUROPA.getHabitantes());
        System.out.println("Continente n° 5: " + Continentes.OCEANIA);
        System.out.println("Numero de paises " + Continentes.OCEANIA.getPaises());
        System.out.println("Numero de habitantes: " + Continentes.OCEANIA.getHabitantes());
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
            case SABADO:
                System.out.println("Sexto día de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo día de la semana");
                break;
            default:
                System.out.println("Dia no correcto");
        }
    }
    
}
