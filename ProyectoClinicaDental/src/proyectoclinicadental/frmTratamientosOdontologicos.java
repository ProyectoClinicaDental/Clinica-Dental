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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTemaTratamientos.setText("TRATAMIENTOS ODONTOLOGICOS");
        getContentPane().add(lblTemaTratamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 220, 30));

        lstTratamientos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Puentes Dentales", "Empastes", "Tratamiento Endodóntico", "Raspado y Pulido Radicular", "Ortodoncia", "Extraccion de Muelas", "Implantes Dentales", "Blanqueamiento Dental", "Carillas Dentales" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstTratamientos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 190, 200));

        lblTratamiento.setText("Tratamiento:");
        getContentPane().add(lblTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 80, 80, 30));
        getContentPane().add(txtTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 230, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTemaTratamientos;
    private javax.swing.JLabel lblTratamiento;
    private javax.swing.JList<String> lstTratamientos;
    private javax.swing.JTextField txtTratamiento;
    // End of variables declaration//GEN-END:variables
}
