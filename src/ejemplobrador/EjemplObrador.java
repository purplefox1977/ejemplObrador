package ejemplobrador;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EjemplObrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
           // TODO code application logic here
            
            //Cargar driver
            Class.forName("org.mariadb.jdbc.Driver");
            
            //cargar base de datos
           //-- DriverManager.getConnection("jdbc.mysql://localhost:3306/obrador2023", "root", "");
            // en lo anteriose genera un obgeto connectio y atraves de conection que es el objeto nos vamos a conectar a la db
            Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/obrador2023", "root","");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el driver"+ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion"+ex);
        }
    }
    
}
