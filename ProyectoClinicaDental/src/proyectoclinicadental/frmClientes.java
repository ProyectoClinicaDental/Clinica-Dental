
package proyectoclinicadental;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;


public class frmClientes extends javax.swing.JFrame {

    
    public frmClientes() {
        initComponents();
        lblTemaClientes.setForeground(Color.red);
        lblTemaClientes.setFont(new java.awt.Font("Times New Roman", 0, 20)); 
        this.setSize(540, 560);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTemaClientes = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidoCliente = new javax.swing.JLabel();
        lblTelefonoCliente = new javax.swing.JLabel();
        lblEdadCliente = new javax.swing.JLabel();
        lblDireccionCliente = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtApellidoCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        txtEdadCliente = new javax.swing.JTextField();
        txtDireccionCliente = new javax.swing.JTextField();
        btnAgregarCliente = new javax.swing.JToggleButton();
        btnLimpiarCliente = new javax.swing.JToggleButton();
        btnRegresarCliente = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTemaClientes.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTemaClientes.setForeground(new java.awt.Color(255, 0, 0));
        lblTemaClientes.setText("ADMINISTRACION DE CLIENTES");
        getContentPane().add(lblTemaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 310, 30));

        lblNombre.setForeground(new java.awt.Color(204, 204, 0));
        lblNombre.setText("NOMBRE");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 20));

        lblApellidoCliente.setForeground(new java.awt.Color(51, 255, 153));
        lblApellidoCliente.setText("APELLIDO");
        getContentPane().add(lblApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        lblTelefonoCliente.setForeground(new java.awt.Color(102, 255, 102));
        lblTelefonoCliente.setText("TELEFONO");
        getContentPane().add(lblTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        lblEdadCliente.setForeground(new java.awt.Color(0, 255, 255));
        lblEdadCliente.setText("EDAD");
        getContentPane().add(lblEdadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        lblDireccionCliente.setForeground(new java.awt.Color(255, 0, 0));
        lblDireccionCliente.setText("DIRECCION");
        lblDireccionCliente.setToolTipText("");
        getContentPane().add(lblDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 70, 30));

        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 270, 30));

        txtApellidoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoClienteKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 270, -1));

        txtTelefonoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoClienteKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 120, -1));

        txtEdadCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadClienteKeyTyped(evt);
            }
        });
        getContentPane().add(txtEdadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 60, -1));

        txtDireccionCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionClienteKeyTyped(evt);
            }
        });
        getContentPane().add(txtDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 270, -1));

        btnAgregarCliente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAgregarCliente.setForeground(java.awt.Color.green);
        btnAgregarCliente.setText("AGREGAR");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 120, -1));

        btnLimpiarCliente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnLimpiarCliente.setForeground(java.awt.Color.cyan);
        btnLimpiarCliente.setText("LIMPIAR");
        btnLimpiarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 90, -1));

        btnRegresarCliente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnRegresarCliente.setForeground(java.awt.Color.red);
        btnRegresarCliente.setText("REGRESAR");
        btnRegresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 120, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setForeground(java.awt.Color.blue);
        jButton1.setText("AÑADIR ELEMENTO AL HISTORIAL MÉDICO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 370, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fundo-azul.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarCliente() {
       class_Clientes cli=new class_Clientes();
       cli.insertar(txtNombreCliente.getText(), txtApellidoCliente.getText(), txtTelefonoCliente.getText(), txtDireccionCliente.getText(), txtEdadCliente.getText());
       Mensajes("El registro del nuevo cliente se ha logrado con éxito");
    }
    private void Mensajes(String Men){
        JOptionPane.showMessageDialog(this, Men);
    }
    private void comprobarcampos(){
        String mens="";
        if(txtNombreCliente.getText().isEmpty())
            mens=("No ha ingresado el nombre\n");
        if(txtApellidoCliente.getText().isEmpty())
            mens+=("No ha ingresado apellidos\n");
        if(txtTelefonoCliente.getText().isEmpty())
            mens+=("No ha ingresado el nombre\n");
        if(txtDireccionCliente.getText().isEmpty())
            mens+=("No ha ingresado apellidos\n");
        if(txtEdadCliente.getText().isEmpty())
            mens+=("No ha ingresado el nombre\n");
        if(!mens.equals(""))
            Mensajes(mens);
        else 
            RegistrarCliente();
        mens="";
        limpiar();
    }
    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
       comprobarcampos();
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void txtNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyTyped
        if(txtNombreCliente.getText().length()==50)
            evt.consume();
        if(!Character.isLetter(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_txtNombreClienteKeyTyped

    private void txtApellidoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoClienteKeyTyped
        if(txtApellidoCliente.getText().length()==50)
            evt.consume();
        if(!Character.isLetter(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_txtApellidoClienteKeyTyped

    private void txtTelefonoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoClienteKeyTyped
        if(txtTelefonoCliente.getText().length()==8)
            evt.consume();
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_txtTelefonoClienteKeyTyped

    private void txtDireccionClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionClienteKeyTyped
        if(txtDireccionCliente.getText().length()==100)
            evt.consume();
    }//GEN-LAST:event_txtDireccionClienteKeyTyped

    private void txtEdadClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadClienteKeyTyped
        if(txtEdadCliente.getText().length()==2)
            evt.consume();
        if(!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_txtEdadClienteKeyTyped

    private void btnLimpiarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarClienteActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarClienteActionPerformed

    private void btnRegresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarClienteActionPerformed
        frmMenuPrincipal menu=new frmMenuPrincipal();
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnRegresarClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmHistorialCliente HC=new frmHistorialCliente();
        this.dispose();
        HC.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAgregarCliente;
    private javax.swing.JToggleButton btnLimpiarCliente;
    private javax.swing.JToggleButton btnRegresarCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellidoCliente;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblEdadCliente;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefonoCliente;
    private javax.swing.JLabel lblTemaClientes;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtEdadCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        txtNombreCliente.setText("");
        txtApellidoCliente.setText("");
        txtTelefonoCliente.setText("");
        txtEdadCliente.setText("");
        txtDireccionCliente.setText("");
    }

    
}
