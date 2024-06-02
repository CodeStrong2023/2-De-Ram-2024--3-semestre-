
package paquete2;

public class Clase4 {
    private String attPrivate = " att privado";
    
    private Clase4(){
        System.out.println("contructor privado");
    }
    
    public Clase4(String arg){
        this();
        System.out.println("algo");
    }

    public String getAttPrivate() {
        return attPrivate;
    }

    public void setAttPrivate(String attPrivate) {
        this.attPrivate = attPrivate;
    }
    
    
    
    private void metodoPrivado(){
        System.out.println("malisimo");
    }
}
