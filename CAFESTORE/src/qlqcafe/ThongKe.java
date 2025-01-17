/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlqcafe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static qlqcafe.BanHang_2.dtm;

/**
 *
 * @author Nhom 40
 */
public class ThongKe extends javax.swing.JFrame {
    private final NguoiDung staff;
    
    public ThongKe(NguoiDung user) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
        layThongKe();
        this.staff = user;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_thongKe = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel_tongHD = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_tongTien = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jDateChooser_Den = new com.toedter.calendar.JDateChooser();
        jButton_quayVe = new javax.swing.JButton();
        jButton_timKiem = new javax.swing.JButton();
        jDateChooser_Tu = new com.toedter.calendar.JDateChooser();
        jLabel_TG_tu = new javax.swing.JLabel();
        jLabel_Ngay_den = new javax.swing.JLabel();
        jLabel_TG_den = new javax.swing.JLabel();
        jLabel_Ngay_tu = new javax.swing.JLabel();
        jComboBox_gioDen = new javax.swing.JComboBox<>();
        jComboBox_gioTu = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton_troVe = new javax.swing.JButton();
        jLabel_thongBao = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_thongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ngày Mua", "Mã hóa đơn", "Mã nhân viên", "Tổng Tiền"
            }
        ));
        jScrollPane1.setViewportView(jTable_thongKe);
        if (jTable_thongKe.getColumnModel().getColumnCount() > 0) {
            jTable_thongKe.getColumnModel().getColumn(1).setPreferredWidth(10);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 894, 418));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tổng Số Hóa Đơn Bán Ra");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 438, 269, 34));

        jLabel_tongHD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_tongHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_tongHD.setText("0");
        getContentPane().add(jLabel_tongHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 438, 82, 34));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tổng Tiền Thu Về");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 438, 208, 34));

        jLabel_tongTien.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_tongTien.setText("0 VNĐ");
        getContentPane().add(jLabel_tongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 438, 213, 34));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDateChooser_Den.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDateChooser_Den, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 160, 30));

        jButton_quayVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/return.png"))); // NOI18N
        jButton_quayVe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_quayVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_quayVeActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_quayVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 106, 83));

        jButton_timKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/search.png"))); // NOI18N
        jButton_timKiem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_timKiemActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_timKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 324, 83));

        jDateChooser_Tu.setDateFormatString("yyyy-MM-dd");
        jDateChooser_Tu.setMinSelectableDate(new java.util.Date(-62135791099000L));
        jPanel1.add(jDateChooser_Tu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 160, 30));

        jLabel_TG_tu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_TG_tu.setText("*Chọn thời gian từ:");
        jPanel1.add(jLabel_TG_tu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 140, 20));

        jLabel_Ngay_den.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Ngay_den.setText("*Chọn ngày đến:");
        jPanel1.add(jLabel_Ngay_den, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 20));

        jLabel_TG_den.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_TG_den.setText("*Chọn thời gian đến:");
        jPanel1.add(jLabel_TG_den, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 160, 20));

        jLabel_Ngay_tu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Ngay_tu.setText("*Chọn ngày từ:");
        jPanel1.add(jLabel_Ngay_tu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 20));

        jComboBox_gioDen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_gioDen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:00", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30" }));
        jComboBox_gioDen.setBorder(null);
        jPanel1.add(jComboBox_gioDen, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 100, 30));

        jComboBox_gioTu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_gioTu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "6:30", "7:00", "7:30", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:00", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30" }));
        jComboBox_gioTu.setBorder(null);
        jPanel1.add(jComboBox_gioTu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 100, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/unnamed.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(914, 10, -1, -1));

        jButton_troVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/smart-home (1).png"))); // NOI18N
        jButton_troVe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_troVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_troVeActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_troVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 330, 114, 92));

        jLabel_thongBao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jLabel_thongBao, new org.netbeans.lib.awtextra.AbsoluteConstraints(967, 210, 386, 29));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/hinh-nen-mau-xanh-8.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jButton_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_timKiemActionPerformed
        
        String thoiGianTu =  jComboBox_gioTu.getSelectedItem().toString().trim();
        String thoiGianDen =  jComboBox_gioDen.getSelectedItem().toString().trim();
        String tuNgay = ((JTextField)jDateChooser_Tu.getDateEditor().getUiComponent()).getText();
        String denNgay = ((JTextField)jDateChooser_Den.getDateEditor().getUiComponent()).getText();
        String ngayGioTu = tuNgay +" "+thoiGianTu; System.out.println(ngayGioTu);
        String ngayGioDen = denNgay +" "+thoiGianDen; System.out.println(ngayGioDen);
        Connection cn = ConnectDB.SQLConnect();
        try {
            dtm = (DefaultTableModel)jTable_thongKe.getModel();
            dtm.setNumRows(0);
            String sql = "SELECT * FROM CTHD WHERE NGAYMUA "+
                                    "BETWEEN CAST('"+ngayGioTu+"' AS DATETIME) "+
                                        "AND CAST('"+ngayGioDen+"' AS DATETIME) ";
            
            Vector vt;
            int dem=0;
            long tongTien, s=0;
            try {
                PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                vt = new Vector();
                vt.add(rs.getString("NGAYMUA"));
                vt.add(rs.getString("MAHD"));
                vt.add(rs.getString("MANV"));
                vt.add(rs.getString("TONGTIEN"));                
                dtm.addRow(vt);
                tongTien = rs.getInt("TONGTIEN");
                s = s + tongTien;
                dem++;
            }
            jTable_thongKe.setModel(dtm);
            jLabel_tongHD.setText(String.valueOf(dem));
            jLabel_tongTien.setText(new XuLyChung().formatCurrency(String.valueOf(s))+ " VNĐ");
            } catch(SQLException e){
                Logger.getLogger(DoUong.class.getName()).log(Level.SEVERE, null, e);
            }
        } catch (Exception e) {
            Logger.getLogger(DoUong.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButton_timKiemActionPerformed

    private void jButton_quayVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_quayVeActionPerformed
        layThongKe();
    }//GEN-LAST:event_jButton_quayVeActionPerformed

    private void jButton_troVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_troVeActionPerformed
        GiaoDienChung gdc = new GiaoDienChung(this.staff);
        this.setVisible(false);
        gdc.setVisible(true);
    }//GEN-LAST:event_jButton_troVeActionPerformed
    
    private void layThongKe(){
        dtm = (DefaultTableModel)jTable_thongKe.getModel();
        dtm.setNumRows(0);
        Connection cn = ConnectDB.SQLConnect();
        String sql = "SELECT * FROM CTHD ORDER BY NGAYMUA DESC";
        Vector vt;
        int dem=0;
        long tongTien, s=0;
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                vt = new Vector();
                vt.add(rs.getString("NGAYMUA"));
                vt.add(rs.getString("MAHD"));
                vt.add(rs.getString("MANV"));
                vt.add(rs.getString("TONGTIEN"));                
                dtm.addRow(vt);
                tongTien = rs.getInt("TONGTIEN");
                s = s + tongTien;
                dem++;
            }
            jTable_thongKe.setModel(dtm);
            jLabel_tongHD.setText(String.valueOf(dem));
            jLabel_tongTien.setText(new XuLyChung().formatCurrency(String.valueOf(s))+ " VNĐ");
            rs.close();
            ps.close();
            cn.close();
        } catch(SQLException e){
            Logger.getLogger(DoUong.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_quayVe;
    private javax.swing.JButton jButton_timKiem;
    private javax.swing.JButton jButton_troVe;
    private javax.swing.JComboBox<String> jComboBox_gioDen;
    private javax.swing.JComboBox<String> jComboBox_gioTu;
    private com.toedter.calendar.JDateChooser jDateChooser_Den;
    private com.toedter.calendar.JDateChooser jDateChooser_Tu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_Ngay_den;
    private javax.swing.JLabel jLabel_Ngay_tu;
    private javax.swing.JLabel jLabel_TG_den;
    private javax.swing.JLabel jLabel_TG_tu;
    private javax.swing.JLabel jLabel_thongBao;
    private javax.swing.JLabel jLabel_tongHD;
    private javax.swing.JLabel jLabel_tongTien;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_thongKe;
    // End of variables declaration//GEN-END:variables
}
