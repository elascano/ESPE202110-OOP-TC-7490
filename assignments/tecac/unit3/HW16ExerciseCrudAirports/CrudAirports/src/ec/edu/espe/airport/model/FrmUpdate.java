package ec.edu.espe.airport.model;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.UpdateResult;
import ec.edu.espe.airport.view.FrmAirport;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Camila
 */
public class FrmUpdate extends javax.swing.JFrame {

    Document filter;
    MongoCollection<Document> Airports;

    /**
     * Creates new form FrmUpdate
     */
    public FrmUpdate(java.awt.Frame parent, boolean modal, MongoCollection<Document> Contact, String id) {

        initComponents();
        filter = new Document("_id", new ObjectId(id));
        this.Airports = Contact;

        Document answer = Contact.find(filter).first();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTicketValue = new javax.swing.JTextField();
        lblWelcome = new javax.swing.JLabel();
        cmbOrigin = new javax.swing.JComboBox<>();
        lblFind1 = new javax.swing.JLabel();
        cmbDestination = new javax.swing.JComboBox<>();
        lblFind2 = new javax.swing.JLabel();
        lblFind3 = new javax.swing.JLabel();
        lblFind4 = new javax.swing.JLabel();
        lblFind5 = new javax.swing.JLabel();
        lblFind6 = new javax.swing.JLabel();
        txtIdAirline = new javax.swing.JTextField();
        txtAirline = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnUpdate1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblWelcome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblWelcome.setText("UPDATE AIRPORTS");

        cmbOrigin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Option", "Ecuador", "Chile", "Spain", "Italy " }));

        lblFind1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFind1.setText("Name:");

        cmbDestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Option", "Colombia", "Mexico", "Germany", "Italy" }));

        lblFind2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFind2.setText("Origin:");

        lblFind3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFind3.setText("Destination:");

        lblFind4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFind4.setText("Id Airline:");

        lblFind5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFind5.setText("Airline:");

        lblFind6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFind6.setText("Ticket Value:");

        btnUpdate1.setText("Update");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblFind1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFind3)
                                    .addComponent(lblFind2))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFind6)
                            .addComponent(lblFind5)
                            .addComponent(lblFind4))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtTicketValue, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAirline, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdAirline, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(btnUpdate1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFind1)
                    .addComponent(lblFind4)
                    .addComponent(txtIdAirline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFind2)
                    .addComponent(cmbOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFind5)
                    .addComponent(txtAirline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFind3)
                    .addComponent(cmbDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFind6)
                    .addComponent(txtTicketValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnUpdate1)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        Document dataUpload = new Document();
        dataUpload.put("Name", txtName.getText());
        dataUpload.put("Origin", cmbOrigin.getSelectedItem());
        dataUpload.put("Destination", cmbDestination.getSelectedItem());
        dataUpload.put("Id Airline", txtIdAirline.getText());
        dataUpload.put("Airline", txtAirline.getText());
        dataUpload.put("Ticket Value", txtTicketValue.getText());
        UpdateResult answer = Airports.updateOne(filter, new Document("$set", dataUpload));
        FrmAirport open = new FrmAirport();
        open.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnUpdate1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JComboBox<String> cmbDestination;
    private javax.swing.JComboBox<String> cmbOrigin;
    private javax.swing.JLabel lblFind1;
    private javax.swing.JLabel lblFind2;
    private javax.swing.JLabel lblFind3;
    private javax.swing.JLabel lblFind4;
    private javax.swing.JLabel lblFind5;
    private javax.swing.JLabel lblFind6;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTextField txtAirline;
    private javax.swing.JTextField txtIdAirline;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTicketValue;
    // End of variables declaration//GEN-END:variables
}
