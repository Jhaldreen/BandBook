package BD;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class BaseDatos {

    Connection con;
    String url = "jdbc:mysql://127.0.0.1:3306/BandBook";//indica la direccion del servidor
    ResultSet resul;// crear cursor para manejar salidas de las consultas

    public void mensajes() {

        try {           
            con = DriverManager.getConnection(url, "root", "");//establezco la conexion           
            //System.out.println(datos.getUserName());//sacar el servidor
            Statement sentence = con.createStatement();
            resul = sentence.executeQuery("Select * from mensajes");
            // resul = datos.getTables(null,"Iberia", null, null);

            while (resul.next()) {//recorre las tablas y me dice las que hay
                System.out.println(" Nombre " + resul.getString(2)
                        + " Asunto: " + resul.getString(3) + " Mensaje: " + resul.getString(4));

            }
            
            con.close();// cerrar la operacion

        } catch (SQLException ex) {
            System.out.println("error" + ex);
        }
            
    } 

    public void selectProvince() {

        try {

            con = DriverManager.getConnection(url, "root", "");//establezco la conexion
            Statement sentence = con.createStatement();
            String provincia = "";
            String sql = "Select * from usuario WHERE province = '" + provincia + "'";
            //System.out.println(sql);
            resul = sentence.executeQuery(sql);

            // resul = datos.getTables(null,"Iberia", null, null);
            while (resul.next()) {//recorre las tablas y me dice las que hay
                System.out.println("Numero: "
                        + resul.getString(1) + " Vuelo: " + resul.getString(2)
                        + " Plaza: " + resul.getString(3) + " Fumador: " + resul.getString(4));

            }
            con.close();// cerrar la operacion

        } catch (SQLException ex) {
            System.out.println("error" + ex);
        }

    }

    public boolean registro(Usuarios usr) {
        try {
            con = DriverManager.getConnection(url, "root", "");//establezco la conexion
            // creamos una variuable para meter el INSERT y se la pasamos al prepared statement 
            String sql = " INSERT INTO usuarios "
                    + "(email,pass,name,phone,state,province,num_people)"
                    + " VALUES (?,?,?,?,?,?,?)";
            PreparedStatement sentencia = con.prepareStatement(sql);
            //asignamos cada variable siendo la primera cifra el numero de columna
            //y despues la variable           
            sentencia.setString(1, usr.getEmail());
            sentencia.setString(2,usr.getPass());
            sentencia.setString(3, usr.getName());
            sentencia.setString(4, usr.getPhone());
            sentencia.setString(5, usr.getState());
            sentencia.setString(6, usr.getProvince());
            sentencia.setInt(7, usr.getNum());
            sentencia.executeUpdate();//ejecutamos las sentencias
            
            sentencia.close();//cerrrar la sentencia
            con.close();//cerrar conexion

        } catch (SQLException ex) {
            System.out.println("Error al insertar Registro " + ex);
        }
        return false;
        

    }

    public void borrarVuelo(String vuelo) {

        try {
            // igual que el anterior pero borrando datos
            con = DriverManager.getConnection(url, "root", "");//establezco la conexion           
            String sql = "DELETE FROM Vuelos WHERE COD_VUELO = ?";
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setString(1, vuelo);
            int filasDeVueltas = sentencia.executeUpdate();
            sentencia.close();
            if (filasDeVueltas != 1) {
                System.out.println("vuelo no borrado");
            } else {
                System.out.println("vuelo borrado");
            }

            con.close();// cerrar la operacion

        } catch (SQLException ex) {
            System.out.println("error" + ex);
        }

    }

    public void convertir() throws SQLException {

        try {
            //aqui hay que realizar dos actualizaciones se suman los no fumadores
            //a fumadores y luego se deja a 0 fumadores
            con = DriverManager.getConnection(url, "root", "");//establezco la conexion
            Statement sentence = con.createStatement();
            sentence.execute("update vuelos set PLAZAS_NO_FUMADOR=(PLAZAS_NO_FUMADOR+PLAZAS_FUMADOR)");
            sentence.execute("update vuelos set PLAZAS_FUMADOR=0");

        } catch (SQLException ex) {
            System.out.println("Error al modificar los fumadores " + ex.getMessage());
        } finally {
            con.close();
        }

    }
}
