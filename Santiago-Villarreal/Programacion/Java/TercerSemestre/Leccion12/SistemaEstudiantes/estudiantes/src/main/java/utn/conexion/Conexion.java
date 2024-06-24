package utn.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConnection(){
        Connection conexion = null;
        // Variables para conectarse a la base de datos
        var baseDatos = "estudiantes2023";
        var url = "jdbc:mysql://localhost:3306/"+baseDatos;
        var usuario = "root";
        var password = "admin";
        // cargar clase de driver de mysql en la memoria
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch(ClassNotFoundException | SQLException e){
            System.out.println("Ocurrió un error en la conexión" + e.getMessage());
        }
        return conexion;
    }
}
