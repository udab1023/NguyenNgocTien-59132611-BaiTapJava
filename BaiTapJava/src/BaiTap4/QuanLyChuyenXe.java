/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.util.ArrayList;

/**
 *
 * @author ngoct
 */
public class QuanLyChuyenXe {
    public double tongDoanhThuNoiThanh = 0;
    public double tongDoanhThuNgoaiThanh = 0;
    public double tongDoanhThu = 0;

    ArrayList<ChuyenXe> l = new ArrayList<>();
    
    public void themCX(ChuyenXe cx){
        l.add(cx);
    }
    public void xuatDS(){
        l.size();
        }
    public void TTtungChuyenXe (){
        System.out.println("Cac chuyen xe có trong danh sach la: ");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i).getThongTin());
        }
    }
    public double tinhDoanhThuNoiThanh(){
        for (int i = 0; i < l.size(); i++){
            if(l.get(i) instanceof XeNoiThanh)
                tongDoanhThuNoiThanh += l.get(i).getDoanhThu(); 
        }
        return tongDoanhThuNoiThanh;
    }
    public double tinhDoanhThuNgoaiThanh(){
        for (int i = 0; i < l.size(); i++){
            if(l.get(i) instanceof XeNgoaiThanh)
                tongDoanhThuNgoaiThanh += l.get(i).getDoanhThu();
        }
        return tongDoanhThuNgoaiThanh;
    }
    public double tongDoanhThu(){
        tongDoanhThu = tongDoanhThuNoiThanh + tongDoanhThuNgoaiThanh;
        return tongDoanhThu;
    }
}
