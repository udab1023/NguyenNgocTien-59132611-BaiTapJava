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
public class XeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgayDiDuoc;
    
    public XeNgoaiThanh(String msChuyen, String hoTenTaiXe, String soXe, double DoanhThu, String noiDen, int soNgayDiDuoc){
        super(msChuyen,hoTenTaiXe,soXe,DoanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    
    public String getnoiDen(){
        return noiDen;
    }
    public void setsoTuyen(String noiDen){
        this.noiDen = noiDen;
    }
    
    public int getsoNgayDiDuoc(){
        return soNgayDiDuoc;
    }
    public void setsoNgayDiDuoc(int soNgayDiDuoc){
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

}
