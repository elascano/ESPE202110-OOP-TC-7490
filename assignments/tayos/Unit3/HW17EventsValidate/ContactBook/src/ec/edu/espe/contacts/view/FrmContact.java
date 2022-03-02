package ec.edu.espe.contacts.view;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.result.DeleteResult;
import ec.edu.espe.contacts.model.ContactsRegist;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.types.ObjectId;
import utils.Connection;

/**
 *
 * @author Sebas
 */
public class FrmContact extends javax.swing.JFrame {

    /**
     * Creates new form FrmContact
     */
    Calendar fecha_actual = new GregorianCalendar();
    MongoCollection<Document> Contacts = new Connection().obtenerDB().getCollection("Contacts");
    DefaultTableModel tabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; //To change body of generated methods, choose Tools | Templates.
        }
    };

    public FrmContact() {
        initComponents();
        tabla.addColumn("id mongo");
        tabla.addColumn("Cedula");
        tabla.addColumn("Last Name");
        tabla.addColumn("Name");
        tabla.addColumn("BirthDate");
        tabla.addColumn("Salary");
        tblRegistration.setModel(tabla);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        CalendarBirth = new com.toedter.calendar.JDateChooser();
        txtSalary = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistration = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblErrorCedula = new javax.swing.JLabel();
        lblErrorLastName = new javax.swing.JLabel();
        lblErrorName = new javax.swing.JLabel();
        lblErrorSalary = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Registration");

        jLabel2.setText("Cedula");

        jLabel3.setText("Last Name");

        jLabel4.setText("Name");

        jLabel5.setText("BirthDate");

        jLabel6.setText("Salary");

<<<<<<< HEAD
=======
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
>>>>>>> ce484174b950faef0a6691e272919111c42b3660
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLastNameKeyTyped(evt);
            }
        });

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalaryKeyTyped(evt);
            }
        });

        tblRegistration.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblRegistration);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.setEnabled(false);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnClear.setText("clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(btnInsert))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCedula)
                                    .addComponent(txtLastName)
                                    .addComponent(txtName)
                                    .addComponent(CalendarBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(txtSalary))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblErrorCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblErrorLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblErrorName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblErrorSalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnRefresh)
                                .addGap(64, 64, 64)
                                .addComponent(btnFind)
                                .addGap(66, 66, 66)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btnExit))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblErrorCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(CalendarBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnRefresh)
                    .addComponent(btnFind)
                    .addComponent(btnDelete)
                    .addComponent(btnExit)
                    .addComponent(btnClear))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        try {
            Document data = new Document();

            data.put("Cedula", Integer.parseInt(txtCedula.getText()));
            data.put("Last Name", txtLastName.getText());
            data.put("name", txtName.getText());
            data.put("BirthDate", CalendarBirth.getDate().toString());
            data.put("salary", Float.parseFloat(txtSalary.getText()));

            Contacts.insertOne(data);

            JOptionPane.showMessageDialog(this, "EXITO");

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "ERROR: " + err.getMessage());
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        mostrar();
        clearFields();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        int cedula;
        ContactsRegist contactsRegist;

        cedula = Integer.parseInt(JOptionPane.showInputDialog("Enter your Cedula number"));

        contactsRegist = findContactsRegist(cedula);

        txtCedula.setText(String.valueOf(contactsRegist.getCedula()));
        txtLastName.setText(contactsRegist.getLastName());
        txtName.setText(contactsRegist.getName());
        CalendarBirth.setDateFormatString(contactsRegist.getBirthDate());
        txtSalary.setText(String.valueOf(contactsRegist.getSalary()));

    }//GEN-LAST:event_btnFindActionPerformed

    public ArrayList<ContactsRegist> returnContactsRegists() {

        ArrayList<ContactsRegist> ContactsRegists;
        ContactsRegists = new ArrayList<>();
        MongoCursor<Document> consulta = Contacts.find().iterator();

        while (consulta.hasNext()) {
            ArrayList<Object> doc = new ArrayList<Object>(consulta.next().values());

            int cedula = Integer.parseInt(doc.get(1).toString());
            String lastName = doc.get(2).toString();
            String name = doc.get(3).toString();
            String birthDate = doc.get(4).toString();
            float salary = Float.parseFloat(doc.get(5).toString());

            ContactsRegist contactsRegist = new ContactsRegist(cedula, lastName, name, birthDate, salary);
            ContactsRegists.add(contactsRegist);
        }
        return ContactsRegists;
    }

    public ContactsRegist findContactsRegist(int cedula) {
        ArrayList<ContactsRegist> contactsRegists;
        contactsRegists = new ArrayList<>();
        contactsRegists = returnContactsRegists();

        for (ContactsRegist contactsRegist : contactsRegists) {
            if (contactsRegist.getCedula() == cedula) {
                return contactsRegist;
            }
        }
        return null;
    }
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int renglon = tblRegistration.getSelectedRow();
        if (renglon == -1) {
            JOptionPane.showMessageDialog(this, "Error, Selecciona el rengloa a Eliminar");
            return;
        }
        String idRemove = tblRegistration.getValueAt(renglon, 0).toString();
        int respuesta = JOptionPane.showConfirmDialog(this, "Estas seguro de eliminar la ID?" + idRemove);
        if (respuesta == JOptionPane.OK_OPTION) {
            boolean answerDelete = Delete(idRemove);
            if (answerDelete == true) {
                mostrar();
                JOptionPane.showMessageDialog(this, "Se elimino Correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar");

            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        int key = evt.getKeyChar();
        boolean numbers = (key >= 48 && key <= 57);
        boolean supr = (key == 8);

        if (numbers || supr) {
            lblErrorCedula.setForeground(new Color(102, 255, 255));
            lblErrorCedula.setText("Correct Format");
        } else {
            JOptionPane.showMessageDialog(this, "Fill only with numbers from 0 to 9");
            lblErrorCedula.setForeground(new Color(255, 0, 0));
            lblErrorCedula.setText("Error. Enter only numbers");
            evt.consume();
        }
        habilyInsert();
        habilyClean();

    }//GEN-LAST:event_txtCedulaKeyTyped

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

    }//GEN-LAST:event_btnClearActionPerformed

    private void txtLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyTyped
        int key = evt.getKeyChar();
        boolean uper = (key >= 65 && key <= 90);
        boolean lower = (key >= 97 && key <= 122);
        boolean espace = (key == 32);
        boolean supr = (key == 8);

        if ((uper || lower || espace || supr)) {
            lblErrorLastName.setForeground(new Color(102, 255, 255));
            lblErrorLastName.setText("Correct Format");
        } else {
            JOptionPane.showMessageDialog(this, "Fill only with uppercase and lowercase letters");
            lblErrorLastName.setForeground(new Color(255, 0, 0));
            lblErrorLastName.setText("Error. Enter only letters");
            evt.consume();
        }
        habilyInsert();
        habilyClean();
    }//GEN-LAST:event_txtLastNameKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        int key = evt.getKeyChar();
        boolean uper = (key >= 65 && key <= 90);
        boolean lower = (key >= 97 && key <= 122);
        boolean espace = (key == 32);
        boolean supr = (key == 8);

        if ((uper || lower || espace || supr)) {
            lblErrorName.setForeground(new Color(102, 255, 255));
            lblErrorName.setText("Correct Format");
        } else {
            JOptionPane.showMessageDialog(this, "Fill only with uppercase and lowercase letters");
            lblErrorName.setForeground(new Color(255, 0, 0));
            lblErrorName.setText("Error. Enter only letters");
            evt.consume();
        }
        habilyInsert();
        habilyClean();
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaryKeyTyped
        int key = evt.getKeyChar();
        boolean numbers = (key >= 48 && key <= 57);
        boolean dat = (key == 46);
        boolean supr = (key == 8);

        if (numbers || dat || supr) {
            lblErrorSalary.setForeground(new Color(102, 255, 255));
            lblErrorSalary.setText("Correct Format");
        } else {
            JOptionPane.showMessageDialog(this, "Fill with decimals and the operator '.'");
            lblErrorSalary.setForeground(new Color(255, 0, 0));
            lblErrorSalary.setText("Error. Enter only float numbers");
            evt.consume();
        }
        habilyInsert();
        habilyClean();
    }//GEN-LAST:event_txtSalaryKeyTyped
