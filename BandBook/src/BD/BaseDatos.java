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
    ResultSet resul;// crear cursor para manjer salidas de las consultas

    public void mensajes() {

        try {
             //esta conexion no hace falta hacerla todo el rato con que la haga 
             //una vez al principio vale pero me he dado cuenta tarde 
            con = DriverManager.getConnection(url, "root", "");//establezco la conexion
            //DatabaseMetaData datos = con.getMetaData(); obtener informacion de la BD
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

    public void mostrarInformacionUsuariosMuro() {

        try {

            con = DriverManager.getConnection(url, "root", "");//establezco la conexion
            Statement sentence = con.createStatement();
            // si pongo , vuelos me da la info de todos los vuelos también
            resul = sentence.executeQuery("Select name,state,province from usuarios");

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

    public void verPasajerosVuelo() {

        try {

            con = DriverManager.getConnection(url, "root", "");//establezco la conexion
            Statement sentence = con.createStatement();
            Scanner usuario = new Scanner(System.in);
            System.out.println("¿De qué vuelo quieres ver los pasajeros? ");
            String vuelo = usuario.nextLine();
            String sql = "Select * from pasajeros WHERE COD_VUELO = '" + vuelo + "'";
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

    public void registro(String email, String pass, String name,
            int phone, String state, String province, int num) {// variables para pasar despues
        // esta parte se pueden meter los datos del tiron sin tener que hacer tantos scanner 
        //en la clase principal solo hay que que poner las variables en INSERT
        // INSERT INTO vuelos VALUES ("'"+codVuelos+"'" etc etc )
        try {
            con = DriverManager.getConnection(url, "root", "");//establezco la conexion
            // creamos una variuable para meter el INSERT y se la pasamos al prepared statemen 
            String sql = " INSERT INTO usuarios VALUES (?,?,?,?,?,?,?)";
            PreparedStatement sentencia = con.prepareStatement(sql);
            //asignamos cada variable siendo la primera cifra el numero de columna
            //y despues la variable
            sentencia.setString(1, email);
            sentencia.setString(2, pass);
            sentencia.setString(3, name);
            sentencia.setInt(4, phone);
            sentencia.setString(5, state);
            sentencia.setString(6, province);
            sentencia.setInt(7, num);
            int filasDeVueltas = sentencia.executeUpdate();//ejecutamos las sentencias

            if (filasDeVueltas != 1) {// condicion para saber si se introduce o no el vuelo

                System.out.println("Usuario mal registrado");

            } else {

                System.out.println("Usuario registrado correctamente");
            }
            sentencia.close();//cerrrar la sentencia
            con.close();//cerrar conexion

        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }

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
