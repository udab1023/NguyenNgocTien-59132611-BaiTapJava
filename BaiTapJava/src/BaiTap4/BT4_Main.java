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
        XeNoiThanh x1 = new XeNoiThanh("C1","Tien","01",1000000,001,100);
        XeNoiThanh x2 = new XeNoiThanh("C2","Dung","02",3000000,002,200);
        XeNoiThanh x3 = new XeNoiThanh("C3","Cuong","03",5000000,003,300);
        XeNgoaiThanh x4 = new XeNgoaiThanh("C4","Hung","04",1000000,"Nha Trang",10);
        XeNgoaiThanh x5 = new XeNgoaiThanh("C5","Doan","05",1500000,"TP HCM",11);
        XeNgoaiThanh x6 = new XeNgoaiThanh("C6","Nhan","06",2000000,"Ha Noi",12);
        
        QuanLyChuyenXe ql = new QuanLyChuyenXe();
        ql.themCX(x1);
        ql.themCX(x2);
        ql.themCX(x3);
        ql.themCX(x4);
        ql.themCX(x5);
        ql.themCX(x6);
        
        ql.TTtungChuyenXe();
        
        System.out.println("Doanh Thu Xe Ngoai Thanh: " + ql.tinhDoanhThuNgoaiThanh());
        System.out.println("Doanh Thu Xe Noi Thanh: " + ql.tinhDoanhThuNoiThanh());
        System.out.println("Tong Doanh Thu: " + ql.tongDoanhThu());
    }
}
