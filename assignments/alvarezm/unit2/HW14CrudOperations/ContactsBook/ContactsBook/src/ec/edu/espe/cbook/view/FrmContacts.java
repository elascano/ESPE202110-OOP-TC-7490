
package ec.edu.espe.cbook.view;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.result.DeleteResult;
import ec.edu.espe.cbook.model.Connection;
import ec.edu.espe.cbook.model.Upload;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.types.ObjectId;



/**
 *
 * @author Angel Guaman
 */
public class FrmContacts extends javax.swing.JFrame {
    
    Calendar fecha_actual = new GregorianCalendar();
    MongoCollection<Document> Contact = new Connection().obtenerDB().getCollection("Contact");
    DefaultTableModel tabla = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; //To change body of generated methods, choose Tools | Templates.
        }
        
    };
    
    public FrmContacts() {
        
        initComponents();
        txtSex.add(txtMasculine);
        txtSex.add(txtFeminine);
        txtSex.add(txtOthers);
        txtBirthdate.setCalendar(fecha_actual);
        tabla.addColumn("ID Cloud");tabla.addColumn("ID");tabla.addColumn("NAME");
        tabla.addColumn("HOBBY");tabla.addColumn("CELLPHONE");
        tabla.addColumn("SEX");tabla.addColumn("GROUP");
        tabla.addColumn("SALARY");tabla.addColumn("BIRTHDATE");
        tabla.addColumn("COMMENTS");
        tblContacts.setModel(tabla);
        mostrar();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSex = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComments = new javax.swing.JTextArea();
        txtHobby = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtCellPhone = new javax.swing.JTextField();
        txtGroup = new javax.swing.JComboBox<>();
        txtSalary = new javax.swing.JTextField();
        txtMasculine = new javax.swing.JRadioButton();
        txtFeminine = new javax.swing.JRadioButton();
        txtOthers = new javax.swing.JRadioButton();
        txtBirthdate = new com.toedter.calendar.JDateChooser();
        btnFind = new javax.swing.JButton();
        btnExit = new javax.swing.JToggleButton();
        btnListContacts = new javax.swing.JButton();
        btnUpload = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblContacts = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 2, 18)); // NOI18N
        jLabel1.setText("CONTACTS BOOK TO MONGO ATLAS");

        jLabel2.setText("Id:");

        jLabel3.setText("Name:");

        jLabel4.setText("Cell Phone:");

        jLabel5.setText("Sex:");

        jLabel6.setText("Group:");

        jLabel7.setText("Salary:");

        jLabel8.setText("Birth Date:");

        jLabel9.setText("Hobby:");

        jLabel10.setText("Comments: ");

        txtComments.setColumns(20);
        txtComments.setRows(5);
        jScrollPane1.setViewportView(txtComments);

        txtHobby.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Play Soccer", "Play Instrument", "Sing", "Video Games", " " }));
        txtHobby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHobbyActionPerformed(evt);
            }
        });

        txtGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Family", "University", "Jobs" }));

        txtMasculine.setBackground(new java.awt.Color(204, 204, 255));
        txtSex.add(txtMasculine);
        txtMasculine.setText("Male");
        txtMasculine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMasculineActionPerformed(evt);
            }
        });

        txtFeminine.setBackground(new java.awt.Color(204, 204, 255));
        txtSex.add(txtFeminine);
        txtFeminine.setText("Female");

        txtOthers.setBackground(new java.awt.Color(204, 204, 255));
        txtSex.add(txtOthers);
        txtOthers.setText("Others");

        txtBirthdate.setDateFormatString("yyyy/MM/dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtOthers)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMasculine)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFeminine)
                                            .addComponent(txtGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtId)
                                        .addGap(61, 61, 61)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9)))
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(txtCellPhone))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHobby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(274, 274, 274))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel3)
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtHobby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(txtMasculine)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFeminine)
                            .addComponent(jLabel5))
                        .addGap(14, 14, 14)
                        .addComponent(txtOthers)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnFind.setBackground(new java.awt.Color(255, 51, 255));
        btnFind.setText("Find");

        btnExit.setBackground(new java.awt.Color(255, 51, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnListContacts.setBackground(new java.awt.Color(255, 51, 255));
        btnListContacts.setText("List Contacts");
        btnListContacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListContactsActionPerformed(evt);
            }
        });

        btnUpload.setBackground(new java.awt.Color(255, 51, 255));
        btnUpload.setText("Upload");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        tblContacts.setBackground(new java.awt.Color(204, 255, 204));
        tblContacts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblContacts);

        btnRemove.setBackground(new java.awt.Color(255, 51, 255));
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(255, 51, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btnAdd)
                .addGap(121, 121, 121)
                .addComponent(btnRemove)
                .addGap(116, 116, 116)
                .addComponent(btnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(btnListContacts)
                .addGap(83, 83, 83)
                .addComponent(btnFind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnFind)
                    .addComponent(btnListContacts)
                    .addComponent(btnUpload)
                    .addComponent(btnRemove)
                    .addComponent(btnAdd))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHobbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHobbyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHobbyActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        
        String sex;
        if(txtMasculine.isSelected()){
                sex = "Masculine";
            }else if (txtFeminine.isSelected()){
                sex = "Femenine";
            } else if(txtOthers.isSelected()){
                sex = "Other";
            } else {
                sex = "Ninguna";
            }
        try {
            Document data = new Document();
            
            data.put("id", Integer.parseInt(txtId.getText()));
            data.put("name", txtName.getText());
            data.put("hobby", txtHobby.getSelectedItem().toString());
            data.put("cellphone", txtCellPhone.getText());
            data.put("sex", txtMasculine.getUIClassID());
            data.put("group", txtGroup.getSelectedItem().toString());
            data.put("salary", Float.parseFloat(txtSalary.getText()));
            data.put("birthdate", txtBirthdate.getDate().toString());
            data.put("comments", txtComments.getText());

            Contact.insertOne(data);
            
            JOptionPane.showMessageDialog(this, "EXITO");
           
        } catch(Exception err){
            JOptionPane.showMessageDialog(this, "ERROR: "+err.getMessage());
        }
        
            
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnListContactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListContactsActionPerformed
               
        mostrar();
        
    }//GEN-LAST:event_btnListContactsActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int renglon = tblContacts.getSelectedRow();
        if(renglon == -1){
            JOptionPane.showMessageDialog(this, "Error, Selecciona el rengloa a Eliminar");
            return;
        }
        String idRemove = tblContacts.getValueAt(renglon, 0).toString();
        int respuesta = JOptionPane.showConfirmDialog(this, "Estas seguro de eliminar la ID?"+ idRemove);
        if(respuesta == JOptionPane.OK_OPTION){
            boolean answerDelete = Delete(idRemove);
            if(answerDelete==true){
                mostrar();
                JOptionPane.showMessageDialog(this, "Se elimino Correctamente");
            }else{
                JOptionPane.showMessageDialog(this, "No se pudo eliminar");

            }
        }
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        int renglon = tblContacts.getSelectedRow();
        if(renglon == -1){
            JOptionPane.showMessageDialog(this, "Error, Select the row to update");
            return;
        }
        String idUpload = tblContacts.getValueAt(renglon, 0).toString();
        int answer = JOptionPane.showConfirmDialog(this, "Are you sure to update the ID?"+ idUpload);
        if(answer == JOptionPane.OK_OPTION){
            Upload upload = new Upload(this,true, Contact, idUpload);
            upload.setVisible(true);
            mostrar();
        }
    }//GEN-LAST:event_btnUploadActionPerformed

    private void txtMasculineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMasculineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMasculineActionPerformed

    public boolean Delete(String id){
        DeleteResult answer = Contact.deleteOne(new Document("_id", new ObjectId(id)));
        if(answer.getDeletedCount()==1){
            return true;
        }
        return false;
    }
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
            java.util.logging.Logger.getLogger(FrmContacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmContacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmContacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmContacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmContacts().setVisible(true);
            }
        });
    }
    public void mostrar(){
        
        MongoCursor<Document> consulta = Contact.find().iterator();
        
        int total = tabla.getRowCount();
        for(int i = 0; i<total; i++){
            tabla.removeRow(0);
        }
        while(consulta.hasNext()){
            ArrayList<Object> doc = new ArrayList<Object>(consulta.next().values());
            tabla.addRow(doc.toArray());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JToggleButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnListContacts;
    private javax.swing.JButton btnRemove;
    private javax.swing.JToggleButton btnUpload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblContacts;
    private com.toedter.calendar.JDateChooser txtBirthdate;
    private javax.swing.JTextField txtCellPhone;
    private javax.swing.JTextArea txtComments;
    private javax.swing.JRadioButton txtFeminine;
    private javax.swing.JComboBox<String> txtGroup;
    private javax.swing.JComboBox<String> txtHobby;
    private javax.swing.JTextField txtId;
    private javax.swing.JRadioButton txtMasculine;
    private javax.swing.JTextField txtName;
    private javax.swing.JRadioButton txtOthers;
    private javax.swing.JTextField txtSalary;
    private javax.swing.ButtonGroup txtSex;
    // End of variables declaration//GEN-END:variables
}
