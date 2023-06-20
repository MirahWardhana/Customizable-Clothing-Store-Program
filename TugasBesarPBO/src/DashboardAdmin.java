import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class DashboardAdmin extends javax.swing.JFrame {
    public static Connection con = null; 
    public static Statement st = null; 
    public static ResultSet rs;
    public static int j,l; 
    public static String i,k;

    public DashboardAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        koneksimysql();
        sales();
        date();
        time();
        countunpaidorders();
        countneworders();
        countonproceedorders();
        countcompletedorders();  
        total();
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
    
    public void countneworders(){
        try{
            String sql = ("SELECT COUNT(orderid) FROM tb_ordertop where TotalPayment=0;");
            rs = st.executeQuery(sql);
            while (rs.next()){
                i= rs.getString(1);
                j=Integer.parseInt(i);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to show data" +e.getMessage());
        }
        try{
            String sql = ("SELECT COUNT(orderid) FROM tb_orderbottom where TotalPayment=0;");
            rs = st.executeQuery(sql);
            while (rs.next()){
                k= rs.getString(1);
                l=Integer.parseInt(k);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to show data" +e.getMessage());
        }
        String s=Integer.toString(j+l);
        labelNew.setText(s);
    }  

    public void countunpaidorders(){
        try{
            String sql = ("SELECT COUNT(orderid) FROM tb_ordertop where PaymentStatus='Unpaid';");
            rs = st.executeQuery(sql);
            while (rs.next()){
                i= rs.getString(1);
                j=Integer.parseInt(i);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to show data" +e.getMessage());
        }
        try{
            String sql = ("SELECT COUNT(orderid) FROM tb_orderbottom where PaymentStatus='Unpaid';");
            rs = st.executeQuery(sql);
            while (rs.next()){
                k= rs.getString(1);
                l=Integer.parseInt(k);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to show data" +e.getMessage());
        }
        String s=Integer.toString(j+l);
        labelUnpaid.setText(s);
    }
    public void countonproceedorders(){
        try{
            String sql = ("SELECT COUNT(orderid) FROM tb_ordertop where OrderStatus='To be proceed';");
            rs = st.executeQuery(sql);
            while (rs.next()){
                i= rs.getString(1);
                j=Integer.parseInt(i);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to show data" +e.getMessage());
        }
        try{
            String sql = ("SELECT COUNT(orderid) FROM tb_orderbottom where OrderStatus='To be proceed';");
            rs = st.executeQuery(sql);
            while (rs.next()){
                k= rs.getString(1);
                l=Integer.parseInt(k);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to data" +e.getMessage());
        }
        String s=Integer.toString(j+l);
        labelOnProceed.setText(s);
    }
    
    public void countcompletedorders(){
        try{
            String sql = ("SELECT COUNT(orderid) FROM tb_ordertop where OrderStatus='Completed' and PaymentStatus='Paid';");
            rs = st.executeQuery(sql);
            while (rs.next()){
                i= rs.getString(1);
                j=Integer.parseInt(i);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to payment data" +e.getMessage());
        }
        try{
            String sql = ("SELECT COUNT(orderid) FROM tb_orderbottom where OrderStatus='Completed' and PaymentStatus='Paid';");
            rs = st.executeQuery(sql);
            while (rs.next()){
                k= rs.getString(1);
                l=Integer.parseInt(k);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to show data" +e.getMessage());
        }
        String s=Integer.toString(j+l);
        labelCompleted.setText(s);
    }
     
    public void total(){
        try{
            String sql = ("SELECT COUNT(orderid) FROM tb_ordertop;");
            rs = st.executeQuery(sql);
            while (rs.next()){
                i= rs.getString(1);
                j=Integer.parseInt(i);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to show data" +e.getMessage());
        }
        try{
            String sql = ("SELECT COUNT(orderid) FROM tb_orderbottom;");
            rs = st.executeQuery(sql);
            while (rs.next()){
                k= rs.getString(1);
                l=Integer.parseInt(k);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to show data" +e.getMessage());
        }
        String s=Integer.toString(j+l);
        labelTotal.setText(s);
    }
     
    public void sales(){
        try{
            String sql = ("SELECT sum(TotalPayment) FROM tb_ordertop where PaymentStatus='Paid';");
            rs = st.executeQuery(sql);
            while (rs.next()){
                i= rs.getString(1);
                j=Integer.parseInt(i);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to show data" +e.getMessage());
        }
        try{
            String sql = ("SELECT sum(TotalPayment) FROM tb_orderbottom where PaymentStatus='Paid';");
            rs = st.executeQuery(sql);
            while (rs.next()){
                k= rs.getString(1);
                l=Integer.parseInt(k);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to show data" +e.getMessage());
        }
        String s=Integer.toString(j+l);
        labelSales.setText(s);
    }
       
    public void date()
        {
            Date d=new Date();
            SimpleDateFormat sdf =new SimpleDateFormat ("yyyy/mm/dd");
            String dd= sdf.format(d);
            labelDate.setText(dd);
        }    
        public void time(){
            new Timer(0,new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae){
                    Date d=new Date();
                    SimpleDateFormat s= new SimpleDateFormat("hh.mm.ss");
                    String time= s.format(d);
                    labelTime.setText(time);
                }
            }).start();
        }
        
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelDashboard = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        TOrderView = new javax.swing.JLabel();
        labelBack = new javax.swing.JLabel();
        BOrderView = new javax.swing.JLabel();
        TReport = new javax.swing.JLabel();
        BReport = new javax.swing.JLabel();
        labelDashboard3 = new javax.swing.JLabel();
        labelDashboard5 = new javax.swing.JLabel();
        labelDashboard6 = new javax.swing.JLabel();
        labelDashboard7 = new javax.swing.JLabel();
        labelUnpaid = new javax.swing.JLabel();
        labelOnProceed = new javax.swing.JLabel();
        labelNew = new javax.swing.JLabel();
        labelCompleted = new javax.swing.JLabel();
        kGradientPanel8 = new keeptoo.KGradientPanel();
        labelTime = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        labelDashboard8 = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        labelSales = new javax.swing.JLabel();
        labelTime1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(730, 430));

        labelDashboard.setFont(new java.awt.Font("Mermaid", 0, 24)); // NOI18N
        labelDashboard.setText("Dashboard for Admin");

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel17.setText("X");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        kGradientPanel7.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel7.setkStartColor(new java.awt.Color(0, 36, 16));
        kGradientPanel7.setPreferredSize(new java.awt.Dimension(110, 85));

        TOrderView.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        TOrderView.setForeground(new java.awt.Color(255, 255, 255));
        TOrderView.setText("<html>Top <br>Order");
        TOrderView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TOrderViewMouseClicked(evt);
            }
        });

        labelBack.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelBack.setForeground(new java.awt.Color(255, 255, 255));
        labelBack.setText("<<<");
        labelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBackMouseClicked(evt);
            }
        });

        BOrderView.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        BOrderView.setForeground(new java.awt.Color(255, 255, 255));
        BOrderView.setText("<html>Bottom<br>Order");
        BOrderView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOrderViewMouseClicked(evt);
            }
        });

        TReport.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        TReport.setForeground(new java.awt.Color(255, 255, 255));
        TReport.setText("<html>Top <br>Order<br>Report");
        TReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TReportMouseClicked(evt);
            }
        });

        BReport.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        BReport.setForeground(new java.awt.Color(255, 255, 255));
        BReport.setText("<html>Bottom <br>Order<br>Report");
        BReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BReportMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel7Layout = new javax.swing.GroupLayout(kGradientPanel7);
        kGradientPanel7.setLayout(kGradientPanel7Layout);
        kGradientPanel7Layout.setHorizontalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelBack))
                    .addGroup(kGradientPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TOrderView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BOrderView, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addComponent(labelBack)
                .addGap(41, 41, 41)
                .addComponent(TReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(BReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(TOrderView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BOrderView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        labelDashboard3.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        labelDashboard3.setText("<html>Completed <br>Orders ");

        labelDashboard5.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        labelDashboard5.setText("<html>On Proceed <br>Orders");

        labelDashboard6.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        labelDashboard6.setText("<html>New<br>Orders");

        labelDashboard7.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        labelDashboard7.setText("<html>Unpaid<br>Orders");

        labelUnpaid.setFont(new java.awt.Font("Mermaid", 0, 70)); // NOI18N
        labelUnpaid.setText("00");

        labelOnProceed.setFont(new java.awt.Font("Mermaid", 0, 70)); // NOI18N
        labelOnProceed.setText("00");

        labelNew.setFont(new java.awt.Font("Mermaid", 0, 70)); // NOI18N
        labelNew.setText("00");

        labelCompleted.setFont(new java.awt.Font("Mermaid", 0, 70)); // NOI18N
        labelCompleted.setText("00");

        kGradientPanel8.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel8.setkStartColor(new java.awt.Color(0, 36, 16));
        kGradientPanel8.setPreferredSize(new java.awt.Dimension(110, 85));

        labelTime.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        labelTime.setForeground(new java.awt.Color(255, 255, 255));
        labelTime.setText("time");

        labelTotal.setFont(new java.awt.Font("Mermaid", 0, 80)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(255, 255, 255));
        labelTotal.setText("00");

        labelDashboard8.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        labelDashboard8.setForeground(new java.awt.Color(255, 255, 255));
        labelDashboard8.setText("Total Orders");

        labelDate.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        labelDate.setForeground(new java.awt.Color(255, 255, 255));
        labelDate.setText("date");

        labelSales.setFont(new java.awt.Font("Mermaid", 0, 60)); // NOI18N
        labelSales.setForeground(new java.awt.Color(255, 255, 255));
        labelSales.setText("000000");

        labelTime1.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        labelTime1.setForeground(new java.awt.Color(255, 255, 255));
        labelTime1.setText("Total Sales");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout kGradientPanel8Layout = new javax.swing.GroupLayout(kGradientPanel8);
        kGradientPanel8.setLayout(kGradientPanel8Layout);
        kGradientPanel8Layout.setHorizontalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDashboard8)
                            .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelTime1)
                                .addComponent(labelTotal))))
                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTime)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDate)
                            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                .addComponent(labelSales)
                                .addGap(27, 27, 27)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        kGradientPanel8Layout.setVerticalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(labelSales, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTime1)
                .addGap(18, 18, 18)
                .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDashboard8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDate)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelOnProceed)
                                    .addComponent(labelDashboard5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelDashboard6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNew))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCompleted)
                                    .addComponent(labelDashboard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelDashboard7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelUnpaid))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(kGradientPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelDashboard)
                                .addGap(211, 211, 211))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGap(15, 15, 15)
                .addComponent(labelDashboard)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNew, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelUnpaid, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDashboard6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDashboard7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCompleted, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelOnProceed))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDashboard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDashboard5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(kGradientPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void labelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBackMouseClicked
        Login a= new Login();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_labelBackMouseClicked

    private void TReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TReportMouseClicked
        TopOrder a= new TopOrder();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_TReportMouseClicked

    private void BReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BReportMouseClicked
        BottomOrder a= new BottomOrder();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_BReportMouseClicked

    private void TOrderViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TOrderViewMouseClicked
        new TopReportView().setVisible(true);
        dispose();
    }//GEN-LAST:event_TOrderViewMouseClicked

    private void BOrderViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOrderViewMouseClicked
        new BottomReportView().setVisible(true);
        dispose();
    }//GEN-LAST:event_BOrderViewMouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BOrderView;
    private javax.swing.JLabel BReport;
    private javax.swing.JLabel TOrderView;
    private javax.swing.JLabel TReport;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel7;
    private keeptoo.KGradientPanel kGradientPanel8;
    private javax.swing.JLabel labelBack;
    private javax.swing.JLabel labelCompleted;
    private javax.swing.JLabel labelDashboard;
    private javax.swing.JLabel labelDashboard3;
    private javax.swing.JLabel labelDashboard5;
    private javax.swing.JLabel labelDashboard6;
    private javax.swing.JLabel labelDashboard7;
    private javax.swing.JLabel labelDashboard8;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelNew;
    private javax.swing.JLabel labelOnProceed;
    private javax.swing.JLabel labelSales;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel labelTime1;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelUnpaid;
    // End of variables declaration//GEN-END:variables

    private ActionListener ActionListener() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
