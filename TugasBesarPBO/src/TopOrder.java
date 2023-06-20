import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TopOrder extends javax.swing.JFrame {
    public static Connection con = null; 
    public static Statement st = null; 
    public static ResultSet rs;

    public TopOrder() {
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
    DefaultTableModel tb;
    public void tampiltabel(){
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("OrderId");
        tb.addColumn("Username");
        tb.addColumn("Kode");
        tb.addColumn("ShoulderWidth");
        tb.addColumn("Chest");
        tb.addColumn("Waist");
        tb.addColumn("Length");
        tb.addColumn("Hip");
        tb.addColumn("CollarModel");
        tb.addColumn("ButtonModel");
        tb.addColumn("SleeveModel");
        tb.addColumn("SleeveWidth");
        tb.addColumn("SleeveLength");
        tb.addColumn("Note");
        tb.addColumn("TotalPayment");
        tb.addColumn("OrderStatus");
        tb.addColumn("PaymentStatus");
        tb.addColumn("Date");
        tableOrder.setModel(tb); 
        
        try{
            String sql = ("select * from tb_orderTop");
            rs = st.executeQuery(sql);
            while (rs.next()){
                tb.addRow(new Object[]{
                    rs.getString("OrderId"),
                    rs.getString("Username"),
                    rs.getString("Kode"),
                    rs.getString("ShoulderWidth"), 
                    rs.getString("Chest"), 
                    rs.getString("Waist"), 
                    rs.getString("Length"), 
                    rs.getString("Hip"),
                    rs.getString("CollarModel"),
                    rs.getString("ButtonModel"),
                    rs.getString("SleeveModel"),
                    rs.getString("SleeveWidth"),
                    rs.getString("SleeveLength"),
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
        labelAccount = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelExit = new javax.swing.JLabel();
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
        txtShoulderWidth = new javax.swing.JTextField();
        txtChest = new javax.swing.JTextField();
        txtWaist = new javax.swing.JTextField();
        labelFname6 = new javax.swing.JLabel();
        txtLength = new javax.swing.JTextField();
        txtCollarModel = new javax.swing.JTextField();
        labelFname7 = new javax.swing.JLabel();
        labelFname8 = new javax.swing.JLabel();
        labelFname9 = new javax.swing.JLabel();
        labelFname10 = new javax.swing.JLabel();
        txtTotalPayment = new javax.swing.JTextField();
        labelFname11 = new javax.swing.JLabel();
        labelFname12 = new javax.swing.JLabel();
        txtHip = new javax.swing.JTextField();
        txtSleeveModel = new javax.swing.JTextField();
        txtButtonModel = new javax.swing.JTextField();
        txtSleeveWidth = new javax.swing.JTextField();
        labelFname14 = new javax.swing.JLabel();
        labelFname15 = new javax.swing.JLabel();
        txtNote = new javax.swing.JTextField();
        labelFname16 = new javax.swing.JLabel();
        labelFname17 = new javax.swing.JLabel();
        txtSleeveLength = new javax.swing.JTextField();
        buttonShow = new javax.swing.JButton();
        txtDate = new javax.swing.JTextField();
        labelFname13 = new javax.swing.JLabel();
        cbOrderStatus = new javax.swing.JComboBox<>();
        cbPaymentStatus = new javax.swing.JComboBox<>();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        labelBack = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(730, 430));

        labelAccount.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        labelAccount.setText("Account");
        labelAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAccountMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel17.setText("X");

        labelExit.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelExit.setText("X");
        labelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExitMouseClicked(evt);
            }
        });

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
        tableOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableOrderMouseClicked(evt);
            }
        });
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
        labelFname2.setText("ShoulderWidth");

        labelFname4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname4.setText("Chest");

        labelFname5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname5.setText("Waist");

        txtUsername.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(102, 102, 102));
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        txtKode.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtKode.setForeground(new java.awt.Color(102, 102, 102));
        txtKode.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        txtShoulderWidth.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtShoulderWidth.setForeground(new java.awt.Color(102, 102, 102));
        txtShoulderWidth.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        txtChest.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtChest.setForeground(new java.awt.Color(102, 102, 102));
        txtChest.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        txtWaist.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtWaist.setForeground(new java.awt.Color(102, 102, 102));
        txtWaist.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        labelFname6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname6.setText("Length");

        txtLength.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtLength.setForeground(new java.awt.Color(102, 102, 102));
        txtLength.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        txtCollarModel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtCollarModel.setForeground(new java.awt.Color(102, 102, 102));
        txtCollarModel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        labelFname7.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname7.setText("CollarModel");

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

        labelFname12.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname12.setText("Hip");

        txtHip.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtHip.setForeground(new java.awt.Color(102, 102, 102));
        txtHip.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        txtSleeveModel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtSleeveModel.setForeground(new java.awt.Color(102, 102, 102));
        txtSleeveModel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        txtButtonModel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtButtonModel.setForeground(new java.awt.Color(102, 102, 102));
        txtButtonModel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        txtSleeveWidth.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtSleeveWidth.setForeground(new java.awt.Color(102, 102, 102));
        txtSleeveWidth.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        labelFname14.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname14.setText("Sleeve Model");

        labelFname15.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname15.setText("ButtonModel");

        txtNote.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtNote.setForeground(new java.awt.Color(102, 102, 102));
        txtNote.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        labelFname16.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname16.setText("Sleeve Width");

        labelFname17.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname17.setText("Sleeve Length");

        txtSleeveLength.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtSleeveLength.setForeground(new java.awt.Color(102, 102, 102));
        txtSleeveLength.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        buttonShow.setBackground(new java.awt.Color(255, 255, 255));
        buttonShow.setFont(new java.awt.Font("Mermaid", 0, 14)); // NOI18N
        buttonShow.setLabel("show data from id");
        buttonShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowActionPerformed(evt);
            }
        });

        txtDate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtDate.setForeground(new java.awt.Color(102, 102, 102));
        txtDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        labelFname13.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        labelFname13.setText("Date");

        cbOrderStatus.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        cbOrderStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "To Be Proceed", "Completed", "Cancelled" }));

        cbPaymentStatus.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        cbPaymentStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unpaid", "Paid", "Cancelled" }));

        kGradientPanel7.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel7.setkStartColor(new java.awt.Color(0, 36, 16));
        kGradientPanel7.setPreferredSize(new java.awt.Dimension(110, 85));

        jLabel13.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("<html>Top <br>Order");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
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

        jLabel14.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("<html>Bottom<br>Order");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("<html>Top <br>Order<br>Report");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("<html>Bottom <br>Order<br>Report");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
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
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addComponent(labelBack)
                .addGap(41, 41, 41)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(buttonShow)
                        .addGap(18, 18, 18)
                        .addComponent(buttonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1228, 1228, 1228)
                        .addComponent(labelAccount))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelFname1)
                                .addGap(45, 45, 45)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelFname4)
                                            .addComponent(labelFname5)
                                            .addComponent(labelFname6)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labelFname2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(labelFname3)))
                                        .addComponent(labelFname12, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelFname7, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(labelFname))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(txtLength, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtChest, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtShoulderWidth, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCollarModel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtKode, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtWaist, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtOrderId, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFname13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFname17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelFname16, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelFname14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelFname8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(labelFname11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelFname9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelFname15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelFname10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNote, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtButtonModel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSleeveLength, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSleeveWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSleeveModel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPaymentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(598, 598, 598)
                                .addComponent(labelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(167, 167, 167))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175)))
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(labelExit))
                .addGap(10, 10, 10)
                .addComponent(labelAccount)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFname14)
                            .addComponent(txtSleeveModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFname16)
                            .addComponent(txtSleeveWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFname17)
                            .addComponent(txtSleeveLength, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFname15)
                            .addComponent(txtButtonModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFname8)
                            .addComponent(txtNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFname9)
                            .addComponent(txtTotalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFname10)
                            .addComponent(cbOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFname11)
                            .addComponent(cbPaymentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFname13)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFname))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFname1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFname3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtShoulderWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFname2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtChest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFname4))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWaist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFname5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFname6))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFname12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCollarModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFname7, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonShow)
                    .addComponent(buttonInsert)
                    .addComponent(buttonUpdate)
                    .addComponent(buttonDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(kGradientPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAccountMouseClicked
        // TODO add your handling code here:
        Account acc= new Account();
        acc.setVisible(true);
        dispose();
    }//GEN-LAST:event_labelAccountMouseClicked

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelExitMouseClicked

    private void tableOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOrderMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tableOrderMouseClicked

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_tubespbo", "root", "");
            con.createStatement().executeUpdate ("update tb_orderTop set Username='"+txtUsername.getText()+"', ShoulderWidth= '"+txtShoulderWidth.getText()+"',"
                    + " Chest= '"+txtChest.getText()+"', Waist= '"+txtWaist.getText()+"', "
                    + "Length= '"+txtLength.getText()+"', Hip= '"+txtHip.getText()+"', CollarModel= '"+txtCollarModel.getText()+"', "
                    + "SleeveModel= '"+txtSleeveModel.getText()+"', SleeveWidth= '"+txtSleeveWidth.getText()+"',"
                    + "SleeveLength= '"+txtSleeveLength.getText()+"', ButtonModel= '"+txtButtonModel.getText()+"', "
                    + "Note= '"+txtNote.getText()+"', TotalPayment= '"+txtTotalPayment.getText()+"', "
                    + "OrderStatus= '"+cbOrderStatus.getSelectedItem()+"', PaymentStatus='"+cbPaymentStatus.getSelectedItem()+"', OrderDate='"+txtDate.getText()+"' "
                    + "where OrderId= '"+txtOrderId.getText()+"';");
            tampiltabel();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Incorrect Order Id");
        }
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void buttonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertActionPerformed
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_tubespbo", "root", "");
            con.createStatement().executeUpdate("insert into tb_orderTop (Username, Kode, ShoulderWidth, Chest, Waist, Length, Hip, CollarModel, ButtonModel, SleeveModel, SleeveWidth, SleeveLength, Note, TotalPayment, OrderStatus, PaymentStatus,OrderDate) values('"+txtUsername.getText()+"','A','"+txtShoulderWidth.getText()+"','"+txtChest.getText()+"','"+txtWaist.getText()+"','"+txtLength.getText()+"','"+txtHip.getText()+"',"
                    + "'"+txtCollarModel.getText()+"','"+txtButtonModel.getText()+"','"+txtSleeveModel.getText()+"','"+txtSleeveWidth.getText()+"','"+txtSleeveLength.getText()+"','"+txtNote.getText()+"','"+txtTotalPayment.getText()+"','"+cbOrderStatus.getSelectedItem()+"','"+cbPaymentStatus.getSelectedItem()+",'"+txtDate.getText()+"');");
            tampiltabel();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Please complete all the form");
        }
    }//GEN-LAST:event_buttonInsertActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_tubespbo", "root", "");
            con.createStatement().executeUpdate ("delete from tb_orderTop where OrderId= '"+txtOrderId.getText()+"';");
            tampiltabel();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Incorrect Order Id");
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowActionPerformed
        try{
            String sql = ("select *from tb_orderTop where Orderid= '"+txtOrderId.getText()+"';");
            String j= txtOrderId.getText();
            int i=Integer.parseInt(j);

            rs = st.executeQuery(sql);
            while (rs.next()){
                txtOrderId.setText(rs.getString(1));
                txtUsername.setText(rs.getString(2));
                txtKode.setText(rs.getString(3));
                txtShoulderWidth.setText(rs.getString(4));
                txtChest.setText(rs.getString(5));
                txtWaist.setText(rs.getString(6));
                txtLength.setText(rs.getString(7));
                txtHip.setText(rs.getString(8));
                txtCollarModel.setText(rs.getString(9));
                txtButtonModel.setText(rs.getString(10));
                txtSleeveModel.setText(rs.getString(11));
                txtSleeveWidth.setText(rs.getString(12));
                txtSleeveLength.setText(rs.getString(13));
                txtNote.setText(rs.getString(14));
                txtTotalPayment.setText(rs.getString(15));
                txtDate.setText(rs.getString(18));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to show data" +e.getMessage());
        }

    }//GEN-LAST:event_buttonShowActionPerformed

    private void labelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBackMouseClicked
        DashboardAdmin da= new DashboardAdmin();
        da.setVisible(true);
        dispose();
    }//GEN-LAST:event_labelBackMouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        TopOrder a= new TopOrder();
        a.setVisible(true);
        dispose();        
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        BottomOrder a= new BottomOrder();
        a.setVisible(true);
        dispose();         
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        new TopReportView().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        new BottomOrderView().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel14MouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TopOrder().setVisible(true);
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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel7;
    private javax.swing.JLabel labelAccount;
    private javax.swing.JLabel labelBack;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelFname;
    private javax.swing.JLabel labelFname1;
    private javax.swing.JLabel labelFname10;
    private javax.swing.JLabel labelFname11;
    private javax.swing.JLabel labelFname12;
    private javax.swing.JLabel labelFname13;
    private javax.swing.JLabel labelFname14;
    private javax.swing.JLabel labelFname15;
    private javax.swing.JLabel labelFname16;
    private javax.swing.JLabel labelFname17;
    private javax.swing.JLabel labelFname2;
    private javax.swing.JLabel labelFname3;
    private javax.swing.JLabel labelFname4;
    private javax.swing.JLabel labelFname5;
    private javax.swing.JLabel labelFname6;
    private javax.swing.JLabel labelFname7;
    private javax.swing.JLabel labelFname8;
    private javax.swing.JLabel labelFname9;
    private javax.swing.JTable tableOrder;
    private javax.swing.JTextField txtButtonModel;
    private javax.swing.JTextField txtChest;
    private javax.swing.JTextField txtCollarModel;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtHip;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtLength;
    private javax.swing.JTextField txtNote;
    private javax.swing.JTextField txtOrderId;
    private javax.swing.JTextField txtShoulderWidth;
    private javax.swing.JTextField txtSleeveLength;
    private javax.swing.JTextField txtSleeveModel;
    private javax.swing.JTextField txtSleeveWidth;
    private javax.swing.JTextField txtTotalPayment;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtWaist;
    // End of variables declaration//GEN-END:variables

}
