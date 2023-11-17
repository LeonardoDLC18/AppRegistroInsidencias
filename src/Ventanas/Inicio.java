/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import appregistroincidencias.Usuario;

/**
 *
 * @author USER
 */
public class Inicio extends javax.swing.JFrame {
    private Usuario usuarioEnUso;

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();       
    }
    
    public Inicio(Usuario usuario) {
        initComponents();  
        usuarioEnUso = usuario;
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
        icon_filtros = new javax.swing.JLabel();
        icon_registro = new javax.swing.JLabel();
        icon_eliminar = new javax.swing.JLabel();
        icon_ver = new javax.swing.JLabel();
        icon_editar = new javax.swing.JLabel();
        icon_generar = new javax.swing.JLabel();
        icon_perfil = new javax.swing.JLabel();
        lbl_resueltos = new javax.swing.JLabel();
        lbl_sinIniciar = new javax.swing.JLabel();
        lbl_iniciados = new javax.swing.JLabel();
        lbl_cuaReporte = new javax.swing.JLabel();
        lbl_cuaEliminar = new javax.swing.JLabel();
        lbl_cuaVer = new javax.swing.JLabel();
        lbl_cuaEditar = new javax.swing.JLabel();
        lbl_cuaGenerar = new javax.swing.JLabel();
        lbl_cuaFiltros = new javax.swing.JLabel();
        lbl_recResueltos = new javax.swing.JLabel();
        lbl_recSinIniciar = new javax.swing.JLabel();
        lbl_recIniciados = new javax.swing.JLabel();
        lbl_cirPerfil = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_listaMostrando = new javax.swing.JList<>();
        lbl_fondo2 = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_filtros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_filtros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/iconFiltros.png"))); // NOI18N
        jPanel1.add(icon_filtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 50, 50));

        icon_registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/iconRegistro.png"))); // NOI18N
        jPanel1.add(icon_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 50, 50));

        icon_eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/iconEliminar.png"))); // NOI18N
        jPanel1.add(icon_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 50, 50));

        icon_ver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/iconVer.png"))); // NOI18N
        jPanel1.add(icon_ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 50, 50));

        icon_editar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/iconEditar.png"))); // NOI18N
        jPanel1.add(icon_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 50, 50));

        icon_generar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_generar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/iconGenerar.png"))); // NOI18N
        jPanel1.add(icon_generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 50, 50));

        icon_perfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/iconPerfil.png"))); // NOI18N
        icon_perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_perfilMouseClicked(evt);
            }
        });
        jPanel1.add(icon_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 50, 50));

        lbl_resueltos.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl_resueltos.setForeground(new java.awt.Color(255, 255, 255));
        lbl_resueltos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_resueltos.setText("Resueltos");
        jPanel1.add(lbl_resueltos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 110, 50));

        lbl_sinIniciar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl_sinIniciar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sinIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sinIniciar.setText("Sin Iniciar");
        jPanel1.add(lbl_sinIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 100, 50));

        lbl_iniciados.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl_iniciados.setForeground(new java.awt.Color(255, 255, 255));
        lbl_iniciados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_iniciados.setText("Iniciados");
        jPanel1.add(lbl_iniciados, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 100, 50));

        lbl_cuaReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/CuaCeleste.png"))); // NOI18N
        jPanel1.add(lbl_cuaReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        lbl_cuaEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/CuaCeleste.png"))); // NOI18N
        jPanel1.add(lbl_cuaEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        lbl_cuaVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/CuaCeleste.png"))); // NOI18N
        jPanel1.add(lbl_cuaVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        lbl_cuaEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/CuaCeleste.png"))); // NOI18N
        jPanel1.add(lbl_cuaEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, -1));

        lbl_cuaGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/CuaCeleste.png"))); // NOI18N
        jPanel1.add(lbl_cuaGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        lbl_cuaFiltros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_cuaFiltros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/CuaFiltroCeleste.png"))); // NOI18N
        jPanel1.add(lbl_cuaFiltros, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 120, -1, -1));

        lbl_recResueltos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/RecEsquinaDerCeleste.png"))); // NOI18N
        jPanel1.add(lbl_recResueltos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        lbl_recSinIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/RecCentroCeleste.png"))); // NOI18N
        jPanel1.add(lbl_recSinIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 110, -1));

        lbl_recIniciados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/RecEsquinaIzqCelesteO.png"))); // NOI18N
        jPanel1.add(lbl_recIniciados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        lbl_cirPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/CirCeleste.png"))); // NOI18N
        jPanel1.add(lbl_cirPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        lst_listaMostrando.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lst_listaMostrando.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lst_listaMostrando.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lst_listaMostrando);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 390, 210));

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

    private void icon_perfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_perfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_icon_perfilMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon_editar;
    private javax.swing.JLabel icon_eliminar;
    private javax.swing.JLabel icon_filtros;
    private javax.swing.JLabel icon_generar;
    private javax.swing.JLabel icon_perfil;
    private javax.swing.JLabel icon_registro;
    private javax.swing.JLabel icon_ver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_cirPerfil;
    private javax.swing.JLabel lbl_cuaEditar;
    private javax.swing.JLabel lbl_cuaEliminar;
    private javax.swing.JLabel lbl_cuaFiltros;
    private javax.swing.JLabel lbl_cuaGenerar;
    private javax.swing.JLabel lbl_cuaReporte;
    private javax.swing.JLabel lbl_cuaVer;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_fondo2;
    private javax.swing.JLabel lbl_iniciados;
    private javax.swing.JLabel lbl_recIniciados;
    private javax.swing.JLabel lbl_recResueltos;
    private javax.swing.JLabel lbl_recSinIniciar;
    private javax.swing.JLabel lbl_resueltos;
    private javax.swing.JLabel lbl_sinIniciar;
    private javax.swing.JList<String> lst_listaMostrando;
    // End of variables declaration//GEN-END:variables
}
