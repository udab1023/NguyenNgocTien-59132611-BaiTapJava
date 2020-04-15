/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author ngoct
 */
public abstract class SinhVienPoly {
    public String hoTen,nganh;
    
    public SinhVienPoly(String hoTen, String nganh){
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();
    
    public String getHocLuc(){
        if (getDiem()<5)
            return "yeu";
        else if (getDiem()>=5 && getDiem()<6.5)
            return "trung binh";
        else if (getDiem()>=6.5 && getDiem()<7.5)
            return "kha";
        else if (getDiem()>=7.5 && getDiem()<9)
            return "gioi";
        else return "xuat xac";
    }
    public String xuat(){
        return "TenSV: "+hoTen+"\n"+"Nganh: "+nganh;
    }
}
