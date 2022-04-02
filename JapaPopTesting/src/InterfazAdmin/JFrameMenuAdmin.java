/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazAdmin;
import Clases.*;
import Interfaz.JFrameInicio;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class JFrameMenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMenuAdmin
     */
    public JFrameMenuAdmin(Logic l) {
        initComponents();
        this.l=l;
        ImageIcon imagen=new ImageIcon(l.getImagen());
        Icon icono =new ImageIcon(imagen.getImage().getScaledInstance(iconoJavaPop.getWidth(),iconoJavaPop.getHeight(),Image.SCALE_DEFAULT));
        iconoJavaPop.setIcon(icono);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonListaDeProducto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonVerListaClientes = new javax.swing.JButton();
        jButtonProductosVendidos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        iconoJavaPop = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonListaDeProducto.setText("Ver lista de productos");
        jButtonListaDeProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaDeProductoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Menú Admin");

        jButtonVerListaClientes.setText("Ver lista clientes");
        jButtonVerListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerListaClientesActionPerformed(evt);
            }
        });

        jButtonProductosVendidos.setText("Ver lista productos vendidos");
        jButtonProductosVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductosVendidosActionPerformed(evt);
            }
        });

        jButton1.setText("Volver Iniciar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButtonVerListaClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonListaDeProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonProductosVendidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(iconoJavaPop, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(iconoJavaPop, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButtonVerListaClientes)
                .addGap(32, 32, 32)
                .addComponent(jButtonListaDeProducto)
                .addGap(32, 32, 32)
                .addComponent(jButtonProductosVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListaDeProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaDeProductoActionPerformed
        dispose();
        JFrameListaProductos ventanaListaProducto=new JFrameListaProductos(l);
        ventanaListaProducto.setLocationRelativeTo(null);
        ventanaListaProducto.setVisible(true);
    }//GEN-LAST:event_jButtonListaDeProductoActionPerformed

    private void jButtonVerListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerListaClientesActionPerformed
        dispose();
        JFrameListaClientes ventanaCliente =new JFrameListaClientes(l);
        ventanaCliente.setLocationRelativeTo(null);
        ventanaCliente.setVisible(true);
    }//GEN-LAST:event_jButtonVerListaClientesActionPerformed

    private void jButtonProductosVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductosVendidosActionPerformed
        dispose();
        JFrameListaProductosVendidos ventanaListaProductoVendido= new JFrameListaProductosVendidos(l);
        ventanaListaProductoVendido.setLocationRelativeTo(null);
        ventanaListaProductoVendido.setVisible(true);
    }//GEN-LAST:event_jButtonProductosVendidosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        JFrameInicio inicioApp =new JFrameInicio(l); 
        inicioApp.setLocationRelativeTo(null);
        inicioApp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconoJavaPop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonListaDeProducto;
    private javax.swing.JButton jButtonProductosVendidos;
    private javax.swing.JButton jButtonVerListaClientes;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    private Logic l;
}
