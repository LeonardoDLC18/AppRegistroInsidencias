package Ventanas;

import appregistroincidencias.ConexionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConfirmacionDeContraseña extends javax.swing.JFrame {
    private String usuario;
    private String correoUsuario;
    
    public ConfirmacionDeContraseña() {
        initComponents();
    }

    public ConfirmacionDeContraseña(String usuario, String correoUsuario) {
        initComponents();
        this.usuario = usuario;
        this.correoUsuario = correoUsuario;
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
        lbl_titulo = new javax.swing.JLabel();
        lbl_titulo2 = new javax.swing.JLabel();
        lbl_noCuenta = new javax.swing.JLabel();
        lbl_noCuenta2 = new javax.swing.JLabel();
        lbl_noCorreo = new javax.swing.JLabel();
        lbl_confirmar = new javax.swing.JLabel();
        lbl_boton = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JTextField();
        lbl_fondo2 = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(128, 173, 216));
        lbl_titulo.setText("CONFIRMACIÓN");
        jPanel1.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        lbl_titulo2.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        lbl_titulo2.setForeground(new java.awt.Color(128, 173, 216));
        lbl_titulo2.setText("DE CONTRASEÑA");
        jPanel1.add(lbl_titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 260, -1));

        lbl_noCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_noCuenta.setForeground(new java.awt.Color(193, 248, 255));
        lbl_noCuenta.setText("Introduce la contraseña que ");
        jPanel1.add(lbl_noCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        lbl_noCuenta2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_noCuenta2.setForeground(new java.awt.Color(193, 248, 255));
        lbl_noCuenta2.setText("te llegó al correo");
        jPanel1.add(lbl_noCuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        lbl_noCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_noCorreo.setForeground(new java.awt.Color(193, 248, 255));
        lbl_noCorreo.setText("¿No recibiste el correo? ");
        lbl_noCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_noCorreoMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_noCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        lbl_confirmar.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        lbl_confirmar.setForeground(new java.awt.Color(193, 255, 248));
        lbl_confirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_confirmar.setText("CONFIRMAR");
        lbl_confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_confirmarMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 240, 50));

        lbl_boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/RecCeleste.png"))); // NOI18N
        jPanel1.add(lbl_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        txt_contraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_contraseña.setForeground(new java.awt.Color(128, 173, 216));
        jPanel1.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 240, 40));

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
        cx.conectar();
        
        try {            
            String contraI = txt_contraseña.getText();
            String consulta = "select * from usuarios where usuario = '" + this.usuario
                    + "' and correo = '" + correoUsuario + "'";
            Statement st = cx.conectar().createStatement();
            ResultSet rs = st.executeQuery(consulta);
            if (rs.next()) {
                //JOptionPane.showMessageDialog(this, "El usuario SI está en la DB");
                String contraU = rs.getString("contra");
                
                if(contraI.equals(contraU)){
                    JOptionPane.showMessageDialog(this, 
                        "La contraseña se cambió correctamente!");
                    InicioSesion ventanaAnterior = new InicioSesion();
                    ventanaAnterior.setLocationRelativeTo(this);
                    ventanaAnterior.setVisible(true);        
                    this.setVisible(false);  
                } else{
                    JOptionPane.showMessageDialog(this, 
                        "La contraseña no se cambió!");
                }
                
            } else {
                JOptionPane.showMessageDialog(this, 
                        "Hubo un fallo con los datos");
            }            
        } catch (SQLException ex) {
            Logger.getLogger(InicioSesion.class.getName()).
                    log(Level.SEVERE, null, ex);
        } 
        cx.desconectar();         
    }//GEN-LAST:event_lbl_confirmarMouseClicked

    private void lbl_noCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_noCorreoMouseClicked
        CambioDeContraseña ventanaCambio = new CambioDeContraseña();
        ventanaCambio.setVisible(true);
        ventanaCambio.setLocationRelativeTo(this);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_noCorreoMouseClicked

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
            java.util.logging.Logger.getLogger(ConfirmacionDeContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmacionDeContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmacionDeContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmacionDeContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmacionDeContraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_boton;
    private javax.swing.JLabel lbl_confirmar;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_fondo2;
    private javax.swing.JLabel lbl_noCorreo;
    private javax.swing.JLabel lbl_noCuenta;
    private javax.swing.JLabel lbl_noCuenta2;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_titulo2;
    private javax.swing.JTextField txt_contraseña;
    // End of variables declaration//GEN-END:variables
}
