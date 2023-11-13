/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appregistroincidencias;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author USER
 */
public class ConexionDB {
    private final String nombreDB = "db_appincidencias";
    private final String urlDB = "jdbc:mysql://aws.connect.psdb.cloud/" + nombreDB + "?sslMode=VERIFY_IDENTITY";
    private final String usuarioDB = "pemzckulig7vwsi7o9p8";
    private final String contraDB = "pscale_pw_OxYJpEDTqp0IJqerl3cEUhSIWyg1Qwsf7lJBLS0cbNz";
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
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    
    
}
