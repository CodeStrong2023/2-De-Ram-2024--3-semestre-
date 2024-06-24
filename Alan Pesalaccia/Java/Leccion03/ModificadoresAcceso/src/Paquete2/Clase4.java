
package Paquete2;

public class Clase4 {
    private String AtributoPrivate = "Atributo Privado";
    
    private Clase4(){
        System.out.println("Constructor privado");
    }
    
    // Creamos un constructor public para poder crear objetos.
    public Clase4(String argumento){ // Aqui se puede llamar al constructor vacío.
        this();
        System.out.println("Constructor público");
    }
    
    // Método private
    private void MetodoPrivado(){
        System.out.println("Método privado");
    }

    public String getAtributoPrivate() {
        return AtributoPrivate;
    }

    public void setAtributoPrivate(String AtributoPrivate) {
        this.AtributoPrivate = AtributoPrivate;
    }
    
    
    
}
