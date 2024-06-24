
package domain;

public class Persona {
    private String nombre;
    
    public Persona(String Nombre){
        this.nombre = Nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String Nombre){
        this.nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre = " + nombre + '}';
    }
    
    
}
