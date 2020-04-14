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
public class Main {
    public static void main(String[] args){
        NhanVien s2 = new NhanVien("Tien",20,"SinhTrung",200,1000000);
        s2.tinhThuong();
        System.out.println(s2);
        s2.display();
    }
}
