package Test;
import Enumeraciones.Dias;
import Enumeraciones.Continentes;


public class TestEnumeraciones {
    public static void main(String[] args) {
      //  System.out.println("Dia 1: " + Dias.LUNES);
      //  indicarDia(Dias.MARTES); // las enumeraciones se tratan como cadena
        //Ahora no se debe usar comillas, se accede a traves de operador punto
        System.out.println("Continente no. 4: " + Continentes.AMERICA);
        System.out.println("Nª de paises en el 4to continente: " + Continentes.AMERICA.getPaises());
        System.out.println(" Nª de habitantes en el 4to continente: " + Continentes.AMERICA.getHabitantes());

        System.out.println("Continente no. 1: " + Continentes.AFRICA);
        System.out.println("Nª de paises en el 1er continente: " + Continentes.AFRICA.getPaises());
        System.out.println(" Nª de habitantes en el 1er continente: " + Continentes.AFRICA.getHabitantes());

        System.out.println("Continente no. 2: " + Continentes.EUROPA);
        System.out.println("Nª de paises en el 2do continente: " + Continentes.EUROPA.getPaises());
        System.out.println(" Nª de habitantes en el 2do continente: " + Continentes.EUROPA.getHabitantes());

        System.out.println("Continente no. 3: " + Continentes.ASIA);
        System.out.println("Nª de paises en el 3er continente: " + Continentes.ASIA.getPaises());
        System.out.println(" Nª de habitantes en el 3er continente: " + Continentes.ASIA.getHabitantes());

        System.out.println("Continente no. 5: " + Continentes.OCEANIA);
        System.out.println("Nª de paises en el 5to continente: " + Continentes.OCEANIA.getPaises());
        System.out.println(" Nª de habitantes en el 5to continente: " + Continentes.OCEANIA.getHabitantes());
    }

    private static void indicarDia(Dias dias) {
        switch(dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            default:
                System.out.println("Dia no encontrado");
        }
    }
}
