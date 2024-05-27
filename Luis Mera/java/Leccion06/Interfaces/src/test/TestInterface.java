package test;

import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionMySql;
import accesodatos.ImplementacionOracle;

public class TestInterface {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionOracle();
        IAccesoDatos datosMysql = new ImplementacionMySql();
        datos.listar();
        datosMysql.listar();
        imprimir(datosMysql);
    }

    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
