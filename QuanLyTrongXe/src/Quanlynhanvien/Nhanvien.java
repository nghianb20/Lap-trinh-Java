
package Quanlynhanvien;




public class Nhanvien implements Comparable<Nhanvien>{
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

    public void setHsl(double hsl) {
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

    public void setThuong(double thuong) {
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
// sap xep theo ten, trung sx theo manv
    @Override
    public int compareTo(Nhanvien o) {
        String[] str = this.tennv.split(" ");
        String ten1 = str[str.length - 1];

        str = o.tennv.split(" ");
        String ten2 = str[str.length - 1];
        if(ten1.equalsIgnoreCase(ten2))
            return this.manv.compareToIgnoreCase(o.manv);
        return ten1.compareToIgnoreCase(ten2);
    }
    
    
}
