
package Controlador;
import java.sql.*;
import javax.swing.*;

public class ConexionSQL {
    
    Connection con = null;

    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/escuela", "root", "di mi nombre");
            JOptionPane.showMessageDialog(null, "Conexión exitosa a la base de datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión "+e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }    
    
    public void close(){
        con = null;
        if(con == null){
            System.out.println("Conexion cerrada");
            //JOptionPane.showMessageDialog(null, "Conexión cerrada");
        }
    }
    
    
}
