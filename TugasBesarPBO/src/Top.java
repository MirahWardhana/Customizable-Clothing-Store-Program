import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Top extends javax.swing.JFrame {
    Connection con = null; 
    Statement st = null; 
    String Username= Login.username;

    public Top() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelDashboard = new javax.swing.JLabel();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        labelExit = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtShoulderWidth = new javax.swing.JTextField();
        labelShoulderWidth = new javax.swing.JLabel();
        labelLength = new javax.swing.JLabel();
        txtLength = new javax.swing.JTextField();
        labelChest = new javax.swing.JLabel();
        txtChest = new javax.swing.JTextField();
        labelWaist = new javax.swing.JLabel();
        labelHip = new javax.swing.JLabel();
        panelNext = new keeptoo.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        txtWaist = new javax.swing.JTextField();
        txtHip = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelDashboard.setFont(new java.awt.Font("Mermaid", 0, 24)); // NOI18N
        labelDashboard.setText("Sizing");

        kGradientPanel7.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel7.setkStartColor(new java.awt.Color(0, 36, 16));

        jLabel13.setFont(new java.awt.Font("Mermaid", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Coutre");

        javax.swing.GroupLayout kGradientPanel7Layout = new javax.swing.GroupLayout(kGradientPanel7);
        kGradientPanel7.setLayout(kGradientPanel7Layout);
        kGradientPanel7Layout.setHorizontalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        labelExit.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelExit.setText("X");
        labelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExitMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 36, 16));
        jPanel3.setForeground(new java.awt.Color(0, 36, 16));

        jLabel5.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html>Please complete form <br>to make an order");

        txtShoulderWidth.setBackground(new java.awt.Color(0, 36, 16));
        txtShoulderWidth.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtShoulderWidth.setForeground(new java.awt.Color(102, 102, 102));
        txtShoulderWidth.setText("Enter shoulder width");
        txtShoulderWidth.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtShoulderWidth.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtShoulderWidth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtShoulderWidthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtShoulderWidthFocusLost(evt);
            }
        });

        labelShoulderWidth.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelShoulderWidth.setForeground(new java.awt.Color(255, 255, 255));
        labelShoulderWidth.setText("Shoulder Width");

        labelLength.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelLength.setForeground(new java.awt.Color(255, 255, 255));
        labelLength.setText("Length");

        txtLength.setBackground(new java.awt.Color(0, 36, 16));
        txtLength.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtLength.setForeground(new java.awt.Color(102, 102, 102));
        txtLength.setText("Enter length");
        txtLength.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtLength.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtLength.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLengthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLengthFocusLost(evt);
            }
        });

        labelChest.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelChest.setForeground(new java.awt.Color(255, 255, 255));
        labelChest.setText("Chest");

        txtChest.setBackground(new java.awt.Color(0, 36, 16));
        txtChest.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtChest.setForeground(new java.awt.Color(102, 102, 102));
        txtChest.setText("Enter chest width");
        txtChest.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtChest.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtChest.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtChestFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtChestFocusLost(evt);
            }
        });

        labelWaist.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelWaist.setForeground(new java.awt.Color(255, 255, 255));
        labelWaist.setText("Waist");

        labelHip.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelHip.setForeground(new java.awt.Color(255, 255, 255));
        labelHip.setText("Hip");

        panelNext.setkEndColor(new java.awt.Color(204, 255, 204));
        panelNext.setkGradientFocus(200);
        panelNext.setkStartColor(new java.awt.Color(0, 36, 16));
        panelNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNextMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Next");

        javax.swing.GroupLayout panelNextLayout = new javax.swing.GroupLayout(panelNext);
        panelNext.setLayout(panelNextLayout);
        panelNextLayout.setHorizontalGroup(
            panelNextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNextLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel9)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        panelNextLayout.setVerticalGroup(
            panelNextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNextLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        txtWaist.setBackground(new java.awt.Color(0, 36, 16));
        txtWaist.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtWaist.setForeground(new java.awt.Color(102, 102, 102));
        txtWaist.setText("Enter waist width");
        txtWaist.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtWaist.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtWaist.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtWaistFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWaistFocusLost(evt);
            }
        });

        txtHip.setBackground(new java.awt.Color(0, 36, 16));
        txtHip.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtHip.setForeground(new java.awt.Color(102, 102, 102));
        txtHip.setText("Enter hip width");
        txtHip.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtHip.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtHip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHipFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHipFocusLost(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("cm");

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("cm");

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("cm");

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("cm");

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("cm");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelHip)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHip, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelLength)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(labelChest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtChest, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelShoulderWidth)
                        .addGap(26, 26, 26)
                        .addComponent(txtShoulderWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelWaist)
                        .addGap(90, 90, 90)
                        .addComponent(txtWaist)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29))
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtShoulderWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(labelShoulderWidth))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(labelChest)
                    .addComponent(txtChest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(labelWaist)
                    .addComponent(txtWaist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(labelLength)
                    .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtHip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHip))
                .addGap(18, 18, 18)
                .addComponent(panelNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\OneDrive\\Documents\\Tugas Tugas Kuliah Semester 2\\Pemrograman Berorientasi Objek\\size chart baju apx.png")); // NOI18N

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel16.setText("<<<");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelDashboard)
                        .addGap(201, 201, 201))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelExit)
                            .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelDashboard)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelExitMouseClicked

    private void txtShoulderWidthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtShoulderWidthFocusGained
        if (txtShoulderWidth.getText().equals ("Enter shoulder width")){
            txtShoulderWidth.setText("");
            txtShoulderWidth.setForeground(new Color (204,204,204));
        }
    }//GEN-LAST:event_txtShoulderWidthFocusGained

    private void txtShoulderWidthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtShoulderWidthFocusLost
        if (txtShoulderWidth.getText().equals ("")){
            txtShoulderWidth.setText("Enter shoulder width");
            txtShoulderWidth.setForeground(new Color (204,204,204));
        }
    }//GEN-LAST:event_txtShoulderWidthFocusLost

    private void txtLengthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLengthFocusGained
        if (txtLength.getText().equals ("Enter length")){
            txtLength.setText("");
            txtLength.setForeground(new Color (204,204,204));
        }
    }//GEN-LAST:event_txtLengthFocusGained

    private void txtLengthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLengthFocusLost
        if (txtLength.getText().equals ("")){
            txtLength.setText("Enter length");
            txtLength.setForeground(new Color (204,204,204));
        }
    }//GEN-LAST:event_txtLengthFocusLost

    private void txtChestFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtChestFocusGained
        if (txtChest.getText().equals ("Enter chest width")){
            txtChest.setText("");
            txtChest.setForeground(new Color (204,204,204));
        }
    }//GEN-LAST:event_txtChestFocusGained

    private void txtChestFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtChestFocusLost
        if (txtChest.getText().equals ("")){
            txtChest.setText("Enter chest width");
            txtChest.setForeground(new Color (204,204,204));
        }
    }//GEN-LAST:event_txtChestFocusLost

    private void panelNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNextMouseClicked
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_tubesPBO", "root", "");
            st = con.createStatement();
            String simpan = "insert into tb_orderTop (Username, Kode, ShoulderWidth, Chest, Waist, Length, Hip, CollarModel, ButtonModel, SleeveModel, SleeveWidth, SleeveLength, Note, TotalPayment, OrderStatus, PaymentStatus, OrderDate) "
                    + "values( '"+Username+"','A','"+txtShoulderWidth.getText()+"','"+txtChest.getText()+"','"+txtWaist.getText()+"','"+txtLength.getText()+"','"+txtHip.getText()+"','0','0','0','0','0', '0', '0', 'To be proceed', 'Unpaid', now());";
            st= con.createStatement();
            int SA = st.executeUpdate(simpan);
            this.setVisible(false);
            new TopModel().setVisible(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Please enter the correct sizing!");
        }
    }//GEN-LAST:event_panelNextMouseClicked

    private void txtWaistFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWaistFocusGained
        if (txtWaist.getText().equals ("Enter waist width")){
            txtWaist.setText("");
            txtWaist.setForeground(new Color (204,204,204));
        }
    }//GEN-LAST:event_txtWaistFocusGained

    private void txtWaistFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWaistFocusLost
        if (txtWaist.getText().equals ("")){
            txtWaist.setText("Enter waist width");
            txtWaist.setForeground(new Color (204,204,204));
        }
    }//GEN-LAST:event_txtWaistFocusLost

    private void txtHipFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHipFocusGained
        if (txtHip.getText().equals ("Enter hip width")){
            txtHip.setText("");
            txtHip.setForeground(new Color (204,204,204));
        }
    }//GEN-LAST:event_txtHipFocusGained

    private void txtHipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHipFocusLost
        if (txtHip.getText().equals ("")){
            txtHip.setText("Enter hip width");
            txtHip.setForeground(new Color (204,204,204));
        }
    }//GEN-LAST:event_txtHipFocusLost

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        Dashboard login= new Dashboard();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Top().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private keeptoo.KGradientPanel kGradientPanel7;
    private javax.swing.JLabel labelChest;
    private javax.swing.JLabel labelDashboard;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelHip;
    private javax.swing.JLabel labelLength;
    private javax.swing.JLabel labelShoulderWidth;
    private javax.swing.JLabel labelWaist;
    private keeptoo.KGradientPanel panelNext;
    private javax.swing.JTextField txtChest;
    private javax.swing.JTextField txtHip;
    private javax.swing.JTextField txtLength;
    private javax.swing.JTextField txtShoulderWidth;
    private javax.swing.JTextField txtWaist;
    // End of variables declaration//GEN-END:variables
}
