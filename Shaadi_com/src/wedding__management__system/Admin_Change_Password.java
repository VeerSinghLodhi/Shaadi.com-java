
package wedding__management__system;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
public class Admin_Change_Password extends javax.swing.JInternalFrame implements Runnable {
ResultSet rs;
Connect c;
    public Admin_Change_Password() {
        initComponents();
        c=new Connect();
        c.getConnect();
        getUsernames();
        jProgressBar1.setVisible(false);
    }
    void getUsernames()
    {
        try
        {
            String sql="select username from profile_master";
            int i=0;
            rs=c.stmt.executeQuery(sql);
            while(rs.next())
            {
                if(!rs.getString(1).equals("admin"))
                    jComboBox1.insertItemAt(rs.getString(1), i++);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this,"Error is "+e,"Error!!",0);
        }
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jComboBox1 = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(224, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Select Username");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("New Password");

        jCheckBox1.setBackground(new java.awt.Color(224, 255, 255));
        jCheckBox1.setText("Show");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jPasswordField2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusLost(evt);
            }
        });

        jPasswordField3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Confirm Password");

        jButton4.setBackground(new java.awt.Color(255, 204, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("Reset");
        jButton4.setToolTipText("Close this page");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 204, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setText("Update");
        jButton5.setToolTipText("Close this page");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 204, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setText("Close");
        jButton6.setToolTipText("Close this page");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(0, 0, 0));
        jProgressBar1.setString("Password Updating......");
        jProgressBar1.setStringPainted(true);

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(41, 41, 41)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        try
        {
            if(jCheckBox1.isSelected())
            {
                jPasswordField2.setEchoChar((char)0);
                jPasswordField3.setEchoChar((char)0);
                jCheckBox1.setText("Hide");
            }
            else
            {
                jPasswordField2.setEchoChar('*');
                jPasswordField3.setEchoChar('*');
                jCheckBox1.setText("Show");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Error is "+e,"Error!!",0);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
           try
           {
                if(jComboBox1.getSelectedIndex()==-1)
                {
                    JOptionPane.showMessageDialog(this, "select a username");
                    return;
                }
                String new_Pass1,new_Pass2;            
                char [] p1=jPasswordField2.getPassword();
                char [] p2=jPasswordField3.getPassword();
                new_Pass1=new String(p1);
                new_Pass2=new String(p2);
                if(new_Pass1.equals(new_Pass2))
                {
                    Thread t1=new Thread(this);
                    t1.start();
                }
                else
                    JOptionPane.showMessageDialog(this,"Password does not match");
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(this,"Error is "+e,"Error!!",0);
           }
            
            
    }//GEN-LAST:event_jButton5ActionPerformed
    public void run()
    {
        try
        {
            jProgressBar1.setVisible(true);
            int val=0;
            while(val<100)
            {
                jProgressBar1.setValue(val++);
                Thread.sleep(40);
            }
            getUpdatePassword();            
        }
        catch(InterruptedException e)
        {
            JOptionPane.showMessageDialog(this, "Error is "+e,"Error!!",0);
        }
    }
    void getClear()
    {
        jPasswordField2.setText(null);
        jPasswordField3.setText(null);
        jComboBox1.setSelectedIndex(-1);
        jProgressBar1.setVisible(false);
    }
    void getUpdatePassword()
    {
        try
        {
            String username,new_Pass1;
            username=jComboBox1.getSelectedItem().toString();
            char [] p1=jPasswordField2.getPassword();
            new_Pass1=new String(p1);
            username=jComboBox1.getSelectedItem().toString();
            String sql="Update Profile_master set password='"+new_Pass1+"' where username='"+username+"'";
            c.stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"Password Updated");
            getClear();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this,"Error is "+e,"Error!!",0);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Error is "+e,"Error!!",0);
        }
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    try {
        c.con.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this,"Error is "+ex,"Error!!",0);
    }
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusLost
        try
        {
            String password;
            char [] pass=jPasswordField2.getPassword();
            password=new String(pass);
            password=password.trim();           //Password Validation
            jPasswordField2.setText(password);
            if(password.length()<8  ||  password.length()>20)
            {
                jLabel2.setForeground(Color.red);
                jLabel2.setText("New Password*");
                jPasswordField2.requestFocus();
            }
            else
            {
                jLabel2.setForeground(Color.WHITE);
                jLabel2.setText("New Password");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error is "+e);
        }try
        {
            String password;
            char [] pass=jPasswordField2.getPassword();
            password=new String(pass);
            password=password.trim();           //Password Validation
            jPasswordField2.setText(password);
            if(password.length()<8  ||  password.length()>20)
            {
                jLabel2.setForeground(Color.red);
                jLabel2.setText("New Password*");
                jPasswordField2.requestFocus();
            }
            else
            {
                jLabel2.setForeground(Color.WHITE);
                jLabel2.setText("New Password");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error is "+e);
        }
    }//GEN-LAST:event_jPasswordField2FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
