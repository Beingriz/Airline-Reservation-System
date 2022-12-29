/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.airlinereservationsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Md Rizwan
 */
public class AddAdmin extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddAdmin
     */
    String driverClassName ="com.mysql.cj.jdbc.Driver";
    String URL = "jdbc:mysql://localhost:3306/airlinesystem";
    String root = "root";
    String password = "System123";
    public AddAdmin() {
        initComponents();
        autoId();
        txt_adminId.setEditable(false);
        generateReport();
    }
    Connection con;
    PreparedStatement pre;
     public void autoId(){
        try {
            try {
                Class.forName(driverClassName);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddFlight.class.getName()).log(Level.SEVERE, null, ex);
            }
            con = DriverManager.getConnection(URL,root,password);
            java.sql.Statement s = con.createStatement();
            String query = "Select MAX(UserId) from admin";
            ResultSet rs =  s.executeQuery(query);
            rs.next();
            String amdinId = rs.getString("MAX(UserId)");
            if(amdinId ==  null){
                txt_adminId.setText("ADM001");
            }else{
                long id = Long.parseLong(amdinId.substring(3, amdinId.length()));
                id++;
                txt_adminId.setText("ADM"+String.format("%03d", id));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AddFlight.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void db_connection(){
        try {
            try {
                Class.forName(driverClassName);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddFlight.class.getName()).log(Level.SEVERE, null, ex);
            }
            con=DriverManager.getConnection(URL,root,password);
        } catch (SQLException ex) {
            Logger.getLogger(AddFlight.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      public void resetFields() {
        txt_fname.setText("");
        txt_lname.setText("");
        txt_username.setText("");
        txt_password.setText("");
        txt_phoneno.setText("");
        admin_dob.setDate(null);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_fname = new javax.swing.JTextField();
        txt_lname = new javax.swing.JTextField();
        admin_dob = new com.toedter.calendar.JDateChooser();
        txt_phoneno = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbl_fname = new javax.swing.JLabel();
        labl_lname = new javax.swing.JLabel();
        lbl_phoneno = new javax.swing.JLabel();
        lbl_dob = new javax.swing.JLabel();
        lbl_fname1 = new javax.swing.JLabel();
        labl_lname1 = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        btn_add_admin = new javax.swing.JButton();
        lbl_fname2 = new javax.swing.JLabel();
        txt_adminId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminTable = new javax.swing.JTable();

        setBackground(java.awt.SystemColor.controlLtHighlight);
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Admin Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        setClosable(true);
        setMaximizable(true);
        setTitle("Add Admin Panel");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(850, 500));

        txt_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fnameActionPerformed(evt);
            }
        });
        txt_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_fnameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fnameKeyTyped(evt);
            }
        });

        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("NEW ADMIN FORM");

        lbl_fname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_fname.setText("First Name");

        labl_lname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labl_lname.setText("Last Name");

        lbl_phoneno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_phoneno.setText("Phone No");

        lbl_dob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_dob.setText("DOB");

        lbl_fname1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_fname1.setText("Username");

        labl_lname1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labl_lname1.setText("Password");

        btn_cancel.setBackground(java.awt.SystemColor.textHighlight);
        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_add_admin.setBackground(java.awt.SystemColor.textHighlight);
        btn_add_admin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_add_admin.setForeground(new java.awt.Color(255, 255, 255));
        btn_add_admin.setText("Add Admin");
        btn_add_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_adminActionPerformed(evt);
            }
        });

        lbl_fname2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_fname2.setText("Admin ID");

        txt_adminId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_adminId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_adminIdActionPerformed(evt);
            }
        });

        adminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sl No", "Admin Id", "First Name", "Last Name", "DOB", "Phone No"
            }
        ));
        jScrollPane1.setViewportView(adminTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(306, 306, 306))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(lbl_fname2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_adminId, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_dob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_phoneno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbl_fname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labl_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(23, 23, 23)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(admin_dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_lname, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_phoneno)
                                        .addComponent(txt_fname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_fname1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labl_lname1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_username)
                                        .addComponent(txt_password))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(btn_add_admin)
                                .addGap(35, 35, 35)
                                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_adminId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_fname2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labl_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(admin_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_fname1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labl_lname1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fnameActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_add_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_adminActionPerformed
        // TODO add your handling code here:
        
        try {
            // TODO add your handling code here:
            db_connection();
            String UserId = txt_adminId.getText();
            String FirstName = txt_fname.getText();
            String LastName = txt_lname.getText();
            DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
            String Date = dt.format(admin_dob.getDate());
            String UserName = txt_username.getText();
            String Password = txt_password.getText();
            String PhoneNo = txt_phoneno.getText();   
            con=DriverManager.getConnection(URL,root,password);
            String insert  ="Insert into admin(UserId,FirstName,LastName,Dob,PhoneNo,UserName,Password)values(?,?,?,?,?,?,?)";
            pre = con.prepareStatement(insert);
            pre.setString(1, UserId);
            pre.setString(2, FirstName);
            pre.setString(3, LastName);
            pre.setString(4, Date);
            pre.setString(5, PhoneNo);
            pre.setString(6, UserName);
            pre.setString(7,Password);
            pre.executeUpdate();
            JOptionPane.showMessageDialog(null, "New Admin Addedd Successfully!");
            resetFields();
            autoId();
            generateReport();
            } catch (SQLException ex) {
                Logger.getLogger(AddFlight.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_add_adminActionPerformed

    private void txt_adminIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_adminIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_adminIdActionPerformed

    private void txt_fnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fnameKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_fnameKeyPressed

    private void txt_fnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fnameKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_fnameKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable adminTable;
    private com.toedter.calendar.JDateChooser admin_dob;
    private javax.swing.JButton btn_add_admin;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labl_lname;
    private javax.swing.JLabel labl_lname1;
    private javax.swing.JLabel lbl_dob;
    private javax.swing.JLabel lbl_fname;
    private javax.swing.JLabel lbl_fname1;
    private javax.swing.JLabel lbl_fname2;
    private javax.swing.JLabel lbl_phoneno;
    private javax.swing.JTextField txt_adminId;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_phoneno;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    public void generateReport() {
        try {
            db_connection();
            // Generating Admin Report Table Data
            String fetch = "Select * from admin";
            pre = con.prepareStatement(fetch);
            ResultSet  rs = pre.executeQuery();
            ResultSetMetaData records  = rs.getMetaData();
            
            int count = records.getColumnCount();
            DefaultTableModel table = (DefaultTableModel) adminTable.getModel();
            table.setRowCount(0);
            int slno = 1;
            while(rs.next()){
                Vector v = new Vector();
                for(int i=0; i<count; i++){
                    v.add(slno);
                    v.add(rs.getString("UserId"));
                    v.add(rs.getString("FirstName"));
                    v.add(rs.getString("LastName"));
                    v.add(rs.getString("Dob"));
                    v.add(rs.getString("PhoneNo"));
                }
                table.addRow(v);
                slno++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
}
