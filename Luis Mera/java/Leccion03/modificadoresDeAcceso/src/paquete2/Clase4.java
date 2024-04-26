package paquete2;

public class Clase4 {

    private String atribitoPrivate = "Atributo privado";
    private Clase4() {
        System.out.println("Constructor privado");
    }
    //Creamos un cosntructor public para poder crar objetos
    public Clase4(String argumento){
        this();
        System.out.println("Constructor publico");
    }

    public String getAtribitoPrivate() {
        return atribitoPrivate;
    }

    public void setAtribitoPrivate(String atribitoPrivate) {
        this.atribitoPrivate = atribitoPrivate;
    }

    //Metodo pivate
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }

}