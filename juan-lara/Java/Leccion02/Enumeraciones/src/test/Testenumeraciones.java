package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

public class Testenumeraciones {
    public static void main(String[] args) {
        //System.out.println("Dia 1: "+Dias.Lunes);
        //indicarDiaSemana(Dias.Domingo);  
        
        //Continente Nro1
        System.out.println("Continente No. 1: "+Continentes.America.getPaises());
                System.out.println("No. de paises en el 1er. continente: "
                        +Continentes.America.getPaises());
        System.out.println("No. de habitantes en el 1er. continente "
                +Continentes.America.getHabitantes());
        
        //Continente Nro2
        System.out.println("Continente No. 2: "+Continentes.Africa.getPaises());
                System.out.println("No. de paises en el 2do. continente: "
                        +Continentes.Africa.getPaises());
        System.out.println("No. de habitantes en el 2do. continente "
                +Continentes.Africa.getHabitantes());
        
        //Continente Nro3
        System.out.println("Continente No. 3: "+Continentes.Africa.getPaises());
                System.out.println("No. de paises en el 3er. continente: "
                        +Continentes.Oceania.getPaises());
        System.out.println("No. de habitantes en el 3er. continente "
                +Continentes.Oceania.getHabitantes());
        
        //Continente Nro4
        System.out.println("Continente No. 4: "+Continentes.Europa.getPaises());
                System.out.println("No. de paises en el 4to. continente: "
                        +Continentes.Europa.getPaises());
        System.out.println("No. de habitantes en el 4to. continente "
                +Continentes.Europa.getHabitantes());
        
        //Continente Nro5
        System.out.println("Continente No. 5: "+Continentes.Asia.getPaises());
                System.out.println("No. de paises en el 5to. continente: "
                        +Continentes.Asia.getPaises());
        System.out.println("No. de habitantes en el 5to. continente "
                +Continentes.Asia.getHabitantes());
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case Lunes:
                System.out.println("Primer dia de la semana");
                break;
            case Martes:
                System.out.println("Segundo dia de la semana");
                break;
            case Miercoles:
                System.out.println("Tercer dia de la semana");
                break;
            case Jueves:
                System.out.println("Cuarto dia de la semana");
                break;
            case Viernes:
                System.out.println("Quinto dia de la semana");
                break;
            case Sabado:
                System.out.println("Sexto dia de la semana");
                break;
            case Domingo:
                System.out.println("Septimo dia de la semana");
        }
    }
}
