package Ventanas;

import appregistroincidencias.ConexionDB;
import appregistroincidencias.EnviarCorreo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CambioDeContraseña extends javax.swing.JFrame {

    public CambioDeContraseña() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_titulo2 = new javax.swing.JLabel();
        lbl_texto = new javax.swing.JLabel();
        lbl_texto2 = new javax.swing.JLabel();
        lbl_noCuenta = new javax.swing.JLabel();
        lbl_enviar = new javax.swing.JLabel();
        lbl_boton = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        lbl_fondo2 = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(128, 173, 216));
        lbl_titulo.setText("CAMBIO  DE");
        jPanel1.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        lbl_titulo2.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        lbl_titulo2.setForeground(new java.awt.Color(128, 173, 216));
        lbl_titulo2.setText("CONTRASEÑA");
        jPanel1.add(lbl_titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 220, -1));

        lbl_texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_texto.setForeground(new java.awt.Color(193, 248, 255));
        lbl_texto.setText("Ingrese los datos de la cuenta, le");
        jPanel1.add(lbl_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        lbl_texto2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_texto2.setForeground(new java.awt.Color(193, 248, 255));
        lbl_texto2.setText("enviaremos la nueva contraseña.");
        jPanel1.add(lbl_texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        lbl_noCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_noCuenta.setForeground(new java.awt.Color(193, 248, 255));
        lbl_noCuenta.setText("¿No tienes una cuenta registrada?");
        lbl_noCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_noCuentaMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_noCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        lbl_enviar.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        lbl_enviar.setForeground(new java.awt.Color(193, 255, 248));
        lbl_enviar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_enviar.setText("ENVIAR");
        lbl_enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_enviarMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 240, 50));

        lbl_boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/RecCeleste.png"))); // NOI18N
        jPanel1.add(lbl_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        txt_usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(128, 173, 216));
        jPanel1.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 240, 40));

        txt_correo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_correo.setForeground(new java.awt.Color(128, 173, 216));
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 240, 40));

        lbl_fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/fondo2.png"))); // NOI18N
        jPanel1.add(lbl_fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 330));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/fondo.png"))); // NOI18N
        jPanel1.add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_noCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_noCuentaMouseClicked
        RegistroUsuario ventanaRegistro = new RegistroUsuario();
        ventanaRegistro.setLocationRelativeTo(this);
        ventanaRegistro.setVisible(true);       
        this.setVisible(false);  
    }//GEN-LAST:event_lbl_noCuentaMouseClicked

    private void lbl_enviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_enviarMouseClicked
        
        
        EnviarCorreo correo = new EnviarCorreo();
        
        ConexionDB cx = new ConexionDB();
        try {            
            String usuario = txt_usuario.getText();
            String correoUsuario = txt_correo.getText();
            String consulta = "select * from usuarios where usuario = '" + usuario
                    + "' and correo = '" + correoUsuario + "'";
            Statement st = cx.conectar().createStatement();
            ResultSet rs = st.executeQuery(consulta);
            if (rs.next()) {
                //JOptionPane.showMessageDialog(this, "El usuario SI está en la DB");
                String cadenaRandom = generarCadenaRandom(10);
                correo.Enviar(correoUsuario, cadenaRandom);
                
                String consulta2 = "update usuarios set contra = '" + 
                        cadenaRandom + "' where usuario = '" + usuario
                        + "' and correo = '" + correoUsuario + "'";    
                Statement st2 = cx.conectar().createStatement();
                int filasAfectadas = st2.executeUpdate(consulta2);
                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(this, 
                            "Se ha cambiado la contraseña, revice su correo!!!"); 
                    ConfirmacionDeContraseña ventanaRegistro = new ConfirmacionDeContraseña(usuario, correoUsuario);
                    ventanaRegistro.setLocationRelativeTo(this);
                    ventanaRegistro.setVisible(true);       
                    this.setVisible(false);  
                } else {
                    JOptionPane.showMessageDialog(this, 
                            "No se ha podido envíar el correo");
                }
            } else {
                JOptionPane.showMessageDialog(this, 
                        "Los datos ingresados son incorrectos");
            }            
        } catch (SQLException ex) {
            Logger.getLogger(InicioSesion.class.getName()).
                    log(Level.SEVERE, null, ex);
        } 
        cx.desconectar();        
    }//GEN-LAST:event_lbl_enviarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CambioDeContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioDeContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioDeContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioDeContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambioDeContraseña().setVisible(true);
            }
        });
    }
    
    public static String generarCadenaRandom(int longitud) {
        // Caracteres posibles para la cadena aleatoria
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        // Crear un objeto Random
        Random random = new Random();

        // Usar StringBuilder para construir la cadena
        StringBuilder cadena = new StringBuilder(longitud);

        // Generar la cadena aleatoria
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            cadena.append(caracterAleatorio);
        }

        // Devolver la cadena generada
        return cadena.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_boton;
    private javax.swing.JLabel lbl_enviar;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_fondo2;
    private javax.swing.JLabel lbl_noCuenta;
    private javax.swing.JLabel lbl_texto;
    private javax.swing.JLabel lbl_texto2;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_titulo2;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
