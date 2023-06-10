/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quanlynhanvien;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.text.ParseException;
import java.text.RuleBasedCollator;
import javax.swing.JFileChooser;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Quanlynhanvien.Nhanvien;
import Menuquantri.MenuQuanTri;
import Quanlynhanvien.Tablenhanvien;

/**
 *
 * @author Nguyen Nghia
 */
public class Quanlynhanvien extends javax.swing.JFrame {

    ArrayList<Nhanvien> dsnv = new ArrayList<Nhanvien>();

    int dongchon = -1;
    Nhanvien nv = new Nhanvien();

    public void fakedata() {
        // Tạo dữ liệu mẫu
        Nhanvien nv1 = new Nhanvien("NV010", "Nguyễn Văn D", "Hà Nội", "Nam", 123456789, "01-01-2000", 1.5, 500000, 2700000);
        Nhanvien nv2 = new Nhanvien("NV002", "Trần Thị A", "Hồ Chí Minh", "Nữ", 987654321, "02-02-1999", 2.0, 1000000, 3800000);
        Nhanvien nv3 = new Nhanvien("NV006", "Lê Văn G", "Đà Nẵng", "Nam", 456123789, "03-03-1998", 1.8, 700000, 3200000);
        Nhanvien nv4 = new Nhanvien("NV005", "Phạm Thị D", "Hải Phòng", "Nữ", 654321987, "04-04-1997", 1.6, 800000, 2900000);
        Nhanvien nv5 = new Nhanvien("NV004", "Vũ Thị E", "Cần Thơ", "Nữ", 321987654, "05-05-1996", 1.7, 900000, 3100000);
        Nhanvien nv6 = new Nhanvien("NV007", "Đinh Thị F", "Huế", "Nữ", 789456123, "06-06-1995", 2.2, 1200000, 4200000);
        Nhanvien nv7 = new Nhanvien("NV008", "Hoàng Thị G", "Nha Trang", "Nữ", 159357486, "07-07-1994", 1.9, 1000000, 3500000);
        Nhanvien nv8 = new Nhanvien("NV001", "Lý Thị H", "Đà Lạt", "Nữ", 753159852, "08-08-1993", 1.8, 800000, 3200000);
        Nhanvien nv9 = new Nhanvien("NV003", "Trương Văn I", "Vũng Tàu", "Nam", 852963741, "09-09-1992", 2.5, 1500000, 4200000);
        Nhanvien nv10 = new Nhanvien("NV009", "Nguyễn Thị I", "Hải Dương", "Nữ", 246813579, "10-10-1991", 1.5, 500000, 2700000);

        // Thêm dữ liệu vào danh sách dsnv
        dsnv.add(nv1);
        dsnv.add(nv2);
        dsnv.add(nv3);
        dsnv.add(nv4);
        dsnv.add(nv5);
        dsnv.add(nv6);
        dsnv.add(nv7);
        dsnv.add(nv8);
        dsnv.add(nv9);
        dsnv.add(nv10);

        // Hiển thị dữ liệu trong tablenhanvien
        loadtablenhanvien();
    }

    public Quanlynhanvien() {
        initComponents();
        fakedata();
        loadtablenhanvien();
        setLocationRelativeTo(null);
    }

    public void loadtablenhanvien() {
        Bangnhanvien.setModel(new Tablenhanvien(dsnv));
    }

    String selectedButton = "";

    public static String chuyendoingay(Date date) {
        // Định dạng chuỗi theo ý muốn, ví dụ: dd-MM-yyyy
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(date);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtHsl = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtThuong = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSdt = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        txtMnv = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();
        textSdt = new javax.swing.JLabel();
        txtTennv = new javax.swing.JTextField();
        btnSapxep = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtDc = new javax.swing.JTextField();
        radioNam = new javax.swing.JRadioButton();
        radioNu = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Bangnhanvien = new javax.swing.JTable();
        chonNgaysinh = new com.toedter.calendar.JDateChooser();
        btnXuatfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Thưởng");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Mã nhân viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tên nhân viên");

        txtSdt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnThem.setText("Thêm");
        btnThem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("HSL");

        btnSua.setText("Sửa");
        btnSua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        txtMnv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnXoa.setText("Xoá");
        btnXoa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        textSdt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textSdt.setText("Số điện thoại");

