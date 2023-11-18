/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import appregistroincidencias.ConexionDB;
import appregistroincidencias.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class EditarPerfil extends javax.swing.JFrame {

    private Usuario usuarioUsando;
    /**
     * Creates new form InicioSesion
     */
    public EditarPerfil() {
        initComponents();
    }
    
    public EditarPerfil(Usuario usuarioUsando, JFrame ventAnt) {
        initComponents();
        txt_usuario.setText(usuarioUsando.getUsuario());
        txt_correo.setText(usuarioUsando.getCorreo());
        txt_contraseña.setText(usuarioUsando.getContra());
        this.usuarioUsando = usuarioUsando;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_confirmar = new javax.swing.JLabel();
        lbl_boton = new javax.swing.JLabel();
        lbl_volver = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        lbl_titulo = new javax.swing.JLabel();
        lbl_fondo2 = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_confirmar.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        lbl_confirmar.setForeground(new java.awt.Color(193, 255, 248));
        lbl_confirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_confirmar.setText("CONFIRMAR");
        lbl_confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_confirmarMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 240, 50));

        lbl_boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/RecCeleste.png"))); // NOI18N
        jPanel1.add(lbl_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        lbl_volver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_volver.setForeground(new java.awt.Color(193, 248, 255));
        lbl_volver.setText("Volver");
        lbl_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_volverMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        txt_contraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_contraseña.setForeground(new java.awt.Color(128, 173, 216));
        txt_contraseña.setText("Contraseña...");
        jPanel1.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 240, 40));

        txt_usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(128, 173, 216));
        txt_usuario.setText("Usuario...");
        jPanel1.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 240, 40));

        txt_correo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_correo.setForeground(new java.awt.Color(128, 173, 216));
        txt_correo.setText("Correo...");
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 240, 40));

        lbl_titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(128, 173, 216));
        lbl_titulo.setText("EDITAR PERFIL");
        jPanel1.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

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

    private void lbl_confirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_confirmarMouseClicked
        ConexionDB cx = new ConexionDB();
        try {            
            String usuario = txt_usuario.getText();
            String correoUsuario = txt_correo.getText();
            String contra = txt_contraseña.getText();
            
            String consulta = "select * from usuarios where usuario = '" + usuarioUsando.getUsuario()
                    + "' and correo = '" + usuarioUsando.getCorreo() + "' and contra = '" 
                    + usuarioUsando.getContra() + "'";
            
            Statement st = cx.conectar().createStatement();
            ResultSet rs = st.executeQuery(consulta);
            if (rs.next()) {
                //JOptionPane.showMessageDialog(this, "El usuario SI está en la DB");
                                
                String consulta2 = "update usuarios set contra = '" + 
                        contra + "', usuario = '" + usuario + "', correo = '" + 
                        correoUsuario + "' where usuario = '" + usuarioUsando.getUsuario()
                        + "' and correo = '" + usuarioUsando.getCorreo() + "' and contra = '" 
                        + usuarioUsando.getContra() + "'";    
                
                Statement st2 = cx.conectar().createStatement();
                int filasAfectadas = st2.executeUpdate(consulta2);
                if (filasAfectadas > 0) {                   
                    String consulta3 = "select * from usuarios where usuario = '" + usuario
                        + "' and correo = '" + correoUsuario + "' and contra = '" 
                        + contra + "'";
                    
                    Statement st3 = cx.conectar().createStatement();
                    ResultSet rs3 = st3.executeQuery(consulta3);
                    if (rs3.next()) {
                        usuarioUsando.setUsuario(rs3.getString("usuario"));
                        usuarioUsando.setContra(rs3.getString("contra"));
                        usuarioUsando.setCorreo(rs3.getString("correo"));
                        JOptionPane.showMessageDialog(this, 
                            "Se ha cambiado los datos de la cuenta!!!"); 
                                        
                        Inicio inicio = new Inicio(usuarioUsando);
                        Perfil ventAnt1 = new Perfil(usuarioUsando, inicio);
                        ventAnt1.setLocationRelativeTo(this);
                        ventAnt1.setVisible(true);       
                        this.setVisible(false);
                    }else {
                        JOptionPane.showMessageDialog(this, 
                                "Hubo un fallo con los datos");
                    }                  
                } else {
                    JOptionPane.showMessageDialog(this, 
                            "No se ha podido cambiar los datos");
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
    }//GEN-LAST:event_lbl_confirmarMouseClicked

    private void lbl_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_volverMouseClicked
        Inicio inicio = new Inicio(usuarioUsando);
        Perfil ventAnt1 = new Perfil(usuarioUsando, inicio);
        ventAnt1.setLocationRelativeTo(this);
        ventAnt1.setVisible(true);       
        this.setVisible(false);  
    }//GEN-LAST:event_lbl_volverMouseClicked

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
            java.util.logging.Logger.getLogger(EditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_boton;
    private javax.swing.JLabel lbl_confirmar;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_fondo2;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_volver;
    private javax.swing.JTextField txt_contraseña;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
