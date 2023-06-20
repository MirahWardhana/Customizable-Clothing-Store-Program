import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MyOrders extends javax.swing.JFrame {
    public static Connection con = null; 
    public static Statement st = null; 
    public static ResultSet rs;
    String Username= Login.username;

    public MyOrders() {
        initComponents();
        setLocationRelativeTo(null);
        koneksimysql();
        paymenttop();
        paymentbottom();
        tampiltabelB();
        tampiltabelA();
        grandtotal();
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
    public void paymentbottom(){
        try{
            String sql = ("select sum(TotalPayment) from tb_orderBottom where Username='"+Username+"' and kode='B' and PaymentStatus='Unpaid';");
            rs = st.executeQuery(sql);
            while (rs.next()){
                labelPaymentBottom.setText(rs.getString(1));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to show payment data" +e.getMessage());
        }
    }
    
    public void paymenttop(){
        try{
            String sql = ("select sum(TotalPayment) from tb_orderTop where Username='"+Username+"' and kode='A' and PaymentStatus='Unpaid';");
            rs = st.executeQuery(sql);
            while (rs.next()){
                labelPaymentTop.setText(rs.getString(1));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to show payment data" +e.getMessage());
        }
    }
    
    public void grandtotal(){
        String j= labelPaymentTop.getText();
        int i=Integer.parseInt(j);
        String k= labelPaymentBottom.getText();
        int l=Integer.parseInt(k);
        int m= i+l;
        String s=Integer.toString(m);
        labelGrandTotal.setText(s);
        
    }

    public void tampiltabelB(){
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("Id");
        tb.addColumn("Total");
        tb.addColumn("OrderStatus");
        tb.addColumn("PaymentStatus");
        tb.addColumn("OrderDate");
        tableOrderBottom.setModel(tb); 
        
        try{
            String sql = ("select OrderId,TotalPayment,OrderStatus, PaymentStatus, OrderDate from tb_orderBottom WHERE Username='"+Username+"' order by paymentstatus;");
            rs = st.executeQuery(sql);
            while (rs.next()){
                tb.addRow(new Object[]{
                    rs.getString("OrderId"),
                    rs.getString("TotalPayment"),
                    rs.getString("OrderStatus"),
                    rs.getString("PaymentStatus"),
                    rs.getString("OrderDate")
                });   
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to show data! " +e.getMessage());
        }
    }
        
    public void tampiltabelA(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Id");
        tbl.addColumn("Total");
        tbl.addColumn("OrderStatus");
        tbl.addColumn("PaymentStatus");
        tbl.addColumn("OrderDate");
        tableOrderTop.setModel(tbl); 
        
        try{
            String sql = ("select OrderId,TotalPayment,OrderStatus, PaymentStatus, OrderDate from tb_orderTop WHERE Username='"+Username+"' ORDER BY PaymentStatus;");
            rs = st.executeQuery(sql);
            while (rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString("OrderId"),
                    rs.getString("TotalPayment"),
                    rs.getString("OrderStatus"),
                    rs.getString("PaymentStatus"),
                    rs.getString("OrderDate")
                });   
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to show data! " +e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelPaymentBottom = new javax.swing.JLabel();
        labelAccount2 = new javax.swing.JLabel();
        labelAccount3 = new javax.swing.JLabel();
        labelPaymentTop = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableOrderBottom = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableOrderTop = new javax.swing.JTable();
        labelAccount4 = new javax.swing.JLabel();
        labelGrandTotal = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        labelDashboard = new javax.swing.JLabel();
        labelAccount = new javax.swing.JLabel();
        labelMyOrder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setPreferredSize(new java.awt.Dimension(730, 430));

        kGradientPanel7.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel7.setkStartColor(new java.awt.Color(0, 36, 16));

        jLabel13.setFont(new java.awt.Font("Mermaid", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Coutre");

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("<<<");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel7Layout = new javax.swing.GroupLayout(kGradientPanel7);
        kGradientPanel7.setLayout(kGradientPanel7Layout);
        kGradientPanel7Layout.setHorizontalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel17.setText("X");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        labelPaymentBottom.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        labelPaymentBottom.setText("0");

        labelAccount2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        labelAccount2.setText("Total");

        labelAccount3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        labelAccount3.setText("Total");

        labelPaymentTop.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        labelPaymentTop.setText("0");

        tableOrderBottom.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        tableOrderBottom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        tableOrderBottom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableOrderBottomBottomMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableOrderBottom);

        tableOrderTop.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        tableOrderTop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        tableOrderTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableOrderTopMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableOrderTop);

        labelAccount4.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        labelAccount4.setText("Grand Total");

        labelGrandTotal.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        labelGrandTotal.setText("0");

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel1.setkGradientFocus(200);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 36, 16));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        labelDashboard.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        labelDashboard.setText("Dashboard");
        labelDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDashboardMouseClicked(evt);
            }
        });

        labelAccount.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        labelAccount.setText("Account");
        labelAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAccountMouseClicked(evt);
            }
        });

        labelMyOrder.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        labelMyOrder.setText("My Orders");
        labelMyOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMyOrderMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(614, 614, 614)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(labelDashboard)
                                .addGap(77, 77, 77)
                                .addComponent(labelMyOrder)
                                .addGap(88, 88, 88)
                                .addComponent(labelAccount))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(labelAccount3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelPaymentTop, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(labelAccount2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelPaymentBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(labelAccount4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(11, 11, 11)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDashboard)
                            .addComponent(labelAccount)
                            .addComponent(labelMyOrder))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelPaymentBottom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelAccount3)
                        .addComponent(labelAccount2))
                    .addComponent(labelPaymentTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAccount4)
                    .addComponent(labelGrandTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        Login login= new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void tableOrderBottomBottomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOrderBottomBottomMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableOrderBottomBottomMouseClicked

    private void tableOrderTopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOrderTopMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableOrderTopMouseClicked

    private void labelDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDashboardMouseClicked
        Dashboard da= new Dashboard();
        da.setVisible(true);
        dispose();
    }//GEN-LAST:event_labelDashboardMouseClicked

    private void labelAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAccountMouseClicked
        Account acc= new Account();
        acc.setVisible(true);
        dispose();
    }//GEN-LAST:event_labelAccountMouseClicked

    private void labelMyOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMyOrderMouseClicked
        MyOrders mo= new MyOrders();
        mo.setVisible(true);
        dispose();
    }//GEN-LAST:event_labelMyOrderMouseClicked
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyOrders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel7;
    private javax.swing.JLabel labelAccount;
    private javax.swing.JLabel labelAccount2;
    private javax.swing.JLabel labelAccount3;
    private javax.swing.JLabel labelAccount4;
    private javax.swing.JLabel labelDashboard;
    private javax.swing.JLabel labelGrandTotal;
    private javax.swing.JLabel labelMyOrder;
    private javax.swing.JLabel labelPaymentBottom;
    private javax.swing.JLabel labelPaymentTop;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tableOrderBottom;
    private javax.swing.JTable tableOrderTop;
    // End of variables declaration//GEN-END:variables
}
