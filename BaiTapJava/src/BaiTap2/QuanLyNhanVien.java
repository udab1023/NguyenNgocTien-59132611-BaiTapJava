/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;
import BaiTap1.NhanVien;
import java.util.ArrayList;
/**
 *
 * @author ngoct
 */
public class QuanLyNhanVien implements IQuanLy {
    ArrayList<NhanVien> l = new ArrayList<NhanVien>(); 
    @Override
    public void them(NhanVien nv){
        l.add(nv);
    }
    
    @Override
    public void inDS(){
        System.out.println("Cac nhan vien có trong danh sach la: ");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        
    }
}
