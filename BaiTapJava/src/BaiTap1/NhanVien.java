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
public class NhanVien {
    public String Ten,DiaChi;
    public int Tuoi,TongSoGioLam;
    public double TienLuong,Thuong;
    
    public NhanVien(String Ten, int Tuoi, String DiaChi, int TongSoGioLam, double TienLuong){
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.TongSoGioLam = TongSoGioLam;
        this.TienLuong = TienLuong;
    }
    public String getTen(){
        return Ten;
    }
    public void setTen(String Ten){
        this.Ten = Ten;
    }
        
    public int getTuoi(){
        return Tuoi;
    }
    public void setTuoi(int Tuoi){
        this.Tuoi = Tuoi;
    }
        
    public String getDiaChi(){
        return DiaChi;
    }
    public void setDiaChi(String DiaChi){
        this.DiaChi = DiaChi;
    }
        
    public int getTongSoGioLam(){
        return TongSoGioLam;
    }
    public void setTongSoGioLam(int TongSoGioLam){
        this.TongSoGioLam = TongSoGioLam;
    }
        
    public double getTienLuong(){
        return TienLuong;
    }
    public void setTienLuong(double TienLuong){
        this.TienLuong = TienLuong;
    }
    
    public double tinhThuong(){
        if (TongSoGioLam >= 200){
            Thuong=this.TienLuong * 20/100;}
        else if (TongSoGioLam <200 && TongSoGioLam >=100){
            Thuong=this.TienLuong * 10/100;}
            else{Thuong=0;}
        return 0;
    }
        void display(){System.out.println(Ten+" "+Tuoi+" "+DiaChi+" "+TongSoGioLam+" "+TienLuong+" "+Thuong);}
}
