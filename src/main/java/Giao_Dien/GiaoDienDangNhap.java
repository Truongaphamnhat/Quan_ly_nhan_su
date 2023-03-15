/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Giao_Dien;

import Helper.ChiaSeDuLieu;
import Helper.HienThiThongBao;
import Helper.KTra_DuLieu;
import DAO.NguoiDungDao;
import Model.NguoiDung;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author HP
 */
public class GiaoDienDangNhap extends javax.swing.JDialog {

    /**
     * Creates new form GiaoDienDangNhap
     */
    public GiaoDienDangNhap(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         setLocationRelativeTo(parent);
       
   }

    GiaoDienDangNhap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avatar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        btn_DangNhap = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Đăng Nhập");

        avatar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        avatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/permission64.png"))); // NOI18N
        avatar.setFocusable(false);
        avatar.setPreferredSize(new java.awt.Dimension(32, 32));

        jLabel2.setText("Tên Đăng Nhập");

        jLabel3.setText("Mật Khẩu");

        btn_DangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Login-icon-16.png"))); // NOI18N
        btn_DangNhap.setText("Đăng Nhập");
        btn_DangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangNhapActionPerformed(evt);
            }
        });

        btn_Thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        btn_Thoat.setText("Thoát");
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btn_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Thoat, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenDangNhap))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Thoat)
                    .addComponent(btn_DangNhap))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThoatActionPerformed
           System.exit(0);
    }//GEN-LAST:event_btn_ThoatActionPerformed

    private void btn_DangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangNhapActionPerformed
        
        StringBuilder sb =  new StringBuilder(); // Tạo Đối Tượng  Cho Phép Lưu Thông Báo.
        
        // Phương thức Ktra tên đăng nhập, mật khẩu có nhập vào chưa?
         KTra_DuLieu.validateEmpty(txtTenDangNhap, sb, "Tên đăng nhập không được để trống");
          KTra_DuLieu.validateEmpty(txtMatKhau, sb, "Mật khẩu không được để trống");
        
          // Kiểm Tra kích thước StringBuilder.
          if  (sb.length()>0){
            HienThiThongBao.ThongBaoLoi(this, sb.toString(), "Lỗi");
            return;
    }
        
          // Tạo Đối Tượng NguoiDungDao khi dữ liệu nhập thành công.
        NguoiDungDao dao = new NguoiDungDao();
        
        try {        
            
            // truyền giá trị tendangnhap va matkhau trả về đối tượng người dùng
            NguoiDung nd = dao.Ktra_DangNhap(txtTenDangNhap.getText(), new String(txtMatKhau.getPassword()));

            // Đối Tương  NguoiDung = null  đăng nhập không thành công, ngươc lại đóng hộp thoại đăng nhập và tạo ra giao diện chính
            if   (nd == null) {
                HienThiThongBao.ThongBaoLoi(this, "Tên đăng nhập hoặc mật khẩu sai", "Lỗi");                
            }else{         
                
                   ChiaSeDuLieu.nguoiDangNhap = nd;
                   this.dispose(); 
                   GiaoDienChinh Main = new GiaoDienChinh();
                    Main.setVisible(true);  
                   
            }           
           
        } 
        // Nếu có lỗi xảy ra thông báo lỗi cho người dùng
        catch (Exception e) {
            e.printStackTrace();
            HienThiThongBao.ThongBaoLoi(this, e.getMessage(), "Lỗi");
        }
      
                
    }//GEN-LAST:event_btn_DangNhapActionPerformed

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
            java.util.logging.Logger.getLogger(GiaoDienDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
       
          
                
            }
        });
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avatar;
    private javax.swing.JButton btn_DangNhap;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}