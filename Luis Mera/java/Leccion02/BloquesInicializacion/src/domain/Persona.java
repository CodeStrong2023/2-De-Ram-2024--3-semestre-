package domain;

import org.w3c.dom.ls.LSOutput;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    //Bloque de inicializacion estatico
    static {
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
    }


    //Bloque de inicializacion dinamico
    {
        System.out.println("Ejecucion de bloque No estatico");
        this.idPersona = Persona.contadorPersonas++;//Incrementamos el atributo
    }

    //Los bloques de inicializacion se ejecutan antes del constructor
    public Persona() {
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                '}';
    }


}