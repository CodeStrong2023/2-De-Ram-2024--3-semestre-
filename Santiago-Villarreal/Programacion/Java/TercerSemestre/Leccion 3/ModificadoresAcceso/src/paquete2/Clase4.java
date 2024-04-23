package paquete2;

public class Clase4 {
    private String atributoPrivate = "Atributo privado";

    private Clase4(){
        System.out.println("Constructor privado");
    }

    //Creamos un constructor public para poder crear objetos
    public Clase4(String argumento){
        this();
        System.out.println("Constructor Publico");
    }

    //Metodo private
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivate(){
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate){
         this.atributoPrivate = atributoPrivate;
    }

}
