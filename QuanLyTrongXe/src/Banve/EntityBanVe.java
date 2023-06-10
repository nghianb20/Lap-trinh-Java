package Banve;

import java.util.Random;

public class EntityBanVe {
    private int ma;

    private String tenKH;
    private String loaiXe;
    //chucVu = 1 là can bo, bang 0 là sinh viên
    private String chucVu;
    private String loaiVe;
    private String sdt;

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    

    public String getLoaiVe() {
        return loaiVe;
    }

    public void setLoaiVe(String loaiVe) {
        this.loaiVe = loaiVe;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public EntityBanVe() {
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public EntityBanVe(String tenKH, String loaiXe, String chucVu, String loaiVe, String sdt) {
        
        Random random = new Random();

        // Tạo số ngẫu nhiên có 4 chữ số
        int min = 1000; // Giá trị nhỏ nhất có thể
        int max = 9999; // Giá trị lớn nhất có thể
        int randomNumber = random.nextInt(max - min + 1) + min;
        this.ma = randomNumber;
        this.tenKH = tenKH;
        this.loaiXe = loaiXe;
        this.chucVu = chucVu;
        this.loaiVe = loaiVe;
        this.sdt = sdt;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

  

    //chucVu = 1 là can bo, bang 0 là sinh viên
    public double tinhTien() {
        double dongia = 0;
        int thoiGian;
        if (chucVu.equalsIgnoreCase("Cán bộ")) {
            return 0;
        } else {

            if (loaiXe.equalsIgnoreCase("Xe máy")) {
                dongia = 5000;
            }
            if (loaiXe.equalsIgnoreCase("Xe đạp")) {
                dongia = 3000;
            }
            if (loaiXe.equalsIgnoreCase("Oto")) {
                dongia = 10000;
            }

            switch (loaiVe) {
                case "Vé ngày":
                    return dongia *1;
                   
                case "Vé tháng":
                    return dongia *20;
                case "Vé quý":
                    return dongia *50;
                case "Vé năm":
                    return dongia *150;
                    
                default:
                // code block
            }

        }
        return 0;

    }

}
