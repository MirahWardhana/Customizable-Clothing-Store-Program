import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class BottomModel extends javax.swing.JFrame {
    Connection con = null; 
    Statement st = null; 
    String Username= Login.username;

    public BottomModel() {
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
        cbModelBottom = new javax.swing.JComboBox<>();
        labelShoulderWidth = new javax.swing.JLabel();
        labelShoulderWidth1 = new javax.swing.JLabel();
        txtNote = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(730, 430));

        labelDashboard.setFont(new java.awt.Font("Mermaid", 0, 24)); // NOI18N
        labelDashboard.setText("Skirt and Pants Model");

        labelExit.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelExit.setText("X");
        labelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExitMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\OneDrive\\Documents\\Tugas Tugas Kuliah Semester 2\\Pemrograman Berorientasi Objek\\gambar baju\\skirt model fix.png")); // NOI18N

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel16.setText("<<<");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\OneDrive\\Documents\\Tugas Tugas Kuliah Semester 2\\Pemrograman Berorientasi Objek\\gambar baju\\pants model fix.png")); // NOI18N

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
                .addGap(33, 33, 33)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNext2Layout.setVerticalGroup(
            panelNext2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNext2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbModelBottom.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        cbModelBottom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52" }));
        cbModelBottom.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelShoulderWidth.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelShoulderWidth.setText("Skirt or Pants Model");

        labelShoulderWidth1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelShoulderWidth1.setText("Note");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(216, 216, 216)
                .addComponent(labelDashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelShoulderWidth1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNote, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelNext2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelShoulderWidth)
                        .addGap(18, 18, 18)
                        .addComponent(cbModelBottom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelDashboard))
                    .addComponent(labelExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbModelBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelShoulderWidth))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelShoulderWidth1)))
                            .addComponent(panelNext2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addComponent(jLabel1))
                .addContainerGap(12, Short.MAX_VALUE))
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
            String simpan = "update tb_orderBottom  set Model='"+cbModelBottom.getSelectedItem()+"', Note='"+txtNote.getText()+"' where username='"+Username+"' and OrderId= (select max(OrderId) from tb_orderBottom);";
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
                new BottomModel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbModelBottom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDashboard;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelShoulderWidth;
    private javax.swing.JLabel labelShoulderWidth1;
    private keeptoo.KGradientPanel panelNext2;
    private javax.swing.JTextField txtNote;
    // End of variables declaration//GEN-END:variables
}