        txtTennv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTennv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTennvActionPerformed(evt);
            }
        });

        btnSapxep.setText("Sắp xếp");
        btnSapxep.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSapxep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapxepActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Địa chỉ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("QUẢN LÝ NHÂN VIÊN");

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setText("<< Trở về");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Giới tính");

        txtDc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        buttonGroup1.add(radioNam);
        radioNam.setSelected(true);
        radioNam.setText("Nam");

        buttonGroup1.add(radioNu);
        radioNu.setText("Nữ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Ngày sinh");

        Bangnhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Bangnhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BangnhanvienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Bangnhanvien);

        chonNgaysinh.setDateFormatString("dd-MM-yyyy");

        btnXuatfile.setText("Xuất file");
        btnXuatfile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXuatfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtMnv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHsl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioNam)
                        .addGap(18, 18, 18)
                        .addComponent(radioNu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textSdt)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTennv, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSdt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtThuong, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(chonNgaysinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(168, 168, 168)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnSua)
                        .addGap(34, 34, 34)
                        .addComponent(btnXoa)
                        .addGap(39, 39, 39)
                        .addComponent(btnSapxep)
                        .addGap(40, 40, 40)
                        .addComponent(btnXuatfile))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSapxep, btnSua, btnThem, btnXoa, btnXuatfile});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textSdt)
                            .addComponent(jLabel5)
                            .addComponent(txtDc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(radioNam)
                                .addComponent(radioNu))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtHsl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTennv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(chonNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnSapxep)
                    .addComponent(btnXuatfile))
                .addGap(43, 43, 43))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSapxep, btnSua, btnThem, btnXoa, btnXuatfile});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        MenuQuanTri mn = new MenuQuanTri();
        mn.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtTennvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTennvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTennvActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        try {
            String maNv = txtMnv.getText();
            boolean trungMaNv = false;

            // Kiểm tra mã nhân viên trùng lặp
            for (Nhanvien existingNv : dsnv) {
                if (existingNv.getManv().equals(maNv)) {
                    trungMaNv = true;
                    break;
                }
            }

            if (trungMaNv) {
                JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại, vui lòng chọn mã khác.");
            } else {
                Date ns = chonNgaysinh.getDate();
                String ngays = chuyendoingay(ns);
                int sdt = Integer.parseInt(txtSdt.getText());
                double hsl = Double.parseDouble(txtHsl.getText());
                double thuong = Double.parseDouble(txtThuong.getText());

                String gt = "";
                if (radioNam.isSelected()) {
                    gt = "Nam";
                } else if (radioNu.isSelected()) {
                    gt = "Nữ";
                }

                double luong = (double) hsl * 1800000 + thuong;

                nv = new Nhanvien(maNv, txtTennv.getText(), txtDc.getText(), gt, sdt, ngays, hsl, thuong, luong);

                dsnv.add(nv);
                loadtablenhanvien();

                JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công.");

                txtMnv.setText("");
                txtTennv.setText("");
                txtDc.setText("");
                txtSdt.setText("");
                txtHsl.setText("");
                txtThuong.setText("");
                chonNgaysinh.setDate(null);
                radioNam.setSelected(false);
                radioNu.setSelected(false);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng số cho SĐT, HSL, và thưởng.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra. Vui lòng kiểm tra lại dữ liệu đã nhập.");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void BangnhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BangnhanvienMouseClicked
        // TODO add your handling code here:
        dongchon = Bangnhanvien.getSelectedRow();
        if (dongchon != -1) {
            // Lấy dữ liệu từ bảng
            String maNv = Bangnhanvien.getValueAt(dongchon, 0).toString();
            String tenNv = Bangnhanvien.getValueAt(dongchon, 1).toString();
            String diaChi = Bangnhanvien.getValueAt(dongchon, 2).toString();
            String sdt = Bangnhanvien.getValueAt(dongchon, 4).toString();
            String hsl = Bangnhanvien.getValueAt(dongchon, 6).toString();
            String thuong = Bangnhanvien.getValueAt(dongchon, 7).toString();
            String gt = Bangnhanvien.getValueAt(dongchon, 3).toString();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            try {
                Date ngaySinh = dateFormat.parse(Bangnhanvien.getValueAt(dongchon, 5).toString());
                chonNgaysinh.setDate(ngaySinh);
            } catch (ParseException e) {
                // Xử lý khi có lỗi xảy ra trong quá trình chuyển đổi ngày
                System.out.println(e);

            }

            // Hiển thị dữ liệu lên màn hình
            txtMnv.setText(maNv);
            txtTennv.setText(tenNv);
            txtDc.setText(diaChi);
            txtSdt.setText(sdt);
            txtHsl.setText(hsl);
            txtThuong.setText(thuong);
            // Cập nhật trạng thái của radio button dựa trên giới tính
            if (gt.equals("Nam")) {
                radioNam.setSelected(true);
            } else if (gt.equals("Nữ")) {
                radioNu.setSelected(true);
            }
            // Cập nhật dữ liệu khác tùy theo trường hợp

        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng trong bảng.");
        }

    }//GEN-LAST:event_BangnhanvienMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        dongchon = Bangnhanvien.getSelectedRow();
        if (dongchon != -1) {
            try {
                // Kiểm tra xem có thay đổi mã nhân viên không
                String maNv = txtMnv.getText();
                String maNvCu = dsnv.get(dongchon).getManv();
                boolean trungMaNv = false;

                // Kiểm tra mã nhân viên trùng lặp (nếu mã nhân viên thay đổi)
                if (!maNv.equals(maNvCu)) {
                    for (Nhanvien existingNv : dsnv) {
                        if (existingNv.getManv().equals(maNv)) {
                            trungMaNv = true;
                            break;
                        }
                    }
                }

                if (trungMaNv) {
                    JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại, vui lòng chọn mã khác.");
                } else {
                    Date ns = chonNgaysinh.getDate();
                    String ngays = chuyendoingay(ns);
                    int sdt = Integer.parseInt(txtSdt.getText());
                    double hsl = Double.parseDouble(txtHsl.getText());
                    double thuong = Double.parseDouble(txtThuong.getText());

                    String gt = "";
                    if (radioNam.isSelected()) {
                        gt = "Nam";
                    } else if (radioNu.isSelected()) {
                        gt = "Nữ";
                    }

                    double luong = hsl * 1800000 + thuong;

                    Nhanvien nvnew = new Nhanvien(maNv, txtTennv.getText(), txtDc.getText(), gt, sdt, ngays, hsl, thuong, luong);

                    dsnv.set(dongchon, nvnew);
                    loadtablenhanvien();

                    JOptionPane.showMessageDialog(this, "Sửa nhân viên thành công.");

                    txtMnv.setText("");
                    txtTennv.setText("");
                    txtDc.setText("");
                    txtSdt.setText("");
                    txtHsl.setText("");
                    txtThuong.setText("");
                    chonNgaysinh.setDate(null);
                    radioNam.setSelected(false);
                    radioNu.setSelected(false);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng số cho SĐT, HSL, và thưởng.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Có lỗi xảy ra. Vui lòng kiểm tra lại dữ liệu đã nhập.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng cần sửa.");
        }

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        dongchon = Bangnhanvien.getSelectedRow();
        if (dongchon != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa nhân viên này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                dsnv.remove(dongchon);
                loadtablenhanvien();

                JOptionPane.showMessageDialog(this, "Xóa nhân viên thành công.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng cần xóa.");
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSapxepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapxepActionPerformed

        
        Collections.sort(dsnv);
        loadtablenhanvien();
        JOptionPane.showMessageDialog(this, "Sắp xếp thành công theo tên.");


    }//GEN-LAST:event_btnSapxepActionPerformed

    private void btnXuatfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatfileActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();

        // Hiển thị hộp thoại cho phép người dùng chọn vị trí lưu file
        int result = fileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                // Lấy đường dẫn của file được chọn
                String filePath = fileChooser.getSelectedFile().getAbsolutePath();

                // Tạo đối tượng BufferedWriter để ghi dữ liệu vào file
                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

                // Lưu dữ liệu từ tablenhanvien vào file
                for (Nhanvien nv : dsnv) {
                    String line = nv.getManv() + ", " + nv.getTennv() + ", " + nv.getDiachi() + ", " + nv.getGt() + ", " + nv.getSdt() + ", " + nv.getNgays() + ", " + nv.getHsl() + "đ" + ", " + nv.getThuong() + "đ" + ", " + nv.getLuongnv() + "đ";
                    writer.write(line);
                    writer.newLine();
                }

                // Đóng BufferedWriter sau khi ghi xong
                writer.close();

                JOptionPane.showMessageDialog(null, "Dữ liệu đã được chuyển thành công vào file.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Có lỗi xảy ra khi ghi dữ liệu vào file.");
            }
    }//GEN-LAST:event_btnXuatfileActionPerformed
    }

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
            java.util.logging.Logger.getLogger(Quanlynhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quanlynhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quanlynhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quanlynhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quanlynhanvien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Bangnhanvien;
    private javax.swing.JButton btnSapxep;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatfile;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser chonNgaysinh;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radioNam;
    private javax.swing.JRadioButton radioNu;
    private javax.swing.JLabel textSdt;
    private javax.swing.JTextField txtDc;
    private javax.swing.JTextField txtHsl;
    private javax.swing.JTextField txtMnv;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTennv;
    private javax.swing.JTextField txtThuong;
    // End of variables declaration//GEN-END:variables
}
