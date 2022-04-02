/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import Clases.*;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Daniel
 */
public class JFrameBuscarProducto extends javax.swing.JFrame {

    
    public JFrameBuscarProducto(Logic l) {
        this.l=l;
        initComponents();
        ImageIcon imagen=new ImageIcon(l.getImagen());
        Icon icono =new ImageIcon(imagen.getImage().getScaledInstance(iconoJavaPop.getWidth(),iconoJavaPop.getHeight(),Image.SCALE_DEFAULT));
        iconoJavaPop.setIcon(icono);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTituloProducto = new javax.swing.JTextField();
        jButtonBuscarProducto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        iconoJavaPop = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moda y Accesorios", "TV,audio y foto", "Móviles y telefonía ", "Informática y electrónica ", "Consolas y videojuegos ", "Deporte y ocio" }));
        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });

        jLabel3.setText("Tags:");

        jTextFieldTituloProducto.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextFieldTituloProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTituloProductoActionPerformed(evt);
            }
        });

        jButtonBuscarProducto.setText("Buscar Producto");
        jButtonBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarProductoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("BÚSQUEDA DE PRODUCTO");

        jLabel1.setText("Categoría:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonBuscarProducto)
                        .addGap(156, 156, 156))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTituloProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconoJavaPop, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconoJavaPop, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTituloProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButtonBuscarProducto)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarProductoActionPerformed
        int categoria=1;
        try{
            categoria=jComboBoxCategoria.getSelectedIndex()+1;
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"No has seleccionado ninguna categoria. ","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        String cat="";
        
        
        switch(categoria){
            case 1:
                cat="Moda y accesorios";
                break;
            case 2:
                cat="TV, audio y foto";
                break;
            case 3:
                cat="Móviles y telefonía";
                break;
            case 4:
                cat="Informática y electrónica";
                break;
            case 5:
                cat="Consolas y videojuegos";
                break;
            case 6:
                cat="Deporte y ocio";
                break;
        }
      
        
        String titulo=jTextFieldTituloProducto.getText().toLowerCase();
        l.buscarProducto(cat,titulo);
        
        if(!(l.getMuyProximos().isEmpty()&&l.getProximos().isEmpty()&&l.getNoProximos().isEmpty())){
            
            JFrameResultado ventanaResultadoBusqueda=new JFrameResultado(l);
            ventanaResultadoBusqueda.setLocationRelativeTo(null);
            ventanaResultadoBusqueda.setVisible(true); 
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(this,"No hay ningun producto con los valores introducidos. ","Mensaje",JOptionPane.INFORMATION_MESSAGE);
            dispose();
            JFrameMenuUsuario nuevoMenu= new JFrameMenuUsuario(l);
            nuevoMenu.setLocationRelativeTo(null);
            nuevoMenu.setVisible(true);
            
        }
        
    }//GEN-LAST:event_jButtonBuscarProductoActionPerformed

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed

    private void jTextFieldTituloProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTituloProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTituloProductoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconoJavaPop;
    private javax.swing.JButton jButtonBuscarProducto;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFieldTituloProducto;
    // End of variables declaration//GEN-END:variables
    private Logic l;
    private ArrayList<ArrayList<Producto>> productosOrdenados;
   
}
