
package ec.edu.espe.bank.view;

/**
 *
 * @author TOSHIBA
 */
public class FrmInformation extends javax.swing.JFrame {

    /**
     * Creates new form FrmInformation
     */
    public FrmInformation() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGuide = new javax.swing.JTextArea();
        btnReturn = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtGuide.setEditable(false);
        txtGuide.setBackground(new java.awt.Color(204, 204, 255));
        txtGuide.setColumns(20);
        txtGuide.setForeground(new java.awt.Color(51, 51, 51));
        txtGuide.setRows(5);
        txtGuide.setText("                                                       \n\n                                                                  Welcome to Banking Plan\n\nBanking Plan is  a program that helps to improve the mismanagement of a person's money\nfrom the control of their expenses so as to avoid losing money or even going bankrupt.\n\nBanking Plan will contribute to society since it is a system that will help us to administer\nmoney correctly. The program is a banking simulation where you will know the amount of\nmoney you have in your account, thus separating it into: Savings Account, Checking Account, and\ntheir respective interest generated monthly and annually.\n\n    How to register ?\n\n   1)  Enter age\n   2)  Enter User Name\n   3)  You need to create an id\n   4)  You need to create a password\n   5)  Click on register\n \n\n     How to enter ?\n\n    1)  Enter User Name\n    2)  Enter your password\n    3)  Click on Loig\n\n   Do you need to cancel  ?\n\n      Click on Cancel\n\n\n  Accounts\n                                                             Savings Account\n\nTo open your account you need to register. \nIn this account you can save your money and have it at the time you require\n\n                                                           Checking Account\n\nTo open your account you need to register.\nTo request this account you need a specific amount of money\n\n\n                                                                     Cdt.\n\nTo open your account you need to register.\n\n");
        jScrollPane1.setViewportView(txtGuide);

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReturn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(btnReturn))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        FrmMenuBanking frmReservation = new FrmMenuBanking ();
        frmReservation.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

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
            java.util.logging.Logger.getLogger(FrmInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtGuide;
    // End of variables declaration//GEN-END:variables
}