package loginPackage;

public class Login_GUI extends javax.swing.JFrame {
    public Login_GUI() {
        initComponents();
        txtUser.setBackground(new java.awt.Color(0,0,0,1));
        passUser.setBackground(new java.awt.Color(0,0,0,1));
        buton1.setBackground(new java.awt.Color(0,0,1,2));
        buton2.setBackground(new java.awt.Color(0,0,1,2));
        select.setBackground(new java.awt.Color(0,0,0,0));
        select1.setBackground(new java.awt.Color(0,0,0,0));
        buton3.setBackground(new java.awt.Color(0,0,5,5));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        passUser = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        info = new javax.swing.JLabel();
        info1 = new javax.swing.JLabel();
        info2 = new javax.swing.JLabel();
        select = new javax.swing.JComboBox<>();
        select1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        buton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        buton1 = new javax.swing.JButton();
        buton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginPackage/icons8-copyright-24.png"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alexandru Tudor");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Best company,");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("best developers!");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Discover the world's best");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("community of freelancers");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("and business owners!");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SEConstanta");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 200)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 51));
        jLabel14.setText("1");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("NUMBER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel14)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(0, 0, 0)
                .addComponent(jLabel10)
                .addGap(0, 0, 0)
                .addComponent(jLabel11)
                .addGap(75, 75, 75)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setText("Username");
        txtUser.setBorder(null);
        jPanel3.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 350, 50));

        passUser.setText("Password");
        passUser.setBorder(null);
        jPanel3.add(passUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 350, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginPackage/icons8-account-48.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 50, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginPackage/icons8-lock-48.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 50, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 360, 10));
        jPanel3.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 460, 20));
        jPanel3.add(info1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 460, 20));
        jPanel3.add(info2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 460, 20));

        select.setForeground(new java.awt.Color(255, 255, 255));
        select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Didn't have", "1-3 years", "3-6 years", "6+ years" }));
        jPanel3.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 200, -1));

        select1.setForeground(new java.awt.Color(255, 255, 255));
        select1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low Package - $19.99/month", "Medium Package - $39.99/month", "Extra Package - $99.99/month" }));
        jPanel3.add(select1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 200, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Click here for more details:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 180, -1));

        buton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buton3.setForeground(new java.awt.Color(255, 255, 255));
        buton3.setText("Info");
        buton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buton3MouseClicked(evt);
            }
        });
        buton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton3ActionPerformed(evt);
            }
        });
        jPanel3.add(buton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 60, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Select your working time in IT:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 180, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Select the package:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 110, -1));

        buton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buton1.setForeground(new java.awt.Color(255, 255, 255));
        buton1.setText("Sign up");
        buton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton1ActionPerformed(evt);
            }
        });
        jPanel3.add(buton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 100, 30));

        buton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buton2.setForeground(new java.awt.Color(255, 255, 255));
        buton2.setText("Login");
        buton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buton2ActionPerformed(evt);
            }
        });
        jPanel3.add(buton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 100, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("X");
        jLabel4.setAlignmentY(0.0F);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 20, 20));

        jLabel3.setBackground(new java.awt.Color(0, 204, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginPackage/2314983.jpg"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void buton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buton1ActionPerformed

    private void buton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buton2ActionPerformed

    private void buton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buton3ActionPerformed

    private void buton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buton3MouseClicked

        info.setText("Low package contains free courses on every language plus free projects.");
        info1.setText("Medium package contains low package and your own teacher 2 hours a week online.");
        info2.setText("Premium package contains everything plus license for every course you take.");
    }//GEN-LAST:event_buton3MouseClicked
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buton1;
    private javax.swing.JButton buton2;
    private javax.swing.JButton buton3;
    private javax.swing.JLabel info;
    private javax.swing.JLabel info1;
    private javax.swing.JLabel info2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField passUser;
    private javax.swing.JComboBox<String> select;
    private javax.swing.JComboBox<String> select1;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
