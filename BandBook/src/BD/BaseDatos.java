package BD;

import static JFrames.Login.mandar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonio
 */
public class BaseDatos {

    Connection con;
    String url = "jdbc:mysql://127.0.0.1:3306/BandBook";//indica la direccion del servidor
    ResultSet resul;// crear cursor para manejar salidas de las consultas

    public boolean registro(Usuarios usr) {
        try {
            con = DriverManager.getConnection(url, "root", "");//establezco la conexion
            // creamos una variuable para meter el INSERT y se la pasamos al prepared statement 
            String sql = " INSERT INTO usuarios "
                    + "(email,pass,name,phone,city,province,num_people)"
                    + " VALUES (?,?,?,?,?,?,?)";
            PreparedStatement sentencia = con.prepareStatement(sql);
            //asignamos cada variable siendo la primera cifra el numero de columna
            //y despues la variable 

            sentencia.setString(1, usr.getEmail());
            sentencia.setString(2, usr.getPass());
            sentencia.setString(3, usr.getName());
            sentencia.setString(4, usr.getPhone());
            sentencia.setString(5, usr.getCity());
            sentencia.setString(6, usr.getProvince());
            sentencia.setInt(7, usr.getNum());
            sentencia.executeUpdate();//ejecutamos las sentencias

            sentencia.close();//cerrrar la sentencia
            con.close();//cerrar conexion

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar Registro " + ex);
        }
        return true;

    }

    public int existeUsuario(String email) {

        PreparedStatement ps = null;
        try {
            con = DriverManager.getConnection(url, "root", "");//establezco la conexion
            String sql = "SELECT count(idusuarios) FROM usuarios WHERE email ='" + email + "'";
            PreparedStatement sentencia = con.prepareStatement(sql);

            resul = sentencia.executeQuery();

            if (resul.next()) {

                return resul.getInt(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return 1;

    }

    public boolean patronEmail(String email) {

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$");

        Matcher matcher = pattern.matcher(email);

        return matcher.find();

    }

    public void borrarUsuario(String email) {

        try {
            // igual que el anterior pero borrando datos
            con = DriverManager.getConnection(url, "root", "");//establezco la conexion           
            String sql = "DELETE FROM usuarios WHERE email ='" + email + "'";
            PreparedStatement sentencia = con.prepareStatement(sql);
            
            int borrado = sentencia.executeUpdate();

            if (borrado != 1) {

                JOptionPane.showMessageDialog(null, "perfil no borrado ");
            } else {
                
                JOptionPane.showConfirmDialog(null, "Esta seguro de que desea borrar este perfil?");
                
            }
  
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

   
    public boolean mensajes(Mensajes men) {

 try {
            con = DriverManager.getConnection(url, "root", "");//establezco la conexion
            // creamos una variable para meter el INSERT y se la pasamos al prepared statement 
            String sql = " INSERT INTO mensajes "
                    + "(name,asunto,texto,email,env_email)"
                    + " VALUES (?,?,?,?,?)";
            PreparedStatement sentencia = con.prepareStatement(sql);
            //asignamos cada variable siendo la primera cifra el numero de columna
            //y despues la variable 
            
            sentencia.setString(1,men.getName());
            sentencia.setString(2, men.getAsunto());
            sentencia.setString(3, men.getTexto());
            sentencia.setString(4, men.getEmail());
            sentencia.setString(5, men.getEnvemail());
            sentencia.executeUpdate();//ejecutamos las sentencias

            sentencia.close();//cerrrar la sentencia
            con.close();//cerrar conexion

        } catch (SQLException ex) {
            System.out.println("Error al insertar mensaje " + ex);
        }finally{
     try {
         
         con.close();
     } catch (SQLException ex) {
         Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
     }
            }
        return true;

    }
  
     public boolean modificarPerfil(Usuarios usr) {
        try {
            con = DriverManager.getConnection(url, "root", "");//establezco la conexion
            // creamos una variuable para meter el INSERT y se la pasamos al prepared statement 
            String sql = " UPDATE usuarios SET name=?, phone=?,"
                    + "city=?, province=?,num_people=? WHERE email ='"+mandar+"'";
            PreparedStatement sentencia = con.prepareStatement(sql);
            //asignamos cada variable siendo la primera cifra el numero de columna
            //y despues la variable 

            //sentencia.setString(1, usr.getEmail());
            //sentencia.setString(2, usr.getPass());
            sentencia.setString(1, usr.getName());
            sentencia.setString(2, usr.getPhone());
            sentencia.setString(3, usr.getCity());
            sentencia.setString(4, usr.getProvince());
            sentencia.setInt(5, usr.getNum());
            sentencia.executeUpdate();//ejecutamos las sentencias

            sentencia.close();//cerrrar la sentencia
            con.close();//cerrar conexion

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar Registro " + ex);
        }
        return true;

    }
     public void modificarPerfilmensajes(Mensajes men) {
        try {
            con = DriverManager.getConnection(url, "root", "");//establezco la conexion
            // creamos una variuable para meter el INSERT y se la pasamos al prepared statement 
            String sql = " UPDATE mensajes SET name=? WHERE email ='"+mandar+"'";
            PreparedStatement sentencia = con.prepareStatement(sql);
            //asignamos cada variable siendo la primera cifra el numero de columna
            //y despues la variable 

            sentencia.setString(1, men.getName());
           
            sentencia.executeUpdate();//ejecutamos las sentencias

            sentencia.close();//cerrrar la sentencia
            con.close();//cerrar conexion

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar mensajes nombre " + ex);
        }
       
    }
     
     

}
