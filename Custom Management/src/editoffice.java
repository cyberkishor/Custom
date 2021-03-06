
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import smusemiv.connection.connection;
import utilities.validator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class editoffice extends javax.swing.JInternalFrame {

    /**
     * Creates new form editoffice
     */
     Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public editoffice() {
        initComponents();
        conn = connection.getConnection();
        this.fillOfficeCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        officeSelect = new javax.swing.JComboBox();
        code = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Add / Edit Office");
        setToolTipText("");

        jLabel3.setText("Office Code:");

        jLabel4.setText("Office Name:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add / Edit OFFICE");

        delete.setText("Delete Record");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel2.setText("Add/Edit :");

        save.setText("Save/Update");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        officeSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Add Office" }));
        officeSelect.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                officeSelectItemStateChanged(evt);
            }
        });
        officeSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                officeSelectActionPerformed(evt);
            }
        });

        code.setEditable(false);
        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(officeSelect, javax.swing.GroupLayout.Alignment.LEADING, 0, 196, Short.MAX_VALUE)
                                    .addComponent(code, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name))
                                .addGap(13, 13, 13)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(officeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void officeSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_officeSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_officeSelectActionPerformed

    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeActionPerformed

    private void officeSelectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_officeSelectItemStateChanged
        String Action = officeSelect.getSelectedItem().toString();
        if(!(Action.equals("Add Office"))){
            ComboboxItem item = (ComboboxItem) officeSelect.getSelectedItem();
            name.setText(item.toString());
            code.setText(item.getCode());
            code.setEditable(false);
           
        }else{
            name.setText("");
            code.setText("");
            code.setEditable(true);
        }   
        
    }//GEN-LAST:event_officeSelectItemStateChanged

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String Name = name.getText();
        String Code = code.getText();
        String Action = officeSelect.getSelectedItem().toString();
        String sql;
        
        validator v  = new validator();
        String error = "";
        
        if (!v.validateName(Name)) {
            error += "Invalid  Name \n";
        }
        if (!v.validateName(Code)) {
            error += "Invalid Code \n";
            
        }
        
        if(!v.validateName(Action)) {
            error += "Invalid Action \n";
        }
        if(!"".equals(error)) {
            JOptionPane.showMessageDialog(null, error, "Error",JOptionPane.WARNING_MESSAGE);
            
        } else {
            if(Action.equals("Add Office")){
               sql = "INSERT INTO office(officeCode,OfficeName) values (?,?)";
           }else{
               sql ="UPDATE office set officeCode =? ,OfficeName = ? WHERE officeCode='"+Code+"'";
           }

           String[] pararms = {Code, Name };

            try {
                if (connection.dbExecute(sql, pararms) == 1){
                   JOptionPane.showMessageDialog(this,"Item saved");
                   this.dispose();

                }} catch (SQLException ex) {
                Logger.getLogger(editoffice.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
            
    }//GEN-LAST:event_saveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Are u Sure ?", "Delate", JOptionPane.OK_CANCEL_OPTION) == 0)
        {
            String Code = code.getText();
            
            if(!(Code.equals(""))){
                String sql ="DELETE FROM office WHERE officeCode =?";
                try{
                    pst = conn.prepareStatement(sql);
                    pst.setString(1,Code);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Item Deleted");
                    this.dispose();
                    
                }catch(SQLException | HeadlessException e){
                    JOptionPane.showMessageDialog(this, e);
                }
            }else{
            JOptionPane.showMessageDialog(null, "Select Office First", "Error",JOptionPane.WARNING_MESSAGE);
        }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void fillOfficeCombo(){
        String sql = "Select * from office";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                
                officeSelect.addItem(new ComboboxItem(rs.getString("officeCode"),rs.getString("OfficeName")));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField code;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox officeSelect;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
