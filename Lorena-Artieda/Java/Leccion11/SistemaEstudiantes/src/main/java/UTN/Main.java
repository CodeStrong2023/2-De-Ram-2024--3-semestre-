package UTN;

import UTN.conexion.Conexion;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        var conexion= Conexion.getConnection();
        if (conexion!= null){
            System.out.println("Conexion exitosa: "+ conexion);

        }else
            System.out.println("Error al conectarse");

    }//Fin main
}//Fin clase Main