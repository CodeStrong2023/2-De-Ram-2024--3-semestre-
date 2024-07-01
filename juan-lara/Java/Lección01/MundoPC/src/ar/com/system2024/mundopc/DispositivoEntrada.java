
package ar.com.system2024.mundopc;
 
public class DispositivoEntrada {
    private String tipo_Entrada;
    private String marca;
    
    public DispositivoEntrada (String tipoEntrada, String marca){
        this.tipo_Entrada = tipoEntrada;
        this.marca = marca;
    }

    public String getTipo_Entrada() {
        return tipo_Entrada;
    }

    public void setTipo_Entrada(String tipo_Entrada) {
        this.tipo_Entrada = tipo_Entrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipo_Entrada=" + tipo_Entrada + ", marca=" + marca + '}';
    }
    
    }
