package wedding__management__system;

import java.awt.Image;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Record_Search extends javax.swing.JInternalFrame {

    Connect c;
    ResultSet rs;
    static String recieverUsername;
    String senderUsername=Wedding_Parent_Page.cuser;
    public Record_Search() {
        initComponents();
        c = new Connect();
        c.getConnect();
        loadData("");
        getSearchData();
        jPanel2.setVisible(false);
        jButton5.setVisible(false);
    }

    void loadData(String uname) {//S101
        try {
            int uname_Size = uname.length();//3 101
            String sql;
            DefaultTableModel model;
            model = (DefaultTableModel) jTable1.getModel();
            if (uname.length() == 0) {
                sql = "select *from profile_view where isactive='Yes' order by pro_code"; // this is a view temporary
            } //create view  profile_view as select pro_code ,username,uname,gender,address,rname,contact,isacitve from profile_master,religion_master where  religion=sno
            else if (uname_Size == 3) {
                System.out.println("Religion code in load data " + uname);
                sql = "select *from profile_view where isactive='Yes' and religion=" + uname;
            } else if (uname_Size == 4) {
                uname=uname.substring(1);
                sql = "select *from profile_view where isactive='Yes' and state=" + uname;
            } else {
                sql = "select *from profile_view where isactive='Yes' and age=" + uname;
            }
            System.out.println(sql);
            int row = jTable1.getRowCount();
            if (row > 0) {
                for (int i = row - 1; i >= 0; i--) {
                    model.removeRow(i);     //delete row
                }
            }

            rs = c.stmt.executeQuery(sql);

            while (rs.next()) {
                if (rs.getInt(1) != 0)//Admin Hided
                {
                    model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)});
                }
            }
            jLabel3.setText("Total Records Found : " + jTable1.getRowCount());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Other Error is " + e, "Error!!", 0);
        }

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabelPhoto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JLabel();
        jTextFieldGender = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldWeight11 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JLabel();
        jTextFieldState = new javax.swing.JLabel();
        jTextFieldDistrict = new javax.swing.JLabel();
        jTextFieldNumber = new javax.swing.JLabel();
        jTextFieldReligion = new javax.swing.JLabel();
        jTextFieldCaste = new javax.swing.JLabel();
        jTextFieldSubCaste = new javax.swing.JLabel();
        jTextFieldProfession = new javax.swing.JLabel();
        jTextFieldHeight = new javax.swing.JLabel();
        jTextFieldWeight = new javax.swing.JLabel();
        jTextFieldName1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldMaritalStatus = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldIncome = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldComplexion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jTextFieldWeight12 = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Records Search");
        setPreferredSize(new java.awt.Dimension(1413, 705));

        jPanel1.setBackground(new java.awt.Color(224, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Profile Code", "User Name", "Name", "Gender", "Address", "Religion ", "Contact No."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 695, 498));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setText("Total Records Found ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 625, 316, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setPreferredSize(new java.awt.Dimension(130, 130));

        jLabelPhoto.setPreferredSize(new java.awt.Dimension(130, 130));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setText("Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setText("Email");

        jTextFieldName.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextFieldName.setText("Name");

        jTextFieldGender.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextFieldGender.setText("Gender");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setText("State");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setText("District");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setText("Number");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setText("Religion");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel12.setText("Caste");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel13.setText("Sub Caste");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel14.setText("Profession");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel15.setText("Height ");

        jTextFieldWeight11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jTextFieldWeight11.setText("Weight (KG)");

        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextFieldEmail.setText("Email");

        jTextFieldState.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextFieldState.setText("State");

        jTextFieldDistrict.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextFieldDistrict.setText("District");

        jTextFieldNumber.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextFieldNumber.setText("Number");

        jTextFieldReligion.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextFieldReligion.setText("Religion");

        jTextFieldCaste.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextFieldCaste.setText("Caste");

        jTextFieldSubCaste.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextFieldSubCaste.setText("Sub Caste");

        jTextFieldProfession.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextFieldProfession.setText("Profession");

        jTextFieldHeight.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextFieldHeight.setText("Height ");

        jTextFieldWeight.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextFieldWeight.setText("Weight (KG)");

        jTextFieldName1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jTextFieldName1.setText("Profile Photo");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setText("Current user : ");

        jTextFieldUsername.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextFieldUsername.setText("Current user : ");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel16.setText("Address:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel17.setText("Marital Status");

        jTextFieldMaritalStatus.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextFieldMaritalStatus.setText("Marital Status");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel18.setText("Income");

        jTextFieldIncome.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextFieldIncome.setText("Income");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel19.setText("Complexion");

        jTextFieldComplexion.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextFieldComplexion.setText("Complexion");

        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jTextAreaAddress.setRows(5);
        jScrollPane2.setViewportView(jTextAreaAddress);

        jTextFieldWeight12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jTextFieldWeight12.setText("Age");

        AgeLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        AgeLabel.setText("Age");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel15)
                            .addComponent(jTextFieldWeight11))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldProfession, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldState, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldDistrict, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldReligion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldCaste, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldSubCaste, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldHeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldWeight12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(36, 36, 36)
                        .addComponent(AgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                            .addComponent(jTextFieldIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17)
                                .addComponent(jLabel19))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldMaritalStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addComponent(jTextFieldComplexion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldName1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldName)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldUsername))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldGender))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextFieldEmail)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jTextFieldName1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldState)
                            .addComponent(jLabel8))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldDistrict))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextFieldNumber)
                            .addComponent(jLabel19)
                            .addComponent(jTextFieldComplexion)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jTextFieldMaritalStatus))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jTextFieldReligion)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextFieldCaste)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextFieldSubCaste))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextFieldProfession))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextFieldHeight))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldWeight11)
                            .addComponent(jTextFieldWeight))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldWeight12)
                            .addComponent(AgeLabel)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldIncome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 110, -1, -1));

        jPanel4.setBackground(new java.awt.Color(224, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 204, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 25, 120, -1));

        jButton2.setBackground(new java.awt.Color(255, 204, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Show");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 25, 120, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Show All Users");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 21, 680, 77));

        jPanel5.setBackground(new java.awt.Color(224, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Search By", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 130, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Religion");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel20.setText("AGE");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 130, -1));

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 130, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel21.setText("State");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 650, 90));

        jButton5.setBackground(new java.awt.Color(255, 204, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton5.setText("Message");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 620, 120, -1));

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanel2.setVisible(false);
        jButton5.setVisible(false);
        loadData("");   //show all records
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
    void getSearchData() {
        try {
            //For Religion
            int i = 0;
            String sql;
            sql = "select rname from religion_master";
            rs = c.stmt.executeQuery(sql);
            while (rs.next()) //Insert religion name from the data base
            {
                jComboBox2.insertItemAt(rs.getString(1), i++);
            }
            // For State

            i = 0;
            sql = "select s_name from state_master";
            rs = c.stmt.executeQuery(sql);
            while (rs.next()) // Insert state name from the data base
            {
                jComboBox3.insertItemAt(rs.getString(1), i++);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }

    }

    void getFullInformation(String username) {
        try {
            if (username.equals("")) {
                JOptionPane.showMessageDialog(this, "Select a user");
                return;
            }
            jPanel2.setVisible(true);
            jButton5.setVisible(true);
            recieverUsername=username;
            Blob b;
            String uname, name, gender, email, address, state, district, number, religion, caste, sub_caste, profession, height, weight, income, complexion, marital_status, age;
            //create view full_information_profile_view as select username,uname,gender,email,s_name,dname,contact,rname,cname,sname,pname,annual_income,complexion,height,weight,marital_status,address,profile_photo,age from religion_master,caste_master,sub_caste_master,profession_master,state_master,district_master,profile_master where state=state_code and district=district_code and religion=sno and caste=cast_code and sub_caste=sub_code and profession=p_code;
            PreparedStatement ps = c.con.prepareStatement("select *from full_information_profile_view where username='" + username + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                uname = rs.getString(1);
                name = rs.getString(2);
                gender = rs.getString(3);
                email = rs.getString(4);
                state = rs.getString(5);
                district = rs.getString(6);
                number = rs.getString(7);
                religion = rs.getString(8);
                caste = rs.getString(9);
                sub_caste = rs.getString(10);
                profession = rs.getString(11);
                income = rs.getString(12);
                complexion = rs.getString(13);
                height = rs.getString(14);
                weight = rs.getString(15);
                marital_status = rs.getString(16);
                address = rs.getString(17);
                b = rs.getBlob(18);
                age = rs.getString(19);
                byte barr[] = b.getBytes(1, (int) b.length());
                FileOutputStream fil = new FileOutputStream("barr");
                fil.write(barr);
                fil.close();
                ImageIcon imageicon = new ImageIcon(new ImageIcon("barr").getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH));

                jTextFieldUsername.setText(uname);
                jTextFieldName.setText(name);
                jTextFieldGender.setText(gender);
                jTextFieldEmail.setText(email);
                jTextFieldState.setText(state);
                jTextFieldDistrict.setText(district);
                jTextFieldNumber.setText(number);
                jTextFieldReligion.setText(religion);
                jTextFieldCaste.setText(caste);
                jTextFieldSubCaste.setText(sub_caste);
                jTextFieldProfession.setText(profession);
                jTextFieldHeight.setText(height);
                jTextFieldWeight.setText(weight + "KG");
                jTextFieldMaritalStatus.setText(marital_status);
                jTextAreaAddress.setText(address);
                jTextFieldIncome.setText(income);
                jTextFieldComplexion.setText(complexion);
                AgeLabel.setText(age);
                jLabelPhoto.setIcon(imageicon);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }
    void getUsernames()
    {
        String username;
        int row = jTable1.getSelectedRow();
        int column = jTable1.getColumnModel().getColumnIndex("User Name");
        System.out.println("Row" + row);
        System.out.println("Column" + column);
        if (row != -1) {
            username = jTable1.getValueAt(row, column).toString();
            System.out.println(username);//                      select username from JTable 
        } else {
            username = "";
        }
        getFullInformation(username);

    }
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        try {
            jPanel2.setVisible(false);
            jButton5.setVisible(false);
            String religion = jComboBox2.getSelectedItem().toString();
            String sql;
            sql = "select sno from religion_master where rname='" + religion + "'";
            System.out.println(sql);
            rs = c.stmt.executeQuery(sql);
            rs.next();
            religion = rs.getString(1);
            System.out.println(religion);
            loadData(religion);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jPanel2.setVisible(false);
        jButton5.setVisible(false);
        String age = jComboBox1.getSelectedItem().toString();
        loadData(age);


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        try {
            jPanel2.setVisible(false);
            jButton5.setVisible(false);
            String state = jComboBox3.getSelectedItem().toString();
            String sql;
            sql = "select state_code from state_master where s_name='"+state+"'";
            rs = c.stmt.executeQuery(sql);
            rs.next();
            state = rs.getString(1);
            loadData("S" + state);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error is " + e, "Error!!", 0);
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try
        {
            Message_Box m1=new Message_Box(recieverUsername);
            m1.setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Error is "+e,"Error!!",0);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
       if(evt.getKeyCode()==10)
            getUsernames();
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        getUsernames();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        
    }//GEN-LAST:event_jTable1MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JLabel jTextFieldCaste;
    private javax.swing.JLabel jTextFieldComplexion;
    private javax.swing.JLabel jTextFieldDistrict;
    private javax.swing.JLabel jTextFieldEmail;
    private javax.swing.JLabel jTextFieldGender;
    private javax.swing.JLabel jTextFieldHeight;
    private javax.swing.JLabel jTextFieldIncome;
    private javax.swing.JLabel jTextFieldMaritalStatus;
    private javax.swing.JLabel jTextFieldName;
    private javax.swing.JLabel jTextFieldName1;
    private javax.swing.JLabel jTextFieldNumber;
    private javax.swing.JLabel jTextFieldProfession;
    private javax.swing.JLabel jTextFieldReligion;
    private javax.swing.JLabel jTextFieldState;
    private javax.swing.JLabel jTextFieldSubCaste;
    private javax.swing.JLabel jTextFieldUsername;
    private javax.swing.JLabel jTextFieldWeight;
    private javax.swing.JLabel jTextFieldWeight11;
    private javax.swing.JLabel jTextFieldWeight12;
    // End of variables declaration//GEN-END:variables
}
//create view full_profile_view as select username,uname,gender,email,s_name,dname,contact,rname,cname,sname,pname,annual_income,complexion,height,weight,marital_status,address,profile_photo from religion_master,caste_master,sub_caste_master,profession_master,state_master,district_master,profile_master where state=state_code and district=district_code and religion=sno and caste=cast_code and sub_caste=sub_code and profession=p_code;
