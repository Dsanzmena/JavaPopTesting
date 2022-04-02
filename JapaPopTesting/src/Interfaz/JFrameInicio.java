/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import InterfazAdmin.*;
import Clases.Cliente;
import static Clases.JavaPopMain.guardarDatos;
import Clases.Logic;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class JFrameInicio extends javax.swing.JFrame {

    /**
     * Creates new form JFrameInicio
     */
    public JFrameInicio(Logic l) {

        initComponents();
        this.l = l;
        
        ImageIcon imagen=new ImageIcon(l.getImagen());
        Icon icono =new ImageIcon(imagen.getImage().getScaledInstance(iconoJavaPop.getWidth(),iconoJavaPop.getHeight(),Image.SCALE_DEFAULT));
        iconoJavaPop.setIcon(icono);
    

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextFieldClave = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jButtonLogin = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordFieldClave = new javax.swing.JPasswordField();
        jCheckBoxClave = new javax.swing.JCheckBox();
        iconoJavaPop = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");
        jTextFieldClave.getAccessibleContext().setAccessibleDescription("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonLogin.setText("Iniciar Sesion");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jButtonRegistrar.setText("Registrarse");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Clave");

        jLabel3.setText("Email");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBoxClave.setText("Mostrar clave");
        jCheckBoxClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxClaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxClave)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPasswordFieldClave)))
                                .addGap(151, 151, 151))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(iconoJavaPop, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(iconoJavaPop, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxClave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrar)
                    .addComponent(jButtonLogin)
                    .addComponent(jButton1))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:

        boolean distintoEmail = true, distintaClave = true;
        String correo = jTextFieldCorreo.getText().toLowerCase();
        String clave = jPasswordFieldClave.getText();
        
        if (correo.equals("") || (clave.equals(""))) {//SI LOS CAMPOS NO HAN SIDO RELLENADOS
            JOptionPane.showMessageDialog(this, "Rellene los campos solicitados ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        } else if (correo.equals("admin@javapop.com") || (clave.equals("admin"))) {//SI LOS CAMPOS SE RELLENAN CON LAS CREDENCIALES DEL ADMIN
            dispose();
            JFrameMenuAdmin menuAdmin = new JFrameMenuAdmin(l);//CREA VENTANA MENU DE ADMIN
            menuAdmin.setLocationRelativeTo(null);
            menuAdmin.setVisible(true);
        } else {//SI NO ES NINGUNA DE LAS ANTERIORES ENTONCES COMPRUEBA SI EL CORREO ES CORRECTO 
            
            boolean loginCorrecto=false;
            for (Cliente c : l.getClientes()) {//BUSCA ENTRE TODOS LOS CLIENTES

                if (c.getEmail().equals(correo)) {//SI EL CORREO COINCIDE

                    if (c.getClave().equals(clave)) {//SI LA CLAVE TAMBIEN COINCIDE 
                        loginCorrecto=true;
                        dispose();
                        l.setClienteActual(c);//PONEMOS COMO USUARIO ACTUAL AL QUE SE ACABA DE VALIDAR
                        distintaClave = false;

                        JFrameMenuUsuario ventanaMenuUsuario = new JFrameMenuUsuario(l);//CREAMOS VENTANA MENU DE USUARIO
                        ventanaMenuUsuario.setLocationRelativeTo(null);
                        ventanaMenuUsuario.setVisible(true);
                        
                    }
                }
                
            }
            if(!loginCorrecto){//SI NO COINCIDE CLAVE O CORREO MUESTRA MENSAJE Y PIDE QUE INTRODUCZA DE NUEVO IDENTIFICACION
                JOptionPane.showMessageDialog(this, "La clave o contraseña no es correcta ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                jTextFieldCorreo.setText("");
                jPasswordFieldClave.setText("");
             
            }
            
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        dispose();
        JFrameTipoRegistro ventanaRegistrar = new JFrameTipoRegistro(l);
        ventanaRegistrar.setLocationRelativeTo(null);
        ventanaRegistrar.setVisible(true);
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        guardarDatos(l.getClientes(), "ficheroClientes");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBoxClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxClaveActionPerformed
        if(jCheckBoxClave.isSelected()){
            jPasswordFieldClave.setEchoChar((char)0);
        }else{
            jPasswordFieldClave.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBoxClaveActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconoJavaPop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JCheckBox jCheckBoxClave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordFieldClave;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldClave;
    private javax.swing.JTextField jTextFieldCorreo;
    // End of variables declaration//GEN-END:variables
    private Logic l;
}
