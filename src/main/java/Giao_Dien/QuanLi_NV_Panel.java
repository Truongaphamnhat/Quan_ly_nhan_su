/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Giao_Dien;

import Helper.HienThiThongBao;
import Helper.KTra_DuLieu;
import Helper.XuLyHinhAnh;
import DAO.NhanVienDao;
import Model.NhanVien;
import java.awt.Image;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author HP
 */
public class QuanLi_NV_Panel extends javax.swing.JPanel {

    private GiaoDienChinh parentform;
    private DefaultTableModel tblModel;
    private byte[] AnhCaNhan;
    /**
     * Creates new form QuanLi_NV_Panel
     */
    public QuanLi_NV_Panel() {
        initComponents();
        
        TieuDeBang();
        
        TaiDuLieuVaoBang();
    }

    
    /*
    Phương thức đặt tiêu đề vào bảng QLNV_BangNhanVien
    */
    private void TieuDeBang(){
        
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String []{"Mã Nhân Viên", "Họ Tên", "Ngày Sinh", " Giới Tính", "Ngày Vào Làm", "Chức Vụ",  "Số Điện Thoại", "Địa chỉ", "Chú Thích"});
        QLNV_table_BangNhanVien.setModel(tblModel);
    }

    /*
    Phương thức cho đọc dữ liệu CSDL hiển thị lên bảng
    */
    private  void TaiDuLieuVaoBang(){
        try {
                NhanVienDao dao = new NhanVienDao();
                List < NhanVien> list = dao.findAll();
                tblModel.setRowCount(0);
                for (NhanVien  it : list){
                    tblModel.addRow(new Object[]{
                        it.getMaNhanVien(), it.getHoTen(), it.getNgaySinh(), it.getGioiTinh() == 1? "Nam" : "Nữ", it.getNgayVaoLam(), it.getChucVu(), it.getSDT() , it.getDiaChi(), it.getChuThich()
                    });
                    tblModel.fireTableDataChanged();
                }
        } catch (Exception e) {
            e.printStackTrace();
            HienThiThongBao.ThongBaoLoi(parentform, e.getMessage(), "Lỗi");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        QLNV_txtMaNhanVien = new javax.swing.JTextField();
        QLNV_txtHoTen = new javax.swing.JTextField();
        QLNV_txtSDT = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbl_QLNV_Hinh = new javax.swing.JLabel();
        QLNV_btn_MoHinh = new javax.swing.JButton();
        rdbNam = new javax.swing.JRadioButton();
        rdbNu = new javax.swing.JRadioButton();
        QLNV_btn_TaoMoi = new javax.swing.JButton();
        QLNV_btn_Luu = new javax.swing.JButton();
        QLNV_btn_Xoa = new javax.swing.JButton();
        QLNV_btn_CapNhat = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        QLNV_table_BangNhanVien = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        QLNV_txtDiaChi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        QLNV_txtArea_ChuThich = new javax.swing.JTextArea();
        QLNV_txtNgaySinh = new javax.swing.JTextField();
        QLNV_txtNgayVaoLam = new javax.swing.JTextField();
        QLNV_cbb_ChucVu = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lý Nhân Viên");

        jLabel2.setText("Mã Nhân Viên");

        jLabel3.setText("Họ Tên");

        jLabel5.setText("Số Điện Thoại");

        jLabel6.setText("Giới Tính");

        jLabel7.setText("Địa Chỉ");

        lbl_QLNV_Hinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_QLNV_Hinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/add64.png"))); // NOI18N

        QLNV_btn_MoHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/open-file-icon-16.png"))); // NOI18N
        QLNV_btn_MoHinh.setText("Mở Hình");
        QLNV_btn_MoHinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLNV_btn_MoHinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_QLNV_Hinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(QLNV_btn_MoHinh)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_QLNV_Hinh, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QLNV_btn_MoHinh))
        );

        buttonGroup1.add(rdbNam);
        rdbNam.setText("Nam");

        buttonGroup1.add(rdbNu);
        rdbNu.setSelected(true);
        rdbNu.setText("Nữ");

        QLNV_btn_TaoMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/reset16.png"))); // NOI18N
        QLNV_btn_TaoMoi.setText("Tạo Mới");
        QLNV_btn_TaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLNV_btn_TaoMoiActionPerformed(evt);
            }
        });

        QLNV_btn_Luu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save-icon.png"))); // NOI18N
        QLNV_btn_Luu.setText("Lưu");
        QLNV_btn_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLNV_btn_LuuActionPerformed(evt);
            }
        });

        QLNV_btn_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        QLNV_btn_Xoa.setText("Xóa");
        QLNV_btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLNV_btn_XoaActionPerformed(evt);
            }
        });

        QLNV_btn_CapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        QLNV_btn_CapNhat.setText("Cập Nhật");
        QLNV_btn_CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLNV_btn_CapNhatActionPerformed(evt);
            }
        });

        QLNV_table_BangNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        QLNV_table_BangNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QLNV_table_BangNhanVienMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(QLNV_table_BangNhanVien);

        jLabel8.setText("Ngày Sinh");

        jLabel9.setText("Chức Vụ");

        jLabel4.setText("Ngày Vào Làm ");

        jLabel10.setText("Chú Thích");

        QLNV_txtArea_ChuThich.setColumns(20);
        QLNV_txtArea_ChuThich.setRows(5);
        jScrollPane1.setViewportView(QLNV_txtArea_ChuThich);

        QLNV_cbb_ChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trưởng Phòng", "Nhân Viên" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(QLNV_btn_TaoMoi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(QLNV_btn_Luu)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(QLNV_btn_CapNhat)
                                        .addGap(14, 14, 14)
                                        .addComponent(QLNV_btn_Xoa))
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(jLabel8))
                                                                .addGap(1, 1, 1)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                    .addComponent(QLNV_txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                                                    .addComponent(QLNV_txtNgaySinh)))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(2, 2, 2)
                                                                .addComponent(QLNV_txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(4, 4, 4)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(QLNV_txtNgayVaoLam, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(rdbNam)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(rdbNu))))))
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(50, 50, 50)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addComponent(jLabel10)))
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(QLNV_txtDiaChi)
                                                .addComponent(QLNV_txtSDT)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                                            .addComponent(QLNV_cbb_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 14, Short.MAX_VALUE))
                            .addComponent(jSeparator4))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QLNV_txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(QLNV_cbb_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QLNV_txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(QLNV_txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(QLNV_txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QLNV_txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(rdbNam)
                                            .addComponent(rdbNu)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(QLNV_txtNgayVaoLam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QLNV_btn_TaoMoi)
                    .addComponent(QLNV_btn_Luu)
                    .addComponent(QLNV_btn_CapNhat)
                    .addComponent(QLNV_btn_Xoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void QLNV_btn_TaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLNV_btn_TaoMoiActionPerformed
        QLNV_txtMaNhanVien.setText("");
        QLNV_txtHoTen.setText("");
        QLNV_txtNgaySinh.setText("");
        QLNV_txtNgayVaoLam.setText("");
        QLNV_cbb_ChucVu.setSelectedIndex(0);
        QLNV_txtArea_ChuThich.setText("");
        rdbNu.setSelected(true);
        QLNV_txtSDT.setText("");
        QLNV_txtDiaChi.setText("");
        AnhCaNhan = null; //Xóa trắng hình ảnh
        // Hiển thị hình ảnh mặc định
        ImageIcon icon = new ImageIcon(
                getClass().getResource("/icon/add64.png"));
        lbl_QLNV_Hinh.setIcon(icon);
    }//GEN-LAST:event_QLNV_btn_TaoMoiActionPerformed

    private void QLNV_btn_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLNV_btn_LuuActionPerformed

        // Kiểm tra dữ liệu đã được nhập?
        StringBuilder sb = new StringBuilder();
            KTra_DuLieu.validateEmpty(QLNV_txtMaNhanVien, sb, "Mã Nhân Viên Không Được Để Trống");
            KTra_DuLieu.validateEmpty(QLNV_txtHoTen, sb, "Họ Tên Không Được Để Trống");
            KTra_DuLieu.validateEmpty(QLNV_txtNgaySinh, sb, "Ngày Sinh Không Được Để Trống");
            KTra_DuLieu.validateEmpty(QLNV_txtNgayVaoLam, sb, "Ngày Vào Làm Không Được Để Trống");            
            KTra_DuLieu.validateEmpty(QLNV_txtSDT, sb, "SĐT Không Được Để Trống");
            KTra_DuLieu.validateEmpty(QLNV_txtDiaChi, sb, "Địa Chỉ Không Được Để Trống");
            // Kiểm tra dữ liệu nhập đúng quy định chưa
            if(!QLNV_txtMaNhanVien.getText().equals(""))
                KTra_DuLieu.KTraRangBuocMaNV(QLNV_txtMaNhanVien, sb, "Vui Lòng Nhập Mã Nhân Viên Đúng Định Dạng NVxxx hoặc TPxxx");
             if(!QLNV_txtSDT.getText().equals("") )
                 KTra_DuLieu.KTraSDT(QLNV_txtSDT, sb, "Vui Lòng Nhập Đúng SDT"); //Kiểm tra sdt nhap đủ 10 số chưa
            if(!QLNV_txtNgaySinh.getText().equals("") )
                KTra_DuLieu.KTraNgayThang(QLNV_txtNgaySinh, sb, "Vui Lòng Nhập Đúng Định Dạng DD/MM/YYYY"); // Kiểm tra ngày sinh nhập đúng định dạng chưa
             if(!QLNV_txtNgayVaoLam.getText().equals("") )
                 KTra_DuLieu.KTraNgayThang(QLNV_txtNgayVaoLam, sb, "Vui Lòng Nhập Đúng Định Dạng DD/MM/YYYY"); // Kiểm tra ngày vào làm nhập đúng định dạng chưa
            
            if(sb.length()>0){
                HienThiThongBao.ThongBaoLoi(parentform, sb.toString(), "Lỗi");
                return;
            }
      
              try {
              NhanVien NV=new NhanVien();
                NV.setMaNhanVien(QLNV_txtMaNhanVien.getText());
                NV.setHoTen(QLNV_txtHoTen.getText());
                NV.setNgaySinh(QLNV_txtNgaySinh.getText());
                NV.setNgayVaoLam(QLNV_txtNgayVaoLam.getText());
                NV.setChucVu(QLNV_cbb_ChucVu.getItemAt(QLNV_cbb_ChucVu.getSelectedIndex()));
                NV.setChuThich(QLNV_txtArea_ChuThich.getText());
                NV.setSDT(QLNV_txtSDT.getText());
                NV.setDiaChi(QLNV_txtDiaChi.getText());
                NV.setGioiTinh(rdbNam.isSelected()?1: 0 );
                NV.setHinh(AnhCaNhan); // Thêm hình ảnh vào csdl
              
                
                NhanVienDao NVdao = new NhanVienDao();
                if(NVdao.insert(NV)){
                    HienThiThongBao.ThongBao (parentform, "Nhân Viên Đã Được Lưu", "Thông Báo");
                    TaiDuLieuVaoBang();
                }else{
                    
                }
                
                
        } catch (Exception e) {
          
            e.printStackTrace();
          //HienThiThongBao.ThongBaoLoi(parentform, e.getMessage(), "Lỗi");
             HienThiThongBao.ThongBaoXacNhan (parentform, "Nhân Viên Không Được Lưu Do Lỗi", "Cảnh Báo");
        }
           
    }//GEN-LAST:event_QLNV_btn_LuuActionPerformed

    private void QLNV_btn_CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLNV_btn_CapNhatActionPerformed
       
    
        // Kiểm tra dữ liệu đã được nhập chưa
        StringBuilder sb = new StringBuilder();
            KTra_DuLieu.validateEmpty(QLNV_txtMaNhanVien, sb, "Mã Nhân Viên Không Được Để Trống");
            KTra_DuLieu.validateEmpty(QLNV_txtHoTen, sb, "Họ Tên Không Được Để Trống");
            KTra_DuLieu.validateEmpty(QLNV_txtNgaySinh, sb, "Ngày Sinh Không Được Để Trống");
            KTra_DuLieu.validateEmpty(QLNV_txtNgayVaoLam, sb, "Ngày Vào Làm Không Được Để Trống");            
            KTra_DuLieu.validateEmpty(QLNV_txtSDT, sb, "SĐT Không Được Để Trống");
            KTra_DuLieu.validateEmpty(QLNV_txtDiaChi, sb, "Địa Chỉ Không Được Để Trống");
            // Kiểm tra dữ liệu nhập đúng quy định chưa
             if(!QLNV_txtMaNhanVien.getText().equals(""))
                KTra_DuLieu.KTraRangBuocMaNV(QLNV_txtMaNhanVien, sb, "Vui Lòng Nhập Mã Nhân Viên Đúng Định Dạng NVxxx hoặc TPxxx");
             if(!QLNV_txtSDT.getText().equals("") )
                 KTra_DuLieu.KTraSDT(QLNV_txtSDT, sb, "Vui Lòng Nhập Đúng SDT"); //Kiểm tra sdt nhap đủ 10 số chưa
            if(!QLNV_txtNgaySinh.getText().equals("") )
                KTra_DuLieu.KTraNgayThang(QLNV_txtNgaySinh, sb, "Vui Lòng Nhập Đúng Định Dạng DD/MM/YYYY"); // Kiểm tra ngày sinh nhập đúng định dạng chưa
             if(!QLNV_txtNgayVaoLam.getText().equals("") )
                 KTra_DuLieu.KTraNgayThang(QLNV_txtNgayVaoLam, sb, "Vui Lòng Nhập Đúng Định Dạng DD/MM/YYYY"); // Kiểm tra ngày vào làm nhập đúng định dạng chưa
            
            if(sb.length()>0){
                HienThiThongBao.ThongBaoLoi(parentform, sb.toString(), "Lỗi");
                return;
            }
            
            // Xác nhận lại yêu cầu cập nhật người dùng
            if(HienThiThongBao.ThongBaoXacNhan (parentform,"Bạn Có Muốn Cập Nhật Nhân Viên Không" , "Hỏi") == JOptionPane.NO_OPTION){
                    return;
            }
      
              try {
              NhanVien NV=new NhanVien();
               NV.setMaNhanVien(QLNV_txtMaNhanVien.getText());
                NV.setHoTen(QLNV_txtHoTen.getText());
                NV.setNgaySinh(QLNV_txtNgaySinh.getText());
                NV.setNgayVaoLam(QLNV_txtNgayVaoLam.getText());
                NV.setChucVu( QLNV_cbb_ChucVu.getItemAt(QLNV_cbb_ChucVu.getSelectedIndex()));
                NV.setChuThich(QLNV_txtArea_ChuThich.getText());
                NV.setSDT(QLNV_txtSDT.getText());
                NV.setDiaChi(QLNV_txtDiaChi.getText());
                NV.setGioiTinh(rdbNam.isSelected()?1: 0 );
                NV.setHinh(AnhCaNhan); // Thêm hình ảnh vào csdl
                
                // Thông báo cập nhật sinh viên?
                NhanVienDao NVdao = new NhanVienDao();
                if(NVdao.update(NV)){
                    HienThiThongBao.ThongBao (parentform, "Nhân Viên Đã Được Cập Nhật", "Thông Báo");
                    TaiDuLieuVaoBang();  
                }else{
                    HienThiThongBao.ThongBaoXacNhan (parentform, "Nhân Viên Không Được Cập Nhật Do Lỗi", "Cảnh Báo");
                }
                
                
        } catch (Exception e) {
          
            e.printStackTrace();
            HienThiThongBao.ThongBaoLoi(parentform, e.getMessage(), "Lỗi");
            
        }
            
           
    }//GEN-LAST:event_QLNV_btn_CapNhatActionPerformed

    private void QLNV_btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLNV_btn_XoaActionPerformed
          // Kiểm tra dữ liệu đã được nhập chưa
        StringBuilder sb = new StringBuilder();
            KTra_DuLieu.validateEmpty(QLNV_txtMaNhanVien, sb, "Mã Nhân Viên Không Được Để Trống");
                        
            if (sb.length()>0){
                HienThiThongBao.ThongBaoLoi(parentform, sb.toString(), "Lỗi");
                return;
            }
            
            // Xác nhận lại yêu cầu cập nhật người dùng
            if(HienThiThongBao.ThongBaoXacNhan (parentform,"Bạn Có Muốn Xóa Nhân Viên Không" , "Hỏi") == JOptionPane.NO_OPTION){
                    return;
            }
      
              try {
                              
                NhanVienDao NVdao = new NhanVienDao();
                if (NVdao.delete(QLNV_txtMaNhanVien.getText())){
                    HienThiThongBao.ThongBao (parentform, "Nhân Viên Đã Được Xóa", "Thông Báo");
                    TaiDuLieuVaoBang();
                }else{
                    HienThiThongBao.ThongBaoXacNhan (parentform, "Nhân Viên Không Được Xóa Do Lỗi", "Cảnh Báo");
                }
                
                
        } catch (Exception e) {
          
            e.printStackTrace();
            HienThiThongBao.ThongBaoLoi(parentform, e.getMessage(), "Lỗi");
        }
              
    }//GEN-LAST:event_QLNV_btn_XoaActionPerformed

    private void QLNV_table_BangNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QLNV_table_BangNhanVienMouseClicked
     

        try {
            int row = QLNV_table_BangNhanVien.getSelectedRow();
            
            if(row >= 0){
                String id = (String) QLNV_table_BangNhanVien.getValueAt(row, 0);
                NhanVienDao dao = new NhanVienDao();
                NhanVien NV = dao.findById(id);
                
                if(NV != null){
                    QLNV_txtMaNhanVien.setText(NV.getMaNhanVien());
                    QLNV_txtHoTen.setText(NV.getHoTen());
                    QLNV_txtNgaySinh.setText(NV.getNgaySinh());
                    QLNV_txtNgayVaoLam.setText(NV.getNgayVaoLam());
                    QLNV_cbb_ChucVu.setSelectedItem(NV.getChucVu());
                    QLNV_txtArea_ChuThich.setText(NV.getChuThich());
                    QLNV_txtSDT.setText(NV.getSDT());
                    QLNV_txtDiaChi.setText(NV.getDiaChi());
                  
                    if(NV.getGioiTinh()==1){
                        rdbNam.setSelected(true);                    
                    }else if(NV.getGioiTinh()==0){
                        rdbNu.setSelected(true);
                     }
                    
                    // Kiểm tra hình ảnh trong csdl, chuyển kí tự thành ảnh
                    if(NV.getHinh() != null){
                        Image img = XuLyHinhAnh.TaoAnhTuKiTuMang(NV.getHinh(), "jpg");
                        lbl_QLNV_Hinh.setIcon(new ImageIcon(img));
                        AnhCaNhan = NV.getHinh();
                    }else{
                            AnhCaNhan = NV.getHinh();
                           ImageIcon icon = new ImageIcon(
                                   getClass().getResource("/icon/add64.png"));
                           lbl_QLNV_Hinh.setIcon(icon); 
                    }
                }
            }
        } catch (Exception e) {
             e.printStackTrace();
            HienThiThongBao.ThongBaoLoi(parentform, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_QLNV_table_BangNhanVienMouseClicked

    private void QLNV_btn_MoHinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLNV_btn_MoHinhActionPerformed
       JFileChooser chooser = new JFileChooser();
       chooser.setFileFilter(new FileFilter() {
           @Override
           public boolean accept(File f) {
           if( f.isDirectory()) {
               return true;
           }else{
                return f.getName().toLowerCase().endsWith(".jpg");
           }

            }

           @Override
           public String getDescription() {
             return "Image File (*.jpg)";
           }
       });
            if (chooser.showOpenDialog(parentform) == JFileChooser.CANCEL_OPTION){
                return;
            }
            
            File file = chooser.getSelectedFile();
            try {
                    ImageIcon icon = new ImageIcon (file.getPath());
                    Image img = XuLyHinhAnh.KichThuoc_HinhAnh(icon.getImage(), 120, 160);
                    ImageIcon KichThuocIcon = new ImageIcon(img);
                    lbl_QLNV_Hinh.setIcon(KichThuocIcon);
                    
                    AnhCaNhan = XuLyHinhAnh.TaoMangKyTu(img, "jpg");
        } catch (Exception e) {
                    e.printStackTrace();
                    HienThiThongBao.ThongBao(parentform, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_QLNV_btn_MoHinhActionPerformed

     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton QLNV_btn_CapNhat;
    private javax.swing.JButton QLNV_btn_Luu;
    private javax.swing.JButton QLNV_btn_MoHinh;
    private javax.swing.JButton QLNV_btn_TaoMoi;
    private javax.swing.JButton QLNV_btn_Xoa;
    private javax.swing.JComboBox<String> QLNV_cbb_ChucVu;
    private javax.swing.JTable QLNV_table_BangNhanVien;
    private javax.swing.JTextArea QLNV_txtArea_ChuThich;
    private javax.swing.JTextField QLNV_txtDiaChi;
    private javax.swing.JTextField QLNV_txtHoTen;
    private javax.swing.JTextField QLNV_txtMaNhanVien;
    private javax.swing.JTextField QLNV_txtNgaySinh;
    private javax.swing.JTextField QLNV_txtNgayVaoLam;
    private javax.swing.JTextField QLNV_txtSDT;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbl_QLNV_Hinh;
    private javax.swing.JRadioButton rdbNam;
    private javax.swing.JRadioButton rdbNu;
    // End of variables declaration//GEN-END:variables
}