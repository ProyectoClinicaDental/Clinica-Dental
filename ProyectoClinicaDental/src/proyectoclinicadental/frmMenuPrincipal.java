
package proyectoclinicadental;


public class frmMenuPrincipal extends javax.swing.JFrame {

   
    public frmMenuPrincipal() {
        initComponents();
        this.setSize(550,500);
        /*lblMenuPrincipal.setFont(new java.awt.Font("Times New Roman", 0, 20)); 
        btnClientesMPrincipal.setFont(new java.awt.Font("Times New Roman", 0, 20)); 
        btnCitas.setFont(new java.awt.Font("Times New Roman", 0, 20)); 
        btnDentistas.setFont(new java.awt.Font("Times New Roman", 0, 20)); 
        btnFacturacion.setFont(new java.awt.Font("Times New Roman", 0, 20)); 
        btnSalas.setFont(new java.awt.Font("Times New Roman", 0, 20)); 
        btnTratamientosOdon.setFont(new java.awt.Font("Times New Roman", 0, 20)); 
        */
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClientesMPrincipal = new javax.swing.JButton();
        btnDentistas = new javax.swing.JButton();
        btnTratamientosOdon = new javax.swing.JButton();
        btnCitas = new javax.swing.JButton();
        btnSalas = new javax.swing.JButton();
        btnFacturacion = new javax.swing.JButton();
        lblMenuPrincipal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClientesMPrincipal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnClientesMPrincipal.setText("CLIENTES");
        btnClientesMPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesMPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(btnClientesMPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 68, 110, -1));

        btnDentistas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnDentistas.setText("DENTISTAS");
        btnDentistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDentistasActionPerformed(evt);
            }
        });
        getContentPane().add(btnDentistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 118, -1, -1));

        btnTratamientosOdon.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnTratamientosOdon.setText("TRATAMIENTOS ODONTOLOGICOS");
        btnTratamientosOdon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTratamientosOdonActionPerformed(evt);
            }
        });
        getContentPane().add(btnTratamientosOdon, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 170, 260, -1));

        btnCitas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCitas.setText("CITAS");
        btnCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitasActionPerformed(evt);
            }
        });
        getContentPane().add(btnCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 219, -1, -1));

        btnSalas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSalas.setText("SALAS");
        btnSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalasActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 269, -1, -1));

        btnFacturacion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnFacturacion.setText("FACTURACION");
        btnFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 328, -1, -1));

        lblMenuPrincipal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblMenuPrincipal.setForeground(java.awt.Color.red);
        lblMenuPrincipal.setText("MENU PRINCIPAL");
        getContentPane().add(lblMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 193, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fundo-azul.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesMPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesMPrincipalActionPerformed
        frmClientes cli=new frmClientes();
        this.dispose();
        cli.setVisible(true);
    }//GEN-LAST:event_btnClientesMPrincipalActionPerformed

    private void btnDentistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDentistasActionPerformed
        frmDentistas den=new frmDentistas();
        this.dispose();
        den.setVisible(true);
    }//GEN-LAST:event_btnDentistasActionPerformed

    private void btnTratamientosOdonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTratamientosOdonActionPerformed
        frmTratamientosOdontologicos tra=new frmTratamientosOdontologicos();
        this.dispose();
        tra.setVisible(true);
    }//GEN-LAST:event_btnTratamientosOdonActionPerformed

    private void btnCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitasActionPerformed
        frmCitas citas=new frmCitas();
        this.dispose();
        citas.setVisible(true);
    }//GEN-LAST:event_btnCitasActionPerformed

    private void btnSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalasActionPerformed
        frmSalas salas=new frmSalas();
        this.dispose();
        salas.setVisible(true);
    }//GEN-LAST:event_btnSalasActionPerformed

    private void btnFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturacionActionPerformed
        frmFacturacion fac=new frmFacturacion();
        this.dispose();
        fac.setVisible(true);
    }//GEN-LAST:event_btnFacturacionActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCitas;
    private javax.swing.JButton btnClientesMPrincipal;
    private javax.swing.JButton btnDentistas;
    private javax.swing.JButton btnFacturacion;
    private javax.swing.JButton btnSalas;
    private javax.swing.JButton btnTratamientosOdon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
