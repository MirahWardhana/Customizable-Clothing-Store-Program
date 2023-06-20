import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class BottomOrderView extends javax.swing.JFrame {
    public static Connection con = null; 
    public static Statement st = null; 
    public static ResultSet rs;

    public BottomOrderView() {
        initComponents();
        setLocationRelativeTo(null);
        koneksimysql();
        PantsSizing.setVisible(false);
        PantsModel.setVisible(false);
        SkirtSizing.setVisible(false);
        SkirtModel.setVisible(false);
        PantsWaist.setVisible(false);
        PantsHip.setVisible(false);
        PantsLength.setVisible(false);
        PantsBottom.setVisible(false);
        SkirtWaist.setVisible(false);
        SkirtHip.setVisible(false);
        SkirtLength.setVisible(false);
        SkirtBottom.setVisible(false);
        
    }
    
    public void koneksimysql(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_tubespbo", "root", "");
            st = con.createStatement();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Connection Failed!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        kGradientPanel9 = new keeptoo.KGradientPanel();
        TOrderView2 = new javax.swing.JLabel();
        labelBack2 = new javax.swing.JLabel();
        BOrderView2 = new javax.swing.JLabel();
        TReport2 = new javax.swing.JLabel();
        BReport2 = new javax.swing.JLabel();
        PantsBottom = new javax.swing.JLabel();
        PantsWaist = new javax.swing.JLabel();
        PantsHip = new javax.swing.JLabel();
        PantsLength = new javax.swing.JLabel();
        PantsSizing = new javax.swing.JLabel();
        SkirtBottom = new javax.swing.JLabel();
        SkirtLength = new javax.swing.JLabel();
        SkirtHip = new javax.swing.JLabel();
        SkirtWaist = new javax.swing.JLabel();
        SkirtSizing = new javax.swing.JLabel();
        Model = new javax.swing.JLabel();
        NOC = new javax.swing.JLabel();
        SkirtModel = new javax.swing.JLabel();
        PantsModel = new javax.swing.JLabel();
        labelOrderId = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        buttonShow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(730, 430));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel19.setText("X");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 0, 24, -1));

        kGradientPanel9.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel9.setkStartColor(new java.awt.Color(0, 36, 16));
        kGradientPanel9.setPreferredSize(new java.awt.Dimension(110, 85));

        TOrderView2.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        TOrderView2.setForeground(new java.awt.Color(204, 204, 204));
        TOrderView2.setText("<html>Top <br>Order");
        TOrderView2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TOrderView2MouseClicked(evt);
            }
        });

        labelBack2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelBack2.setForeground(new java.awt.Color(255, 255, 255));
        labelBack2.setText("<<<");
        labelBack2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBack2MouseClicked(evt);
            }
        });

        BOrderView2.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        BOrderView2.setForeground(new java.awt.Color(255, 255, 255));
        BOrderView2.setText("<html>Bottom<br>Order");
        BOrderView2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOrderView2MouseClicked(evt);
            }
        });

        TReport2.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        TReport2.setForeground(new java.awt.Color(204, 204, 204));
        TReport2.setText("<html>Top <br>Order<br>Report");
        TReport2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TReport2MouseClicked(evt);
            }
        });

        BReport2.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        BReport2.setForeground(new java.awt.Color(204, 204, 204));
        BReport2.setText("<html>Bottom <br>Order<br>Report");
        BReport2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BReport2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel9Layout = new javax.swing.GroupLayout(kGradientPanel9);
        kGradientPanel9.setLayout(kGradientPanel9Layout);
        kGradientPanel9Layout.setHorizontalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel9Layout.createSequentialGroup()
                .addGroup(kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelBack2))
                    .addGroup(kGradientPanel9Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BReport2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TReport2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TOrderView2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BOrderView2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        kGradientPanel9Layout.setVerticalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel9Layout.createSequentialGroup()
                .addComponent(labelBack2)
                .addGap(41, 41, 41)
                .addComponent(TReport2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(BReport2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(TOrderView2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(BOrderView2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jPanel3.add(kGradientPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));

        PantsBottom.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        PantsBottom.setText("00");
        jPanel3.add(PantsBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, 30));

        PantsWaist.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        PantsWaist.setText("00");
        jPanel3.add(PantsWaist, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, 30));

        PantsHip.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        PantsHip.setText("00");
        jPanel3.add(PantsHip, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, 30));

        PantsLength.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        PantsLength.setText("00");
        jPanel3.add(PantsLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, 30));

        PantsSizing.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\OneDrive\\Documents\\Tugas Tugas Kuliah Semester 2\\Pemrograman Berorientasi Objek\\gambar baju\\pants sizing fix.png")); // NOI18N
        jPanel3.add(PantsSizing, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        SkirtBottom.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        SkirtBottom.setText("00");
        jPanel3.add(SkirtBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, 30));

        SkirtLength.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        SkirtLength.setText("00");
        jPanel3.add(SkirtLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, 30));

        SkirtHip.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        SkirtHip.setText("00");
        jPanel3.add(SkirtHip, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, 30));

        SkirtWaist.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        SkirtWaist.setText("00");
        jPanel3.add(SkirtWaist, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, 30));

        SkirtSizing.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\OneDrive\\Documents\\Tugas Tugas Kuliah Semester 2\\Pemrograman Berorientasi Objek\\gambar baju\\skirt sizing fix.png")); // NOI18N
        jPanel3.add(SkirtSizing, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 227, 217));

        Model.setFont(new java.awt.Font("Mermaid", 0, 36)); // NOI18N
        Model.setText("00");
        jPanel3.add(Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, 30));

        NOC.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        NOC.setText("<html>Number Of <br>Choice:");
        jPanel3.add(NOC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, 40));

        SkirtModel.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\OneDrive\\Documents\\Tugas Tugas Kuliah Semester 2\\Pemrograman Berorientasi Objek\\gambar baju\\skirt model fix.png")); // NOI18N
        jPanel3.add(SkirtModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));

        PantsModel.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\OneDrive\\Documents\\Tugas Tugas Kuliah Semester 2\\Pemrograman Berorientasi Objek\\gambar baju\\pants model fix.png")); // NOI18N
        jPanel3.add(PantsModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 339, 290));

        labelOrderId.setFont(new java.awt.Font("Mermaid", 1, 18)); // NOI18N
        labelOrderId.setText("Order Id");
        jPanel3.add(labelOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 17, -1, -1));

        txtOrderId.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        txtOrderId.setForeground(new java.awt.Color(102, 102, 102));
        txtOrderId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 11, 104, -1));

        buttonShow.setBackground(new java.awt.Color(255, 255, 255));
        buttonShow.setFont(new java.awt.Font("Mermaid", 0, 14)); // NOI18N
        buttonShow.setText("show sizing and model");
        buttonShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowActionPerformed(evt);
            }
        });
        jPanel3.add(buttonShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 44, 194, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BReport2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BReport2MouseClicked
        BottomOrder a= new BottomOrder();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_BReport2MouseClicked

    private void TReport2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TReport2MouseClicked
        TopOrder a= new TopOrder();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_TReport2MouseClicked

    private void BOrderView2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOrderView2MouseClicked
        new BottomReportView().setVisible(true);
        dispose();
    }//GEN-LAST:event_BOrderView2MouseClicked

    private void labelBack2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBack2MouseClicked
        new BottomReportView().setVisible(true);
        dispose();
    }//GEN-LAST:event_labelBack2MouseClicked

    private void TOrderView2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TOrderView2MouseClicked
        TopOrderView a= new TopOrderView();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_TOrderView2MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void buttonShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowActionPerformed
        try{
            String sql = ("select *from tb_orderBottom where OrderId= '"+txtOrderId.getText()+"';");
            rs = st.executeQuery(sql);
            while (rs.next()){
                String i= (rs.getString(8));
                int j= Integer.parseInt(i);
                if(j>40){
                    PantsSizing.setVisible(true);
                    PantsModel.setVisible(true);
                    SkirtSizing.setVisible(false);
                    SkirtModel.setVisible(false);
                    
                    SkirtWaist.setVisible(false);
                    SkirtHip.setVisible(false);
                    SkirtLength.setVisible(false);
                    SkirtBottom.setVisible(false);
                    
                    PantsWaist.setText(rs.getString(4));
                    PantsHip.setText(rs.getString(5));
                    PantsLength.setText(rs.getString(6));
                    PantsBottom.setText(rs.getString(7));
                    
                    PantsWaist.setVisible(true);
                    PantsHip.setVisible(true);
                    PantsLength.setVisible(true);
                    PantsBottom.setVisible(true);

                    Model.setText(rs.getString(8));
                }
                else if(j<=40){
                    SkirtSizing.setVisible(true);
                    SkirtModel.setVisible(true);
                    PantsSizing.setVisible(false);
                    PantsModel.setVisible(false);
                    
                    PantsWaist.setVisible(false);
                    PantsHip.setVisible(false);
                    PantsLength.setVisible(false);
                    PantsBottom.setVisible(false);

                    SkirtWaist.setText(rs.getString(4));
                    SkirtHip.setText(rs.getString(5));
                    SkirtLength.setText(rs.getString(6));
                    SkirtBottom.setText(rs.getString(7));
                    
                    SkirtWaist.setVisible(true);
                    SkirtHip.setVisible(true);
                    SkirtLength.setVisible(true);
                    SkirtBottom.setVisible(true);
                    
                    Model.setText(rs.getString(8));
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to show data" +e.getMessage());
        }
    }//GEN-LAST:event_buttonShowActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BottomOrderView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BOrderView2;
    private javax.swing.JLabel BReport2;
    private javax.swing.JLabel Model;
    private javax.swing.JLabel NOC;
    private javax.swing.JLabel PantsBottom;
    private javax.swing.JLabel PantsHip;
    private javax.swing.JLabel PantsLength;
    private javax.swing.JLabel PantsModel;
    private javax.swing.JLabel PantsSizing;
    private javax.swing.JLabel PantsWaist;
    private javax.swing.JLabel SkirtBottom;
    private javax.swing.JLabel SkirtHip;
    private javax.swing.JLabel SkirtLength;
    private javax.swing.JLabel SkirtModel;
    private javax.swing.JLabel SkirtSizing;
    private javax.swing.JLabel SkirtWaist;
    private javax.swing.JLabel TOrderView2;
    private javax.swing.JLabel TReport2;
    private javax.swing.JButton buttonShow;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel3;
    private keeptoo.KGradientPanel kGradientPanel9;
    private javax.swing.JLabel labelBack2;
    private javax.swing.JLabel labelOrderId;
    private javax.swing.JTextField txtOrderId;
    // End of variables declaration//GEN-END:variables
}
