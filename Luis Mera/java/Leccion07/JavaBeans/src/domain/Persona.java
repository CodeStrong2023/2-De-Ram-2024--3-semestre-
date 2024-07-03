package domain;

import java.io.Serializable;

// requerimiento javabeans: serializable
public class Persona implements Serializable{
    // requerimiento javabeans: atributos tipo private
    private String nombre;
    private String apellido;

    // requerimiento javabeans: constructor vacío (obligatorio)
    public Persona(){

    }

    // opcional
    public Persona (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // requerimientos javabeans: getters and setters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // opcional
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
    }

    
    
}