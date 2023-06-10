/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlytrongxe;

import java.util.Objects;

/**
 *
 * @author hohuu
 */
public class CaTruc {
    private int maCaTruc;
    private String maNV;
    private String viTriNhaXe;
    private String date;
    private String caTruc;

    public int getMaCaTruc() {
        return maCaTruc;
    }
    public String getMaNV() {
        return maNV;
    }

    public String getViTriNhaXe() {
        return viTriNhaXe;
    }

    public String getDate() {
        return date;
    }

    public String getCaTruc() {
        return caTruc;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setViTriNhaXe(String viTriNhaXe) {
        this.viTriNhaXe = viTriNhaXe;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCaTruc(String caTruc) {
        this.caTruc = caTruc;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.maNV);
        hash = 29 * hash + Objects.hashCode(this.date);
        hash = 29 * hash + Objects.hashCode(this.caTruc);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CaTruc other = (CaTruc) obj;
        if (!Objects.equals(this.maNV, other.maNV)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return Objects.equals(this.caTruc, other.caTruc);
    }
    
    
    
}
