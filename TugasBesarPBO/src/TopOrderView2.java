public class TopOrderView2 extends javax.swing.JFrame {

    public TopOrderView2() {
        initComponents();
        setLocationRelativeTo(null);
        Collar.setText(TopOrderView.collar);
        Button.setText(TopOrderView.button);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        Button = new javax.swing.JLabel();
        labelBack2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Collar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SleeveModel = new javax.swing.JLabel();
        NOC = new javax.swing.JLabel();

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

        Button.setFont(new java.awt.Font("Mermaid", 0, 36)); // NOI18N
        Button.setText("00");
        jPanel3.add(Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, 30));

        labelBack2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelBack2.setText("<<<");
        labelBack2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBack2MouseClicked(evt);
            }
        });
        jPanel3.add(labelBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\OneDrive\\Documents\\Tugas Tugas Kuliah Semester 2\\Pemrograman Berorientasi Objek\\gambar baju\\collar model fix.png")); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        Collar.setFont(new java.awt.Font("Mermaid", 0, 36)); // NOI18N
        Collar.setText("00");
        jPanel3.add(Collar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\OneDrive\\Documents\\Tugas Tugas Kuliah Semester 2\\Pemrograman Berorientasi Objek\\gambar baju\\button model fix.png")); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        SleeveModel.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        SleeveModel.setText("<html>Number Of <br>Choice:");
        jPanel3.add(SleeveModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, 40));

        NOC.setFont(new java.awt.Font("Mermaid", 0, 18)); // NOI18N
        NOC.setText("<html>Number Of <br>Choice:");
        jPanel3.add(NOC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void labelBack2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBack2MouseClicked
        new TopOrderView().setVisible(true);
        dispose();
    }//GEN-LAST:event_labelBack2MouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TopOrderView2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button;
    private javax.swing.JLabel Collar;
    private javax.swing.JLabel NOC;
    private javax.swing.JLabel SleeveModel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelBack2;
    // End of variables declaration//GEN-END:variables
}
