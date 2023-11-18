/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import appregistroincidencias.Usuario;
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class Perfil extends javax.swing.JFrame {
    private Usuario usuarioEnUso;
    private Inicio ventanaAnt;
    
    /**
     * Creates new form Inicio
     */
    public Perfil() {
        initComponents();       
    }
    
    public Perfil(Usuario usuario, Inicio ventanaAnt) {
        initComponents();   
        usuarioEnUso = usuario;
        this.ventanaAnt = ventanaAnt;
        lbl_usuario.setText(usuarioEnUso.getUsuario());
        lbl_id.setText(usuarioEnUso.getId_usuario() + " ");
        lbl_correo.setText(usuarioEnUso.getCorreo());
        
        if ("Comun".equals(usuarioEnUso.getTipo())){  
            lbl_text1.setText("Editar Perfil");
            lbl_text2.setText("Comentarios");
            lbl_text3.setText("Reclamos");
            lbl_text4.setText("Ayuda");
        }     
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
        jp_editar = new javax.swing.JPanel();
        lbl_text1 = new javax.swing.JLabel();
        jp_elimiar = new javax.swing.JPanel();
        lbl_text2 = new javax.swing.JLabel();
        jp_agregar = new javax.swing.JPanel();
        lbl_text3 = new javax.swing.JLabel();
        jp_ver = new javax.swing.JPanel();
        lbl_text4 = new javax.swing.JLabel();
        jp_condiciones = new javax.swing.JPanel();
        lbl_condiciones = new javax.swing.JLabel();
        icon_perfil = new javax.swing.JLabel();
        icon_salir = new javax.swing.JLabel();
        icon_volver = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        lbl_usuario1 = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        lbl_id1 = new javax.swing.JLabel();
        lbl_correo = new javax.swing.JLabel();
        lbl_correo1 = new javax.swing.JLabel();
        lbl_cirPerfil = new javax.swing.JLabel();
        lbl_cuaSalir = new javax.swing.JLabel();
        lbl_cuaVolver = new javax.swing.JLabel();
        lbl_fondo2 = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_editar.setBackground(new java.awt.Color(51, 120, 173));
        jp_editar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149, 177, 246), 2));

        lbl_text1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_text1.setForeground(new java.awt.Color(149, 177, 246));
        lbl_text1.setText("Editar perfil");
        lbl_text1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_text1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_editarLayout = new javax.swing.GroupLayout(jp_editar);
        jp_editar.setLayout(jp_editarLayout);
        jp_editarLayout.setHorizontalGroup(
            jp_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_editarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_text1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
        jp_editarLayout.setVerticalGroup(
            jp_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_text1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(jp_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 410, 40));

        jp_elimiar.setBackground(new java.awt.Color(51, 120, 173));
        jp_elimiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149, 177, 246), 2));

        lbl_text2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_text2.setForeground(new java.awt.Color(149, 177, 246));
        lbl_text2.setText("Eliminar usuario");
        lbl_text2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_text2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_elimiarLayout = new javax.swing.GroupLayout(jp_elimiar);
        jp_elimiar.setLayout(jp_elimiarLayout);
        jp_elimiarLayout.setHorizontalGroup(
            jp_elimiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_elimiarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_text2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
        jp_elimiarLayout.setVerticalGroup(
            jp_elimiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_text2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(jp_elimiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 410, 40));

        jp_agregar.setBackground(new java.awt.Color(51, 120, 173));
        jp_agregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149, 177, 246), 2));

        lbl_text3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_text3.setForeground(new java.awt.Color(149, 177, 246));
        lbl_text3.setText("Agregar usuario");
        lbl_text3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_text3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_agregarLayout = new javax.swing.GroupLayout(jp_agregar);
        jp_agregar.setLayout(jp_agregarLayout);
        jp_agregarLayout.setHorizontalGroup(
            jp_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_agregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_text3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
        jp_agregarLayout.setVerticalGroup(
            jp_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_text3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(jp_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 410, 40));

        jp_ver.setBackground(new java.awt.Color(51, 120, 173));
        jp_ver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149, 177, 246), 2));

        lbl_text4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_text4.setForeground(new java.awt.Color(149, 177, 246));
        lbl_text4.setText("Ver usuarios");
        lbl_text4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_text4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_verLayout = new javax.swing.GroupLayout(jp_ver);
        jp_ver.setLayout(jp_verLayout);
        jp_verLayout.setHorizontalGroup(
            jp_verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_verLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_text4, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
        jp_verLayout.setVerticalGroup(
            jp_verLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_text4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(jp_ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 410, 40));

        jp_condiciones.setBackground(new java.awt.Color(51, 120, 173));
        jp_condiciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149, 177, 246), 2));

        lbl_condiciones.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_condiciones.setForeground(new java.awt.Color(149, 177, 246));
        lbl_condiciones.setText("Condiciones de servicios");

        javax.swing.GroupLayout jp_condicionesLayout = new javax.swing.GroupLayout(jp_condiciones);
        jp_condiciones.setLayout(jp_condicionesLayout);
        jp_condicionesLayout.setHorizontalGroup(
            jp_condicionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_condicionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_condiciones, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
        jp_condicionesLayout.setVerticalGroup(
            jp_condicionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_condiciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(jp_condiciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 410, 40));

        icon_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/iconPerfilGrande.png"))); // NOI18N
        jPanel1.add(icon_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        icon_salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/iconSalir.png"))); // NOI18N
        jPanel1.add(icon_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 50, 50));

        icon_volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/iconVolver.png"))); // NOI18N
        icon_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_volverMouseClicked(evt);
            }
        });
        jPanel1.add(icon_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 50, 50));

        lbl_usuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(149, 177, 246));
        lbl_usuario.setText("Nombre del Usuario");
        jPanel1.add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 220, -1));

        lbl_usuario1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_usuario1.setForeground(new java.awt.Color(149, 177, 246));
        lbl_usuario1.setText("Usuario:");
        jPanel1.add(lbl_usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        lbl_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_id.setForeground(new java.awt.Color(149, 177, 246));
        lbl_id.setText("123456789");
        jPanel1.add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 220, -1));

        lbl_id1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_id1.setForeground(new java.awt.Color(149, 177, 246));
        lbl_id1.setText("Id         :");
        jPanel1.add(lbl_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        lbl_correo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_correo.setForeground(new java.awt.Color(149, 177, 246));
        lbl_correo.setText("correo@gmail.com");
        jPanel1.add(lbl_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 220, -1));

        lbl_correo1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_correo1.setForeground(new java.awt.Color(149, 177, 246));
        lbl_correo1.setText("Correo  :");
        jPanel1.add(lbl_correo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        lbl_cirPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/CirCelesteGrande.png"))); // NOI18N
        jPanel1.add(lbl_cirPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        lbl_cuaSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/CuaCeleste.png"))); // NOI18N
        jPanel1.add(lbl_cuaSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        lbl_cuaVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/CuaCeleste.png"))); // NOI18N
        jPanel1.add(lbl_cuaVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        lbl_fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Fondo2.png"))); // NOI18N
        jPanel1.add(lbl_fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 430, 460));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/fondo.png"))); // NOI18N
        jPanel1.add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void icon_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_volverMouseClicked
        ventanaAnt.actualizarLista();
        ventanaAnt.setLocationRelativeTo(this);
        ventanaAnt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_icon_volverMouseClicked

    private void lbl_text1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_text1MouseClicked
        EditarPerfil editarPerfil = new EditarPerfil(usuarioEnUso, this);
        editarPerfil.setLocationRelativeTo(this);
        editarPerfil.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_lbl_text1MouseClicked

    private void lbl_text2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_text2MouseClicked
        String texto = lbl_text2.getText();
        if ("Comentarios".equals(texto)) {
            Comentario ventana = new Comentario("COMENTARIO", 
                    "¡¡¡Escribe tu comentario, tendremos", 
                    "en cuenta tu sugerencia!!!", this, usuarioEnUso);
            ventana.setLocationRelativeTo(this);
            ventana.setVisible(true);
            this.setVisible(false);
        } else if("Eliminar usuario".equals(texto)){
            VerUsuarios verUsuarios = new VerUsuarios();
            verUsuarios.setLocationRelativeTo(this);
            verUsuarios.setVisible(true);
            this.setVisible(false); 
        }
    }//GEN-LAST:event_lbl_text2MouseClicked

    private void lbl_text3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_text3MouseClicked
        String texto = lbl_text3.getText();
        if ("Reclamos".equals(texto)) {
            Comentario ventana = new Comentario("RECLAMO", 
                    "¡¡¡Escribe tu comentario, tendremos ", 
                    "en cuenta tu reclamo!!!", this, usuarioEnUso);
            ventana.setLocationRelativeTo(this);
            ventana.setVisible(true);
            this.setVisible(false);
        } else if("Agregar usuarios".equals(texto)){
            VerUsuarios verUsuarios = new VerUsuarios();
            verUsuarios.setLocationRelativeTo(this);
            verUsuarios.setVisible(true);
            this.setVisible(false); 
        }
    }//GEN-LAST:event_lbl_text3MouseClicked

    private void lbl_text4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_text4MouseClicked
        String texto = lbl_text4.getText();
        if ("Ayuda".equals(texto)) {
            Comentario ventana = new Comentario("AYUDA", 
                    "¡¡¡Escribe tu comentario, te", 
                    "ayudaremos lo antes posible!!!", this, usuarioEnUso);
            ventana.setLocationRelativeTo(this);
            ventana.setVisible(true);
            this.setVisible(false);
        } else if("Ver usuarios".equals(texto)){
            VerUsuarios verUsuarios = new VerUsuarios();
            verUsuarios.setLocationRelativeTo(this);
            verUsuarios.setVisible(true);
            this.setVisible(false); 
        }
    }//GEN-LAST:event_lbl_text4MouseClicked

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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon_perfil;
    private javax.swing.JLabel icon_salir;
    private javax.swing.JLabel icon_volver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jp_agregar;
    private javax.swing.JPanel jp_condiciones;
    private javax.swing.JPanel jp_editar;
    private javax.swing.JPanel jp_elimiar;
    private javax.swing.JPanel jp_ver;
    private javax.swing.JLabel lbl_cirPerfil;
    private javax.swing.JLabel lbl_condiciones;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_correo1;
    private javax.swing.JLabel lbl_cuaSalir;
    private javax.swing.JLabel lbl_cuaVolver;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_fondo2;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_id1;
    private javax.swing.JLabel lbl_text1;
    private javax.swing.JLabel lbl_text2;
    private javax.swing.JLabel lbl_text3;
    private javax.swing.JLabel lbl_text4;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JLabel lbl_usuario1;
    // End of variables declaration//GEN-END:variables
}
