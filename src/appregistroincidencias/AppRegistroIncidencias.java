/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appregistroincidencias;

import Ventanas.InicioSesion;

/**
 *
 * @author USER
 */
public class AppRegistroIncidencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConexionDB conexion = new ConexionDB();
        boolean conectado = false;
        
        conexion.conectar();
        
        InicioSesion incioSesion = new InicioSesion();
        incioSesion.setVisible(true);
        incioSesion.setLocationRelativeTo(null);
        
        
        
        
        
    }
    
}
