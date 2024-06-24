package accesoDatos;

public interface IAccesoDatos {
    int MAX_REGISTRO=10;

    //Metodo insertar es abstracto, sin cuerpo.

    void insertar();
    void listar();
    void actualizar();
    void eliminar();

}
