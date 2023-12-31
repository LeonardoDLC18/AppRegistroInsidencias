/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import appregistroincidencias.ConexionDB;
import appregistroincidencias.Registro;
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
public class RegistroDeReporte extends javax.swing.JFrame {

    private boolean editando;
    private Registro registroEditar;
    private Inicio ventanaAnt;
    private Usuario usuarioUsando;
    
    /**
     * Creates new form Inicio
     */
    public RegistroDeReporte() {
        initComponents();  
        editando = false;
        
    }
    public RegistroDeReporte(Usuario usuario, Inicio ventanaAnt) {
        initComponents();  
        editando = false;
        this.ventanaAnt = ventanaAnt;
        usuarioUsando = usuario;
    }
    
    public RegistroDeReporte(Registro registro, Inicio ventanaAnt) {
        initComponents();  
        editando = false;
        this.ventanaAnt = ventanaAnt;
        
        registroEditar = registro;
        
        txt_titulo.setText(registroEditar.getTitulo());
        txt_descripcion.setText(registroEditar.getDescripcion());        
        cb_categoria.setSelectedItem(registroEditar.getCategoria());
        cb_estado.setSelectedItem(registroEditar.getEstado());
        cb_prioridad.setSelectedItem(registroEditar.getPrioridad());
        icon_guardar.setVisible(false);
        lbl_cuaGuardar.setVisible(false);
    }
    
    public RegistroDeReporte(Usuario usuario, Registro registro, Inicio ventanaAnt) {
        initComponents();  
        usuarioUsando = usuario;
        this.ventanaAnt = ventanaAnt;
        registroEditar = registro;
        
        
        editando = true;
        txt_titulo.setText(registroEditar.getTitulo());
        txt_descripcion.setText(registroEditar.getDescripcion());        
        cb_categoria.setSelectedItem(registroEditar.getCategoria());
        cb_estado.setSelectedItem(registroEditar.getEstado());
        cb_prioridad.setSelectedItem(registroEditar.getPrioridad());            
        
        
        
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextArea();
        txt_titulo = new javax.swing.JTextField();
        cb_estado = new javax.swing.JComboBox<>();
        cb_categoria = new javax.swing.JComboBox<>();
        cb_prioridad = new javax.swing.JComboBox<>();
        icon_guardar = new javax.swing.JLabel();
        icon_volver = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_tituloReporte = new javax.swing.JLabel();
        lbl_involucrado1 = new javax.swing.JLabel();
        lbl_prioridad = new javax.swing.JLabel();
        lbl_categoria = new javax.swing.JLabel();
        lbl_descripcion = new javax.swing.JLabel();
        lbl_cuaGuardar = new javax.swing.JLabel();
        lbl_cuaVolver = new javax.swing.JLabel();
        lbl_fondo2 = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setWheelScrollingEnabled(false);

        txt_descripcion.setColumns(10);
        txt_descripcion.setLineWrap(true);
        txt_descripcion.setRows(5);
        txt_descripcion.setAutoscrolls(false);
        jScrollPane1.setViewportView(txt_descripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 410, 100));

