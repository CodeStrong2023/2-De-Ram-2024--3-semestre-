package test;

import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionMySql;
import accesodatos.implementacionOracle;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql();
        // datos.listar();
        // imprimir(datos);
        datos = new implementacionOracle();
        // datos.listar();
        imprimir(datos);
    }

    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
