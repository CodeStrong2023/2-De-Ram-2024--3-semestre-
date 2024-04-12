package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    static{ //bloque de inicialización estatico
        System.out.println("Ejecución del bloque estático");
        ++Persona.contadorPersonas;
        //idPersona = 10; No es un atributo estático = error
    }

    {   //Se inicia con cada objecto creado a diferencia del estatico que solo se ejecuta una vez
        System.out.println("Ejecucíón del bloque NO estático");
        this.idPersona = Persona.contadorPersonas++;
    }   //Bloque de inicialización NO estático (contexto dinámico)

    //Los bloques de inicialización se ejecutan antes del constructor

    public Persona(){
        System.out.println("Ejecución del constructor");
    }

    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString(){
        return "Persona{" + "idPersona = " + idPersona + "}";
    }

}
