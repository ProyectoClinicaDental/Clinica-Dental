/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclinicadental;

/**
 *
 * @author Javier
 */
public class frmTratamientosOdontologicos extends javax.swing.JFrame {

    /**
     * Creates new form frmTratamientosOdontologicos
     */
    public frmTratamientosOdontologicos() {
        initComponents();
        txtTratamiento.setFont(new java.awt.Font("Times New Roman", 0, 20)); 
        lblTemaTratamientos.setFont(new java.awt.Font("Times New Roman", 0, 20)); 
        lblTratamiento.setFont(new java.awt.Font("Times New Roman", 0, 20)); 
        lstTratamientos.setFont(new java.awt.Font("Times New Roman", 0, 20)); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTemaTratamientos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTratamientos = new javax.swing.JList<>();
        lblTratamiento = new javax.swing.JLabel();
        txtTratamiento = new javax.swing.JTextField();
        btnAgregarTratamiento = new javax.swing.JButton();
        btnAtrasTratamiento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTemaTratamientos.setText("TRATAMIENTOS ODONTOLOGICOS");
        getContentPane().add(lblTemaTratamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 280, 40));

        lstTratamientos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Puentes Dentales", "Empastes", "Tratamiento Endodóntico", "Raspado y Pulido Radicular", "Ortodoncia", "Extraccion de Muelas", "Implantes Dentales", "Blanqueamiento Dental", "Carillas Dentales" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstTratamientos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 270, 240));

        lblTratamiento.setText("Tratamiento:");
        getContentPane().add(lblTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 80, 110, 30));

        txtTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTratamientoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 230, -1));

        btnAgregarTratamiento.setText("AGREGAR");
        getContentPane().add(btnAgregarTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        btnAtrasTratamiento.setText("ATRAS");
        getContentPane().add(btnAtrasTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fundo-azul-da-tecnologia-com-linhas_23-2147611285.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTratamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTratamientoActionPerformed

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
            java.util.logging.Logger.getLogger(frmTratamientosOdontologicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTratamientosOdontologicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTratamientosOdontologicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTratamientosOdontologicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTratamientosOdontologicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarTratamiento;
    private javax.swing.JButton btnAtrasTratamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTemaTratamientos;
    private javax.swing.JLabel lblTratamiento;
    private javax.swing.JList<String> lstTratamientos;
    private javax.swing.JTextField txtTratamiento;
    // End of variables declaration//GEN-END:variables
}