<<<<<<< HEAD
=======

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed
>>>>>>> ce484174b950faef0a6691e272919111c42b3660
    public boolean Delete(String id) {
        DeleteResult answer = Contacts.deleteOne(new Document("_id", new ObjectId(id)));
        if (answer.getDeletedCount() == 1) {
            return true;
        }
        return false;
    }

    public void mostrar() {

        MongoCursor<Document> consulta = Contacts.find().iterator();

        int total = tabla.getRowCount();
        for (int i = 0; i < total; i++) {
            tabla.removeRow(0);
        }
        while (consulta.hasNext()) {
            ArrayList<Object> doc = new ArrayList<Object>(consulta.next().values());
            tabla.addRow(doc.toArray());
        }
    }

    public void habilyInsert() {
        if (!txtCedula.getText().isEmpty() && !txtLastName.getText().isEmpty() && !txtName.getText().isEmpty()
                && !txtSalary.getText().isEmpty()) {
            btnInsert.setEnabled(true);
        } else {
            btnInsert.setEnabled(false);
        }
    }

    public void habilyClean() {
        if (!txtCedula.getText().isEmpty() && !txtLastName.getText().isEmpty() && !txtName.getText().isEmpty()
                && !txtSalary.getText().isEmpty()) {
            btnClear.setEnabled(true);
        } else {
            btnClear.setEnabled(false);
        }
    }

    public void clearFields() {
        txtCedula.setText("");
        txtLastName.setText("");
        txtName.setText("");
        CalendarBirth.setDateFormatString("");
        txtSalary.setText("");
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
            java.util.logging.Logger.getLogger(FrmContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmContact().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser CalendarBirth;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblErrorCedula;
    private javax.swing.JLabel lblErrorLastName;
    private javax.swing.JLabel lblErrorName;
    private javax.swing.JLabel lblErrorSalary;
    private javax.swing.JTable tblRegistration;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}