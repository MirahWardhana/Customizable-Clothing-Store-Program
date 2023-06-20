import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class TopOrderView extends javax.swing.JFrame {
    public static Connection con = null; 
    public static Statement st = null; 
    public static ResultSet rs;
    public static String collar;
    public static String button;
   
    public TopOrderView() {
        initComponents();
        setLocationRelativeTo(null);
        koneksimysql();
        
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
        SleeveWidth = new javax.swing.JLabel();
        ShoulderWidth = new javax.swing.JLabel();
        NOC = new javax.swing.JLabel();
        SleeveLength = new javax.swing.JLabel();
        Chest = new javax.swing.JLabel();
        Hip = new javax.swing.JLabel();
        Waist = new javax.swing.JLabel();
        Length = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        kGradientPanel9 = new keeptoo.KGradientPanel();
        TOrderView2 = new javax.swing.JLabel();
        labelBack2 = new javax.swing.JLabel();
        BOrderView2 = new javax.swing.JLabel();
        TReport2 = new javax.swing.JLabel();
        BReport2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelOrderId = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        buttonShow = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelNext4 = new keeptoo.KGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        SleeveModel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(730, 430));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SleeveWidth.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        SleeveWidth.setText("00");
        jPanel3.add(SleeveWidth, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, 30));

        ShoulderWidth.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        ShoulderWidth.setText("00");
        jPanel3.add(ShoulderWidth, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, 30));

        NOC.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        NOC.setText("<html>Number Of <br>Choice:");
        jPanel3.add(NOC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, 40));

        SleeveLength.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        SleeveLength.setText("00");
        jPanel3.add(SleeveLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, 30));

        Chest.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        Chest.setText("00");
        jPanel3.add(Chest, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, 30));

        Hip.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        Hip.setText("00");
        jPanel3.add(Hip, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, 30));

        Waist.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        Waist.setText("00");
        jPanel3.add(Waist, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, 30));

        Length.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        Length.setText("00");
        jPanel3.add(Length, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, 30));

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
        TOrderView2.setForeground(new java.awt.Color(255, 255, 255));
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
        BOrderView2.setForeground(new java.awt.Color(204, 204, 204));
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

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\OneDrive\\Documents\\Tugas Tugas Kuliah Semester 2\\Pemrograman Berorientasi Objek\\gambar baju\\size chart baju fix2.png")); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 106, -1, -1));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleeve model fix.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, 258));

        panelNext4.setkEndColor(new java.awt.Color(204, 255, 204));
        panelNext4.setkGradientFocus(200);
        panelNext4.setkStartColor(new java.awt.Color(0, 36, 16));
        panelNext4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNext4MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Next");

        javax.swing.GroupLayout panelNext4Layout = new javax.swing.GroupLayout(panelNext4);
        panelNext4.setLayout(panelNext4Layout);
        panelNext4Layout.setHorizontalGroup(
            panelNext4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNext4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel13)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelNext4Layout.setVerticalGroup(
            panelNext4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNext4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.add(panelNext4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 100, -1));

        SleeveModel.setFont(new java.awt.Font("Mermaid", 0, 36)); // NOI18N
        SleeveModel.setText("00");
        jPanel3.add(SleeveModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, -1, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void TOrderView2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TOrderView2MouseClicked
        TopOrderView a= new TopOrderView();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_TOrderView2MouseClicked

    private void labelBack2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBack2MouseClicked
        DashboardAdmin da= new DashboardAdmin();
        da.setVisible(true);
        dispose();
    }//GEN-LAST:event_labelBack2MouseClicked

    private void BOrderView2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOrderView2MouseClicked
        new TopReportView().setVisible(true);
        dispose();
    }//GEN-LAST:event_BOrderView2MouseClicked

    private void TReport2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TReport2MouseClicked
        TopOrder a= new TopOrder();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_TReport2MouseClicked

    private void BReport2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BReport2MouseClicked
        BottomOrder a= new BottomOrder();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_BReport2MouseClicked

    private void buttonShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowActionPerformed
        try{
            String sql = ("select *from tb_orderTop where OrderId= '"+txtOrderId.getText()+"';");
            rs = st.executeQuery(sql);
            while (rs.next()){
                SleeveModel.setText(rs.getString(11));
                ShoulderWidth.setText(rs.getString(4));
                Chest.setText(rs.getString(5));
                Waist.setText(rs.getString(6));
                Length.setText(rs.getString(7));
                Hip.setText(rs.getString(8));
                SleeveWidth.setText(rs.getString(12));
                SleeveLength.setText(rs.getString(13));
                collar= rs.getString(9);
                button= rs.getString(10);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to show data" +e.getMessage());
        }
    }//GEN-LAST:event_buttonShowActionPerformed

    private void panelNext4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNext4MouseClicked
        new TopOrderView2().setVisible(true);
    }//GEN-LAST:event_panelNext4MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TopOrderView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BOrderView2;
    private javax.swing.JLabel BReport2;
    private javax.swing.JLabel Chest;
    private javax.swing.JLabel Hip;
    private javax.swing.JLabel Length;
    private javax.swing.JLabel NOC;
    private javax.swing.JLabel ShoulderWidth;
    private javax.swing.JLabel SleeveLength;
    private javax.swing.JLabel SleeveModel;
    private javax.swing.JLabel SleeveWidth;
    private javax.swing.JLabel TOrderView2;
    private javax.swing.JLabel TReport2;
    private javax.swing.JLabel Waist;
    private javax.swing.JButton buttonShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private keeptoo.KGradientPanel kGradientPanel9;
    private javax.swing.JLabel labelBack2;
    private javax.swing.JLabel labelOrderId;
    private keeptoo.KGradientPanel panelNext4;
    private javax.swing.JTextField txtOrderId;
    // End of variables declaration//GEN-END:variables
}
