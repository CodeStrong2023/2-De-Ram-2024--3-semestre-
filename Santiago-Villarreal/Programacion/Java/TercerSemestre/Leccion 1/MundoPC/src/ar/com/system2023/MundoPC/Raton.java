
package ar.com.system2023.MundoPC;

public class Raton extends DispositivosEntrada{
    private final int idRaton;
    private static int contadorRatones;
    
    public Raton (String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ","+ super.toString()+'}';
    }
    
    
}
