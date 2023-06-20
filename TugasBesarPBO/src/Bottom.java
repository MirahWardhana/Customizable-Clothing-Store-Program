import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Bottom extends javax.swing.JFrame {
    Connection con = null; 
    Statement st = null; 
    String Username= Login.username;

    public Bottom() {
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
        labelLength = new javax.swing.JLabel();
        txtLength = new javax.swing.JTextField();
        labelWaist = new javax.swing.JLabel();
        labelHip = new javax.swing.JLabel();
        panelNext = new keeptoo.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        txtWaist = new javax.swing.JTextField();
        txtHip = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        labelBottom = new javax.swing.JLabel();
        txtBottom = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelNextLayout = new javax.swing.GroupLayout(panelNext);
        panelNext.setLayout(panelNextLayout);
        panelNextLayout.setHorizontalGroup(
            panelNextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNextLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel9)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelNextLayout.setVerticalGroup(
            panelNextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNextLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(19, 19, 19))
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

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("cm");

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("cm");

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("cm");

        labelBottom.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelBottom.setForeground(new java.awt.Color(255, 255, 255));
        labelBottom.setText("Bottom");

        txtBottom.setBackground(new java.awt.Color(0, 36, 16));
        txtBottom.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtBottom.setForeground(new java.awt.Color(102, 102, 102));
        txtBottom.setText("Enter bottom width");
        txtBottom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtBottom.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtBottom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBottomFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBottomFocusLost(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("cm");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelBottom)
                                    .addComponent(labelLength)
                                    .addComponent(labelHip)
                                    .addComponent(labelWaist))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtLength, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHip, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtWaist)
                                    .addComponent(txtBottom))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel27)))
                            .addComponent(panelNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelWaist)
                    .addComponent(txtWaist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHip)
                    .addComponent(txtHip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLength)
                    .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(labelBottom)
                    .addComponent(txtBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\OneDrive\\Documents\\Tugas Tugas Kuliah Semester 2\\Pemrograman Berorientasi Objek\\gambar baju\\pants sizing fix.png")); // NOI18N

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel16.setText("<<<");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\OneDrive\\Documents\\Tugas Tugas Kuliah Semester 2\\Pemrograman Berorientasi Objek\\gambar baju\\skirt sizing fix.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206)))
                .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelExit)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(11, 11, 11)
                        .addComponent(labelDashboard)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addContainerGap(43, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void panelNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNextMouseClicked
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_tubesPBO", "root", "");
            st = con.createStatement();
            String simpan = "insert into tb_orderBottom (Username, Kode, Waist, Hip, Length, Bottom, Model, Note, TotalPayment, OrderStatus, PaymentStatus, OrderDate) "
                    + "values( '"+Username+"','B','"+txtWaist.getText()+"','"+txtHip.getText()+"','"+txtLength.getText()+"','"+txtBottom.getText()+"','0','0','0','To be proceed', 'Unpaid', now());";
            st= con.createStatement();
            int SA = st.executeUpdate(simpan);
            this.setVisible(false);
            new BottomModel().setVisible(true);
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
        Dashboard db= new Dashboard();
        db.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void txtBottomFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBottomFocusGained
        if (txtBottom.getText().equals ("Enter bottom width")){
            txtBottom.setText("");
            txtBottom.setForeground(new Color (204,204,204));
        }
    }//GEN-LAST:event_txtBottomFocusGained

    private void txtBottomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBottomFocusLost
        if (txtBottom.getText().equals ("")){
            txtBottom.setText("Enter bottom width");
            txtBottom.setForeground(new Color (204,204,204));
        }
    }//GEN-LAST:event_txtBottomFocusLost

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        BottomModel bm= new BottomModel();
        bm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bottom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bottom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bottom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bottom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bottom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private keeptoo.KGradientPanel kGradientPanel7;
    private javax.swing.JLabel labelBottom;
    private javax.swing.JLabel labelDashboard;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelHip;
    private javax.swing.JLabel labelLength;
    private javax.swing.JLabel labelWaist;
    private keeptoo.KGradientPanel panelNext;
    private javax.swing.JTextField txtBottom;
    private javax.swing.JTextField txtHip;
    private javax.swing.JTextField txtLength;
    private javax.swing.JTextField txtWaist;
    // End of variables declaration//GEN-END:variables
}
