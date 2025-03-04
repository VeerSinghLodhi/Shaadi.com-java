package wedding__management__system;

import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
public final class Wedding_Parent_Page extends javax.swing.JFrame {

    static String cuser;
    static String upass;
    Connect c;
    ResultSet rs;
    int recieverCode;

    public Wedding_Parent_Page(String cuser, String upass) {
        try {
            c = new Connect();
            c.getConnect();
            Wedding_Parent_Page.cuser = cuser;
            Wedding_Parent_Page.upass = upass;
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            initComponents();
            this.setExtendedState(MAXIMIZED_BOTH);
            jLabel1.setText("Current User : " + Wedding_Parent_Page.cuser);
            System.out.println("Username is " + cuser);
            System.out.println("Password is " + upass);
            getAdmin();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error is " + e, "Error!!", 0);
        }

    }

    void getWindowTheme() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }

    void getLinuxTheme() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }

    void getCheckMessage() {
        try {

            String sql;
            sql = "select pro_code from profile_master where username='" + cuser + "'";
            System.out.println(sql);
            rs = c.stmt.executeQuery(sql);
            rs.next();
            recieverCode = rs.getInt(1);
            sql = "select count(*) from message_master where isread='N' and reciever=" + recieverCode;
            System.out.println(sql);
            rs = c.stmt.executeQuery(sql);
            rs.next();
            int count = rs.getInt(1);
            System.out.println(count);
            if (count != 0) {
                jMenu1.setText("MESSAGE(" + count + ")");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }

    void getAdmin() {
        if (cuser.equals("admin") && upass.equals("admin")) {
            editMenu.setVisible(false);
            jMenu2.setVisible(false);
            jLabel1.setVisible(true);
            jMenu1.setVisible(false);
        } else if (cuser.equals("") && upass.equals("")) {
            jMenu2.setVisible(false);
            jMenu3.setVisible(false);
            jLabel1.setVisible(false);
            jMenu1.setVisible(false);
        } else {
            editMenu.setVisible(false);
            jMenu3.setVisible(false);
            jMenu1.setVisible(true);
            jLabel1.setText("Current User : " + Wedding_Parent_Page.cuser);
            getCheckMessage();
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();
        cutMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Current User :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuBar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 0), 3, true));

        editMenu.setMnemonic('e');
        editMenu.setText("REGISTRATION");
        editMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        cutMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cutMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cutMenuItem1.setMnemonic('t');
        cutMenuItem1.setText("New");
        cutMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem1);

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem1.setText("Back");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem1);

        menuBar.add(editMenu);

        jMenu2.setText("PROFILE");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem4.setText("Search Profile");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem6.setText("Update Profile");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem3.setText("Change Password");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem9.setText("Delete Profile");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem2.setText("Log out");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        menuBar.add(jMenu2);

        jMenu3.setText("ADMIN");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem5.setText("Password Change");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem7.setText("Log out");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        menuBar.add(jMenu3);

        jMenu1.setText("MESSAGES");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem8.setText("Messages");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        menuBar.add(jMenu1);

        jMenu4.setText("THEME");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem10.setText("Windows");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("Linux");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        menuBar.add(jMenu4);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Change_Password p1 = new Change_Password();
        p1.setVisible(true);
        desktopPane.add(p1);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Admin_Change_Password adim = new Admin_Change_Password();
        adim.setVisible(true);
        desktopPane.add(adim);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void cutMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItem1ActionPerformed
        Add_New addn = new Add_New();
        addn.setVisible(true);
        desktopPane.add(addn);
    }//GEN-LAST:event_cutMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Record_Search s1 = new Record_Search();
        s1.setVisible(true);
        desktopPane.add(s1);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Modify_Profile p1 = new Modify_Profile();
        p1.setVisible(true);
        desktopPane.add(p1);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        logout();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    void logout() {
        this.setVisible(false);
        Login_Page l1 = new Login_Page();
        l1.setLocationRelativeTo(null);
        l1.setVisible(true);
    }
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        logout();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        logout();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Delete_Profile d1 = new Delete_Profile();
        d1.setVisible(true);
        desktopPane.add(d1);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        Message_Master m1 = new Message_Master();
        m1.setVisible(true);
        desktopPane.add(m1);
        try {
            c.stmt.executeUpdate("Update message_master set isread='Y' where reciever=" + recieverCode);
            jMenu1.setText("MESSAGE");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        getWindowTheme();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        getLinuxTheme();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wedding_Parent_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Wedding_Parent_Page WPP = new Wedding_Parent_Page("", "");
                WPP.setVisible(true);
                WPP.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cutMenuItem1;
    public javax.swing.JDesktopPane desktopPane;
    public static javax.swing.JMenu editMenu;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    public static javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
