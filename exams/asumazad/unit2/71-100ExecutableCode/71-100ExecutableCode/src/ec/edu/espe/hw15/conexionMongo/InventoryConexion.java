/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hw15.conexionMongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;





/**
 *
 * @author dylanasumaza
 */
public class InventoryConexion extends javax.swing.JFrame {
DB db;
DBCollection products;
 BasicDBObject document = new BasicDBObject();
    /**
     * Creates new form InventoryConexion
     * @throws java.net.UnknownHostException
     */
    public InventoryConexion() throws UnknownHostException{
        
    try {
        Mongo mongo = new Mongo("localhost",27017);
        db=mongo.getDB("71-100ExecutableCode");
        products=db.getCollection("products");
        
    } catch (UnknownHostException ex) {
        Logger.getLogger(InventoryConexion.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
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

        PnlInputs = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idProvider = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtbrand = new javax.swing.JTextField();
        txtpurchasePrice = new javax.swing.JTextField();
        txtquantity = new javax.swing.JTextField();
        txtidProviders = new javax.swing.JTextField();
        PnlButton = new javax.swing.JPanel();
        btmdisplay = new javax.swing.JButton();
        btmsave = new javax.swing.JButton();
        btmdelete = new javax.swing.JButton();
        btmupdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText(" INVENTORY");

        jLabel4.setText("Add Products:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("ID:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Name:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Brand:");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Purchase Price:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Quantity:");

        idProvider.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        idProvider.setText("ID Provider:");

        txtquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquantityActionPerformed(evt);
            }
        });

        btmdisplay.setText("DISPLAY");
        btmdisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmdisplayActionPerformed(evt);
            }
        });

        btmsave.setText("SAVE");
        btmsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmsaveActionPerformed(evt);
            }
        });

        btmdelete.setText("DELETE");
        btmdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmdeleteActionPerformed(evt);
            }
        });

        btmupdate.setText("UPDATE");
        btmupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlButtonLayout = new javax.swing.GroupLayout(PnlButton);
        PnlButton.setLayout(PnlButtonLayout);
        PnlButtonLayout.setHorizontalGroup(
            PnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btmsave, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btmdelete)
                .addGap(18, 18, 18)
                .addComponent(btmupdate)
                .addGap(18, 18, 18)
                .addComponent(btmdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlButtonLayout.setVerticalGroup(
            PnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlButtonLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmsave)
                    .addComponent(btmdisplay)
                    .addComponent(btmdelete)
                    .addComponent(btmupdate))
                .addGap(0, 44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PnlInputsLayout = new javax.swing.GroupLayout(PnlInputs);
        PnlInputs.setLayout(PnlInputsLayout);
        PnlInputsLayout.setHorizontalGroup(
            PnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlInputsLayout.createSequentialGroup()
                .addGroup(PnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlInputsLayout.createSequentialGroup()
                        .addGroup(PnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlInputsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(PnlInputsLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(PnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(PnlInputsLayout.createSequentialGroup()
                                                .addComponent(idProvider)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtidProviders))
                                            .addGroup(PnlInputsLayout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(PnlInputsLayout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtpurchasePrice))
                                            .addGroup(PnlInputsLayout.createSequentialGroup()
                                                .addGroup(PnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel7))
                                                .addGap(30, 30, 30)
                                                .addGroup(PnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtbrand)
                                                    .addComponent(txtname)
                                                    .addComponent(txtid)))))))
                            .addGroup(PnlInputsLayout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jLabel3)))
                        .addGap(0, 244, Short.MAX_VALUE))
                    .addGroup(PnlInputsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PnlButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlInputsLayout.setVerticalGroup(
            PnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtbrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtpurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idProvider)
                    .addComponent(txtidProviders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(PnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnlInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlInputs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btmsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmsaveActionPerformed

       
document.put("ID",  txtid.getText());
document.put("Name",  txtname.getText());
document.put("Bran",  txtbrand.getText());        
document.put("Purchase Price",  txtpurchasePrice.getText());    
document.put("Quantity", txtquantity.getText());   
document.put("Id Provider",  txtidProviders.getText());   
products.insert(document);

//TODO add your handling code here;
        
        
        
    }//GEN-LAST:event_btmsaveActionPerformed

    private void btmdisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmdisplayActionPerformed
        
     DBCursor cursor = products.find();
     while(cursor.hasNext()){
         jTextArea1.setText(jTextArea1.getText() + "\n" + cursor.next());
     }
        
  
    }//GEN-LAST:event_btmdisplayActionPerformed

    private void txtquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquantityActionPerformed

    private void btmdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmdeleteActionPerformed
    String id = JOptionPane.showInputDialog("Enter ID");
    document.put("ID", id);
    products.remove(document);
    JOptionPane.showConfirmDialog(null,"Delete confirm", "Ok", JOptionPane.DEFAULT_OPTION);
    
        
// TODO add your handling code here:
    }//GEN-LAST:event_btmdeleteActionPerformed

    private void btmupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmupdateActionPerformed
        
    if (txtid.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Enter ID","Conexio", JOptionPane.ERROR_MESSAGE);
        
        
    }else{
        document.put("ID", txtid.getText());
        
        BasicDBObject documentN = new BasicDBObject();
       
documentN.put("ID",  txtid.getText());
documentN.put("Name",  txtname.getText());
documentN.put("Bran",  txtbrand.getText());        
documentN.put("Purchase Price",  txtpurchasePrice.getText());    
documentN.put("Quantity", txtquantity.getText());   
documentN.put("Id Provider",  txtidProviders.getText());   
products.update(document,documentN);

    }
    
        // TODO add your handling code here:
    }//GEN-LAST:event_btmupdateActionPerformed

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
            java.util.logging.Logger.getLogger(InventoryConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InventoryConexion().setVisible(true);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(InventoryConexion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlButton;
    private javax.swing.JPanel PnlInputs;
    private javax.swing.JButton btmdelete;
    private javax.swing.JButton btmdisplay;
    private javax.swing.JButton btmsave;
    private javax.swing.JButton btmupdate;
    private javax.swing.JLabel idProvider;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtbrand;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtidProviders;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpurchasePrice;
    private javax.swing.JTextField txtquantity;
    // End of variables declaration//GEN-END:variables
}
