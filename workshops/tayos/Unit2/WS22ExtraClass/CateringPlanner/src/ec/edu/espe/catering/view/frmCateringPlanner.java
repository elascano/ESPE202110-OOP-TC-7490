/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.catering.view;

/**
 *
 * @author Caisatoa
 */
public class frmCateringPlanner extends javax.swing.JFrame {

    /**
     * Creates new form frmCateringPlanner
     */
    public frmCateringPlanner() {
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

        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCateringPlanner = new javax.swing.JMenu();
        ItmAbout = new javax.swing.JMenuItem();
        ItmExit = new javax.swing.JMenuItem();
        mnuNew = new javax.swing.JMenu();
        itmReservetions = new javax.swing.JMenuItem();
        itmEvents = new javax.swing.JMenuItem();
        MnuResources = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CATERING PLANNER");

        mnuCateringPlanner.setText("Catering Planner");

        ItmAbout.setText("About");
        mnuCateringPlanner.add(ItmAbout);

        ItmExit.setText("Exit");
        ItmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmExitActionPerformed(evt);
            }
        });
        mnuCateringPlanner.add(ItmExit);

        jMenuBar1.add(mnuCateringPlanner);

        mnuNew.setText("New");

        itmReservetions.setText("Reservations");
        itmReservetions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReservetionsActionPerformed(evt);
            }
        });
        mnuNew.add(itmReservetions);

        itmEvents.setText("Events");
        itmEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEventsActionPerformed(evt);
            }
        });
        mnuNew.add(itmEvents);

        jMenuBar1.add(mnuNew);

        MnuResources.setText("Resources");
        jMenuBar1.add(MnuResources);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(216, 216, 216))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean alreadyDisposed=false;
    private void ItmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmExitActionPerformed
        if(this.isDisplayable()){
            alreadyDisposed = true;
            this.dispose();
        }
    }//GEN-LAST:event_ItmExitActionPerformed

    private void itmReservetionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReservetionsActionPerformed
        frmReservation FrmReservation = new frmReservation();
        FrmReservation.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmReservetionsActionPerformed

    private void itmEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEventsActionPerformed
        frmEvents FrmEvents = new frmEvents();
        FrmEvents.setVisible(true);
        this.setVisible(false);
 
    }//GEN-LAST:event_itmEventsActionPerformed

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
            java.util.logging.Logger.getLogger(frmCateringPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCateringPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCateringPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCateringPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCateringPlanner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItmAbout;
    private javax.swing.JMenuItem ItmExit;
    private javax.swing.JMenu MnuResources;
    private javax.swing.JMenuItem itmEvents;
    private javax.swing.JMenuItem itmReservetions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu mnuCateringPlanner;
    private javax.swing.JMenu mnuNew;
    // End of variables declaration//GEN-END:variables
}
