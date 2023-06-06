/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlytrongxe.Table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import quanlytrongxe.Class.Nhanvien;


public class Tablenhanvien extends AbstractTableModel{
    private String name[] ={"Mã nv", "Tên nv", "Địa chỉ", "Giới tính", "SDT", "Ngày sinh", "HSL","Thưởng","Lương"};
    private Class classess[]={String.class, String.class, String.class,String.class, int.class, String.class, double.class, double.class,double.class};
    ArrayList<Nhanvien> dsnv=new ArrayList<Nhanvien>();
    
    public Tablenhanvien(ArrayList<Nhanvien> nv){
        dsnv=nv;
    }
    @Override
    public int getRowCount() {
        return dsnv.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dsnv.get(rowIndex).getManv();
            
            case 1: return dsnv.get(rowIndex).getTennv();
            
            case 2: return dsnv.get(rowIndex).getDiachi();
             
            case 3: return dsnv.get(rowIndex).getGt();
            
            case 4: return dsnv.get(rowIndex).getSdt();
            
            case 5: return dsnv.get(rowIndex).getNgays();
            
            case 6: return dsnv.get(rowIndex).getHsl();
            
            case 7: return dsnv.get(rowIndex).getThuong();
            
            case 8: return dsnv.get(rowIndex).getLuongnv();
            
            default : return null;
        }
    }
    
    @Override
    public Class getColumnClass(int columnIndex){
        return classess[columnIndex];
    }
    
    @Override
    public String getColumnName(int column){
        return name[column];
    }
}
