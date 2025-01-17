/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static qlqcafe.BanHang_2.dtm;
import qlqcafe.ConnectDB;
import qlqcafe.DoUong;
/**
 *
 * @author Admin
 */
public class testSP extends javax.swing.JFrame {
    private static DefaultTableModel dtm;
    private static DefaultComboBoxModel dcbm;
    private Thread thread;
    private boolean thanhToan;
    private static int num = 1;     
    private static int chon, i, item, itemGiaSP, itemMaSP;     
//    private static String ma, gia, loai;
    /**
     * Creates new form testSP
     */
    public testSP() {
        initComponents();
        loadLoaiNuoc();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox_loaiNuoc = new javax.swing.JComboBox<>();
        jComboBox_tenNuoc = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextField_sl = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_doUong = new javax.swing.JTable();
        jButton_OK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Loại đồ uống");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Tên đồ uống");

        jComboBox_loaiNuoc.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox_loaiNuocPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Số lượng");

        jTextField_sl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_slKeyReleased(evt);
            }
        });

        jTable_doUong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên nước", "Số Lượng", "Thành tiền"
            }
        ));
        jTable_doUong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_doUongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_doUong);

        jButton_OK.setText("OKE");
        jButton_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jButton_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_loaiNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_sl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_tenNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_loaiNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_tenNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_sl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jButton_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_loaiNuocPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox_loaiNuocPopupMenuWillBecomeInvisible
        jComboBox_tenNuoc.removeAllItems();
        Connection cn = ConnectDB.SQLConnect();
        String sql = "SELECT s.TENSP, l.TENLSP FROM SANPHAM s, LOAISP l WHERE l.MALSP = s.MALSP AND l.TENLSP = N'"+jComboBox_loaiNuoc.getSelectedItem().toString()+"'";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                this.jComboBox_tenNuoc.addItem(rs.getString("TENSP"));
            }
            rs.close();
            ps.close();
            cn.close();
        } catch (SQLException e) {
             Logger.getLogger(DoUong.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jComboBox_loaiNuocPopupMenuWillBecomeInvisible
    private void loadLoaiNuoc(){
        Connection cn = ConnectDB.SQLConnect();  
        String sql = "SELECT * FROM LOAISP";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);               
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                jComboBox_loaiNuoc.addItem(rs.getString("TENLSP"));
            }
            ps.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    private void jTextField_slKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_slKeyReleased
        // TODO add your handling code here:
        Connection cn = ConnectDB.SQLConnect();
        String sql ="SELECT DISTINCT * FROM SANPHAM s, LOAISP l WHERE l.MALSP = s.MALSP AND l.TENLSP = N'" +jComboBox_tenNuoc.getSelectedItem()+"'";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                if((rs.getInt("SOLUONG")- Integer.parseInt(jTextField_sl.getText())) < 0){
                    JOptionPane.showMessageDialog(this, "Số lượng vượt quá số lượng hiện có");
                }
            }
            ps.close();
            rs.close();
            cn.close();
        } catch (HeadlessException | NumberFormatException | SQLException ex) {
            Logger.getLogger(DoUong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextField_slKeyReleased
    
    private void jTable_doUongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_doUongMouseClicked
        // TODO add your handling code here:
        jComboBox_loaiNuoc.removeAllItems();
        jComboBox_tenNuoc.removeAllItems();
        int i = jTable_doUong.getSelectedRow();
        dtm =(DefaultTableModel) jTable_doUong.getModel();

        jComboBox_tenNuoc.addItem(dtm.getValueAt(i, 1).toString());
        jTextField_sl.setText(dtm.getValueAt(i,2).toString());

    }//GEN-LAST:event_jTable_doUongMouseClicked

    private int layGiaSP(){
        Connection cn = ConnectDB.SQLConnect(); 
        String sql = "SELECT DONGIA FROM SANPHAM WHERE TENSP = N'"+jComboBox_tenNuoc.getSelectedItem()+"'";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);               
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                itemGiaSP = rs.getInt("DONGIA");
            }
            ps.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            e.getMessage();
        }
        return itemGiaSP;
    }
    
    private int layMaSP(){
        Connection cn = ConnectDB.SQLConnect(); 
        String sql = "SELECT MASP FROM SANPHAM WHERE TENSP = N'"+jComboBox_tenNuoc.getSelectedItem()+"'";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);               
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                itemMaSP = rs.getInt("MASP");
            }
            ps.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            e.getMessage();
        }
        return itemMaSP;
    }
    
    private void insert(int masp,int maban,int sl, int thanhtien){
        Connection cn = ConnectDB.SQLConnect();  
        String sql = "INSERT INTO HOADON(MASP,MABAN,SLMUA,THANHTIEN)"
                    +"VALUES("+masp+","+maban+","+sl+","+thanhtien+")";
        
        try {
            PreparedStatement ps = cn.prepareStatement(sql);               
            ps.executeUpdate();
            
            ps.close();
            cn.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    private void jButton_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OKActionPerformed
        // TODO add your handling code here:
        
        int ggia = layGiaSP();
        int masp = layMaSP();
        int sl = Integer.parseInt(jTextField_sl.getText().toString());
        int thanhtien = ggia*sl;
        insert(masp, 5, sl, thanhtien);
        
        System.out.println(ggia);
        System.out.println(masp);
        System.out.println(sl);
        System.out.println(thanhtien);
    }//GEN-LAST:event_jButton_OKActionPerformed

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
            java.util.logging.Logger.getLogger(testSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testSP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_OK;
    private javax.swing.JComboBox<String> jComboBox_loaiNuoc;
    private javax.swing.JComboBox<String> jComboBox_tenNuoc;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_doUong;
    private javax.swing.JTextField jTextField_sl;
    // End of variables declaration//GEN-END:variables
}