        txt_titulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_titulo.setForeground(new java.awt.Color(128, 173, 216));
        txt_titulo.setText("Titulo del registro...");
        jPanel1.add(txt_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 410, 40));

        cb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin iniciar", "En proceso", "Resuelto", " " }));
        jPanel1.add(cb_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 90, -1));

        cb_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pelea", "Caida", "Discusion", "Broma", "Escape" }));
        jPanel1.add(cb_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 90, -1));

        cb_prioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jPanel1.add(cb_prioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 90, -1));

        icon_guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/iconGuardar.png"))); // NOI18N
        icon_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_guardarMouseClicked(evt);
            }
        });
        jPanel1.add(icon_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 50, 50));

        icon_volver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/iconVolver.png"))); // NOI18N
        icon_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_volverMouseClicked(evt);
            }
        });
        jPanel1.add(icon_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 50, 50));

        lbl_titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(128, 173, 216));
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("REGISTRO DEL REPORTE");
        jPanel1.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 430, -1));

        lbl_tituloReporte.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_tituloReporte.setForeground(new java.awt.Color(149, 177, 246));
        lbl_tituloReporte.setText("Titulo");
        jPanel1.add(lbl_tituloReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 410, 36));

        lbl_involucrado1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_involucrado1.setForeground(new java.awt.Color(149, 177, 246));
        lbl_involucrado1.setText("Estado");
        jPanel1.add(lbl_involucrado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, 40));

        lbl_prioridad.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_prioridad.setForeground(new java.awt.Color(149, 177, 246));
        lbl_prioridad.setText("Prioridad");
        jPanel1.add(lbl_prioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 90, 36));

        lbl_categoria.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_categoria.setForeground(new java.awt.Color(149, 177, 246));
        lbl_categoria.setText("Categoría");
        jPanel1.add(lbl_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, 36));

        lbl_descripcion.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_descripcion.setForeground(new java.awt.Color(149, 177, 246));
        lbl_descripcion.setText("Descripción");
        jPanel1.add(lbl_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 410, 36));

        lbl_cuaGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/CuaCeleste.png"))); // NOI18N
        jPanel1.add(lbl_cuaGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

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

    private void icon_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_guardarMouseClicked
        String titulo = txt_titulo.getText();
        String descripcion = txt_descripcion.getText();
        String categoria = (String) cb_categoria.getSelectedItem();
        String estado = (String) cb_estado.getSelectedItem();
        String prioridad = (String) cb_prioridad.getSelectedItem();
        int id_usuario = usuarioUsando.getId_usuario();
            
        if (!editando) {
            ConexionDB cx = new ConexionDB();             
            try {            
                String consulta = "insert into registros (id_usuario, titulo, descripcion, categoria, estado, prioridad)" 
                        + "values ('" + id_usuario + "', '" + titulo + "', '" + descripcion + "', '" + categoria + 
                        "', '" + estado + "', '" + prioridad + "')";
                Statement st = cx.conectar().createStatement();
                int filasAfectadas = st.executeUpdate(consulta);
                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(this, 
                                "El registro SI ha sido agregado en la DB");             
                } else {
                    JOptionPane.showMessageDialog(this, 
                                "El registro NO ha sido agregado en la DB");
                }            
            } catch (SQLException ex) {
                Logger.getLogger(RegistroDeReporte.class.getName()).
                        log(Level.SEVERE, null, ex);
            } 
            cx.desconectar();
        } else{
            ConexionDB cx = new ConexionDB();  
            try { 
                String consulta = "update registros set titulo = '" + titulo + 
                    "', descripcion = '" + descripcion + "', categoria = '" + 
                    categoria + "', estado = '" + estado + "', prioridad = '" +
                    prioridad + "' where id_registro = " + registroEditar.getId_registro();
            
                Statement st = cx.conectar().createStatement();
                int filasAfectadas = st.executeUpdate(consulta);
                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(this, 
                                "El registro ha sido actualizado en la DB");             
                } else {
                    JOptionPane.showMessageDialog(this, 
                                "El registro NO ha sido actualizado en la DB");
                }    
            } catch (SQLException ex) {
                Logger.getLogger(RegistroDeReporte.class.getName()).
                        log(Level.SEVERE, null, ex);
            } 
            cx.desconectar();
        }       
    }//GEN-LAST:event_icon_guardarMouseClicked

    private void icon_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_volverMouseClicked
        ventanaAnt.actualizarLista("Todos");
        ventanaAnt.setLocationRelativeTo(this);
        ventanaAnt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_icon_volverMouseClicked

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
            java.util.logging.Logger.getLogger(RegistroDeReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RegistroDeReporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_categoria;
    private javax.swing.JComboBox<String> cb_estado;
    private javax.swing.JComboBox<String> cb_prioridad;
    private javax.swing.JLabel icon_guardar;
    private javax.swing.JLabel icon_volver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_categoria;
    private javax.swing.JLabel lbl_cuaGuardar;
    private javax.swing.JLabel lbl_cuaVolver;
    private javax.swing.JLabel lbl_descripcion;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_fondo2;
    private javax.swing.JLabel lbl_involucrado1;
    private javax.swing.JLabel lbl_prioridad;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_tituloReporte;
    private javax.swing.JTextArea txt_descripcion;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
