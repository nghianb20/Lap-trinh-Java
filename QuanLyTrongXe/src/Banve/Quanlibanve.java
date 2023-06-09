/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banve;

/**
 *
 * @author FPT
 */
public class Quanlibanve {
     String tenNv, chucvu;
     double thanhtien;
     int sdt;
     
     public Quanlibanve(String tenNv, String chucvu, double thanhtien, int sdt){
         this.tenNv = tenNv;
         this.chucvu = chucvu;
         this.sdt = sdt;
         this.thanhtien = thanhtien;
     }

    public String getTenNv() {
        return tenNv;
    }

    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }
}

