import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class TopModel2 extends javax.swing.JFrame {
    Connection con = null; 
    Statement st = null; 
    String Username= Login.username;

    public TopModel2() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelDashboard = new javax.swing.JLabel();
        labelExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelNext2 = new keeptoo.KGradientPanel();
        jLabel11 = new javax.swing.JLabel();
        labelDashboard1 = new javax.swing.JLabel();
        labelShoulderWidth1 = new javax.swing.JLabel();
        labelShoulderWidth2 = new javax.swing.JLabel();
        labelShoulderWidth3 = new javax.swing.JLabel();
        labelShoulderWidth4 = new javax.swing.JLabel();
        txtSleeveWidth = new javax.swing.JTextField();
        txtSleeveLength = new javax.swing.JTextField();
        txtNote = new javax.swing.JTextField();
        cbSleeveModel = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(730, 430));

        labelDashboard.setFont(new java.awt.Font("Mermaid", 0, 24)); // NOI18N
        labelDashboard.setText("Sleeve Sizing");

        labelExit.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelExit.setText("X");
        labelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExitMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\OneDrive\\Documents\\Tugas Tugas Kuliah Semester 2\\Pemrograman Berorientasi Objek\\gambar baju\\size chart baju fix2.png")); // NOI18N

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel16.setText("<<<");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleeve model fix.png"))); // NOI18N

        panelNext2.setkEndColor(new java.awt.Color(204, 255, 204));
        panelNext2.setkGradientFocus(200);
        panelNext2.setkStartColor(new java.awt.Color(0, 36, 16));
        panelNext2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNext2MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Next");

        javax.swing.GroupLayout panelNext2Layout = new javax.swing.GroupLayout(panelNext2);
        panelNext2.setLayout(panelNext2Layout);
        panelNext2Layout.setHorizontalGroup(
            panelNext2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNext2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel11)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        panelNext2Layout.setVerticalGroup(
            panelNext2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNext2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(19, 19, 19))
        );

        labelDashboard1.setFont(new java.awt.Font("Mermaid", 0, 24)); // NOI18N
        labelDashboard1.setText("Sleeve Model");

        labelShoulderWidth1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelShoulderWidth1.setText("Sleeve Model");

        labelShoulderWidth2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelShoulderWidth2.setText("Sleeve Width");

        labelShoulderWidth3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelShoulderWidth3.setText("Sleeve Length");

        labelShoulderWidth4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelShoulderWidth4.setText("Note");

        txtSleeveWidth.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtSleeveWidth.setForeground(new java.awt.Color(102, 102, 102));
        txtSleeveWidth.setText("Enter sleeve width");
        txtSleeveWidth.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtSleeveWidth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSleeveWidthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSleeveWidthFocusLost(evt);
            }
        });

        txtSleeveLength.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtSleeveLength.setForeground(new java.awt.Color(102, 102, 102));
        txtSleeveLength.setText("Enter sleeve length");
        txtSleeveLength.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtSleeveLength.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSleeveLengthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSleeveLengthFocusLost(evt);
            }
        });

        txtNote.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtNote.setForeground(new java.awt.Color(102, 102, 102));
        txtNote.setText("Enter a note");
        txtNote.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtNote.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNoteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNoteFocusLost(evt);
            }
        });

        cbSleeveModel.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cbSleeveModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        cbSleeveModel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel30.setText("cm");

        jLabel31.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel31.setText("cm");

        jLabel32.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel32.setText("cm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(labelDashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelDashboard1)
                .addGap(132, 132, 132))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelShoulderWidth2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSleeveWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelShoulderWidth3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSleeveLength, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelShoulderWidth1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelShoulderWidth4))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNote)
                            .addComponent(cbSleeveModel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18)
                        .addComponent(panelNext2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(labelExit))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDashboard)
                            .addComponent(labelDashboard1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(panelNext2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSleeveModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelShoulderWidth1)
                            .addComponent(jLabel30)
                            .addComponent(txtSleeveWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelShoulderWidth2))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(labelShoulderWidth4)
                            .addComponent(jLabel31)
                            .addComponent(txtSleeveLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelShoulderWidth3))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
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

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        Dashboard d= new Dashboard();
        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void panelNext2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNext2MouseClicked
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_tubesPBO", "root", "");
            st = con.createStatement();
            String simpan = "update tb_orderTop set SleeveModel='"+cbSleeveModel.getSelectedItem()+"', SleeveWidth='"+txtSleeveWidth.getText()+"', SleeveLength='"+txtSleeveLength.getText()+"', Note='"+txtSleeveWidth.getText()+"' where username='"+Username+"' and OrderId= (select max(OrderId) from tb_orderTop);";
            st= con.createStatement();
            int SA = st.executeUpdate(simpan);
            this.setVisible(false);
            JOptionPane.showMessageDialog(this,"Your order will be proceed!");
            new Dashboard().setVisible(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Please enter the correct sizing!");
        }
    }//GEN-LAST:event_panelNext2MouseClicked

    private void txtSleeveWidthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSleeveWidthFocusGained
        if (txtSleeveWidth.getText().equals ("Enter sleeve width")){
            txtSleeveWidth.setText("");
            txtSleeveWidth.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtSleeveWidthFocusGained

    private void txtSleeveWidthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSleeveWidthFocusLost
        if (txtSleeveWidth.getText().equals ("")){
            txtSleeveWidth.setText("Enter sleeve width");
            txtSleeveWidth.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtSleeveWidthFocusLost

    private void txtSleeveLengthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSleeveLengthFocusGained
        if (txtSleeveLength.getText().equals ("Enter sleeve length")){
            txtSleeveLength.setText("");
            txtSleeveLength.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtSleeveLengthFocusGained

    private void txtSleeveLengthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSleeveLengthFocusLost
        if (txtSleeveLength.getText().equals ("")){
            txtSleeveLength.setText("Enter sleeve length");
            txtSleeveLength.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtSleeveLengthFocusLost

    private void txtNoteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoteFocusGained
        if (txtNote.getText().equals ("Enter a note")){
            txtNote.setText("");
            txtNote.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtNoteFocusGained

    private void txtNoteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoteFocusLost
        if (txtNote.getText().equals ("")){
            txtNote.setText("Enter a note");
            txtNote.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtNoteFocusLost
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TopModel2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbSleeveModel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDashboard;
    private javax.swing.JLabel labelDashboard1;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelShoulderWidth1;
    private javax.swing.JLabel labelShoulderWidth2;
    private javax.swing.JLabel labelShoulderWidth3;
    private javax.swing.JLabel labelShoulderWidth4;
    private keeptoo.KGradientPanel panelNext2;
    private javax.swing.JTextField txtNote;
    private javax.swing.JTextField txtSleeveLength;
    private javax.swing.JTextField txtSleeveWidth;
    // End of variables declaration//GEN-END:variables
}
