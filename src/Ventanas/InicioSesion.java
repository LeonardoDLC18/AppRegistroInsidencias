package Ventanas;

import appregistroincidencias.ConexionDB;
import appregistroincidencias.Usuario;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InicioSesion extends javax.swing.JFrame {
    
    public InicioSesion() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_noCuenta = new javax.swing.JLabel();
        lbl_olvidaste = new javax.swing.JLabel();
        lbl_iniciar = new javax.swing.JLabel();
        lbl_boton = new javax.swing.JLabel();
        pw_contra = new javax.swing.JPasswordField();
        txt_usuario = new javax.swing.JTextField();
        lbl_titulo = new javax.swing.JLabel();
        lbl_fondo2 = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_noCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_noCuenta.setForeground(new java.awt.Color(193, 248, 255));
        lbl_noCuenta.setText("¿No tienes una cuenta registrada?");
        lbl_noCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_noCuentaMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_noCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        lbl_olvidaste.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_olvidaste.setForeground(new java.awt.Color(193, 248, 255));
        lbl_olvidaste.setText("¿Olvidaste tu contraseña?");
        lbl_olvidaste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_olvidasteMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_olvidaste, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        lbl_iniciar.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        lbl_iniciar.setForeground(new java.awt.Color(193, 255, 248));
        lbl_iniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_iniciar.setText("INICIAR");
        lbl_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_iniciarMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 240, 50));

        lbl_boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/RecCeleste.png"))); // NOI18N
        jPanel1.add(lbl_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        jPanel1.add(pw_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 240, 40));

        txt_usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(128, 173, 216));
        jPanel1.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 240, 40));

        lbl_titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(128, 173, 216));
        lbl_titulo.setText("BIENVENIDO");
        jPanel1.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

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

    private void lbl_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_iniciarMouseClicked
        ConexionDB cx = new ConexionDB();
        try {            
            String usuario = txt_usuario.getText();
            String contra = String.valueOf(pw_contra.getPassword());
            String consulta = "select * from usuarios where usuario = '" + usuario
                    + "' and contra = '" + contra + "'";
            Statement st = cx.conectar().createStatement();
            ResultSet rs = st.executeQuery(consulta);
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, 
                        "El usuario SI está en la DB");
                Usuario usuarioObtenido = new Usuario();
                usuarioObtenido.setId_usuario(rs.getInt("id_usuario"));
                usuarioObtenido.setUsuario(rs.getString("usuario"));
                usuarioObtenido.setContra(rs.getString("contra"));
                usuarioObtenido.setCorreo(rs.getString("correo"));
                usuarioObtenido.setTipo(rs.getString("tipo"));
                
                Inicio ventanaInicio = new Inicio(usuarioObtenido);
                ventanaInicio.actualizarLista();
                ventanaInicio.setVisible(true);
                ventanaInicio.setLocationRelativeTo(this);
                this.setVisible(false);               
            } else {
                JOptionPane.showMessageDialog(this, 
                        "El usuario NO está en la DB");
            }            
        } catch (SQLException ex) {
            Logger.getLogger(InicioSesion.class.getName()).
                    log(Level.SEVERE, null, ex);
        } 
        cx.desconectar();
    }//GEN-LAST:event_lbl_iniciarMouseClicked

    private void lbl_noCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_noCuentaMouseClicked
        RegistroUsuario ventanaRegistro = new RegistroUsuario();
        ventanaRegistro.setVisible(true);
        ventanaRegistro.setLocationRelativeTo(this);
        this.setVisible(false);         
    }//GEN-LAST:event_lbl_noCuentaMouseClicked

    private void lbl_olvidasteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_olvidasteMouseClicked
        CambioDeContraseña ventanaCambio = new CambioDeContraseña();
        ventanaCambio.setVisible(true);
        ventanaCambio.setLocationRelativeTo(this);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_olvidasteMouseClicked

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_boton;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_fondo2;
    private javax.swing.JLabel lbl_iniciar;
    private javax.swing.JLabel lbl_noCuenta;
    private javax.swing.JLabel lbl_olvidaste;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPasswordField pw_contra;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
