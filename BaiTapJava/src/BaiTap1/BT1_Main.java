/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author ngoct
 */
public class BT1_Main {
    public static void main(String[] args){
        NhanVien s1 = new NhanVien("Tien",20,"65 SinhTrung",200,1000000);
        NhanVien s2 = new NhanVien("Trung",19,"12 HaRa",150,1000000);
        System.out.println(s1.getThongTin());
        System.out.println(s2.getThongTin());
    }
}
