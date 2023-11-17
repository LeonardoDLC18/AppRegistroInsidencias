package appregistroincidencias;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConexionDB {
    private final String nombreDB = "db_appincidencias";    
    private final String usuarioDB = "bgdyollt29cwzbevgnoa";
    private final String contraDB = "pscale_pw_69n0XlOSom2LPkhd7RYQj7XhM0O353Ah7kzSAjuNLih";
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
