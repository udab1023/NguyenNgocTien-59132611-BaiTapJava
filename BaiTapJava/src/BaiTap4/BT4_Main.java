/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author ngoct
 */
public class BT4_Main {
    public static void main(String[] args){
        XeNoiThanh x1 = new XeNoiThanh("C1","Tien","01",001,100,1000000);
        XeNoiThanh x2 = new XeNoiThanh("C2","Dung","02",002,200,3000000);
        XeNoiThanh x3 = new XeNoiThanh("C3","Cuong","03",003,300,5000000);
        XeNgoaiThanh x4 = new XeNgoaiThanh("C4","Hung","04","Nha Trang",10,1000000);
        XeNgoaiThanh x5 = new XeNgoaiThanh("C5","Doan","05","TP HCM",11,1500000);
        XeNgoaiThanh x6 = new XeNgoaiThanh("C6","Nhan","06","Ha Noi",12,2000000);
        
        QuanLyChuyenXe ql = new QuanLyChuyenXe();
        ql.themCX(x1);
        ql.themCX(x2);
        ql.themCX(x3);
        ql.themCX(x4);
        ql.themCX(x5);
        ql.themCX(x6);
        
        System.out.println(ql);
    }
}
