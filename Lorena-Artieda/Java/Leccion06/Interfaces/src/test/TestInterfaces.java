package test;

import accesoDatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos= new ImplementacionMysql();
        //datos.actualizar();
        imprimir(datos);
        datos = new ImplementacionOracle();
        //datos.listar();
        imprimir(datos);
    }
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
