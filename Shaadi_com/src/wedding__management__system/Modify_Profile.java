package wedding__management__system;

import java.awt.Color;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.ImageIcon;

public class Modify_Profile extends javax.swing.JInternalFrame {

    String uname = Wedding_Parent_Page.cuser;
    String upass = Wedding_Parent_Page.upass;
    Connect c;
    ResultSet rs;
    String fileName,kundliName;
    Blob b,b2;
    public Modify_Profile() {
        c = new Connect();
        c.getConnect();
        initComponents();

        getData();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jFileChooser2 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox10 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Profile Modify");

        jPanel1.setBackground(new java.awt.Color(224, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 648));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 44, 76, -1));

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
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 41, 207, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Gender");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 86, 91, -1));

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
        jRadioButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 84, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(224, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jRadioButton2.setText("Female");
        jRadioButton2.setToolTipText("Select Gender");
        jRadioButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton2KeyPressed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 84, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 138, 91, 80));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Age");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 294, 126, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("State");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 343, 78, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("District");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 392, 94, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("E-mail");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 242, 90, 31));

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
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox1KeyPressed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 340, 207, -1));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField5.setToolTipText("Enter E-mail Address");
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 236, 207, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Annual Income");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 438, 136, 39));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Complexion");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 430, 129, -1));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Income", "5000", "Less than 10000", "Greater than 10000" }));
        jComboBox2.setSelectedIndex(-1);
        jComboBox2.setToolTipText("Select Annual Income");
        jComboBox2.setPreferredSize(new java.awt.Dimension(207, 31));
        jComboBox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox2KeyPressed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 442, -1, -1));

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Light", "Medium", "Deep(Dark)", "Fair" }));
        jComboBox3.setSelectedIndex(-1);
        jComboBox3.setToolTipText("Select Complexion");
        jComboBox3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox3KeyPressed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 427, 207, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Kundli Photo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 280, 130, -1));

        jComboBox5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox5.setToolTipText("Select Religion");
        jComboBox5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox5KeyPressed(evt);
            }
        });
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 41, 208, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Caste");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 84, 64, 36));

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
        jComboBox6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox6KeyPressed(evt);
            }
        });
        jPanel1.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 90, 208, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Sub Caste");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 142, -1, -1));

        jComboBox7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox7.setToolTipText("Select Sub Caste");
        jComboBox7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox7KeyPressed(evt);
            }
        });
        jPanel1.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 139, 208, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Profession");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 191, -1, -1));

        jComboBox8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox8.setToolTipText("Select Profession");
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });
        jComboBox8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox8KeyPressed(evt);
            }
        });
        jPanel1.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 188, 208, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Height");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 240, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Weight");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 289, -1, -1));

        jComboBox9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 (feet)", "3.5 (feet)", "4 (feet)", "4.5 (feet)", "5 (feet)", "5.5 (feet)", "6 (feet)", "6.5 (feet)", "7 (feet)", " " }));
        jComboBox9.setSelectedIndex(-1);
        jComboBox9.setToolTipText("Select Height");
        jComboBox9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox9KeyPressed(evt);
            }
        });
        jPanel1.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 237, 208, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Username");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 381, 100, -1));

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
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 378, 208, -1));

        jButton1.setBackground(new java.awt.Color(255, 204, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 522, 111, -1));

        jButton2.setBackground(new java.awt.Color(255, 204, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.setToolTipText("Reset All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 522, 111, -1));

        jButton3.setBackground(new java.awt.Color(255, 204, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Close");
        jButton3.setToolTipText("Close this page");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 111, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("Enter Address");
        jTextArea1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextArea1FocusLost(evt);
            }
        });
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 138, 207, 80));

        jComboBox4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox4.setToolTipText("Select District");
        jComboBox4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox4KeyPressed(evt);
            }
        });
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 389, 207, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Status");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 338, -1, 35));

        jComboBox11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Divorced", "other" }));
        jComboBox11.setSelectedIndex(-1);
        jComboBox11.setToolTipText("Select Marital Status");
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });
        jComboBox11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox11KeyPressed(evt);
            }
        });
        jPanel1.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 329, 208, -1));

        jSpinner1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(15, 15, 150, 1));
        jSpinner1.setToolTipText("Select Weight");
        jSpinner1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSpinner1KeyPressed(evt);
            }
        });
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 286, 208, -1));

        jPanel2.setBackground(new java.awt.Color(224, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 150));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Person-square-icon-01.png"))); // NOI18N
        jLabel19.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Religion");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 44, 83, -1));

        jButton4.setBackground(new java.awt.Color(255, 204, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("Browse");
        jButton4.setToolTipText("Close this page");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 240, 100, 30));

        jComboBox10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70" }));
        jComboBox10.setSelectedIndex(-1);
        jComboBox10.setToolTipText("Select Complexion");
        jComboBox10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox10KeyPressed(evt);
            }
        });
        jPanel1.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 290, 207, -1));

        jPanel3.setBackground(new java.awt.Color(224, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(150, 150));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/KundliPic.png"))); // NOI18N
        jLabel20.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 204, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setText("Browse");
        jButton5.setToolTipText("Close this page");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton5KeyPressed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 480, 100, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setText("Profile Photo");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 44, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        try {
            String name, cname = "";
            name = jTextField1.getText();
            name = name.trim();
            jTextField1.setText(name);          // Name validation
            if (name.length() < 2 || name.length() > 40) {

                jLabel1.setForeground(Color.red);
                jLabel1.setText(null);
                jLabel1.setText("Name*");
                jTextField1.requestFocus();
                return;
            }

            jLabel1.setForeground(Color.BLACK);
            jLabel1.setText("Name");
            cname += Character.toUpperCase(name.charAt(0));
            for (int i = 1; i < name.length(); i++) {
                char ch = name.charAt(i);
                if (Character.isWhitespace(ch)) {
                    cname += " ";
                    cname += Character.toUpperCase(name.charAt(i + 1));
                    i++;
                } else {
                    cname += ch;
                }
            }
            jTextField1.setText(cname);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRadioButton1FocusLost
        try {
            if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) {
                jLabel2.setForeground(Color.red);
                jLabel2.setText(null);                  //Gender Validation
                jLabel2.setText("Gender*");
                jRadioButton1.requestFocus();
            } else {
                jLabel2.setForeground(Color.BLACK);
                jLabel2.setText("Gender");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }

    }//GEN-LAST:event_jRadioButton1FocusLost

    private void jComboBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusLost
        if (jComboBox1.getSelectedIndex() == -1) {
            jLabel5.setForeground(Color.red);
            jLabel5.setText(null);
            jLabel5.setText("State*");          //State Validation
            jComboBox1.requestFocus();
            return;
        }

        jLabel5.setForeground(Color.BLACK);
        jLabel5.setText("State");

    }//GEN-LAST:event_jComboBox1FocusLost

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedIndex() >= 0)
            getDistrict();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        try {
            String email = jTextField5.getText();
            email = email.trim();
            email = email.toLowerCase();
            jTextField5.setText(email);             // Email Validation
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

    private void jComboBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox6ItemStateChanged

    }//GEN-LAST:event_jComboBox6ItemStateChanged

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        if (jComboBox6.getSelectedIndex() >= 0)
            getSubCaste();
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        try {
            String username, sql;
            username = jTextField6.getText();
            username = username.trim();
            username = username.toLowerCase();
            System.out.println(username);
            jTextField6.setText(username);      // Username Validation
            if (username.length() < 5 || username.length() > 30) {
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
            sql = "select count(username) from profile_master where username='" + username + "'";
            System.out.println(sql);
            rs = c.stmt.executeQuery(sql);
            rs.next();
            int result = rs.getInt(1);
            if (!username.equals(uname) && result == 1) //If username already exists 
            {
                JOptionPane.showMessageDialog(this, "Username already exists", "Invalied Username", 1);
                jTextField6.setForeground(Color.red);
                jLabel16.setForeground(Color.red);
                jLabel16.setText("Username*");
                jTextField6.setText(jTextField6.getText());
                jTextField6.requestFocus();
                //JOptionPane.showMessageDialog(this,"Username already exists","Invalied Username",0);
                return;
            }
            if (result == 0) {
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

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed

    }//GEN-LAST:event_jTextField6ActionPerformed
    void getMessage() {
        JOptionPane.showMessageDialog(this, "Fill Full Information");
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (jTextField1.getText().equals("")) {
                getMessage();
                return;
            }
            if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) {
                getMessage();
                return;
            }
            if (jTextArea1.getText().equals("")) {
                getMessage();
                return;
            }
//            if (jTextField3.getText().equals("")) {
//                getMessage();
//                return;
//            }
            if (jComboBox1.getSelectedIndex() == -1) {
                getMessage();
                return;
            }
            if (jComboBox2.getSelectedIndex() == -1) {
                getMessage();
                return;
            }
            if (jComboBox3.getSelectedIndex() == -1) {
                getMessage();
                return;
            }
            if (jComboBox4.getSelectedIndex() == -1) {
                getMessage();
                return;
            }
            if (jComboBox5.getSelectedIndex() == -1) {
                getMessage();
                return;
            }
            if (jComboBox6.getSelectedIndex() == -1) {
                getMessage();
                return;
            }
            if (jComboBox7.getSelectedIndex() == -1) {
                getMessage();
                return;
            }
            if (jComboBox8.getSelectedIndex() == -1) {
                getMessage();
                return;
            }
            if (jComboBox9.getSelectedIndex() == -1) {
                getMessage();
                return;
            }
            if (jComboBox11.getSelectedIndex() == -1) {
                getMessage();
                return;
            }
            if (jComboBox10.getSelectedIndex() == -1) {
                getMessage();
                return;
            }
            String name, gender, address, age, state, district, email, religion, caste, sub_caste, profession, annual_income, complexion, height, weight, username, marital_status;
            name = jTextField1.getText();
            if (jRadioButton1.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            age = jComboBox10.getSelectedItem().toString();
            address = jTextArea1.getText();
            marital_status = jComboBox11.getSelectedItem().toString();

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

            PreparedStatement ps = c.con.prepareStatement("Update profile_master set uname=?,gender=?,age=?,state=?,district=?,email=?,religion=?,caste=?,sub_caste=?,profession=?,annual_income=?,complexion=?,height=?,weight=?,username=?,marital_status=?,address=?,profile_photo=?,kundli=? where username='" + uname + "' and password='" + upass + "'");
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setString(3, age);
            ps.setString(4, state);
            ps.setString(5, district);
            ps.setString(6, email);
            ps.setString(7, religion);
            ps.setString(8, caste);
            ps.setString(9, sub_caste);
            ps.setString(10, profession);
            ps.setString(11, annual_income);
            ps.setString(12, complexion);
            ps.setString(13, height);
            ps.setString(14, weight);
            ps.setString(15, username);
            ps.setString(16, marital_status);
            ps.setString(17, address);
            if(fileName!=null){
                FileInputStream profile_photo = new FileInputStream(fileName);
                ps.setBinaryStream(18, profile_photo, profile_photo.available());
            }
            else
                ps.setBlob(18, b);
            if(kundliName!=null){
                FileInputStream profile_photo = new FileInputStream(kundliName);
                ps.setBinaryStream(19, profile_photo, profile_photo.available());
            }
            else
                ps.setBlob(19, b2);
            
            ps.executeUpdate();
            c.stmt.executeUpdate("commit");
            JOptionPane.showMessageDialog(this, "Profile Updated");
            Wedding_Parent_Page.cuser = username;
            Wedding_Parent_Page.jLabel1.setText("Current User : " + username);
            this.setVisible(false);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
        jTextArea1.setText(null);
        jTextField1.setText(null);
        jComboBox10.setSelectedIndex(-1);
        jTextField5.setText(null);
        jTextField6.setText(null);
        //ImageIcon icon=new ImageIcon("C:\\Users\\Pawan Singh Lodhi\\Documents\\NetBeansProjects\\Wedding__Management__System\\src\\Icons\\add_pinture");
        //Image newing=icon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        //icon=new ImageIcon(newing);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            c.con.close();
            this.setVisible(false);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error is " + ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextArea1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea1FocusLost
        try {
            String address, caddress = "";
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
            caddress += Character.toUpperCase(address.charAt(0));
            for (int i = 1; i < address.length(); i++) {
                char ch = address.charAt(i);
                if (Character.isWhitespace(ch)) {
                    caddress += " ";
                    caddress += Character.toUpperCase(address.charAt(i + 1));
                    i++;
                } else {
                    caddress += ch;
                }
            }
            jTextArea1.setText(caddress);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }

    }//GEN-LAST:event_jTextArea1FocusLost

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try
        {
            jFileChooser1.showOpenDialog(this);
            fileName=jFileChooser1.getSelectedFile().getPath();
            System.out.println(fileName);
            ImageIcon icon=new ImageIcon(fileName);
            Image newing=icon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            icon=new ImageIcon(newing);
            jLabel19.setIcon(icon);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Error is "+e,"Error!!",0);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getKeyCode()==10)
            jRadioButton1.requestFocus();
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jRadioButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton1KeyPressed
        if(evt.getKeyCode()==10)
            jTextArea1.requestFocus();
    }//GEN-LAST:event_jRadioButton1KeyPressed

    private void jRadioButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton2KeyPressed
        if(evt.getKeyCode()==10)
            jTextArea1.requestFocus();
    }//GEN-LAST:event_jRadioButton2KeyPressed

    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyPressed
        if(evt.getKeyCode()==10)
            jTextField5.requestFocus();
    }//GEN-LAST:event_jTextArea1KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        if(evt.getKeyCode()==10)
            jComboBox10.requestFocus();
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jComboBox10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox10KeyPressed
        if(evt.getKeyCode()==10)
            jComboBox1.requestFocus();
    }//GEN-LAST:event_jComboBox10KeyPressed

    private void jComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyPressed
        if(evt.getKeyCode()==10)
            jComboBox4.requestFocus();
    }//GEN-LAST:event_jComboBox1KeyPressed

    private void jComboBox4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox4KeyPressed
        if(evt.getKeyCode()==10)
            jComboBox2.requestFocus();
    }//GEN-LAST:event_jComboBox4KeyPressed

    private void jComboBox2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox2KeyPressed
        if(evt.getKeyCode()==10)
            jComboBox5.requestFocus();
    }//GEN-LAST:event_jComboBox2KeyPressed

    private void jComboBox5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox5KeyPressed
        if(evt.getKeyCode()==10)
            jComboBox6.requestFocus();
    }//GEN-LAST:event_jComboBox5KeyPressed

    private void jComboBox6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox6KeyPressed
        if(evt.getKeyCode()==10)
            jComboBox7.requestFocus();
    }//GEN-LAST:event_jComboBox6KeyPressed

    private void jComboBox7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox7KeyPressed
        if(evt.getKeyCode()==10)
            jComboBox8.requestFocus();
    }//GEN-LAST:event_jComboBox7KeyPressed

    private void jComboBox8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox8KeyPressed
        if(evt.getKeyCode()==10)
            jComboBox9.requestFocus();
    }//GEN-LAST:event_jComboBox8KeyPressed

    private void jComboBox9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox9KeyPressed
        if(evt.getKeyCode()==10)
            jSpinner1.requestFocus();
    }//GEN-LAST:event_jComboBox9KeyPressed

    private void jSpinner1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSpinner1KeyPressed
        if(evt.getKeyCode()==10)
            jComboBox11.requestFocus();
    }//GEN-LAST:event_jSpinner1KeyPressed

    private void jComboBox11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox11KeyPressed
        if(evt.getKeyCode()==10)
            jTextField6.requestFocus();
    }//GEN-LAST:event_jComboBox11KeyPressed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        if(evt.getKeyCode()==10)
            jComboBox3.requestFocus();
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jComboBox3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox3KeyPressed
        if(evt.getKeyCode()==10)
            jButton4.requestFocus();
    }//GEN-LAST:event_jComboBox3KeyPressed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        if(evt.getKeyCode()==10)
            jButton1.requestFocus();
    }//GEN-LAST:event_jButton4KeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try
        {
            jFileChooser1.showOpenDialog(this);
            kundliName=jFileChooser1.getSelectedFile().getPath();
            System.out.println(kundliName);
            ImageIcon icon=new ImageIcon(kundliName);
            Image newing=icon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            icon=new ImageIcon(newing);
            jLabel20.setIcon(icon);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Error is "+e,"Error!!",0);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5KeyPressed
    void getState() {
        try {
            int i = 0;
            rs = c.stmt.executeQuery("select s_name from state_master");
            while (rs.next()) {
                jComboBox1.insertItemAt(rs.getString(1), i++);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }

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

    void getData() {
        try {
            
            String username, name, gender, email, address, state, district, religion, caste, sub_caste, profession, height, weight, income, complexion, marital_status, age;
            PreparedStatement ps = c.con.prepareStatement("select *from full_profile_view where username='" + uname + "'");
            //create view full_profile_view as select username,uname,gender,email,s_name,dname,rname,cname,sname,pname,annual_income,complexion,height,weight,marital_status,address,profile_photo,age,kundli from religion_master,caste_master,sub_caste_master,profession_master,state_master,district_master,profile_master where state=state_code and district=district_code and religion=sno and caste=cast_code and sub_caste=sub_code and profession=p_code;
            rs = ps.executeQuery();
            rs.next();

            username = rs.getString(1);
            name = rs.getString(2);
            gender = rs.getString(3);
            email = rs.getString(4);
            state = rs.getString(5);
            district = rs.getString(6);
            religion = rs.getString(7);
            caste = rs.getString(8);
            sub_caste = rs.getString(9);
            profession = rs.getString(10);
            income = rs.getString(11);
            complexion = rs.getString(12);
            height = rs.getString(13);
            weight = rs.getString(14);
            marital_status = rs.getString(15);
            address = rs.getString(16);
            b=rs.getBlob(17);
            age = rs.getString(18);
            b2=rs.getBlob(19);
            
            byte barr[] = b.getBytes(1, (int) b.length());
            FileOutputStream fil= new FileOutputStream("barr");
            fil.write(barr);
            ImageIcon imageicon = new ImageIcon(new ImageIcon("barr").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));

            byte barr2[] = b2.getBytes(1, (int) b2.length());
            FileOutputStream fil2= new FileOutputStream("barr2");
            fil2.write(barr2);
            ImageIcon imageicon2 = new ImageIcon(new ImageIcon("barr2").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
            
            jTextField1.setText(name);
            if (gender.equals("Male")) {
                jRadioButton1.setSelected(true);
            } else {
                jRadioButton2.setSelected(true);
            }

            jTextArea1.setText(address);
            jTextField5.setText(email);
            jComboBox10.setSelectedItem(age);
            jTextField6.setText(username);
            jComboBox2.setSelectedItem(income);
            jComboBox3.setSelectedItem(complexion);

            getState();
            getReligion();
            getCaste();
            getProfession();

            jComboBox1.setSelectedItem(state);
            jComboBox4.setSelectedItem(district);
            jComboBox5.setSelectedItem(religion);
            jComboBox6.setSelectedItem(caste);
            jComboBox7.setSelectedItem(sub_caste);
            jComboBox8.setSelectedItem(profession);
            jComboBox9.setSelectedItem(height);
            jSpinner1.setValue(Integer.valueOf(weight));
            jComboBox11.setSelectedItem(marital_status);
            jLabel19.setIcon(imageicon);
            jLabel20.setIcon(imageicon2);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        } catch (Exception e) {
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
    private javax.swing.JFileChooser jFileChooser2;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
