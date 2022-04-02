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
public class JFrameMenuUsuario extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMenuUsuario
     */
    public JFrameMenuUsuario(Logic l) {
        initComponents();
        this.l=l;
        ImageIcon imagen=new ImageIcon(l.getImagen());
        Icon icono =new ImageIcon(imagen.getImage().getScaledInstance(iconoJavaPop.getWidth(),iconoJavaPop.getHeight(),Image.SCALE_DEFAULT));
        iconoJavaPop.setIcon(icono);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonCambiarDatos = new javax.swing.JButton();
        jButtonPagarModificarDatos = new javax.swing.JButton();
        jButtonNuevoProducto = new javax.swing.JButton();
        jButtonBajaProducto = new javax.swing.JButton();
        jButtonBuscarProducto = new javax.swing.JButton();
        jButtonComprarProducto = new javax.swing.JButton();
        jButtonVolverLogin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonMensajeria = new javax.swing.JButton();
        iconoJavaPop = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Menú Usuario");

        jButtonCambiarDatos.setText("Cambiar datos ");
        jButtonCambiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiarDatosActionPerformed(evt);
            }
        });

        jButtonPagarModificarDatos.setText("Pago cliente profesional");
        jButtonPagarModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagarModificarDatosActionPerformed(evt);
            }
        });

        jButtonNuevoProducto.setText("Alta de nuevo producto");
        jButtonNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoProductoActionPerformed(evt);
            }
        });

        jButtonBajaProducto.setText("Baja de producto");
        jButtonBajaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajaProductoActionPerformed(evt);
            }
        });

        jButtonBuscarProducto.setText("Búsqueda producto");
        jButtonBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarProductoActionPerformed(evt);
            }
        });

        jButtonComprarProducto.setText("Comprar producto");
        jButtonComprarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarProductoActionPerformed(evt);
            }
        });

        jButtonVolverLogin.setText("Volver Iniciar Sesion");
        jButtonVolverLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverLoginActionPerformed(evt);
            }
        });

        jPanel1.setLayout(null);

        jButtonMensajeria.setText("Mensajería");
        jButtonMensajeria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMensajeriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCambiarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBajaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonComprarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                            .addComponent(jButtonPagarModificarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                            .addComponent(jButtonVolverLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                            .addComponent(jButtonMensajeria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(jLabel1)
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(iconoJavaPop, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iconoJavaPop, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCambiarDatos)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonBuscarProducto)
                            .addComponent(jButtonComprarProducto))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNuevoProducto)
                            .addComponent(jButtonMensajeria)))
                    .addComponent(jButtonPagarModificarDatos))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBajaProducto)
                    .addComponent(jButtonVolverLogin))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCambiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiarDatosActionPerformed
        dispose();
        if(l.getClienteActual().esProfesional()){
            JFrameCambioDatosPro ventanaCambioPro =new JFrameCambioDatosPro(l);
            ventanaCambioPro.setLocationRelativeTo(null);
            ventanaCambioPro.setVisible(true);
        }else{
            JFrameCambioDatos ventanaCambio =new JFrameCambioDatos(l);
            ventanaCambio.setLocationRelativeTo(null);
            ventanaCambio.setVisible(true);
        }
        
    }//GEN-LAST:event_jButtonCambiarDatosActionPerformed

    private void jButtonNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoProductoActionPerformed
        dispose();
        JFrameAltaProducto ventanaNuevoProducto= new JFrameAltaProducto(l);
        ventanaNuevoProducto.setLocationRelativeTo(null);
        ventanaNuevoProducto.setVisible(true);
    }//GEN-LAST:event_jButtonNuevoProductoActionPerformed

    private void jButtonBajaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaProductoActionPerformed
        dispose();
        JFrameBajaProducto ventanaBorrarProducto=new JFrameBajaProducto(l);
        ventanaBorrarProducto.setLocationRelativeTo(null);
        ventanaBorrarProducto.setVisible(true);
    }//GEN-LAST:event_jButtonBajaProductoActionPerformed

    private void jButtonBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarProductoActionPerformed
        dispose();
        JFrameBuscarProducto ventanaBuscarProducto=new JFrameBuscarProducto(l);
        ventanaBuscarProducto.setLocationRelativeTo(null);
        ventanaBuscarProducto.setVisible(true);       
    }//GEN-LAST:event_jButtonBuscarProductoActionPerformed

    private void jButtonPagarModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagarModificarDatosActionPerformed
        if(l.getClienteActual().esProfesional()){
            JOptionPane.showMessageDialog(this,"Actualmente ya eres cliente profesional","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }else{
            dispose();
            JFrameConvertirProfesional nuevoProfesional=new JFrameConvertirProfesional(l);
            nuevoProfesional.setLocationRelativeTo(null);
            nuevoProfesional.setVisible(true);
        }
        
    }//GEN-LAST:event_jButtonPagarModificarDatosActionPerformed

    private void jButtonComprarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarProductoActionPerformed
        dispose();
        JFrameCompraProducto ventanaCompra =new  JFrameCompraProducto(l);
        ventanaCompra.setLocationRelativeTo(null);
        ventanaCompra.setVisible(true);     
    }//GEN-LAST:event_jButtonComprarProductoActionPerformed

    private void jButtonVolverLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverLoginActionPerformed
        dispose();
        JFrameInicio nuevoInicio = new JFrameInicio(l);
        nuevoInicio.setLocationRelativeTo(null);
        nuevoInicio.setVisible(true);
    }//GEN-LAST:event_jButtonVolverLoginActionPerformed

    private void jButtonMensajeriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMensajeriaActionPerformed
        dispose();
        JFrameMensajeria nuevaVentanaMensaje = new JFrameMensajeria(l);
        nuevaVentanaMensaje.setLocationRelativeTo(null);
        nuevaVentanaMensaje.setVisible(true);
    }//GEN-LAST:event_jButtonMensajeriaActionPerformed
    
   
    
   
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconoJavaPop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBajaProducto;
    private javax.swing.JButton jButtonBuscarProducto;
    private javax.swing.JButton jButtonCambiarDatos;
    private javax.swing.JButton jButtonComprarProducto;
    private javax.swing.JButton jButtonMensajeria;
    private javax.swing.JButton jButtonNuevoProducto;
    private javax.swing.JButton jButtonPagarModificarDatos;
    private javax.swing.JButton jButtonVolverLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private Logic l;
}

