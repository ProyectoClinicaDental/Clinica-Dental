/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclinicadental;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class frmSalas extends javax.swing.JFrame {

    /**
     * Creates new form frmSalas
     */
    class_Salas salas=new class_Salas();
    ResultSet rst_lista=null;    
    DefaultListModel modelo=new DefaultListModel();
    public frmSalas() {
        initComponents();
        llenarlista();
        this.setSize(410, 450);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTemaSalas = new javax.swing.JLabel();
        lblSalas = new javax.swing.JLabel();
        txtSala = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSalasActuales = new javax.swing.JList<>();
        lblSalasActuales = new javax.swing.JLabel();
        btnAgregarSalas = new javax.swing.JButton();
        btnAtrasSalas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTemaSalas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTemaSalas.setForeground(java.awt.Color.red);
        lblTemaSalas.setText("SALAS");
        getContentPane().add(lblTemaSalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 22, -1, -1));

        lblSalas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblSalas.setForeground(java.awt.Color.orange);
        lblSalas.setText("Nombre de nueva sala:");
        getContentPane().add(lblSalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 68, -1, -1));
        getContentPane().add(txtSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 65, 210, -1));

        lstSalasActuales.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lstSalasActuales.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstSalasActuales);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 140, 230, -1));

        lblSalasActuales.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblSalasActuales.setForeground(java.awt.Color.orange);
        lblSalasActuales.setText("Salas Actuales");
        getContentPane().add(lblSalasActuales, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 118, -1, -1));

        btnAgregarSalas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAgregarSalas.setForeground(java.awt.Color.green);
        btnAgregarSalas.setText("AGREGAR");
        btnAgregarSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSalasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarSalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        btnAtrasSalas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAtrasSalas.setForeground(java.awt.Color.red);
        btnAtrasSalas.setText("ATRAS");
        btnAtrasSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasSalasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtrasSalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fundo-azul.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenarlista(){        
        try{
            modelo.removeAllElements();
            rst_lista=salas.LlenarListadeSalas();
            while (rst_lista.next()) 
                modelo.addElement(rst_lista.getString("Nombre_Sala").toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
                modelo.addElement("Error");
        }
        lstSalasActuales.setModel(modelo);
    }
    private void btnAgregarSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSalasActionPerformed
        if(txtSala.getText().length()==0)
            JOptionPane.showMessageDialog(this, "No hay ninguna referencia para \nguardar el nombre de la sala");
        else{
            salas.insertar(txtSala.getText());
            JOptionPane.showMessageDialog(this, "Registro de nueva sala exitoso");
        }
            llenarlista();
    }//GEN-LAST:event_btnAgregarSalasActionPerformed

    private void btnAtrasSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasSalasActionPerformed
        frmMenuPrincipal menu=new frmMenuPrincipal();
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnAtrasSalasActionPerformed

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
            java.util.logging.Logger.getLogger(frmSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSalas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarSalas;
    private javax.swing.JButton btnAtrasSalas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSalas;
    private javax.swing.JLabel lblSalasActuales;
    private javax.swing.JLabel lblTemaSalas;
    private javax.swing.JList<String> lstSalasActuales;
    private javax.swing.JTextField txtSala;
    // End of variables declaration//GEN-END:variables
}
