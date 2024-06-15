
package ar.com.system2023.MundoPC;

public class Orden {
    private final int idOrden;
    private Computadora computadora[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 6;
    private int contadorComputadora;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadora  = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadora < Orden.MAX_COMPUTADORAS){
            this.computadora[this.contadorComputadora++] = computadora;
        }
        else{
            System.out.println("Has superado el límite: " + Orden.MAX_COMPUTADORAS);
        }
    }
    public void mostrarOrden(){
        System.out.println("Orden #: " + this.idOrden);
        System.out.println("Computadoras de la orden #: " + this.idOrden);
        for(int i = 0; i < this.contadorComputadora; i++){
            System.out.println(this.computadora[i]);
        }
    }
}