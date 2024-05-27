package accesodatos;

public class ImplementacionMySql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar Datos");
    }

    @Override
    public void listar() {
        System.out.println("Listar Datos");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar Datos");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar Datos");
    }
}
