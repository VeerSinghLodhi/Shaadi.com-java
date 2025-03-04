package wedding__management__system;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.FileInputStream;             // Import required package
import java.io.IOException;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class Add_New extends javax.swing.JInternalFrame {

    Connect c;
    ResultSet rs;
    static String username, password;
    int profile_code;
    String fileName=null, kundliName=null;

    public Add_New() {
        c = new Connect();
        c.getConnect();
        initComponents();
        //connection with data base

        getProfileCode();   //show profile code 

        getState();         //show state name in the combobox

        getReligion();      //show religion name in the combobox

        getCaste();         //show caste name in the combobox

        getProfession();    //show profession name in the combobox

    }

    void getProfileCode() {
        try {
            String sql = "select max(pro_code) from profile_master";
            rs = c.stmt.executeQuery(sql);
            rs.next();
            if (rs == null) //Check profile code from the data base
            {
                profile_code = 1;
            } else {
                profile_code = rs.getInt(1) + 1;
            }
            System.out.println("Profile Code is " + profile_code);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }

    void getState() {
        try {
            int i = 0;
            String sql = "select s_name from state_master";
            rs = c.stmt.executeQuery(sql);
            while (rs.next()) // Insert state name from the data base
            {
                jComboBox1.insertItemAt(rs.getString(1), i++);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }

    }

    void getReligion() {
        try {
            int i = 0;
            String sql = "select rname from religion_master";
            rs = c.stmt.executeQuery(sql);
            while (rs.next()) //Insert religion name from the data base
            {
                jComboBox5.insertItemAt(rs.getString(1), i++);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }

    }

    void getCaste() {
        try {
            int i = 0;
            String sql = "select  cname from  caste_master";
            rs = c.stmt.executeQuery(sql);
            while (rs.next()) //Insert caste name from the data base
            {
                jComboBox6.insertItemAt(rs.getString(1), i++);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }

    void getProfession() {
        try {
            int i = 0;
            String sql = "select pname from profession_master";
            rs = c.stmt.executeQuery(sql);
            while (rs.next()) // Insert profession name from the data base
            {
                jComboBox8.insertItemAt(rs.getString(1), i++);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }

    void getSubCaste() {
        try {
            jComboBox7.removeAllItems();
            String sql, casteName;
            int i = 0, casteCode;
            casteName = jComboBox6.getSelectedItem().toString();
            System.out.println(casteName);
            sql = "select cast_code from caste_master where cname ='" + casteName + "'";
            System.out.println(sql);
            rs = c.stmt.executeQuery(sql);
            rs.next();
            casteCode = rs.getInt(1);  // Find caste code?

            System.out.println(casteCode);
            sql = "select sname from sub_caste_master where SUB_CAST_CODE=" + casteCode;
            rs = c.stmt.executeQuery(sql);
            while (rs.next()) // Insert sub caste name according to caste code from the data base
            {
                jComboBox7.insertItemAt(rs.getString(1), i++);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REGISTRATION FORM");
        setPreferredSize(new java.awt.Dimension(1150, 620));

        jPanel1.setBackground(new java.awt.Color(224, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 20, 76, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setToolTipText("Enter Name");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 20, 207, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Gender");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 65, 91, -1));

        jRadioButton1.setBackground(new java.awt.Color(224, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jRadioButton1.setText("Male");
        jRadioButton1.setToolTipText("Select Gender");
        jRadioButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jRadioButton1FocusLost(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 65, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(224, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jRadioButton2.setText("Female");
        jRadioButton2.setToolTipText("Select Gender");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 65, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 105, 91, 80));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Contact No.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 252, 126, 31));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField3.setToolTipText("Enter Contact Number");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 252, 207, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("State");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 301, 78, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("District");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 357, 94, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("E-mail");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 206, 90, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox1.setToolTipText("Select State");
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox1FocusLost(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 301, 207, -1));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField5.setToolTipText("Enter E-mail Address");
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 203, 207, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Annual Income");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 403, -1, 36));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Complexion");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 460, 124, -1));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Income", "5000", "Less than 10000", "Greater than 10000" }));
        jComboBox2.setSelectedIndex(-1);
        jComboBox2.setToolTipText("Select Annual Income");
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 406, 207, -1));

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Light", "Medium", "Deep(Dark)", "Fair" }));
        jComboBox3.setSelectedIndex(-1);
        jComboBox3.setToolTipText("Select Complexion");
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 457, 207, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Religion");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 83, -1));

        jComboBox5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox5.setToolTipText("Select Religion");
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 208, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Caste");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 65, 64, -1));

        jComboBox6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox6.setToolTipText("Select Caste");
        jComboBox6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox6ItemStateChanged(evt);
            }
        });
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 65, 208, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Sub Caste");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jComboBox7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox7.setToolTipText("Select Sub Caste");
        jPanel1.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 208, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Profession");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        jComboBox8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox8.setToolTipText("Select Profession");
        jPanel1.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 208, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Height");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Weight(KG)");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        jComboBox9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 (feet)", "3.5 (feet)", "4 (feet)", "4.5 (feet)", "5 (feet)", "5.5 (feet)", "6 (feet)", "6.5 (feet)", "7 (feet)", " " }));
        jComboBox9.setSelectedIndex(-1);
        jComboBox9.setToolTipText("Select Height");
        jPanel1.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 208, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Username");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 100, -1));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField6.setToolTipText("Enter Username ");
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 208, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Password");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 100, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Profile Photo");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 204, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setText("Browse");
        jButton4.setToolTipText("Select Profile Photo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 200, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("Enter Address");
        jTextArea1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextArea1FocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 108, 207, 80));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setText("Kundli");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, -1, -1));

        jComboBox4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox4.setToolTipText("Select District");
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 354, 207, -1));

        jButton5.setBackground(new java.awt.Color(255, 204, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton5.setText("Browse");
        jButton5.setToolTipText("Select a Kundli Pictute");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Status");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 305, -1, -1));

        jComboBox11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Divorced" }));
        jComboBox11.setSelectedIndex(-1);
        jComboBox11.setToolTipText("Select Marital Status");
        jPanel1.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 305, 208, -1));

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPasswordField1.setToolTipText("Create Password");
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 208, -1));

        jCheckBox1.setBackground(new java.awt.Color(224, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close eye icon.png"))); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 454, 40, 30));

        jSpinner1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(15, 15, 150, 1));
        jSpinner1.setToolTipText("Select Weight");
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 208, -1));

        jPanel3.setBackground(new java.awt.Color(224, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(130, 129));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Person-square-icon-01.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel25)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel25)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 250, -1, 134));

        jPanel4.setBackground(new java.awt.Color(224, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(130, 129));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/KundliPic.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel27)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel27)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 65, -1, 132));

        jPasswordField2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPasswordField2.setToolTipText("Create Password");
        jPasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusLost(evt);
            }
        });
        jPanel1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 454, 208, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("Confirm Password");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 454, 160, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Age");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 124, -1));

        jComboBox10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70" }));
        jComboBox10.setSelectedIndex(-1);
        jComboBox10.setToolTipText("Select Complexion");
        jPanel1.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 508, 207, -1));

        jPanel2.setBackground(new java.awt.Color(224, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton3.setBackground(new java.awt.Color(255, 204, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Close");
        jButton3.setToolTipText("Close this page");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.setToolTipText("Reset All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(15, 15, 15))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 530, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox6ItemStateChanged
        if (jComboBox6.getSelectedIndex() >= 0)
            getSubCaste(); // CALL SUB CASTE METHOD
    }//GEN-LAST:event_jComboBox6ItemStateChanged

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed

    }//GEN-LAST:event_jComboBox6ActionPerformed

    void getClear() {
        jComboBox1.setSelectedIndex(-1);
        jComboBox2.setSelectedIndex(-1);
        jComboBox3.setSelectedIndex(-1);
        jComboBox4.setSelectedIndex(-1);
        jComboBox5.setSelectedIndex(-1);
        jComboBox6.setSelectedIndex(-1);
        jComboBox7.setSelectedIndex(-1);
        jComboBox8.setSelectedIndex(-1);
        jComboBox9.setSelectedIndex(-1);
        jComboBox11.setSelectedIndex(-1);
        buttonGroup1.clearSelection();
        jComboBox4.removeAllItems();  //district
        jComboBox7.removeAllItems();    //sub caste
        jSpinner1.setValue(15);
        jTextArea1.setText(null);
        jTextField1.setText(null);
        jTextField3.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);
        jPasswordField1.setText(null);
        jLabel27.setIcon(null);
        jLabel25.setIcon(null);
        jTextField1.requestFocus();
        ImageIcon icon = new ImageIcon("Images\\KundliPic.png");                    //  PHOTO RESET
        Image newing = icon.getImage();
        icon = new ImageIcon(newing);
        jLabel27.setIcon(icon);
        
        ImageIcon icon2 = new ImageIcon("Images\\SquareSizeNoProfilePictrue.png");                    //  PHOTO RESET
        Image newing1 = icon2.getImage();
        icon2=new ImageIcon(newing1);
        jLabel25.setIcon(icon2);

    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            jFileChooser1.showOpenDialog(this);
            fileName = jFileChooser1.getSelectedFile().getPath();
            ImageIcon icon = new ImageIcon(fileName);
            Image newing = icon.getImage().getScaledInstance(130, 129, Image.SCALE_SMOOTH);
            icon = new ImageIcon(newing);
            jLabel25.setIcon(icon);
            // Select photo from the file for (profile photo)
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Select a picture for Profile Photo ");
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedIndex() >= 0)
            getDistrict(); // CALL DISTRICT METHOD
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            c.con.close();
            this.setVisible(false);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error is "+ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        getClear();
    }//GEN-LAST:event_jButton2ActionPerformed
    void getMessage(String message) {
        JOptionPane.showMessageDialog(this, "Please Enter "+message,"Message",0);
    }
    void getMessageForList(String message)
    {
        JOptionPane.showMessageDialog(this, "Please Select a "+message,"Message",0);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String password1,name, gender, address, contact_no, state, district, email, religion, caste, sub_caste, profession, annual_income, complexion, height, weight, marital_status,age;
            if (jTextField1.getText().length() < 2 || jTextField1.getText().length() > 40) {
                jLabel1.setForeground(Color.red);
                jLabel1.setText("Name*");
                jTextField1.requestFocus();
                return;
            }
            jLabel1.setForeground(Color.BLACK);
            jLabel1.setText("Name");
            
            if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) {
                getMessageForList("Gender");
                return;
            }
            if (jTextArea1.getText().equals("")) {
                getMessage("Address");
                return;
            }
            if (jTextField5.getText().equals("")) {
                getMessage("Email");
                return;
            }
            if (jTextField3.getText().equals("")) {
                getMessage("Contact");
                return;
            }
            if (jComboBox1.getSelectedIndex() == -1) {
                getMessageForList("State");
                return;
            }
            if (jComboBox4.getSelectedIndex() == -1) {
                getMessageForList("District");
                return;
            }
            if (jComboBox2.getSelectedIndex() == -1) {
                getMessageForList("Annual Income");
                return;
            }
            if (jComboBox3.getSelectedIndex() == -1) {
                getMessageForList("Complexion");
                return;
            }
            if (jComboBox10.getSelectedIndex() == -1) {
                getMessageForList("Age");
                return;
            }
            if (jComboBox5.getSelectedIndex() == -1) {
                getMessageForList("Religion");
                return;
            }
            if (jComboBox6.getSelectedIndex() == -1) {
                getMessageForList("Caste");
                return;
            }
            if (jComboBox7.getSelectedIndex() == -1) {
                getMessageForList("Sub Caste");
                return;
            }
            if (jComboBox8.getSelectedIndex() == -1) {
                getMessageForList("Professoin");
                return;
            }
            if (jComboBox9.getSelectedIndex() == -1) {
                getMessageForList("Height");
                return;
            }
            if (jComboBox11.getSelectedIndex() == -1) {
                getMessageForList("Marital Status");
                return;
            }
            if (jTextField6.getText().equals("")) {
                getMessage("Username");
                return;
            }
            if (jPasswordField1.getText().equals("")) {
                getMessage("Password");
                return;
            }
            if (jPasswordField2.getText().equals("")) {
                getMessage("Comfirm Password");
                return;
            }
            if(null==kundliName)
            {
                JOptionPane.showMessageDialog(this,"Select a Kundli Picture","Message",0);
                return;
            }
            if(null==fileName)
            {
                JOptionPane.showMessageDialog(this,"Select a Profile Picture","Message",0);
                return;
            }
            
            name = jTextField1.getText();
            if (jRadioButton1.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            contact_no = jTextField3.getText();
            address = jTextArea1.getText();
            marital_status = jComboBox11.getSelectedItem().toString();
            age=jComboBox10.getSelectedItem().toString();

            state = jComboBox1.getSelectedItem().toString();
            rs = c.stmt.executeQuery("select state_code from state_master where s_name='" + state + "'");
            rs.next();
            state = rs.getString(1);      // FIND THE STATE CODE FOR SAVE IN THE DATA BASE(Foreign Key)

            district = jComboBox4.getSelectedItem().toString();
            rs = c.stmt.executeQuery("select district_code from district_master where dname='" + district + "'");
            rs.next();
            district = rs.getString(1);    //FIND THE DISTRICT CODE FOR SAVE IN THE DATA BASE(Foreign Key)

            email = jTextField5.getText();
            annual_income = jComboBox2.getSelectedItem().toString();
            complexion = jComboBox3.getSelectedItem().toString();

            religion = jComboBox5.getSelectedItem().toString();
            rs = c.stmt.executeQuery("select sno from religion_master where rname='" + religion + "'");
            rs.next();
            religion = rs.getString(1);   //FIND THE RELIGION CODE FOR SAVE IN THE DATA BASE(Foreign Key)

            caste = jComboBox6.getSelectedItem().toString();
            rs = c.stmt.executeQuery("select cast_code from caste_master where cname='" + caste + "'");
            rs.next();
            caste = rs.getString(1);  //FIND THE CASTE CODE FOR SAVE IN THE DATA BASE(Foreign Key)

            sub_caste = jComboBox7.getSelectedItem().toString();
            rs = c.stmt.executeQuery("select sub_code from sub_caste_master where sname='" + sub_caste + "'");
            rs.next();
            sub_caste = rs.getString(1);  //FIND THE SUB CASTE CODE FOR SAVE IN THE DATA BASE(Foreign Key)

            profession = jComboBox8.getSelectedItem().toString();
            rs = c.stmt.executeQuery("Select p_code from profession_master where pname='" + profession + "'");
            rs.next();
            profession = rs.getString(1); // FIND THE PROFESSION CODE FOR SAVE IN THE DATA BASE(Foreign Key)

            height = jComboBox9.getSelectedItem().toString();
            weight = jSpinner1.getValue().toString();
            username = jTextField6.getText();
            char[] pword1 = jPasswordField1.getPassword();
            char[] pword2 =jPasswordField2.getPassword();
            password = new String(pword1);
            password1=new String(pword2);

            if(!(password.equals(password1)))
            {
                JOptionPane.showMessageDialog(this,"Password does not match");
                return;
            }
            getProfileCode();

            PreparedStatement ps = c.con.prepareStatement("insert into profile_master values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, profile_code);
            ps.setString(2, name);
            ps.setString(3, gender);
            ps.setString(4, email);
            ps.setString(5, address);
            ps.setInt(6, Integer.parseInt(state));
            ps.setInt(7, Integer.parseInt(district));
            ps.setString(8, contact_no);
            ps.setInt(9, Integer.parseInt(religion));
            ps.setInt(10, Integer.parseInt(caste));
            ps.setInt(11, Integer.parseInt(sub_caste));
            ps.setInt(12, Integer.parseInt(profession));
            ps.setString(13, annual_income);
            ps.setString(14, complexion);
            ps.setString(15, height);
            ps.setString(16, weight);
            ps.setString(17, "Yes");
            ps.setString(18, username);
            ps.setString(19, password);
            FileInputStream profile_photo = new FileInputStream(fileName);
            ps.setBinaryStream(20, profile_photo, profile_photo.available());
            FileInputStream kundli_photo = new FileInputStream(kundliName);
            ps.setBinaryStream(21, kundli_photo, kundli_photo.available());
            ps.setString(22, marital_status);
            ps.setString(23, age);
            
            ps.executeUpdate();                 // INSERT INTO DATA BASE
            JOptionPane.showMessageDialog(this, "Registration Successful");
            getClear();                         // After Data saved in data base clear all textfield combobox etc.            
            
            this.setVisible(false);
            Login_Page l1=new Login_Page();
            l1.setVisible(true);
            l1.setLocationRelativeTo(null);

        } catch (SQLException | java.io.FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        } catch (HeadlessException | IOException | NumberFormatException  e) {
            JOptionPane.showMessageDialog(this, " Other Error is " + e, "Error!!", 0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            jFileChooser1.showOpenDialog(this);
            kundliName = jFileChooser1.getSelectedFile().toPath().toString();
            ImageIcon icon = new ImageIcon(kundliName);
            Image newing = icon.getImage().getScaledInstance(130, 129, Image.SCALE_SMOOTH);
            icon = new ImageIcon(newing);
            jLabel27.setIcon(icon);
        } //Kundli picture
        catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Select a kundli picture ");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
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


    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        try {
            String number = jTextField3.getText();
            number = number.trim();
            jTextField3.setText(number);        // Contact Validation
            if (number.length() < 10 || number.length() > 10) {
                jLabel4.setForeground(Color.red);
                jLabel4.setText(null);
                jLabel4.setText("Contact No.*");
                jTextField3.requestFocus();
                return;
            }
            if (number.length() == 10) {
                jLabel4.setForeground(Color.BLACK);
                jLabel4.setText("Contact No.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
//        try {
//            String name,cname="";
//            name = jTextField1.getText();
//            name = name.trim();
//            jTextField1.setText(name);          // Name validation
//            
//
//            
//            cname+=Character.toUpperCase(name.charAt(0));
//            for(int i=1;i<name.length();i++)
//            {
//                char ch=name.charAt(i);
//                if(Character.isWhitespace(ch)){
//                    cname+=" ";
//                    cname+=Character.toUpperCase(name.charAt(i+1));
//                    i++;
//                }
//                else
//                    cname+=ch;
//            }
//            System.out.println("Correct name is "+cname);
//            jTextField1.setText(cname);
//            
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
//        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jRadioButton1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRadioButton1FocusLost
        try {
            if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) {
                jLabel2.setForeground(Color.red);
                jLabel2.setText(null);                  //Gender Validation
                jLabel2.setText("Gender*");
                jRadioButton1.requestFocus();
                return;
            }

            jLabel2.setForeground(Color.BLACK);
            jLabel2.setText("Gender");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }


    }//GEN-LAST:event_jRadioButton1FocusLost

    private void jTextArea1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusLost
        try {
            String address ,caddress="";
            address = jTextArea1.getText();
            address = address.trim();
            jTextArea1.setText(address);
            if (address.length() < 5) //Address Validation
            {
                jLabel3.setForeground(Color.red);
                jLabel3.setText(null);
                jLabel3.setText("Address*");
                jTextArea1.requestFocus();
                return;
            }

            jLabel3.setForeground(Color.BLACK);
            jLabel3.setText("Address");
            caddress+=Character.toUpperCase(address.charAt(0));
            for(int i=1;i<address.length();i++)
            {
                char ch=address.charAt(i);
                if(Character.isWhitespace(ch)){
                    caddress+=" ";
                    caddress+=Character.toUpperCase(address.charAt(i+1));
                    i++;
                }
                else
                    caddress+=ch;
            }
            jTextArea1.setText(caddress);
            System.out.printf("Address is "+caddress);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }

    }//GEN-LAST:event_jTextArea1FocusLost

    private void jComboBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusLost
//        if (jComboBox1.getSelectedIndex() == -1) {
//            jLabel5.setForeground(Color.red);
//            jLabel5.setText(null);
//            jLabel5.setText("State*");          //State Validation
//            jComboBox1.requestFocus();
//            return;
//        }
//
//        jLabel5.setForeground(Color.BLACK);
//        jLabel5.setText("State");

    }//GEN-LAST:event_jComboBox1FocusLost

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        try {
            String email = jTextField5.getText();
            email = email.trim();
            email = email.toLowerCase();
            jTextField5.setText(email);             // Email Validation
//            for(int i=0;i<email.length();i++)
//            {
//                char ch=email.charAt(i);
//                if(ch=='@')
//                {
//                    
//                }
//            }
            if (email.length() < 6 || !email.endsWith(".com")) {
                jLabel7.setForeground(Color.red);
                jLabel7.setText(null);
                jLabel7.setText("E-mail*");
                jTextField5.requestFocus();
                return;
            }

            jLabel7.setForeground(Color.BLACK);
            jLabel7.setText("E-mail");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }

    }//GEN-LAST:event_jTextField5FocusLost

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed

    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        try {
            String username1, sql;
            username1 = jTextField6.getText();
            username1 = username1.trim();
            username1 = username1.toLowerCase();
            System.out.println(username1);
            jTextField6.setText(username1);      // Username Validation
            for(int i=0;i<username1.length();i++)
            {
                char ch=username1.charAt(i);
                if(Character.isWhitespace(ch))
                { 
                    jTextField6.setForeground(Color.red);
                    jTextField6.setText(jTextField6.getText());
                    jTextField6.requestFocus();
                    jLabel16.setForeground(Color.red);
                    jLabel16.setText("Username*");
                    return;
                }
            }
            if (username1.length() < 5 || username1.length() > 30) {
                jTextField6.setForeground(Color.red);
                jTextField6.setText(jTextField6.getText());
                jTextField6.requestFocus();
                jLabel16.setForeground(Color.red);
                jLabel16.setText("Username*");
                return;
            } else {
                jTextField6.setForeground(Color.BLACK);
                jTextField6.setText(jTextField6.getText());
                jLabel16.setForeground(Color.BLACK);
                jLabel16.setText("Username");

            }
            sql = "select count(username) from profile_master where username='" + username1 + "'";
            System.out.println(sql);
            rs = c.stmt.executeQuery(sql);
            rs.next();
            int result = rs.getInt(1);
            if (result == 1) //If username already exists 
            {
                JOptionPane.showMessageDialog(this, "Username already exists", "Invalied Username", 1);
                jTextField6.setForeground(Color.red);
                jLabel16.setForeground(Color.red);
                jLabel16.setText("Username*");
                jTextField6.setText(jTextField6.getText());
                jTextField6.requestFocus();
                //JOptionPane.showMessageDialog(this,"Username already exists","Invalied Username",0);
            } else {
                jTextField6.setForeground(Color.BLACK);
                jLabel16.setForeground(Color.BLACK);
                jTextField6.setText(jTextField6.getText());
                jLabel16.setText("Username");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }//GEN-LAST:event_jTextField6FocusLost

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        try {
            String password1;
            char[] pass = jPasswordField1.getPassword();
            password1 = new String(pass);
            password1 = password1.trim();           //Password Validation
            jPasswordField1.setText(password1);
            if (password1.length() < 8 || password1.length() > 20) {
                jLabel17.setForeground(Color.red);
                jLabel17.setText("Password*");
                jPasswordField1.requestFocus();
            } else {
                jLabel17.setForeground(Color.BLACK);
                jLabel17.setText("Password");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        String cname="",name;
        name=jTextField1.getText();
        name=name.trim();
        jTextField1.setText(name);
        cname+=Character.toUpperCase(name.charAt(0));
        for(int i=1;i<name.length();i++)
        {
            char ch=name.charAt(i);
            if(Character.isWhitespace(ch)){
                cname+=" ";
                cname+=Character.toUpperCase(name.charAt(i+1));
                i++;
        }
        else
            cname+=ch;
        }
        jTextField1.setText(cname);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FocusGained

    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2FocusLost

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getKeyCode()==10)
            jTextArea1.requestFocus();
    }//GEN-LAST:event_jTextField1KeyPressed
    void getDistrict() {
        try {
            jComboBox4.removeAllItems();

            String stateCode, sql;
            stateCode = jComboBox1.getSelectedItem().toString();
            rs = c.stmt.executeQuery("select state_code from state_master where s_name='" + stateCode + "'");
            rs.next();
            stateCode = rs.getString(1);  // Find the State code for district name

            // System.out.println("State Code is "+stateCode);
            int i = 0;
            sql = "select dname from district_master where district_state_code=" + stateCode;
            rs = c.stmt.executeQuery(sql);
            while (rs.next()) // insert district name according to state name
            {
                jComboBox4.insertItemAt(rs.getString(1), i++);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
//create table profile_master (pro_code number(3) primary key,uname varchar(40),gender varchar(6),email varchar(40),address varchar(50),state number(3) references state_master,district number(3) references district_master,contact varchar(10),religion number(3) references religion_master ,caste number(3) references caste_master,sub_caste number(3) references sub_caste_master,profession number(3) references profession_master,annual_income varchar(25),complexion varchar(15),height varchar(25),weight varchar(25),isactive varchar(3),username varchar(30),password varchar(20),profile_photo blob,kundli blob,marital_status varchar(15),age number(2)))
}
