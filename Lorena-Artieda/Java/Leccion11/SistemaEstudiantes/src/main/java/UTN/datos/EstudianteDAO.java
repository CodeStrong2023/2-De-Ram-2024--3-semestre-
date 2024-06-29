package UTN.datos;

import UTN.conexion.Conexion;
import UTN.domain.Estudiante;

import java.lang.ref.PhantomReference;
import java.security.spec.ECField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static UTN.conexion.Conexion.getConnection;
public class EstudianteDAO {
    //Metodo listar
    public List<Estudiante> listarEstudiantes() throws SQLException, ClassNotFoundException {
        List<Estudiante> estudiantes = new ArrayList<>();
        //Creamos algunos objetos que son necesarios para conectarnos con la base de datos
        PreparedStatement ps; //Prepara la sentencia de SQL
        ResultSet rs;//Permite almacenar el resultado que obtenemos
        //Creamos un objeto de tipo connection
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2024";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idEstudiante"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                //Agregamos a la lista
                estudiantes.add(estudiante);
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrio un error al cerrar la conexon");
            }
        }
        return estudiantes;
    }//Fin metodo listarEstudiantes

    public boolean buscarEstudiantePorId(Estudiante estudiante) throws SQLException, ClassNotFoundException {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2024 WHERE idEstudiante = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if (rs.next()) {
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true;//Se encontro un registro
            }//Fin if

        } catch (Exception e) {
            System.out.println("Ocurrio un error al buscar estudiante: " + e.getMessage());
        }//Fin catch
        finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrio un error  al cerrar la conexion: " + e.getMessage());
            }//fin catch
        }//fin
        return false;
    }



    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Listar los estudiantes
        var estudianteDAO= new EstudianteDAO();
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes=  estudianteDAO.listarEstudiantes();
        estudiantes.forEach(System.out::println);

        //Buscar por ID
        var estudiante1 = new Estudiante(1);
        System.out.println("Estudiantes antes de la busqueda: "+ estudiante1);
        var encontrado= estudianteDAO.buscarEstudiantePorId(estudiante1);
        if (encontrado) {
            System.out.println("Estudiante encontrado: "+ estudiante1);
        } else {
            System.out.println("Estudiante no encontrado");
        }
    }



}
