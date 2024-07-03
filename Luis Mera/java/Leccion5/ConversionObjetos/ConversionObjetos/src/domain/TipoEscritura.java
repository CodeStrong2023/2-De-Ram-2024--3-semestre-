package domain;

public enum TipoEscritura{
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digital");

    private final String descripcion;

    // Constructor
    private TipoEscritura(String descripcion){
        this.descripcion = descripcion;
    }

    //Metodo Get
    public String getDescripcion(){
        return this.descripcion;
    }


}
