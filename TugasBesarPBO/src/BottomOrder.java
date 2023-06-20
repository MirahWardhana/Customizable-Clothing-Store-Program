import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 
import java.io.FileWriter; 

import javax.swing.JOptionPane;

public class BottomOrder extends javax.swing.JFrame {
    public static Connection con = null; 
    public static Statement st = null; 
    public static ResultSet rs;

    DefaultTableModel tb;
    
    public BottomOrder() {
        initComponents();
        setLocationRelativeTo(null);
        koneksimysql();
        tampiltabel();       
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

    public void tampiltabel(){
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("OrderId");
        tb.addColumn("Username");
        tb.addColumn("Kode");
        tb.addColumn("Waist");
        tb.addColumn("Hip");
        tb.addColumn("Bottom");
        tb.addColumn("Model");
        tb.addColumn("Note");
        tb.addColumn("TotalPayment");
        tb.addColumn("OrderStatus");
        tb.addColumn("PaymentStatus");
        tb.addColumn("Date");
        tableOrder.setModel(tb); 
        try{
            String sql = ("select * from tb_orderBottom");
            rs = st.executeQuery(sql);
            while (rs.next()){
                tb.addRow(new Object[]{
                    rs.getString("OrderId"),
                    rs.getString("Username"),
                    rs.getString("Kode"), 
                    rs.getString("Waist"), 
                    rs.getString("Hip"), 
                    rs.getString("Bottom"), 
                    rs.getString("Model"),
                    rs.getString("Note"),
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableOrder = new javax.swing.JTable();
        labelFname = new javax.swing.JLabel();
        labelFname1 = new javax.swing.JLabel();
        labelFname3 = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        buttonUpdate = new javax.swing.JButton();
        buttonInsert = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        labelFname2 = new javax.swing.JLabel();
        labelFname4 = new javax.swing.JLabel();
        labelFname5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtKode = new javax.swing.JTextField();
        txtWaist = new javax.swing.JTextField();
        txtHip = new javax.swing.JTextField();
        txtLength = new javax.swing.JTextField();
        labelFname6 = new javax.swing.JLabel();
        txtBottom = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        labelFname7 = new javax.swing.JLabel();
        labelFname8 = new javax.swing.JLabel();
        labelFname9 = new javax.swing.JLabel();
        labelFname10 = new javax.swing.JLabel();
        txtTotalPayment = new javax.swing.JTextField();
        labelFname11 = new javax.swing.JLabel();
        buttonShow = new javax.swing.JButton();
        txtNote = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        labelFname24 = new javax.swing.JLabel();
        cbOrderStatus = new javax.swing.JComboBox<>();
        cbPaymentStatus = new javax.swing.JComboBox<>();
        kGradientPanel44 = new keeptoo.KGradientPanel();
        jLabel122 = new javax.swing.JLabel();
        labelBack37 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(730, 430));
        jPanel1.setPreferredSize(new java.awt.Dimension(730, 430));

        tableOrder.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        tableOrder.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableOrder);

        labelFname.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname.setText("Order Id");

        labelFname1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname1.setText("Username");

        labelFname3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname3.setText("Kode");

        txtOrderId.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtOrderId.setForeground(new java.awt.Color(102, 102, 102));
        txtOrderId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        buttonUpdate.setBackground(new java.awt.Color(255, 255, 255));
        buttonUpdate.setFont(new java.awt.Font("Mermaid", 0, 14)); // NOI18N
        buttonUpdate.setText("Update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonInsert.setBackground(new java.awt.Color(255, 255, 255));
        buttonInsert.setFont(new java.awt.Font("Mermaid", 0, 14)); // NOI18N
        buttonInsert.setText("Insert");
        buttonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertActionPerformed(evt);
            }
        });

        buttonDelete.setBackground(new java.awt.Color(255, 255, 255));
        buttonDelete.setFont(new java.awt.Font("Mermaid", 0, 14)); // NOI18N
        buttonDelete.setText("Delete ");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        labelFname2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname2.setText("Waist");

        labelFname4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname4.setText("Hip");

        labelFname5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname5.setText("Length");

        txtUsername.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(102, 102, 102));
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        txtKode.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtKode.setForeground(new java.awt.Color(102, 102, 102));
        txtKode.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        txtWaist.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtWaist.setForeground(new java.awt.Color(102, 102, 102));
        txtWaist.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        txtHip.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtHip.setForeground(new java.awt.Color(102, 102, 102));
        txtHip.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        txtLength.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtLength.setForeground(new java.awt.Color(102, 102, 102));
        txtLength.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        labelFname6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname6.setText("Bottom");

        txtBottom.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtBottom.setForeground(new java.awt.Color(102, 102, 102));
        txtBottom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        txtModel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtModel.setForeground(new java.awt.Color(102, 102, 102));
        txtModel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        labelFname7.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname7.setText("Model");

        labelFname8.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname8.setText("Note");

        labelFname9.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname9.setText("Total Payment");

        labelFname10.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname10.setText("Order Status");

        txtTotalPayment.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtTotalPayment.setForeground(new java.awt.Color(102, 102, 102));
        txtTotalPayment.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        labelFname11.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname11.setText("Payment Status");

        buttonShow.setBackground(new java.awt.Color(255, 255, 255));
        buttonShow.setFont(new java.awt.Font("Mermaid", 0, 14)); // NOI18N
        buttonShow.setLabel("show data from id");
        buttonShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowActionPerformed(evt);
            }
        });

        txtNote.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtNote.setForeground(new java.awt.Color(102, 102, 102));
        txtNote.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        txtDate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtDate.setForeground(new java.awt.Color(102, 102, 102));
        txtDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        labelFname24.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname24.setText("Date");

        cbOrderStatus.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        cbOrderStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "To Be Proceed", "Completed", "Cancelled" }));

        cbPaymentStatus.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        cbPaymentStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unpaid", "Paid", "Cancelled" }));

        kGradientPanel44.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel44.setkStartColor(new java.awt.Color(0, 36, 16));
        kGradientPanel44.setPreferredSize(new java.awt.Dimension(110, 85));

        jLabel122.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(204, 204, 204));
        jLabel122.setText("<html>Top <br>Order");
        jLabel122.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel122MouseClicked(evt);
            }
        });

        labelBack37.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelBack37.setForeground(new java.awt.Color(255, 255, 255));
        labelBack37.setText("<<<");
        labelBack37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBack37MouseClicked(evt);
            }
        });

        jLabel123.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(204, 204, 204));
        jLabel123.setText("<html>Bottom<br>Order");
        jLabel123.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel123MouseClicked(evt);
            }
        });

        jLabel124.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(204, 204, 204));
        jLabel124.setText("<html>Top <br>Order<br>Report");
        jLabel124.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel124MouseClicked(evt);
            }
        });

        jLabel125.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(255, 255, 255));
        jLabel125.setText("<html>Bottom <br>Order<br>Report");
        jLabel125.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel125MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel44Layout = new javax.swing.GroupLayout(kGradientPanel44);
        kGradientPanel44.setLayout(kGradientPanel44Layout);
        kGradientPanel44Layout.setHorizontalGroup(
            kGradientPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel44Layout.createSequentialGroup()
                .addGroup(kGradientPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel44Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelBack37))
                    .addGroup(kGradientPanel44Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(kGradientPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        kGradientPanel44Layout.setVerticalGroup(
            kGradientPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel44Layout.createSequentialGroup()
                .addComponent(labelBack37)
                .addGap(41, 41, 41)
                .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel1.setText("x");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(576, 576, 576)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labelFname1)
                                                    .addComponent(labelFname3)
                                                    .addComponent(labelFname2)
                                                    .addComponent(labelFname, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(labelFname4)
                                                    .addComponent(labelFname5)
                                                    .addComponent(labelFname6))
                                                .addGap(50, 50, 50)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtWaist, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtHip, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(48, 48, 48)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(labelFname7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelFname9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labelFname8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labelFname10)
                                                        .addComponent(labelFname11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNote, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cbPaymentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(buttonShow)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(buttonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTotalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelFname24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)
                                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(633, 633, 633)))
                        .addGap(446, 446, 446))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFname)
                            .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFname7)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelFname1))
                            .addComponent(labelFname8)
                            .addComponent(txtNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelFname9)
                                .addComponent(txtTotalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelFname3)
                            .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelFname10)
                                .addComponent(cbOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtWaist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelFname2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelFname11)
                                .addComponent(cbPaymentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtHip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelFname4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelFname24)
                                .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelFname5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(txtBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelFname6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonShow)
                    .addComponent(buttonInsert)
                    .addComponent(buttonUpdate)
                    .addComponent(buttonDelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(kGradientPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_tubespbo", "root", "");
            con.createStatement().executeUpdate ("update tb_orderBottom set Username='"+txtUsername.getText()+"', Waist= '"+txtWaist.getText()+"', Hip= '"+txtHip.getText()+"', Length= '"+txtLength.getText()+"', Bottom= '"+txtBottom.getText()+"', Model= '"+txtModel.getText()+"', Note= '"+txtNote.getText()+"', TotalPayment= '"+txtTotalPayment.getText()+"', OrderStatus= '"+cbOrderStatus.getSelectedItem()+"', PaymentStatus= '"+cbPaymentStatus.getSelectedItem()+"', OrderDate='"+txtDate.getText()+"' where OrderId= '"+txtOrderId.getText()+"';"); 
            tampiltabel();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Incorrect Order Id");
        }
        if (cbOrderStatus.getSelectedItem()=="Completed"){
            String Orderid= txtOrderId.getText(); 
            String Username= txtUsername.getText(); 
            String TotalPayment= txtTotalPayment.getText(); 
            String OrderDate= txtDate.getText(); 
         
            String OrderId= txtOrderId.getText();
        try { 
                FileWriter writer = new FileWriter ("Order.txt",true); 
                writer.write("OrderId"+OrderId); 
                writer.write(System.getProperty("line.separator"));
                writer.write("Username"+Username); 
                writer.write(System.getProperty("line.separator")); 
                writer.write("TotalPayment"+TotalPayment); 
                writer.write(System.getProperty("line.separator")); 
                writer.write("TotalPayment"+OrderDate); 
                writer.write(System.getProperty("line.separator")); 
                writer.close(); 

            } 
            catch (Exception e) 
            { 
                JOptionPane.showMessageDialog(rootPane, "Error"); 
            }

        }
        
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void buttonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertActionPerformed
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_tubespbo", "root", "");
            con.createStatement().executeUpdate("insert into tb_orderBottom (OrderId, Username, Kode, Waist, Hip, Length, Bottom, Model, Note, TotalPayment, OrderStatus, PaymentStatus, OrderDate) values('"+txtOrderId.getText()+"','"+txtUsername.getText()+"','B','"+txtWaist.getText()+"','"+txtHip.getText()+"','"+txtLength.getText()+"',"
                    + "'"+txtBottom.getText()+"','"+txtModel.getText()+"','"+txtNote.getText()+"','"+txtTotalPayment.getText()+"','"+cbOrderStatus.getSelectedItem()+"','"+cbPaymentStatus.getSelectedItem()+"','"+txtDate.getText()+"');");
            tampiltabel();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Please complete all the form");
        }
       
    }//GEN-LAST:event_buttonInsertActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_tubespbo", "root", "");
            con.createStatement().executeUpdate ("delete from tb_orderBottom where OrderId= '"+txtOrderId.getText()+"';"); 
            tampiltabel();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Incorrect Order Id");
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowActionPerformed
        try{
            String sql = ("select *from tb_orderBottom where Orderid= '"+txtOrderId.getText()+"';");
            String j= txtOrderId.getText();
            int i=Integer.parseInt(j);
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                txtOrderId.setText(rs.getString(1));
                txtUsername.setText(rs.getString(2));
                txtKode.setText(rs.getString(3));
                txtWaist.setText(rs.getString(4));
                txtHip.setText(rs.getString(5));
                txtLength.setText(rs.getString(6));
                txtBottom.setText(rs.getString(7));
                txtModel.setText(rs.getString(8));
                txtNote.setText(rs.getString(9));
                txtTotalPayment.setText(rs.getString(10));
                txtDate.setText(rs.getString(13));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to show data" +e.getMessage());
        }      
    }//GEN-LAST:event_buttonShowActionPerformed

    private void labelBack37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBack37MouseClicked
        DashboardAdmin da= new DashboardAdmin();
        da.setVisible(true);
        dispose();
    }//GEN-LAST:event_labelBack37MouseClicked

    private void jLabel124MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel124MouseClicked
        TopOrder a= new TopOrder();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel124MouseClicked

    private void jLabel125MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel125MouseClicked
        BottomOrder a= new BottomOrder();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel125MouseClicked

    private void jLabel122MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel122MouseClicked
        new TopReportView().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel122MouseClicked

    private void jLabel123MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel123MouseClicked
        new BottomReportView().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel123MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BottomOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonInsert;
    private javax.swing.JButton buttonShow;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JComboBox<String> cbOrderStatus;
    private javax.swing.JComboBox<String> cbPaymentStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel44;
    private javax.swing.JLabel labelBack37;
    private javax.swing.JLabel labelFname;
    private javax.swing.JLabel labelFname1;
    private javax.swing.JLabel labelFname10;
    private javax.swing.JLabel labelFname11;
    private javax.swing.JLabel labelFname2;
    private javax.swing.JLabel labelFname24;
    private javax.swing.JLabel labelFname3;
    private javax.swing.JLabel labelFname4;
    private javax.swing.JLabel labelFname5;
    private javax.swing.JLabel labelFname6;
    private javax.swing.JLabel labelFname7;
    private javax.swing.JLabel labelFname8;
    private javax.swing.JLabel labelFname9;
    private javax.swing.JTable tableOrder;
    private javax.swing.JTextField txtBottom;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtHip;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtLength;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtNote;
    private javax.swing.JTextField txtOrderId;
    private javax.swing.JTextField txtTotalPayment;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtWaist;
    // End of variables declaration//GEN-END:variables

}
