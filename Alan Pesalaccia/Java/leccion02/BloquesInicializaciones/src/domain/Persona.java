package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    static { //bloque de inicializacion statico
        System.out.println("Ejecución bloque estático");
        ++Persona.contadorPersonas;
        //idPersona = 10; No es estatico por eso da el error
        //solo se ejecuta una vez por codigo

    }

        { //bloque de inicializacion no estatico(contexto dinamico)
            System.out.println("Ejecución bloque no estático");
            this.idPersona = Persona.contadorPersonas++;//incremento del atributo

        }
// los bloques de inicializacion se ejecutan antes del constructor
    public Persona() {
        System.out.println("Ejecución del constructor");
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
