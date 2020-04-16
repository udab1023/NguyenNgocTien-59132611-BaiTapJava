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
public class ChuyenXe {
    public String msChuyen,hoTenTaiXe,soXe;
    public double DoanhThu;
    
    public ChuyenXe(String msChuyen, String hoTenTaiXe, String soXe, double DoanhThu){
        this.msChuyen = msChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.DoanhThu = DoanhThu;
    }
    
    public String msChuyen(){
        return msChuyen;
    }
    public void setmsChuyen(String msChuyen){
        this.msChuyen = msChuyen;
    }
    
    public String gethoTenTaiXe(){
        return hoTenTaiXe;
    }
    public void sethoTenTaiXe(String hoTenTaiXe){
        this.hoTenTaiXe = hoTenTaiXe;
    }
    
    public String getsoXe(){
        return soXe;
    }
    public void setsoXe(String soXe){
        this.soXe = soXe;
    }
    
    public double getDoanhThu(){
        return DoanhThu;
    }
    public void setDoanhThu(double DoanhThu){
        this.DoanhThu = DoanhThu;
    }
    
    public String getThongTin(){
        return "MS Chuyen: "+msChuyen+"\n"+"hoTenTaiXe: "+hoTenTaiXe+"\n"+"soXe: "+soXe+"\n"+"DoanhThu: "+DoanhThu+"\n";
    }
}
