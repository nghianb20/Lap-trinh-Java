/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlytrongxe.Class;

/**
 *
 * @author Nguyen Nghia
 */
public class Nhanvien {
     String manv, tennv, diachi, gt, ngays;
     double hsl, thuong, luongnv;
     
    int sdt;

    public Nhanvien(String manv, String tennv, String diachi, String gt,int sdt, String ngays, double hsl, double thuong,double luongnv ) {
        this.manv = manv;
        this.tennv = tennv;
        this.diachi = diachi;
        this.gt = gt;
        this.ngays = ngays;
        this.hsl = hsl;
        this.thuong = thuong;
        this.luongnv = luongnv;
        this.sdt = sdt;
    }

    public Nhanvien(){
        
    }

    

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public double getHsl() {
        return hsl;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(int thuong) {
        this.thuong = thuong;
    }

    public String getNgays() {
        return ngays;
    }

    public void setNgays(String ngays) {
        this.ngays = ngays;
    }

    public double getLuongnv() {
        return luong();
    }

    public void setLuongnv(double luongnv) {
        this.luongnv = luong();
    }
    
    
    public double luong(){
        return 1800000*hsl + thuong;
    }
}
