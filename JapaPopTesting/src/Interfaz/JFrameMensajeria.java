/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.*;
import GeneradorWord.Word;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class JFrameMensajeria extends javax.swing.JFrame {

    public JFrameMensajeria(Logic l) {
        this.l = l;
        initComponents();
        
        ImageIcon imagen=new ImageIcon(l.getImagen());
        Icon icono =new ImageIcon(imagen.getImage().getScaledInstance(iconoJavaPop.getWidth(),iconoJavaPop.getHeight(),Image.SCALE_DEFAULT));
        iconoJavaPop.setIcon(icono);
        añadirProductos();
        añadirMensajes();
    }

    public void añadirProductos() {

        

        for (Producto p : l.getClienteActual().getProductos()) {
            if (p.getPosibleComprador() != null) {
                dlm1.addElement(p);
            }
        }

        jListProductosSolicitados.setModel(dlm1);
    }

    public void añadirMensajes() {
        
        ArrayList<Mensaje> mensajes = l.getClienteActual().getMensajes();

        if (!mensajes.isEmpty()) {

            for (Mensaje m : mensajes) {
                dlm.addElement(m);
            }
        }

        jListOtrosMensajes.setModel(dlm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProductosSolicitados = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButtonVender = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldEstado = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListOtrosMensajes = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaMensaje = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jButtonVerProducto = new javax.swing.JButton();
        jButtonVerMensaje = new javax.swing.JButton();
        jButtonBorrarMensaje = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldComprador = new javax.swing.JTextField();
        jButtonVolver = new javax.swing.JButton();
        imagenLabel = new javax.swing.JLabel();
        iconoJavaPop = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jListProductosSolicitados);

        jLabel1.setText("Productos solicitados:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Mensajería");

        jLabel10.setText("€");

        jButtonVender.setText("Vender producto");
        jButtonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVenderActionPerformed(evt);
            }
        });

        jLabel7.setText("Descripción:");

        jLabel4.setText("Titulo:");

        jLabel5.setText("Precio:");

        jLabel8.setText("Estado:");

        jTextFieldTitulo.setEditable(false);
        jTextFieldTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTituloActionPerformed(evt);
            }
        });

        jTextFieldEstado.setEditable(false);

        jTextFieldPrecio.setEditable(false);

        jTextAreaDescripcion.setEditable(false);
        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setRows(5);
        jScrollPane4.setViewportView(jTextAreaDescripcion);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("PRODUCTO:");

        jScrollPane3.setViewportView(jListOtrosMensajes);

        jLabel3.setText("Otros mensajes:");

        jTextAreaMensaje.setColumns(20);
        jTextAreaMensaje.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextAreaMensaje.setRows(5);
        jScrollPane5.setViewportView(jTextAreaMensaje);

        jLabel9.setText("Mensaje:");

        jButtonVerProducto.setText("Ver producto");
        jButtonVerProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerProductoActionPerformed(evt);
            }
        });

        jButtonVerMensaje.setText("Ver mensaje");
        jButtonVerMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerMensajeActionPerformed(evt);
            }
        });

        jButtonBorrarMensaje.setText("Borrar Mensaje");
        jButtonBorrarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarMensajeActionPerformed(evt);
            }
        });

        jLabel12.setText("Comprador:");

        jTextFieldComprador.setEditable(false);
        jTextFieldComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCompradorActionPerformed(evt);
            }
        });

        jButtonVolver.setText("Volver al menú");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        imagenLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\Documents\\NetBeansProjects\\JavaPopPRUEBAS\\images\\sinimagen.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonVerProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jButtonVender))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(33, 33, 33))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel5))
                                                .addGap(26, 26, 26)))
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(imagenLabel)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButtonVerMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButtonBorrarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconoJavaPop, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconoJavaPop, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonVerMensaje)
                            .addComponent(jButtonBorrarMensaje))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(61, 61, 61)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonVerProducto))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel1))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel4)
                                                .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(6, 6, 6)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(29, 29, 29)
                                                    .addComponent(jLabel5)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel12)
                                                .addComponent(jTextFieldComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel10))
                                            .addGap(26, 26, 26)))
                                    .addGap(22, 22, 22)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(imagenLabel))
                            .addGap(18, 18, 18)
                            .addComponent(jButtonVender))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVenderActionPerformed

        try {
            Producto p = jListProductosSolicitados.getSelectedValue();
            dlm1.removeElement(p);
            l.comprarProducto(p);
            
            JOptionPane.showMessageDialog(this, "El producto ha sido comprado ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldEstado.setText("");
            jTextFieldPrecio.setText("");
            jTextFieldTitulo.setText("");
            jTextAreaDescripcion.setText("");
            jTextFieldComprador.setText("");
            ImageIcon imagen=new ImageIcon(p.getSinImagen());
            Icon icono =new ImageIcon(imagen.getImage().getScaledInstance(imagenLabel.getWidth(),imagenLabel.getHeight(),Image.SCALE_DEFAULT));
            imagenLabel.setIcon(icono);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No has seleccionado ningun producto ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }


    }//GEN-LAST:event_jButtonVenderActionPerformed

    private void jTextFieldTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTituloActionPerformed
      
    }//GEN-LAST:event_jTextFieldTituloActionPerformed

    private void jButtonVerProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerProductoActionPerformed
        try {
            Producto p = jListProductosSolicitados.getSelectedValue();
            jTextFieldEstado.setText(p.getEstado());
            jTextFieldPrecio.setText(String.valueOf(p.getPrecioVenta()));
            jTextFieldTitulo.setText(p.getTitulo().toString());
            jTextAreaDescripcion.setText(p.getDescripcion());
            jTextFieldComprador.setText(p.getPosibleComprador().getNombre());
            ImageIcon imagen=new ImageIcon(p.getFotografia());
            Icon icono =new ImageIcon(imagen.getImage().getScaledInstance(imagenLabel.getWidth(),imagenLabel.getHeight(),Image.SCALE_DEFAULT));
            imagenLabel.setIcon(icono);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No has seleccionado ningun producto ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_jButtonVerProductoActionPerformed

    private void jButtonVerMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerMensajeActionPerformed
        try {
            Mensaje m = jListOtrosMensajes.getSelectedValue();
            jTextAreaMensaje.setText(m.getContenido());
            if(m.getTituloMensaje().matches("Nueva compra")){
                JOptionPane.showMessageDialog(this, "Imprimiendo factura. Seleccione el directorio donde desee guardarla.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                Word word=new Word(m.getProducto());
                word.crear();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No hay ningun mensaje seleccionado ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButtonVerMensajeActionPerformed

    private void jTextFieldCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCompradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCompradorActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        dispose();
        JFrameMenuUsuario nuevoMenu = new JFrameMenuUsuario(l);
        nuevoMenu.setLocationRelativeTo(null);
        nuevoMenu.setVisible(true);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonBorrarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarMensajeActionPerformed
        try {
            Mensaje m = jListOtrosMensajes.getSelectedValue();
            dlm.removeElement(m);
            jTextAreaMensaje.setText("");
            jTextAreaDescripcion.setText("");
            l.getClienteActual().getMensajes().remove(m);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No hay ningun mensaje seleccionado ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonBorrarMensajeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconoJavaPop;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JButton jButtonBorrarMensaje;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JButton jButtonVerMensaje;
    private javax.swing.JButton jButtonVerProducto;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<Mensaje> jListOtrosMensajes;
    private javax.swing.JList<Producto> jListProductosSolicitados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextArea jTextAreaMensaje;
    private javax.swing.JTextField jTextFieldComprador;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
    private Logic l;
    DefaultListModel<Mensaje> dlm = new DefaultListModel();
    DefaultListModel<Producto> dlm1 = new DefaultListModel();}
