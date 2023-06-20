import java.awt.Color;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    Connection con = null; 
    Statement st = null; 
    public static String username;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPhoto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelPassword = new javax.swing.JLabel();
        labelForgetPassword = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        labelCoutre = new javax.swing.JLabel();
        labelWelcome = new javax.swing.JLabel();
        panelLogin = new keeptoo.KGradientPanel();
        labelLogin = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        checkboxShowPassword = new javax.swing.JCheckBox();
        labelUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        labelSignup = new javax.swing.JLabel();
        labelExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        labelPhoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\OneDrive\\Documents\\TugasBesarPBO\\foto login 1.png")); // NOI18N
        labelPhoto.setText("jLabel8");
        labelPhoto.setPreferredSize(new java.awt.Dimension(339, 200));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        labelPassword.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelPassword.setText("Password");

        labelForgetPassword.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        labelForgetPassword.setText("forget your password");

        kGradientPanel3.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel3.setkStartColor(new java.awt.Color(0, 36, 16));

        labelCoutre.setFont(new java.awt.Font("Mermaid", 0, 24)); // NOI18N
        labelCoutre.setForeground(new java.awt.Color(255, 255, 255));
        labelCoutre.setText("Coutre");

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(labelCoutre)
                .addContainerGap())
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(labelCoutre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelWelcome.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        labelWelcome.setForeground(new java.awt.Color(0, 36, 16));
        labelWelcome.setText("Welcome");

        panelLogin.setkEndColor(new java.awt.Color(204, 255, 204));
        panelLogin.setkStartColor(new java.awt.Color(0, 36, 16));
        panelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLoginMouseClicked(evt);
            }
        });

        labelLogin.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelLogin.setText("Login");

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(labelLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtPassword.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        checkboxShowPassword.setBackground(new java.awt.Color(255, 255, 255));
        checkboxShowPassword.setFont(new java.awt.Font("Yu Gothic UI", 0, 8)); // NOI18N
        checkboxShowPassword.setText("<html>show <br>password");
        checkboxShowPassword.setBorder(null);
        checkboxShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxShowPasswordActionPerformed(evt);
            }
        });

        labelUsername.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelUsername.setText("Username");

        txtUsername.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(102, 102, 102));
        txtUsername.setText("Enter your username");
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelForgetPassword)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(checkboxShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
                            .addComponent(labelWelcome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelUsername)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPassword)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(checkboxShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelForgetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );

        kGradientPanel1.setForeground(new java.awt.Color(0, 36, 16));
        kGradientPanel1.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 36, 16));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(380, 300));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(380, 300));

        labelSignup.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelSignup.setForeground(new java.awt.Color(255, 255, 255));
        labelSignup.setText("Sign Up");
        labelSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSignupMouseClicked(evt);
            }
        });

        labelExit.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelExit.setForeground(new java.awt.Color(255, 255, 255));
        labelExit.setText("X");
        labelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExitMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/suit-and-tie-outfit.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jacket-elegant-feminine-black-clothes-for-business (1).png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelSignup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(82, 82, 82))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        if (txtUsername.getText().equals ("Enter your username")){
            txtUsername.setText("");
            txtUsername.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        if (txtUsername.getText().equals ("")){
            txtUsername.setText("Enter your username");
            txtUsername.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void panelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLoginMouseClicked
        if (txtUsername.getText(). equals("Enter your username")){
                JOptionPane.showMessageDialog (null,"Please enter your username!");
                txtUsername.requestFocus();
        }
        else if(txtPassword.getText(). equals("")){
                JOptionPane.showMessageDialog (null,"Please enter your password!");
                txtPassword.requestFocus();
        }
        else{
            try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost/db_tubesPBO", "root", "");
                    st = con.createStatement();
                    String sql = ("select* from tb_register where Username='"+txtUsername.getText()+"'and Password='"+txtPassword.getText()+"';");
                    ResultSet rs = st.executeQuery(sql);
                    if (rs.next()){
                       username = txtUsername.getText();
                       this.setVisible(false);
                       new Dashboard().setVisible(true); 
                       if (txtUsername.getText().equals("MirahWardhana")|| txtUsername.getText().equals("Caturdianta") ){
                           this.setVisible(false);
                           new DashboardAdmin().setVisible(true); 
                       }
                    }
                    else{
                        JOptionPane.showMessageDialog(rootPane,"Incorrect username or password");
                    }
            }
            catch (Exception e) {
                    JOptionPane.showMessageDialog(this,"Connection Failed!");
            }     
        }
    }//GEN-LAST:event_panelLoginMouseClicked

    private void labelSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSignupMouseClicked
        Register regis= new Register();
        regis.setVisible(true);
        dispose();
    }//GEN-LAST:event_labelSignupMouseClicked

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        System.exit(0);      
    }//GEN-LAST:event_labelExitMouseClicked

    private void checkboxShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxShowPasswordActionPerformed
        if (checkboxShowPassword.isSelected()){
            txtPassword.setEchoChar((char)0);
        }else {
            txtPassword.setEchoChar ('*');
        }
    }//GEN-LAST:event_checkboxShowPasswordActionPerformed

    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkboxShowPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JLabel labelCoutre;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelForgetPassword;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPhoto;
    private javax.swing.JLabel labelSignup;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel labelWelcome;
    private keeptoo.KGradientPanel panelLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
