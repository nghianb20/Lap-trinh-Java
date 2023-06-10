/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlytrongxe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import quanlytrongxe.Class.KhachHang;

/**
 *
 * @author Tran Kien
 */
public class Quanlykhachhang extends javax.swing.JFrame {

    ArrayList<KhachHang> listKh;
    DefaultTableModel model;
    int dongChon = -1;
    /**
     * Creates new form Quanlykhachhang
     */
    public Quanlykhachhang() {
        initComponents();
        listKh = new ArrayList<KhachHang>();
        model = (DefaultTableModel) tblListKH.getModel();
        fakeData();
        setLocationRelativeTo(null); 
        loadData();
    }
//  Tai lai du lieu
    public void loadData(){
        int stt = 1;
        if(model.getRowCount() > 0)
            model.setRowCount(0);
        for(var item : listKh){
            model.addRow(new Object[]{
                stt++ , item.getMaKH(), item.getHoTen(), item.getGioiTinh(),
                item.getChucVu(), item.getSDT(), item.getDiaChi(), dateToString(item.getNgaySinh())
            });
        }
    }
//  Du lieu mau  
    public void fakeData(){
        listKh.add(new KhachHang("KH001", "Tran Trung Kien", "0123456789", "Ha Noi", "Nam", "Sinh vien", toDate("28/05/2002")));
        listKh.add(new KhachHang("KH002", "Tran Tien Dung", "0444444444", "Ha Noi", "Nam", "Sinh vien", toDate("02/03/2001")));
        listKh.add(new KhachHang("KH003", "Nguyen Van A", "0333333333", "Ha Nam", "Nu", "Giao Vien", toDate("10/04/1996")));
        listKh.add(new KhachHang("KH004", "Nguyen Tu Nghia", "0123456788", "Ninh Binh", "Nam", "Sinh vien", toDate("28/02/2002")));
        listKh.add(new KhachHang("KH005", "Le Truong Vu", "0355555555", "Ha Noi", "Nam", "Sinh vien", toDate("04/05/2001")));
        listKh.add(new KhachHang("KH006", "Ho Huu Phuong", "0866666666", "Nghe An", "Nu", "Giao Vien", toDate("10/04/1992")));
        listKh.add(new KhachHang("KH007", "Ngo Thi Hoai", "0987654321", "Ha Noi", "Nu", "Sinh vien", toDate("08/09/2000")));
        listKh.add(new KhachHang("KH008", "Doan Huong Giang", "0381111111", "Ha Noi", "Nu", "Sinh vien", toDate("03/08/2002")));
        listKh.add(new KhachHang("KH009", "Nguyen Do Thi Linh", "0333333333", "Ha Noi", "Nu", "Giao Vien", toDate("10/04/1990")));
        listKh.add(new KhachHang("KH010", "Bui Cong Vuong", "0123456788", "Quang Ninh", "Nam", "Sinh vien", toDate("09/06/1998")));
    }
//    Chuyen tu chuoi sang doi tuong date
    public Date toDate(String ngay){
        SimpleDateFormat dateF = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        try{
            date = dateF.parse(ngay);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Loi ngay sinh");
        }
        return date;
    }
//    Chuyen tu doi tuong date sang chuoi
    public String dateToString(Date ngay){
        SimpleDateFormat dateF = new SimpleDateFormat("dd/MM/yyyy");
        return dateF.format(ngay);
    }
//    Kiem tra ma khach hang co ton tai chua
    public boolean isCheckMaKH(KhachHang kh){
        for(KhachHang item : listKh){
            if(kh.equals(item)){
                JOptionPane.showMessageDialog(this, "Ma khach hang da ton tai!");
                return true;
            }
        }
        return false;
    }
//    Xoa du lieu o input vua thao tac
    public void resetInput(){
        tbMaKH.setText("");
        tbHoTen.setText("");
        tbChucVu.setText("");
        tbDiaChi.setText("");
        tbSDT.setText("");
        dtNgaySinh.setDate(null);
        gioiTinh.clearSelection();
    }
    public void xuatFile(ArrayList<KhachHang> list, String fileName){
        try{
//            FileOutputStream fos = new FileOutputStream(new File(fileName));
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(list);
//            PrintWriter pw = new PrintWriter(new File(fileName));
//            for(KhachHang kh : list){
//                pw.printf("{0}, {1}, {2}, {3}, {4}, {5}, {6}", kh.getMaKH(),
//                        kh.getHoTen(), kh.getGioiTinh(), kh.getChucVu(), kh.getSDT(), kh.getDiaChi(), kh.getNgaySinh());
//            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

                // Lưu dữ liệu từ tablenhanvien vào file
                for (KhachHang kh : list) {
                    String line = String.format("%s, %s, %s, %s, %s, %s, %s",
                            kh.getMaKH(), kh.getHoTen(), kh.getGioiTinh(),
                            kh.getChucVu(), kh.getSDT(), kh.getDiaChi(), dateToString(kh.getNgaySinh()));
                    writer.write(line);
                    writer.newLine();
                }

                // Đóng BufferedWriter sau khi ghi xong
                writer.close();
                JOptionPane.showMessageDialog(this, "Xuat file thanh cong!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Loi xuat file!");
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

        gioiTinh = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tbMaKH = new javax.swing.JTextField();
        tbHoTen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tbChucVu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tbDiaChi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tbSDT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dtNgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        rbNam = new javax.swing.JRadioButton();
        rbNu = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnXuatFile = new javax.swing.JButton();
        btnSapXep = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListKH = new javax.swing.JTable();
        btnTim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Quản lý khách hàng");

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setText("<< Trở về");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Mã khách hàng: ");

        tbMaKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbMaKH.setName("tbMaNV"); // NOI18N
        tbMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbMaKHActionPerformed(evt);
            }
        });

        tbHoTen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbHoTen.setActionCommand("");
        tbHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbHoTenActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Họ tên:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Chức vụ:");

        tbChucVu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbChucVuActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Địa chỉ:");

        tbDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbDiaChiActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("SĐT: ");

        tbSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSDTActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Ngày sinh:");

        dtNgaySinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Giới tính: ");

        gioiTinh.add(rbNam);
        rbNam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbNam.setText("Nam");

        gioiTinh.add(rbNu);
        rbNu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbNu.setText("Nữ");
        rbNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNuActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Danh sách khách hàng:");

        btnThem.setText("Thêm");
        btnThem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnXuatFile.setText("Xuất file");
        btnXuatFile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileActionPerformed(evt);
            }
        });

        btnSapXep.setText("Sắp xếp");
        btnSapXep.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        tblListKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã khách hàng", "Họ tên", "Giới tính", "Chức vụ", "SĐT", "Địa chỉ", "Ngày sinh"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblListKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListKHMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblListKH);
        if (tblListKH.getColumnModel().getColumnCount() > 0) {
            tblListKH.getColumnModel().getColumn(0).setMinWidth(50);
            tblListKH.getColumnModel().getColumn(1).setMinWidth(100);
            tblListKH.getColumnModel().getColumn(2).setMinWidth(150);
            tblListKH.getColumnModel().getColumn(3).setMinWidth(80);
            tblListKH.getColumnModel().getColumn(4).setMinWidth(80);
            tblListKH.getColumnModel().getColumn(5).setMinWidth(100);
            tblListKH.getColumnModel().getColumn(6).setMinWidth(80);
            tblListKH.getColumnModel().getColumn(7).setMinWidth(100);
        }

        btnTim.setText("Tìm");
        btnTim.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton6)
                .addGap(100, 100, 100)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(tbMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(tbSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(tbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(dtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(tbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(rbNu, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(tbDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnXuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton6))
                    .addComponent(jLabel4))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(tbMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tbSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(tbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(dtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbNu)
                                    .addComponent(rbNam))))
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(tbDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        rbNam.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Nut tro ve menu
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        MenuQuanTri mn=new MenuQuanTri();
        mn.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tbMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbMaKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbMaKHActionPerformed

    private void tbChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbChucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbChucVuActionPerformed

    private void tbDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDiaChiActionPerformed

    private void tbSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbSDTActionPerformed

    private void rbNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNuActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        KhachHang kh = new KhachHang();
        boolean isSuccess = true;
        try{
            kh.setMaKH(tbMaKH.getText());
            kh.setHoTen(tbHoTen.getText());
            kh.setChucVu(tbChucVu.getText());
            kh.setSDT(tbSDT.getText());
            kh.setNgaySinh(dtNgaySinh.getDate());
            if(rbNam.isSelected()){
                kh.setGioiTinh("Nam");
            }
            else if(rbNu.isSelected()){
                kh.setGioiTinh("Nu");
            }
            else {
                kh.setGioiTinh("");
            }
            kh.setDiaChi(tbDiaChi.getText());
        } catch(Exception ex){
            isSuccess = false;
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        if(isSuccess && !isCheckMaKH(kh)){
            JOptionPane.showMessageDialog(this, "Them thanh cong!");
            listKh.add(kh);
            loadData();
            resetInput();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileActionPerformed
        // TODO add your handling code here:
        xuatFile(listKh,"DanhSachKH.txt");
        resetInput();
    }//GEN-LAST:event_btnXuatFileActionPerformed
// Nut sap xep lai du lieu theo ten
    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        // TODO add your handling code here:
        Collections.sort(listKh);
        loadData();
        JOptionPane.showMessageDialog(this, "Da sap xep danh sach theo ten!");
    }//GEN-LAST:event_btnSapXepActionPerformed

    private void tbHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbHoTenActionPerformed
// Nut sua thong tin
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        dongChon = tblListKH.getSelectedRow();
        if(listKh.size() == 0)
            JOptionPane.showMessageDialog(this, "Danh sach dang trong khong the sua!");
        else if(dongChon == -1)
            JOptionPane.showMessageDialog(this, "Hay chon dong tren bang du lieu!");
        else {
            KhachHang kh = new KhachHang();
            boolean isSuccess = true;
            try{
                kh.setMaKH(tbMaKH.getText());
                kh.setHoTen(tbHoTen.getText());
                kh.setChucVu(tbChucVu.getText());
                kh.setSDT(tbSDT.getText());
                kh.setNgaySinh(dtNgaySinh.getDate());
                if(rbNam.isSelected()){
                    kh.setGioiTinh("Nam");
                }
                else if(rbNu.isSelected()){
                    kh.setGioiTinh("Nu");
                }
                else {
                    kh.setGioiTinh("");
                }
                kh.setDiaChi(tbDiaChi.getText());
            } catch(Exception ex){
                isSuccess = false;
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            if(isSuccess &&(kh.equals(listKh.get(dongChon)) || !isCheckMaKH(kh))){
                JOptionPane.showMessageDialog(this, "Sua thanh cong!");
                listKh.set(dongChon, kh);
                loadData();
                resetInput();
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed
// Thao tac chon dong se hien thi du lieu vao o input
    private void tblListKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListKHMouseClicked
        // TODO add your handling code here:
        dongChon = tblListKH.getSelectedRow();
        setEditData(listKh.get(dongChon));
    }//GEN-LAST:event_tblListKHMouseClicked
// Nut xoa du lieu
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        dongChon = tblListKH.getSelectedRow();
        listKh.remove(dongChon);
        loadData();
        resetInput();
        JOptionPane.showMessageDialog(this, "Xoa file thanh cong!");
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        ArrayList<KhachHang> list = new ArrayList<KhachHang>();
        String name = "";
        try{
            name = tbHoTen.getText();
            if(name.isEmpty()) throw new Exception("Dien truong ho ten de tim kiem theo ten!");
            for(var item : listKh){
                if(item.getHoTen().equalsIgnoreCase(name))
                    list.add(item);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        if(!list.isEmpty()){
            int stt = 1;
            if(model.getRowCount() > 0)
                model.setRowCount(0);
            for(var item : list){
                model.addRow(new Object[]{
                    stt++ , item.getMaKH(), item.getHoTen(), item.getGioiTinh(),
                    item.getChucVu(), item.getSDT(), item.getDiaChi(), dateToString(item.getNgaySinh())
                });
            }
            JOptionPane.showMessageDialog(this, "Tim kiem thanh cong!");
        }
    }//GEN-LAST:event_btnTimActionPerformed

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
            java.util.logging.Logger.getLogger(Quanlykhachhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quanlykhachhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quanlykhachhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quanlykhachhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quanlykhachhang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatFile;
    private com.toedter.calendar.JDateChooser dtNgaySinh;
    private javax.swing.ButtonGroup gioiTinh;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbNam;
    private javax.swing.JRadioButton rbNu;
    private javax.swing.JTextField tbChucVu;
    private javax.swing.JTextField tbDiaChi;
    private javax.swing.JTextField tbHoTen;
    private javax.swing.JTextField tbMaKH;
    private javax.swing.JTextField tbSDT;
    private javax.swing.JTable tblListKH;
    // End of variables declaration//GEN-END:variables
//  Hanh vi dua du lieu vao o input
    private void setEditData(KhachHang kh) {
        tbMaKH.setText(kh.getMaKH());
        tbHoTen.setText(kh.getHoTen());
        tbChucVu.setText(kh.getChucVu());
        tbDiaChi.setText(kh.getDiaChi());
        tbSDT.setText(kh.getSDT());
        dtNgaySinh.setDate(kh.getNgaySinh());
        if(kh.getGioiTinh() == "Nam") rbNam.setSelected(true);
        else rbNu.setSelected(true);
    }
}
