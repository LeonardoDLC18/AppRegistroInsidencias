package appregistroincidencias;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConexionDB {
    private final String nombreDB = "db_appincidencias";    
<<<<<<< HEAD
//<<<<<<< HEAD
    private final String usuarioDB = "3t2tb2dc8or64484b9wj";
    private final String contraDB = "pscale_pw_Xrs8j4v2kaR7jb31AznI6OOfA6YV7PimrtTR4LdyZO2";
//=======
//    private final String usuarioDB = "3t2tb2dc8or64484b9wj";
//    private final String contraDB = "pscale_pw_Xrs8j4v2kaR7jb31AznI6OOfA6YV7PimrtTR4LdyZO2";
//>>>>>>> 1.1
=======
    private final String usuarioDB = "rrlzyhr51o5cgmt6ia5q";
    private final String contraDB = "pscale_pw_QvDfAgBmM4v619cIZ277LbAZrqPYzy5Vvf7YnK5rAkx";
>>>>>>> 1.1
    private final String urlDB = "jdbc:mysql://aws.connect.psdb.cloud/" + nombreDB + "?sslMode=VERIFY_IDENTITY";
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private Connection cx;
    public ConexionDB(){
        
    }
    
    public Connection conectar(){
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(urlDB, usuarioDB, contraDB);
            System.out.println("Se conectó");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se conectó");
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }
    
     public void desconectar(){
        try {
            cx.close();
            System.out.println("Se desconectó");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }      
}
