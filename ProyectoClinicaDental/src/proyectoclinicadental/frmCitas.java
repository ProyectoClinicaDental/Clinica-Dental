/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclinicadental;

import com.sun.glass.events.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class frmCitas extends javax.swing.JFrame {

    class_Citas cita=new class_Citas();
    ResultSet rst_lista=null;    
    DefaultComboBoxModel modelo=new DefaultComboBoxModel();
    DefaultComboBoxModel modelo1=new DefaultComboBoxModel();
    DefaultComboBoxModel modelo2=new DefaultComboBoxModel();
    public frmCitas() {
        initComponents();
        PrepararListas();  
        this.setSize(450, 400);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCitas = new javax.swing.JLabel();
        lblFechaCita = new javax.swing.JLabel();
        lblHoraCitas = new javax.swing.JLabel();
        txtFechaCitas = new javax.swing.JTextField();
        txtHoraCitas = new javax.swing.JTextField();
        lblDentistaCitas = new javax.swing.JLabel();
        cmbDentistaCitas = new javax.swing.JComboBox<>();
        lblClienteCitas = new javax.swing.JLabel();
        cmbClienteCitas = new javax.swing.JComboBox<>();
        lblSalaCitas = new javax.swing.JLabel();
        cmbSalaCitas = new javax.swing.JComboBox<>();
        btnAgregarCitas = new javax.swing.JButton();
        btnAtrasCitas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCitas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblCitas.setForeground(java.awt.Color.red);
        lblCitas.setText("CITAS");
        getContentPane().add(lblCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 29, -1, -1));

        lblFechaCita.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFechaCita.setForeground(java.awt.Color.orange);
        lblFechaCita.setText("Fecha:");
        getContentPane().add(lblFechaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 75, -1, -1));

        lblHoraCitas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblHoraCitas.setForeground(java.awt.Color.orange);
        lblHoraCitas.setText("Hora:");
        getContentPane().add(lblHoraCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 75, -1, -1));

        txtFechaCitas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtFechaCitas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFechaCitasFocusGained(evt);
            }
        });
        txtFechaCitas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaCitasKeyTyped(evt);
            }
        });
        getContentPane().add(txtFechaCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 69, 96, -1));

        txtHoraCitas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtHoraCitas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoraCitasFocusGained(evt);
            }
        });
        txtHoraCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraCitasActionPerformed(evt);
            }
        });
        txtHoraCitas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoraCitasKeyTyped(evt);
            }
        });
        getContentPane().add(txtHoraCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 69, 88, -1));

        lblDentistaCitas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblDentistaCitas.setForeground(java.awt.Color.orange);
        lblDentistaCitas.setText("Elegir Dentista:");
        getContentPane().add(lblDentistaCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 120, -1, -1));

        cmbDentistaCitas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmbDentistaCitas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbDentistaCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 115, 252, -1));

        lblClienteCitas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblClienteCitas.setForeground(java.awt.Color.orange);
        lblClienteCitas.setText("Cliente:");
        getContentPane().add(lblClienteCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 177, -1, -1));

        cmbClienteCitas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmbClienteCitas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbClienteCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 172, 252, -1));

        lblSalaCitas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblSalaCitas.setForeground(java.awt.Color.orange);
        lblSalaCitas.setText("Sala:");
        getContentPane().add(lblSalaCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 229, -1, -1));

        cmbSalaCitas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmbSalaCitas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbSalaCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 224, 108, -1));

        btnAgregarCitas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAgregarCitas.setForeground(java.awt.Color.green);
        btnAgregarCitas.setText("AGREGAR");
        btnAgregarCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCitasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        btnAtrasCitas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAtrasCitas.setForeground(java.awt.Color.red);
        btnAtrasCitas.setText("ATRAS");
        btnAtrasCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasCitasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtrasCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fundo-azul.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaCitasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaCitasKeyTyped
        if ((!Character.isDigit(evt.getKeyChar()))||(txtFechaCitas.getText().length()==10))
        evt.consume();
        if((KeyEvent.VK_BACKSPACE!=evt.getKeyCode())&&(evt.getKeyChar()!='')){
            if((txtFechaCitas.getText().length()==2)||(txtFechaCitas.getText().length()==5))
            txtFechaCitas.setText(txtFechaCitas.getText()+"/");
        }
    }//GEN-LAST:event_txtFechaCitasKeyTyped

    private void txtFechaCitasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaCitasFocusGained
        if(txtFechaCitas.getText().equals("dd/mm/aaaa"))
        txtFechaCitas.setText("");
    }//GEN-LAST:event_txtFechaCitasFocusGained

    private void btnAgregarCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCitasActionPerformed
        RegistrarCita();
    }//GEN-LAST:event_btnAgregarCitasActionPerformed

    private void txtHoraCitasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraCitasKeyTyped
        if ((!Character.isDigit(evt.getKeyChar()))||(txtHoraCitas.getText().length()==5))
        evt.consume();
        if((KeyEvent.VK_BACKSPACE!=evt.getKeyCode())&&(evt.getKeyChar()!='')){
            if((txtHoraCitas.getText().length()==2))
            txtHoraCitas.setText(txtHoraCitas.getText()+":");
        }
    }//GEN-LAST:event_txtHoraCitasKeyTyped

    private void txtHoraCitasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoraCitasFocusGained
        if(txtHoraCitas.getText().equals("HH:MM"))
        txtHoraCitas.setText("");
    }//GEN-LAST:event_txtHoraCitasFocusGained

    private void btnAtrasCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasCitasActionPerformed
        frmMenuPrincipal menu=new frmMenuPrincipal();
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnAtrasCitasActionPerformed

    private void txtHoraCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraCitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraCitasActionPerformed

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
            java.util.logging.Logger.getLogger(frmCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCitas;
    private javax.swing.JButton btnAtrasCitas;
    private javax.swing.JComboBox<String> cmbClienteCitas;
    private javax.swing.JComboBox<String> cmbDentistaCitas;
    private javax.swing.JComboBox<String> cmbSalaCitas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCitas;
    private javax.swing.JLabel lblClienteCitas;
    private javax.swing.JLabel lblDentistaCitas;
    private javax.swing.JLabel lblFechaCita;
    private javax.swing.JLabel lblHoraCitas;
    private javax.swing.JLabel lblSalaCitas;
    private javax.swing.JTextField txtFechaCitas;
    private javax.swing.JTextField txtHoraCitas;
    // End of variables declaration//GEN-END:variables

    private void reset(){        
        txtFechaCitas.setText("dd/mm/aaaa");
        txtHoraCitas.setText("HH:MM");
    }
    private void PrepararListas() {  
        reset();
        try{
            modelo.removeAllElements();
            modelo1.removeAllElements();
            modelo2.removeAllElements();
            rst_lista=cita.ListaDentistas();
            while (rst_lista.next()) 
                modelo.addElement(rst_lista.getString(1).toString());
            rst_lista=cita.ListaClientes();
            while (rst_lista.next()) 
                modelo1.addElement(rst_lista.getString(1).toString());
            rst_lista=cita.ListaSalas();
            while (rst_lista.next()) 
                modelo2.addElement(rst_lista.getString(1).toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
                modelo.addElement("Error");
                modelo1.addElement("Error");
                modelo2.addElement("Error");
        }
        cmbDentistaCitas.setModel(modelo);
        cmbClienteCitas.setModel(modelo1);
        cmbSalaCitas.setModel(modelo2);
        cmbDentistaCitas.requestFocus();
    }

    private void RegistrarCita() {
        if(txtFechaCitas.getText().length()<8)
            JOptionPane.showMessageDialog(this, "Ingrese una fecha válida");
        else if(txtFechaCitas.getText().length()==0)
            JOptionPane.showMessageDialog(this, "Ingrese una hora válida");
        else{
            String fecha=txtFechaCitas.getText().charAt(6)+""+txtFechaCitas.getText().charAt(7)+""+txtFechaCitas.getText().charAt(8)+""+txtFechaCitas.getText().charAt(9)+"/"+txtFechaCitas.getText().charAt(3)+""+txtFechaCitas.getText().charAt(4)+"/"+txtFechaCitas.getText().charAt(0)+""+txtFechaCitas.getText().charAt(1);
            cita.insertar((cmbDentistaCitas.getSelectedIndex()+1),(cmbClienteCitas.getSelectedIndex()+1), (cmbSalaCitas.getSelectedIndex()+1), fecha);
            JOptionPane.showMessageDialog(this, "Cita registrada correctamente");
            reset();
        }        
    }
}
