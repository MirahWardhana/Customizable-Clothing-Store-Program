import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement; 
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {
    Connection con = null; 
    Statement st = null; 
    
    public Register() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        labelLogin = new javax.swing.JLabel();
        labelMotto = new javax.swing.JLabel();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        txtFname = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        panelSignup7 = new keeptoo.KGradientPanel();
        labelSignup7 = new javax.swing.JLabel();
        labelLname = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        labelPassword1 = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JTextField();
        labelCreateAccount = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelPhone = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelFname = new javax.swing.JLabel();
        labelExit1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setForeground(new java.awt.Color(0, 36, 16));
        kGradientPanel1.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel1.setkGradientFocus(600);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 36, 16));

        labelLogin.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelLogin.setText("Login");
        labelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLoginMouseClicked(evt);
            }
        });

        labelMotto.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        labelMotto.setForeground(new java.awt.Color(255, 255, 255));
        labelMotto.setText("<html> Create <br> an Outfit  <br> That <br>Fits  <br> You <br>Well!");

        kGradientPanel7.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel7.setkStartColor(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Mermaid", 0, 24)); // NOI18N
        jLabel13.setText("Coutre");

        javax.swing.GroupLayout kGradientPanel7Layout = new javax.swing.GroupLayout(kGradientPanel7);
        kGradientPanel7.setLayout(kGradientPanel7Layout);
        kGradientPanel7Layout.setHorizontalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(labelMotto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185)
                        .addComponent(labelLogin)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(labelMotto, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel9.setPreferredSize(new java.awt.Dimension(360, 430));

        txtFname.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtFname.setForeground(new java.awt.Color(102, 102, 102));
        txtFname.setText("Enter your first name");
        txtFname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtFname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFnameFocusLost(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword.setText("Create a password");
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });

        panelSignup7.setkEndColor(new java.awt.Color(204, 255, 204));
        panelSignup7.setkStartColor(new java.awt.Color(0, 36, 16));
        panelSignup7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSignupMouseClicked(evt);
            }
        });

        labelSignup7.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelSignup7.setForeground(new java.awt.Color(255, 255, 255));
        labelSignup7.setText("Sign Up");

        javax.swing.GroupLayout panelSignup7Layout = new javax.swing.GroupLayout(panelSignup7);
        panelSignup7.setLayout(panelSignup7Layout);
        panelSignup7Layout.setHorizontalGroup(
            panelSignup7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSignup7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(labelSignup7)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panelSignup7Layout.setVerticalGroup(
            panelSignup7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSignup7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSignup7)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        labelLname.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelLname.setText("Last Name");

        txtUsername.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(102, 102, 102));
        txtUsername.setText("Create a username");
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });

        txtLname.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtLname.setForeground(new java.awt.Color(102, 102, 102));
        txtLname.setText("Enter your last name");
        txtLname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtLname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLnameFocusLost(evt);
            }
        });

        labelPassword1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelPassword1.setText("Password");

        txtPassword1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtPassword1.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword1.setText("Re-enter password");
        txtPassword1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtPassword1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassword1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassword1FocusLost(evt);
            }
        });

        labelCreateAccount.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        labelCreateAccount.setForeground(new java.awt.Color(0, 36, 16));
        labelCreateAccount.setText("Create Account");

        labelEmail.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelEmail.setText("Email");

        labelPhone.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelPhone.setText("Phone ");

        txtEmail.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(102, 102, 102));
        txtEmail.setText("Enter your email");
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        txtPhone.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtPhone.setForeground(new java.awt.Color(102, 102, 102));
        txtPhone.setText("Enter your phone number");
        txtPhone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPhoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPhoneFocusLost(evt);
            }
        });

        labelPassword.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelPassword.setText("Password");

        labelUsername.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelUsername.setText("Username");

        labelFname.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelFname.setText("First Name");

        labelExit1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelExit1.setText("X");
        labelExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExit1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelSignup7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(labelPhone)
                                        .addGap(46, 46, 46))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))))
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(labelLname, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(labelFname, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(labelExit1)
                .addGap(19, 19, 19)
                .addComponent(labelCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLname)
                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPassword1))
                .addGap(18, 18, 18)
                .addComponent(panelSignup7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void labelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLoginMouseClicked
        Login login = new Login(); 
        login.setVisible(true); 
        dispose(); 
    }//GEN-LAST:event_labelLoginMouseClicked

    private void txtPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneFocusLost
        if (txtPhone.getText().equals ("")){
            txtPhone.setText("Enter your phone number");
            txtPhone.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtPhoneFocusLost

    private void txtPhoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneFocusGained
        if (txtPhone.getText().equals ("Enter your phone number")){
            txtPhone.setText("");
            txtPhone.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtPhoneFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if (txtEmail.getText().equals ("")){
            txtEmail.setText("Enter your email");
            txtEmail.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        if (txtEmail.getText().equals ("Enter your email")){
            txtEmail.setText("");
            txtEmail.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtPassword1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassword1FocusLost
        if (txtPassword1.getText().equals ("")){
            txtPassword1.setText("Re-enter password");
            txtPassword1.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtPassword1FocusLost

    private void txtPassword1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassword1FocusGained
        if (txtPassword1.getText().equals ("Re-enter password")){
            txtPassword1.setText("");
            txtPassword1.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtPassword1FocusGained

    private void txtLnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLnameFocusLost
        if (txtLname.getText().equals ("")){
            txtLname.setText("Enter your last name");
            txtLname.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtLnameFocusLost

    private void txtLnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLnameFocusGained
        if (txtLname.getText().equals ("Enter your last name")){
            txtLname.setText("");
            txtLname.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtLnameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        if (txtUsername.getText().equals ("")){
            txtUsername.setText("Create a username");
            txtUsername.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        if (txtUsername.getText().equals ("Create a username")){
            txtUsername.setText("");
            txtUsername.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void panelSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSignupMouseClicked
        if (txtUsername.getText(). equals("Create a username")){
            JOptionPane.showMessageDialog (null,"Please enter username!");
            txtUsername.requestFocus();
        }
        else if(txtPassword.getText(). equals("Create a password")){
            JOptionPane.showMessageDialog (null,"Please enter password!");
            txtPassword.requestFocus();
        }
        else if(txtFname.getText(). equals("Enter your first name")){
            JOptionPane.showMessageDialog (null,"Please enter your first name!");
            txtFname.requestFocus();
        }
        else if(txtLname.getText(). equals("Enter your last name")){
            JOptionPane.showMessageDialog (null,"Please enter your last name!");
            txtLname.requestFocus();
        }
        else if(txtEmail.getText(). equals("Enter your email")){
            JOptionPane.showMessageDialog (null,"Please enter your email!");
            txtEmail.requestFocus();
        }
        else if(txtPhone.getText(). equals("Enter your phone number")){
            JOptionPane.showMessageDialog (null,"Please enter your phone number!");
            txtPhone.requestFocus();
        }
        else if(txtPassword.getText(). equals(txtPassword1.getText())){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/db_tubesPBO", "root", "");
                st = con.createStatement();
                String simpan = "insert into tb_register values('"+txtFname.getText()+"','"+txtLname.getText()+"','"+txtEmail.getText()+"','"+txtPhone.getText()+"','"+txtUsername.getText()+"','"+txtPassword.getText()+"');";
                int SA = st.executeUpdate(simpan);
                this.setVisible(false);
                new Login().setVisible(true);
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Username already exist");
            }

        }
    }//GEN-LAST:event_panelSignupMouseClicked

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if (txtPassword.getText().equals ("")){
            txtPassword.setText("Create a password");
            txtPassword.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        if (txtPassword.getText().equals ("Create a password")){
            txtPassword.setText("");
            txtPassword.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtFnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFnameFocusLost
        if (txtFname.getText().equals ("")){
            txtFname.setText("Enter your first name");
            txtFname.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtFnameFocusLost

    private void txtFnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFnameFocusGained
        // TODO add your handling code here:
        if (txtFname.getText().equals ("Enter your first name")){
            txtFname.setText("");
            txtFname.setForeground(new Color (102,102,102));
        }
    }//GEN-LAST:event_txtFnameFocusGained

    private void labelExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelExit1MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel7;
    private javax.swing.JLabel labelCreateAccount;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelExit1;
    private javax.swing.JLabel labelFname;
    private javax.swing.JLabel labelLname;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelMotto;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPassword1;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JLabel labelSignup7;
    private javax.swing.JLabel labelUsername;
    private keeptoo.KGradientPanel panelSignup7;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPassword1;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
