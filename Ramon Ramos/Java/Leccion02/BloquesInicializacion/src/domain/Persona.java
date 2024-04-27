package domain;

public class Persona{
    private final int idPersona;
    private static int contadorPersonas;
    
    static { //Bloque de inicialización Estatico
        System.out.println("Ejecución del bloque estático");
        ++Persona.contadorPersonas;
        //idPersona = 10; No es estático por esto tenemos un error
    }
    
    { //Bloque de inicialización NO estatico o conexto dinámico
        System.out.println("Ejecución del bloque NO estático");
        this.idPersona = Persona.contadorPersonas++; //Incrementamos el atributo
    }
    //Estos bloques se ejecutan antes del contador
    
    public Persona(){
        System.out.println("Ejecución del constructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}
