//   
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JFileChooser;

public class ContactFrame extends javax.swing.JFrame
{
   
    // create a reference for the default list model for the list
    DefaultListModel<String> model;
    
     // Lab 11: replace the array with an ArrayList.
    ArrayList<Contact> contactArrayList = new ArrayList<Contact>();

    /**
     * Creates new form ContactFrame
     */
    public ContactFrame()
    {
        initComponents(); 
        
        // create the default list model object
        model = new DefaultListModel<String>();
        
        // set the model to the list
        lstNames.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblStreet = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblZip = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        lblCount = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstNames = new javax.swing.JList<>();
        cbxContact = new javax.swing.JComboBox<>();
        lblContactType = new javax.swing.JLabel();
        txtDependentInfo = new javax.swing.JTextField();
        lblDependentInfo = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnAdd2 = new javax.swing.JButton();
        btnSort = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lab 5 by White");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lab 12 by CWhite"));

        lblName.setText("Name");

        lblPhone.setText("Phone");

        lblEmail.setText("Email");

        txtName.setText("White");

        txtPhone.setText("(555) 555 5555");

        txtEmail.setText("white@email.com");

        lblStreet.setText("Street");

        lblCity.setText("City");

        lblState.setText("State");

        lblZip.setText("Zip");

        txtStreet.setText("123 Lander");

        txtCity.setText("Mayfield");

        txtState.setText("OH");

        txtZip.setText("44124");

        lblCount.setText("Count:0");

        lstNames.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstNames);

        cbxContact.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Business", "Family", "Friend" }));
        cbxContact.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbxContactActionPerformed(evt);
            }
        });

        lblContactType.setText("Contact Type");

        lblDependentInfo.setText("Company");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCount)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPhone)
                            .addComponent(lblEmail)
                            .addComponent(lblName)
                            .addComponent(lblContactType)
                            .addComponent(lblDependentInfo))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(txtPhone)
                                    .addComponent(txtName))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblStreet)
                                    .addComponent(lblCity)
                                    .addComponent(lblState))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblZip)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtZip, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                                    .addComponent(txtStreet)
                                    .addComponent(txtCity)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbxContact, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDependentInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStreet)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblState)
                        .addComponent(lblZip)
                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContactType))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDependentInfo)
                    .addComponent(txtDependentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblCount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExitActionPerformed(evt);
            }
        });

        btnAdd2.setText("Add");
        btnAdd2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAdd2ActionPerformed(evt);
            }
        });

        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSortActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaveActionPerformed(evt);
            }
        });

        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd2)
                        .addGap(18, 18, 18)
                        .addComponent(btnSort)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnLoad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnAdd2)
                    .addComponent(btnSort)
                    .addComponent(btnDelete)
                    .addComponent(btnSave)
                    .addComponent(btnLoad))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExitActionPerformed
    {//GEN-HEADEREND:event_btnExitActionPerformed
        System.exit(0); 
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAdd2ActionPerformed
    {//GEN-HEADEREND:event_btnAdd2ActionPerformed
        
        //Cteating Contact variable
        Contact.ContactType type = Contact.ContactType.BUSINESS;
        
        //Lab 11: declare a reference to a Contact object
        Contact contact = null;
        
        //Add try catch block
        try
        {
        // get the rank from the combo box
        // use a switch statement to assign the rank based
        // on index selected
        switch(cbxContact.getSelectedIndex())
        {
            case 0:
                type = Contact.ContactType.BUSINESS;
                
                //Craete the ContactBusiness object from input
                contact = new ContactBusiness(txtName.getText(),txtEmail.getText(),
                txtPhone.getText(), txtStreet.getText(), txtCity.getText(),
                txtState.getText(), txtZip.getText(), type, txtDependentInfo.getText());
                
                //Add the ContactBusiness info to the model for the listbox
                model.addElement(contact.toString());
                contactArrayList.add(contact);
                break;
            case 1:
                type = Contact.ContactType.FAMILY;
                
                //Create the ContactFamily object from input
                contact = new ContactFamily(txtName.getText(),txtEmail.getText(),
                txtPhone.getText(), txtStreet.getText(), txtCity.getText(),
                txtState.getText(), txtZip.getText(), type, txtDependentInfo.getText());
                
                model.addElement(contact.toString());
                contactArrayList.add(contact);
                break;
            case 2:
                type = Contact.ContactType.FRIEND;
                
                contact = new ContactFriend(txtName.getText(),txtEmail.getText(),
                txtPhone.getText(), txtStreet.getText(), txtCity.getText(),
                txtState.getText(), txtZip.getText(), type,
                        Integer.parseInt(txtDependentInfo.getText()));
                
                //Add the ContactFamily info to the model fo the listBox
                model.addElement(contact.toString());
                contactArrayList.add(contact);
                break;
           
        }
//        index++;

        
        // Get the current count from the Contact class and display it in the label
        lblCount.setText("Count: " + Contact.getCount());
        }
        //catch method for ContactException rolling out the Contact Creation Error message
          catch(ContactException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Contact Creation Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Contact Creation Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSortActionPerformed
    {//GEN-HEADEREND:event_btnSortActionPerformed

        // Lab 11: replace array with arrayList
        // sort the arrayList with no comparitor, use the compareTo method.
        contactArrayList.sort(null);
        
        // clear out the model for the list box
        model.removeAllElements();

        // use for loop to add each element in the sorted ArrayList to the model
        for(Contact so : contactArrayList)
        {
            model.addElement(so.toString());
        }
    }//GEN-LAST:event_btnSortActionPerformed

    private void cbxContactActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbxContactActionPerformed
    {//GEN-HEADEREND:event_cbxContactActionPerformed
        //determine which was selected 
        switch(cbxContact.getSelectedIndex())
        {
            case 0:
                lblDependentInfo.setText("Company");
                break;
             
            case 1:
                lblDependentInfo.setText("Relationship");
                break;
                
            case 2: 
                lblDependentInfo.setText("Year Met");
                break;
        }
        
        txtDependentInfo.setText("");
    }//GEN-LAST:event_cbxContactActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteActionPerformed
    {//GEN-HEADEREND:event_btnDeleteActionPerformed
                // get the selected item in the list box.
        String strSelected = lstNames.getSelectedValue();
        
        // if nothing is selected display error message
        if(strSelected == null)
        {
            JOptionPane.showMessageDialog(this, "Nothing Seleced in List Box", 
                    "Deletion Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // get the name by finding the chacters starting at 0 upto but not including the ,
        String strName = strSelected.substring(0, strSelected.indexOf(','));
        
        // remove Employee using selected index from list box 
        contactArrayList.remove(lstNames.getSelectedIndex());
        
        // remove the selected value from the model by getting the selected index
        model.remove(lstNames.getSelectedIndex());
        
        // decrement the count
        Contact.decrementCount();
        
        // Get the current count from the Employee class and display it in the label
        lblCount.setText("Count: " + Contact.getCount());
      
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveActionPerformed
    {//GEN-HEADEREND:event_btnSaveActionPerformed
           // create a BufferedWriter and use it to write to the file.
	try
        {
            // create JFileChooser 
            JFileChooser fc = new JFileChooser();
            
            // display save dialog 
            fc.showSaveDialog(this);
            
            // get selected file
            File file = fc.getSelectedFile();
            
            // open the file
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(file));

            // use a for loop to write all the contact to the file
            for(Contact contact : contactArrayList)
            {
                myWriter.write(contact.toFile() + System.getProperty("line.separator"));
            }
            myWriter.close();	// immediately close the file when finished with it.
        } catch (Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage(), "File Write Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLoadActionPerformed
    {//GEN-HEADEREND:event_btnLoadActionPerformed
        try
        {
            // create JFileChooser
            JFileChooser fc = new JFileChooser();
            
            // display save dialog
            fc.showOpenDialog(this);
            
            // get selected file
            File file = fc.getSelectedFile();
            
            // create the BufferedReader
            BufferedReader myReader = new BufferedReader(new FileReader(file));
            
            // create reference to String to hold line from file
            String line;
            
            // Create reference to array to hold individual fields from the string.
            String[] fields;
                                 
            // read the first line
            line = myReader.readLine();
            // create reference to Contact object.
            Contact contact;
            // if line not null, file not empty
            while(line != null)
            {
                // split line it into its fields.
                fields = line.split(",");
                
                // get the type from field 6 and create the appropriate object
                Contact.ContactType type = Contact.ContactType.valueOf(fields[7]);
                switch(type)
                {
                    case BUSINESS:
                        contact = new ContactBusiness(fields[0], fields[1], fields[2], fields[3],
                        fields[4], fields[5], fields[6], type, fields[8]);
                    
                        // Add the salaryEmployee to the model for the listbox
                        model.addElement(contact.toString());
                    
                        // add the object to the arrayList
                        contactArrayList.add(contact);
                        break;
                    case FAMILY:
                        contact = new ContactFamily(fields[0], fields[1], fields[2], fields[3],
                        fields[4], fields[5], fields[6], type, fields[8]);
                    
                        // Add the HourlyEmployee to the model for the listbox
                        model.addElement(contact.toString());
                    
                        // add the object to the arrayList
                        contactArrayList.add(contact);
                        break;
                    case FRIEND:
                        contact = new ContactFriend(fields[0], fields[1], fields[2], fields[3],
                        fields[4], fields[5], fields[6], type, Integer.parseInt(fields[8]));
                        
                        // Add the HourlyEmployee to the model for the listbox
                        model.addElement(contact.toString());
                    
                        // add the object to the arrayList
                        contactArrayList.add(contact);
                    default:
                        System.out.println("Error: number of fields not 8");
                        break;
                }

		// read the next line.
		line = myReader.readLine();
            }
            // immediately close the file when finished with it.
            myReader.close();	
            
            // Get the current count from the Employee class and display it in the label
            lblCount.setText("Count: " + Contact.getCount());
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "File Read Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(ContactFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ContactFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ContactFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ContactFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ContactFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSort;
    private javax.swing.JComboBox<String> cbxContact;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblContactType;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblDependentInfo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblZip;
    private javax.swing.JList<String> lstNames;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDependentInfo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}