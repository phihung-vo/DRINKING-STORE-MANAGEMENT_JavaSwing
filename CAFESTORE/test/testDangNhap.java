
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class testDangNhap extends javax.swing.JFrame {
    private static DefaultTableModel dtm;
    /**
     * Creates new form testDangNhap
     */
    public testDangNhap() {
        initComponents();
        layGiaTri();
    }

    public void layGiaTri(){
        dtm = (DefaultTableModel) jTable_user.getModel();
        dtm.setNumRows(0);
        Connection cn = ConnectDB.SQLConnect();
        String sql = "SELECT * FROM [USER]";
        Vector vt;
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                vt = new Vector();
                vt.add(rs.getString("User"));
                vt.add(rs.getString("Password"));
                
                dtm.addRow(vt);
            }
            jTable_user.setModel(dtm);
            rs.close();
            ps.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_USER = new javax.swing.JTextField();
        jPasswordField_PASS = new javax.swing.JPasswordField();
        jButton_OK = new javax.swing.JButton();
        jButton_EXIT = new javax.swing.JButton();
        jButton_THEM = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_user = new javax.swing.JTable();
        jButton_xoa = new javax.swing.JButton();
        jButton_sua = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PASS");

        jLabel2.setText("USER");

        jButton_OK.setText("OKE");
        jButton_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OKActionPerformed(evt);
            }
        });

        jButton_EXIT.setText("THOÁT");
        jButton_EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EXITActionPerformed(evt);
            }
        });

        jButton_THEM.setText("Thêm");
        jButton_THEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_THEMActionPerformed(evt);
            }
        });

        jTable_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "User", "Pass"
            }
        ));
        jTable_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_userMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_user);

        jButton_xoa.setText("Xóa");
        jButton_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_xoaActionPerformed(evt);
            }
        });

        jButton_sua.setText("Sửa");
        jButton_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_suaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPasswordField_PASS, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_USER, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jButton_EXIT)
                        .addGap(54, 54, 54)
                        .addComponent(jButton_THEM))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jButton_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(jButton_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_USER, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField_PASS, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_OK, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(jButton_THEM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_EXIT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OKActionPerformed
        // TODO add your handling code here:
        Connection cn = ConnectDB.SQLConnect();
        String user = jTextField_USER.getText();
        String pass = jPasswordField_PASS.getText();
        
        String sql = "SELECT * FROM [USER] WHERE [User] = '"+user+"' AND [Password] = '"+pass+"'";
        
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(this,"đăng nhập thành công");
            } else JOptionPane.showMessageDialog(this,"đăng nhập thất bại");
            
            ps.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            e.getMessage();
        }
        
    }//GEN-LAST:event_jButton_OKActionPerformed

    private void jButton_EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EXITActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton_EXITActionPerformed

    public void insertUSER(String user, String pass){
        Connection cn = ConnectDB.SQLConnect();
        String sql = "INSERT INTO [USER]([User],Password) VALUES ('"+user+"','"+pass+"')";
        
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"thêm thành công");
            
            ps.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"thêm thất bại");
        }
    }
    
    private void jButton_THEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_THEMActionPerformed
        // TODO add your handling code here:
        String user = jTextField_USER.getText();
        String pass = jPasswordField_PASS.getText();
        
        insertUSER(user,pass);
    }//GEN-LAST:event_jButton_THEMActionPerformed

    private void jTable_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_userMouseClicked
        // TODO add your handling code here:
        int i = jTable_user.getSelectedRow();
        dtm =(DefaultTableModel) jTable_user.getModel();
        jTextField_USER.setText(dtm.getValueAt(i, 0).toString());
        jPasswordField_PASS.setText(dtm.getValueAt(i, 1).toString());
        jTable_user.getSelectedColumn();
    }//GEN-LAST:event_jTable_userMouseClicked

    private void jButton_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_xoaActionPerformed
        // TODO add your handling code here:
        Connection cn = ConnectDB.SQLConnect();
        String sql = "DELETE FROM [USER] WHERE [User] = '"+jTextField_USER.getText()+"'";
        
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"xóa thành công");
            
            ps.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"xóa thất bại");
        }
    }//GEN-LAST:event_jButton_xoaActionPerformed

    private void jButton_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_suaActionPerformed
        // TODO add your handling code here:
        Connection cn = ConnectDB.SQLConnect();
        String sql = "UPDATE [USER] SET Password = '"+jPasswordField_PASS.getText()+"' WHERE [User] = '"+jTextField_USER.getText()+"'";
        
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"sửa thành công");
            
            ps.close();
            cn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"sửa thất bại");
        }
        
    }//GEN-LAST:event_jButton_suaActionPerformed
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(testDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_EXIT;
    private javax.swing.JButton jButton_OK;
    private javax.swing.JButton jButton_THEM;
    private javax.swing.JButton jButton_sua;
    private javax.swing.JButton jButton_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField_PASS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_user;
    private javax.swing.JTextField jTextField_USER;
    // End of variables declaration//GEN-END:variables
}