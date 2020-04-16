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

    ArrayList l = new ArrayList();
    
    public void themCX(ChuyenXe cx){
        l.add(cx);
    }
    public void xuatDS(){
        l.size();
        }
    public void TTtungChuyenXe (){
        System.out.println("Cac chuyen xe có trong danh sach la: ");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
    public double tinhTongDoanhThu(double XeNoiThanh.DoanhThu, double XeNgoaiThanh.DoanhThu){
        XeNoiThanh.DoanhThu + XeNgoaiThanh.DoanhThu;
    }
}
