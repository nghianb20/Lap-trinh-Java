/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlytrongxe.Class;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author KyenTT
 */
public class KhachHang implements Comparable<KhachHang>{
    String maKH,hoTen,SDT,diaChi,gioiTinh,chucVu;
    Date ngaySinh;

    public KhachHang() {
    }
    public KhachHang(String maKH) {
        this.maKH = maKH;
    }
    public KhachHang(String maKH, String hoTen, String SDT, String diaChi, String gioiTinh, String chucVu, Date ngaySinh) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.SDT = SDT;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.chucVu = chucVu;
        this.ngaySinh = ngaySinh;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) throws Exception {
        if(maKH.isEmpty())
            throw new Exception("Ma khach hang khong duoc de trong!");
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) throws Exception {
        if(hoTen.isEmpty())
            throw new Exception("Ho ten khong duoc de trong!");
        this.hoTen = hoTen;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) throws Exception {
        if(SDT.isEmpty())
            throw new Exception("SDT khong duoc de trong!");
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) throws Exception {
        if(diaChi.isEmpty())
            throw new Exception("Dia chi khong duoc de trong!");
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) throws Exception {
        if(gioiTinh.isEmpty())
            throw new Exception("Gioi tinh khong duoc de trong!");
        this.gioiTinh = gioiTinh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) throws Exception {
        if(chucVu.isEmpty())
            throw new Exception("Chuc vu khong duoc de trong!");
        this.chucVu = chucVu;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) throws Exception {
        if(ngaySinh == null)
            throw new Exception("Ngay sinh khong duoc de trong!");
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s, %s, %s",maKH, hoTen, gioiTinh, chucVu, SDT, diaChi, ngaySinh);
    }

    @Override
    public boolean equals(Object obj) {
        KhachHang kh1 = (KhachHang) obj;
        return this.maKH.equalsIgnoreCase(kh1.maKH);
    }
//  Sap xep theo ten, neu ten trung sap xep theo maKH
    @Override
    public int compareTo(KhachHang o) {
//        Lay ra chuoi ten doi tuong 1
        String[] str = this.hoTen.split(" ");
        String ten1 = str[str.length - 1];
//        Lay ra chuoi ten doi tuong 2
        str = o.hoTen.split(" ");
        String ten2 = str[str.length - 1];
        if(ten1.equalsIgnoreCase(ten2))
            return this.maKH.compareToIgnoreCase(o.maKH);
        return ten1.compareToIgnoreCase(ten2);
    }
}
