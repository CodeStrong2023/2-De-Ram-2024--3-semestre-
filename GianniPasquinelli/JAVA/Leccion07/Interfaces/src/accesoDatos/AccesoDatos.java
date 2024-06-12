package accesodatos;

public interface IAccesoDatos {
    int Max_Registro = 10;
    // metodo insertar es abstracto y sin cuerpo
    void insertar();

    void listar();

    void actualizar();

    void eliminar();
}