import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Account extends javax.swing.JFrame {
    public static Connection con = null; 
    public static Statement st = null; 
    public static ResultSet rs;
    String Username= Login.username;

    public Account() {
        initComponents();
        setLocationRelativeTo(null);
        koneksimysql();
        tampilprofile();
        update(); 
        
        labelCustomer.setText(Login.username);
        
        if (labelCustomer.getText().equals("MirahWardhana")|| labelCustomer.getText().equals("Caturdianta")){
            labelStatus.setText("Dressmaker");
        }
        else{
            labelStatus.setText("Customer");
        }
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
    
    public void tampilprofile(){
        try{
            String sql = ("select * from tb_register where Username='"+Username+"';");
            rs = st.executeQuery(sql);
            while (rs.next()){
                txtFname.setText(rs.getString(1));
                txtLname.setText(rs.getString(2));
                txtEmail.setText(rs.getString(3));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Failed to show data" +e.getMessage());
        }
    }
    
    void update(){
    if(txtNewPassword.getText(). equals(txtNewPassword2.getText())){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/db_tubesPBO", "root", "");
                st = con.createStatement();
                String simpan = "update tb_register set FirstName='"+txtFname.getText()+"'and Lastname='"+txtLname.getText()+"' and '"+txtEmail.getText()+"',Password='"+txtNewPassword.getText()+"') where username= '"+Username+"';";
                int SA = st.executeUpdate(simpan);
                this.setVisible(false);
                new Login().setVisible(true);
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(this,"New password is not the same!");
            }
        }
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        labelCustomer = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        txtLname = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtNewPassword = new javax.swing.JTextField();
        labelCustomer1 = new javax.swing.JLabel();
        labelCustomer2 = new javax.swing.JLabel();
        labelCustomer3 = new javax.swing.JLabel();
        labelCustomer4 = new javax.swing.JLabel();
        txtNewPassword2 = new javax.swing.JTextField();
        labelCustomer5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelStatus1 = new javax.swing.JLabel();
        labelMyOrder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(730, 430));

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

        jLabel1.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        jLabel1.setText("Dashboard");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        jLabel2.setText("Account");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

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

        jPanel8.setBackground(new java.awt.Color(0, 36, 16));
        jPanel8.setForeground(new java.awt.Color(0, 36, 16));

        labelCustomer.setFont(new java.awt.Font("Mermaid", 0, 24)); // NOI18N
        labelCustomer.setForeground(new java.awt.Color(255, 255, 255));
        labelCustomer.setText("username");

        labelStatus.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelStatus.setForeground(new java.awt.Color(255, 255, 255));
        labelStatus.setText("Status");

        txtLname.setBackground(new java.awt.Color(0, 36, 16));
        txtLname.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtLname.setForeground(new java.awt.Color(255, 255, 255));
        txtLname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtLname.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        txtFname.setBackground(new java.awt.Color(0, 36, 16));
        txtFname.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtFname.setForeground(new java.awt.Color(255, 255, 255));
        txtFname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtFname.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        txtEmail.setBackground(new java.awt.Color(0, 36, 16));
        txtEmail.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtEmail.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user (3).png"))); // NOI18N

        txtPassword.setBackground(new java.awt.Color(0, 36, 16));
        txtPassword.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setText("Enter your password");
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPassword.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });

        txtNewPassword.setBackground(new java.awt.Color(0, 36, 16));
        txtNewPassword.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtNewPassword.setText("Enter a new password");
        txtNewPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtNewPassword.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtNewPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNewPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNewPasswordFocusLost(evt);
            }
        });

        labelCustomer1.setFont(new java.awt.Font("Mermaid", 0, 12)); // NOI18N
        labelCustomer1.setForeground(new java.awt.Color(255, 255, 255));
        labelCustomer1.setText("First Name");

        labelCustomer2.setFont(new java.awt.Font("Mermaid", 0, 12)); // NOI18N
        labelCustomer2.setForeground(new java.awt.Color(255, 255, 255));
        labelCustomer2.setText("Surame");

        labelCustomer3.setFont(new java.awt.Font("Mermaid", 0, 12)); // NOI18N
        labelCustomer3.setForeground(new java.awt.Color(255, 255, 255));
        labelCustomer3.setText("Email");

        labelCustomer4.setFont(new java.awt.Font("Mermaid", 0, 12)); // NOI18N
        labelCustomer4.setForeground(new java.awt.Color(255, 255, 255));
        labelCustomer4.setText("Password");

        txtNewPassword2.setBackground(new java.awt.Color(0, 36, 16));
        txtNewPassword2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtNewPassword2.setForeground(new java.awt.Color(255, 255, 255));
        txtNewPassword2.setText("Re-enter new password");
        txtNewPassword2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtNewPassword2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtNewPassword2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNewPassword2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNewPassword2FocusLost(evt);
            }
        });

        labelCustomer5.setFont(new java.awt.Font("Mermaid", 0, 12)); // NOI18N
        labelCustomer5.setForeground(new java.awt.Color(255, 255, 255));
        labelCustomer5.setText("New Password");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        labelStatus1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelStatus1.setText("Save Changes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(labelStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelStatus1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(labelCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(44, 44, 44)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCustomer5)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelCustomer1)
                                .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelCustomer2)
                                .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelCustomer3)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelCustomer4)
                                .addComponent(txtNewPassword, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNewPassword2, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel3))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelCustomer1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelCustomer2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelCustomer3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addComponent(labelCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelStatus))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(labelCustomer4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelCustomer5)))
                .addGap(6, 6, 6)
                .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNewPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        labelMyOrder.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        labelMyOrder.setText("My Orders");
        labelMyOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMyOrderMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(614, 614, 614)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel1)
                                .addGap(76, 76, 76)
                                .addComponent(labelMyOrder)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(157, 157, 157))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(labelMyOrder))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        Login login= new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Dashboard d= new Dashboard();
        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void labelMyOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMyOrderMouseClicked
        // TODO add your handling code here:
        MyOrders mo= new MyOrders();
        mo.setVisible(true);
        dispose();
    }//GEN-LAST:event_labelMyOrderMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Account acc= new Account();
        acc.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
        if (txtPassword.getText().equals ("Enter your password")){
            txtPassword.setText("");
            txtNewPassword.setForeground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        // TODO add your handling code here:
        if (txtPassword.getText().equals ("")){
            txtPassword.setText("Enter your password");
            txtNewPassword.setForeground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtNewPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewPasswordFocusGained
        // TODO add your handling code here:
        if (txtNewPassword.getText().equals ("Enter a new password")){
            txtNewPassword.setText("");
            txtNewPassword.setForeground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtNewPasswordFocusGained

    private void txtNewPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewPasswordFocusLost
        // TODO add your handling code here:
        if (txtNewPassword.getText().equals ("")){
            txtNewPassword.setText("Enter a new password");
            txtNewPassword.setForeground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtNewPasswordFocusLost

    private void txtNewPassword2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewPassword2FocusGained
        // TODO add your handling code here:
        if (txtNewPassword2.getText().equals ("Re-enter new password")){
            txtNewPassword2.setText("");
            txtNewPassword2.setForeground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtNewPassword2FocusGained

    private void txtNewPassword2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewPassword2FocusLost
        // TODO add your handling code here:
        if (txtNewPassword2.getText().equals ("")){
            txtNewPassword2.setText("Re-enter new password");
            txtNewPassword2.setForeground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtNewPassword2FocusLost
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel7;
    private javax.swing.JLabel labelCustomer;
    private javax.swing.JLabel labelCustomer1;
    private javax.swing.JLabel labelCustomer2;
    private javax.swing.JLabel labelCustomer3;
    private javax.swing.JLabel labelCustomer4;
    private javax.swing.JLabel labelCustomer5;
    private javax.swing.JLabel labelMyOrder;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel labelStatus1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtNewPassword;
    private javax.swing.JTextField txtNewPassword2;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
