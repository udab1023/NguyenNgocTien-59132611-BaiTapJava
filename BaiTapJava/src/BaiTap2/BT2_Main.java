/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap1.NhanVien;

/**
 *
 * @author ngoct
 */
public class BT2_Main {
    public static void main(String[] args)
    {
        QuanLyNhanVien ql = new QuanLyNhanVien();
        NhanVien nv1 = new NhanVien("Hoang",20,"116 Duong 2/4",200,5000000);
        NhanVien nv2 = new NhanVien("Long",23,"Cam Ranh",250,3500000);
        NhanVien nv3 = new NhanVien("Nhung",22,"12 Dien Bien Phu",90,2500000);
        NhanVien nv4 = new NhanVien("Phuc",21,"6 Au Co",190,1000000);
        NhanVien nv5 = new NhanVien("Van",18,"25 Lac LOng Quan",120,5500000);
        
        ql.them(nv1);
        ql.them(nv2);
        ql.them(nv3);
        ql.them(nv4);
        ql.them(nv5);
        
        ql.inDS();
    }
}
