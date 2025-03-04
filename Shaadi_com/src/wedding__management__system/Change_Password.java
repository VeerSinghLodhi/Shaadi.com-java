package wedding__management__system;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.ImageIcon;

public class Change_Password extends javax.swing.JInternalFrame implements Runnable {

    Connect c;
    String username = Wedding_Parent_Page.cuser;
    ResultSet rs;

    public Change_Password() {
        initComponents();
        c = new Connect();
        c.getConnect();
        jProgressBar1.setVisible(false);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Change Password");

        jPanel1.setBackground(new java.awt.Color(224, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Current Password");

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("New Password");

        jCheckBox1.setBackground(new java.awt.Color(224, 255, 255));
        jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close eye icon.png"))); // NOI18N
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
        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyPressed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
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
                .addContainerGap(50, Short.MAX_VALUE))
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
        try {
            if (jCheckBox1.isSelected()) {
                jPasswordField1.setEchoChar((char) 0);  //Show Password in PasswordField
                ImageIcon icon = new ImageIcon("Images\\open eye icon.png");                    //  PHOTO RESET
                Image newing = icon.getImage();
                icon = new ImageIcon(newing);
                jCheckBox1.setIcon(icon);
            } else //use Checkbox
            {
                jPasswordField1.setEchoChar('*'); // Hide Password in PasswordField
                ImageIcon icon = new ImageIcon("Images\\close eye icon.png");                    //  PHOTO RESET
                Image newing = icon.getImage();
                icon = new ImageIcon(newing);
                jCheckBox1.setIcon(icon);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        getClear();
    }//GEN-LAST:event_jButton4ActionPerformed
    void getClear() {
        try {
            jPasswordField1.setText(null);
            jPasswordField2.setText(null);
            jPasswordField3.setText(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }

    void getUpdatePassword() {
        try {
            String current, old_Pass, new_Pass1, new_Pass2, sql;
            char[] p1 = jPasswordField1.getPassword();
            char[] p2 = jPasswordField2.getPassword();
            char[] p3 = jPasswordField3.getPassword();

            old_Pass = new String(p1);
            new_Pass1 = new String(p2);
            new_Pass2 = new String(p3);

            if (new_Pass1.equals(new_Pass2)) {
                sql = "select password from profile_master where username='" + username + "'";
                System.out.println(sql);
                rs = c.stmt.executeQuery(sql);
                rs.next();
                current = rs.getString(1);
                System.out.println(current);
                if (current.equals(old_Pass)) {
                    sql = "update profile_master set password='" + new_Pass1 + "' where username='" + username + "'";
                    System.out.println(sql);
                    c.stmt.executeUpdate(sql);
                    jProgressBar1.setVisible(false);
                    JOptionPane.showMessageDialog(this, "Password Updated");
                    getClear();
                } else {
                    jProgressBar1.setVisible(false);
                    JOptionPane.showMessageDialog(this, "Current Password Is Incorrect");
                }
            } else {
                jProgressBar1.setVisible(false);
                JOptionPane.showMessageDialog(this, "Password does no match");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }

    public void run() {
        try {
            jProgressBar1.setVisible(true);
            int val = 0;
            while (val < 100) {
                jProgressBar1.setValue(val++);
                Thread.sleep(40);
            }
            getUpdatePassword();
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }

    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            String old_Pass, new_Pass1, new_Pass2;
            char[] p1 = jPasswordField1.getPassword();
            char[] p2 = jPasswordField2.getPassword();
            char[] p3 = jPasswordField3.getPassword();

            old_Pass = new String(p1);
            new_Pass1 = new String(p2);
            new_Pass2 = new String(p3);
            if (old_Pass.length() < 3) {
                JOptionPane.showMessageDialog(this, "Enter Current Password");
                return;
            }
            if (new_Pass1.length() < 3) {
                JOptionPane.showMessageDialog(this, "Enter NewPassword");
                return;
            }
            if (new_Pass2.length() < 3) {
                JOptionPane.showMessageDialog(this, "Enter Comfirm Password");
                return;
            }
            if (!new_Pass1.equals(new_Pass2)) {
                JOptionPane.showMessageDialog(this, "Password do not match");
                return;
            }
            Thread t1 = new Thread(this);
            t1.start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            c.con.close();
            this.setVisible(false);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error is " + ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusLost
        try {
            String password;
            char[] pass = jPasswordField2.getPassword();
            password = new String(pass);
            password = password.trim();           //Password Validation
            jPasswordField2.setText(password);
            if (password.length() < 8 || password.length() > 20) {
                jLabel2.setForeground(Color.red);
                jLabel2.setText("New Password*");
                jPasswordField2.requestFocus();
            } else {
                jLabel2.setForeground(Color.BLACK);
                jLabel2.setText("New Password");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error is " + e);
        }
    }//GEN-LAST:event_jPasswordField2FocusLost

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if (evt.getKeyCode() == 10)
            jPasswordField2.requestFocus();
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jPasswordField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyPressed
        if (evt.getKeyCode() == 10)
            jPasswordField3.requestFocus();
    }//GEN-LAST:event_jPasswordField2KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
